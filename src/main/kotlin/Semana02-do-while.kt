fun main(){
    //1 - Faça um loop do-while que imprima todos os números de 1 a 10
    var i = 1
    do {
        print("$i ")
        i++
    }while (i <= 10)
    print("\n\n")
    //2 - Faça um loop do-while que peça ao usuário para digitar um número até que ele digite um número negativo
    var num: Int
    do{
        print("Digite um número: ")
        num = readln().toInt()
    }while (num > 0)
    print("\n\n")
    //3 - Faça um loop do-while que peça ao usuário para digitar um número de 1 a 10 até que ele acerte o número sorteado
    val sorteado = 8
    var digitado: Int
    do {
        print("Tente acertar o número sorteado: ")
        digitado = readln().toInt()
    }while (digitado != sorteado)
}