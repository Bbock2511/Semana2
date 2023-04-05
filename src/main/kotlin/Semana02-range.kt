fun main(){
    //1 - Crie um range de números de 1 a 10 e imprima cada número
    for (i in 1..10){
        print("$i ")
    }
    print("\n\n")
    //2 - Crie um range de letras de 'a' a 'z' e imprima cada letra
    for (letra in 'a'..'z'){
        print("$letra ")
    }
    print("\n\n")
    //3 - Crie um range de números de 1 a 100 e imprima apenas os números pares
    for (numero in 1..100){
        if (numero % 2 == 0)
            print("$numero ")
    }
}