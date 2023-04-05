fun main(){
    //1 - Faça um loop for que imprima todos os números de 1 a 10
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(i in numeros){
        print("$i ")
    }
    print("\n\n")
    //2 - Faça um loop for que imprima todos os números pares de 0 a 20:
    val array = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    for(j in array){
        if(j % 2 == 0)
            print("$j ")
    }
    print("\n\n")
    //3 - Faça um loop for que imprima todos os números ímpares de 10 a 0
    val impares = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    for (k in impares){
        if (k % 2 != 0)
            print("$k ")
    }
}