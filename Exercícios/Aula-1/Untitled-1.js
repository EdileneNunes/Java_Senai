
const y = 10
function exemploEscopos() {
    let x = 5
{
    var z = 15
}

console.log(y)
console.log(x)
console.log(z)

x = 20

console.log(x)
}
console.log(x)
exemploEscopos()