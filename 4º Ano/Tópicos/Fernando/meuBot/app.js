var restify = require('restify');
var builder = require('botbuilder');

// Setup Restify Server
var server = restify.createServer();
server.listen(process.env.port || process.env.PORT || 3978, function () {
   console.log('%s listening to %s', server.name, server.url);
});

// Crie um chat conector para se comunicar com o Bot Framework Service
var connector = new builder.ChatConnector({
    appId: process.env.MICROSOFT_APP_ID,
    appPassword: process.env.MICROSOFT_APP_PASSWORD
});

// Endpoint que irá monitorar as mensagens do usuário
server.post('/api/messages', connector.listen());

// Recebe as mensagens do usuário e responde repetindo cada mensagem (prefixado com 'Você disse:')
var bot = new builder.UniversalBot(connector);

bot.dialog('/', [
    (session)=>{
        builder.Prompts.text(session, 'Tudo bem?');
    },
    (session)=>{
        builder.Prompts.text(session, 'Gostaria de pedir uma pizza?');
    },
    (session, results)=>{
        let msg = results.response;
        if(msg.toLowerCase() == 'sim'){
            builder.Prompts.text(session, 'De qual sabor?');
        }else
            session.send('Não entendi o que você digitou.');
    },
    (session, results)=>{
        let msg = results.response;
        session.send('Certo, pizza de '+msg);
        builder.Prompts.text(session, 'Qual o endereço para entrega?');
    },
    (session, results)=>{
        let msg = results.response;
        session.send('Certo, enviar a pizza para: '+msg);
        builder.Prompts.text(session, 'Pode me informar um telefone para contato?');
    },
    (session, results)=>{
        let msg = results.response;
        if(msg.toLowerCase() == 'não' || msg.toLowerCase() == 'nao'){
            session.send('Okay, o endereço basta.\nObrigado. Seu pedido está sendo processado!');
        }else{
            session.send('Okay, qualquer coisa ligaremos para você no '+msg)
            session.send('Obrigado. Seu pedido está sendo processado!');
        }
        session.endDialog();
    }
])