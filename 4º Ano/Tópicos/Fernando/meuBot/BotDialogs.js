//Bot no emulator
var restify = require('restify');
var builder = require('botbuilder');

//Configuração do servidor restify
// Setup Restify Server
var server = restify.createServer();
server.listen(process.env.port || process.env.PORT || 3978, function () {
   console.log('%s listening to %s', server.name, server.url);
});

//Criação do chat connector para comunicar com o servidor do Bot Framework:
// Create chat connector for communicating with the Bot Framework Service
var connector = new builder.ChatConnector({
    appId: process.env.MicrosoftAppId,
    appPassword: process.env.MicrosoftAppPassword
});

const bot = new builder.UniversalBot(connector); 

//Endpoint para executar as mensagens para os usuarios via Bot Emulator
// Listen for messages from users 
server.post('/api/messages', connector.listen());

var cliName, nPessoas, dormits, dataIn, dataOut, endereco, pagamento;
//Aqui entra os dialogos
//Fluxo de dialogo entre o bot e o usuário dentro de um array de interações/sessões
bot.dialog('/',[ 
    session =>{
        session.beginDialog('/saudacao');
    }
]);

bot.dialog('/saudacao', [
    session => {
        builder.Prompts.text(session, 'Olá! Qual é o seu nome?');
    },
    (session, results) => {
         let msg = results.response;
         cliName= msg;
         session.endDialog('Olá ' + msg);
         session.beginDialog('/quarto');
    }
])

bot.dialog('/quarto',[ 
    session => {
        builder.Prompts.text(session, 'Gostaria de reservar um quarto?');
        //session.send('Gostaria de reservar um quarto?');
    },
    (session, results) => {
        let msg = results.response;
        if(msg.toLowerCase()=='sim'){
            builder.Prompts.text(session, 'Para quantas pessoas?');
        }else{
            builder.Prompts.text(session, 'Desculpe, não entendi o que você disse '+cliName);
        }
   },
   (session, results) => {
        let msg = results.response;
        nPessoas = msg;
        builder.Prompts.text(session, 'Certo, de quais dormitórios precisa?');
   },
   (session, results) => {
        let msg = results.response;
        dormits = msg;
        session.endDialog();
        session.beginDialog('/infos');
    }
]);

bot.dialog('/infos',[
    session => {
        builder.Prompts.text(session, cliName+', por gentileza, informe a data para que pretende reservar o quarto.');
    },
    (session, results) => {
        var msg = results.response;
        dataIn = msg;
        builder.Prompts.text(session, 'E a data de saída?');
    },
    (session, results) => {
        var msg = results.response;
        dataOut = msg;
        session.send('Certo '+cliName+', só preciso de mais algumas informações.');
        builder.Prompts.text(session, 'Qual seu endereço completo?')
    },
    (session, results) => {
        var msg = results.response;
        endereco = msg;
        session.send(cliName+', nossa empresa aceita pagamentos em dinheiro e em cartão (débito ou crédito).');
        builder.Prompts.text(session, 'Com qual método deseja realizar o pagamento?');
    },
    (session, results) => {
        var msg = results.response;
        pagamento = msg;
        session.endDialog();
        session.beginDialog('/final');
    }
]);

bot.dialog('/final', [
    session => {
        session.send('Obrigado, '+cliName+'. Isso é tudo.');
        session.send('Encontrei um quarto para '+nPessoas+' pessoas.');
        session.send('Com '+dormits+'.');
        session.send('Disponível de '+dataIn+' a '+dataOut);
        session.send('Clicando no link abaixo você pode ver informações detalhadas sobre o quarto.');
        session.send('E também finalizar o pagamento.')
        session.endDialog();
        session.beginDialog('/meu_card');
    }
])

bot.dialog('/meu_card',[ 
    session => {
        var card = new builder.HeroCard(session)
        .title('Quarto')
        .subtitle('Separei um quarto pra você!')
        .text('.')
        .images([
            builder.CardImage.create(session, 'https://www.creditooudebito.com.br/wp-content/uploads/2017/05/quarto-de-hotel1.jpg')
        ])
        .buttons([
            builder.CardAction.openUrl(session, 'https://trivago.com.br', 'Visualizar')
        ]);

        var msg = new builder.Message(session).addAttachment(card);
        session.send(msg);
    }
]);