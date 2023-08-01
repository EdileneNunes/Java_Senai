
const familia = {
pai: {
    nome: 'joão',
    idade: 35,
    hobby: 'cozinhar'
},

mae: {
    nome: 'maria',
    idade: 33,
    hobby: 'ler'
},

filho: {
    nome: 'Pedro',
    idade: 8,
    hobby: 'jogar Futebol'

}

};

const {filho: {hobby: hobbyFilho}} = familia

console.log('Hobby do filho:', hobbyFilho)
