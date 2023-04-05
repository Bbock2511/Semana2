fun main(){
    //1- Escreva um programa que imprima todos os números de 0 a 10, exceto o número 5, usando continue
    for (i in 0..10){
        if (i == 5)
            continue
        print("$i ")
    }
    print("\n\n")
    //2- Escreva um programa que leia números do usuário e pare quando o número digitado for negativo usando break
    var num: Int
    while (true){
        print("Digite um número: ")
        num = readln().toInt()
        if (num < 0)
            break
    }
    print("\n\n")
    //3 - Escreva um programa que leia um número inteiro positivo do usuário e imprima
    //todos os números pares de 0 até o número digitado, exceto o número 4, usando
    //continue e break
    print("Digite até qual número deseja: ")
    val inteiro = readln().toInt()
    if (inteiro > 0) {
        for (numero in 0..inteiro step 2) {
            if (numero == 4)
                continue
            print("$numero ")
            if (numero >= inteiro)
                break
        }
    } else{
        println("Número inválido")
    }
}