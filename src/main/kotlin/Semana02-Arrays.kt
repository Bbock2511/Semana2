fun main(){
    //1 - Escreva um programa que crie um array de 10 números inteiros aleatórios e imprima o maior número do array
    val numeros = intArrayOf(10, 23, 47, 8, 15, 32, 56, 92, 4, 7)
    var maior = numeros[0]
    for (i in 1 until numeros.size){
        if (numeros[i] > maior){
            maior = numeros[i]
        }
    }
    println("O maior número é $maior")
    print("\n")
    //2 - Escreva um programa que crie um array de 10 números inteiros digitados pelo usuário e imprima a média dos números do array
    val array = IntArray(10)
    for (i in array.indices){
        print("Digite o ${i+1}° número: ")
        array[i] = readln().toInt()
    }
    val media = array.average()
    print("A média é $media")
    print("\n")
    //3 - Escreva um programa que crie um array de 10 strings com nomes de frutas e imprima somente as frutas que começam com a letra "a" usando loop for e if.
    val frutas = arrayOf("Maçã", "Banana", "Abacaxi", "Laranja", "Uva", "Manga", "Pera", "Morango", "Melancia", "Amora")
    val frutasComA = ArrayList<String>()
    for (fruta in frutas){
        if (fruta.startsWith('A', true)){
            frutasComA.add(fruta)
        }
    }
    print(frutasComA.joinToString())
}
