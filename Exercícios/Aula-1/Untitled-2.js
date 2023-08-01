
const configuracaoPadrao = {
    tema: 'claro',
    idioma: 'ingles',
    notificacao: true,

};

const configuracaoAluno = {
    tema: 'escuro',
    tamanhoDaFonte: '18px',
    notificacao: false,

};

const configuracaoFinal = { ...configuracaoPadrao, ...configuracaoAluno,};

console.log(configuracaoFinal)

const {tema, notificacao} = configuracaoFinal;

console.log('tema:', tema);
console.log('notificações: ', notificacao);