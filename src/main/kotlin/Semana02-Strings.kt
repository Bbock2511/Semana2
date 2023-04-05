fun main(){
    //1 - Escreva um programa que leia uma frase do usuário e imprima quantos caracteres ela possui usando length.
    print("Digite uma frase: ")
    var frase = readln()
    println("A frase possui ${frase.length} caracteres")
    print("\n")
    //2 - Escreva um programa que leia uma frase do usuário e imprima a mesma frase em ordem inversa usando loop for
    var fraseInvertida = ""
    frase = frase.lowercase()
    for (i in frase.length-1 downTo 0){
        fraseInvertida += frase[i]
    }
    println(fraseInvertida.replaceFirstChar { it.uppercase() })
    print("\n")
    //3 - Escreva um programa que leia uma frase do usuário e imprima apenas as vogais da frase usando loop for e if.
    var vogais = ""
    for (i in frase.indices){
        val caractere = frase[i]
        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'){
            vogais += caractere.uppercase()
        }
    }
    print("$vogais ")
}