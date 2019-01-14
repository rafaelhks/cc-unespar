const builder = require("botbuilder");
const conector = new builder.ConsoleConnector().listen();
const bot = new builder.UniversalBot(conector);

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
    }
])