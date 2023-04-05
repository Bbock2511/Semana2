fun main(){
    //1 - Faça um loop while que imprima todos os números de 1 a 10
    var i = 1
    while(i <= 10){
        print("$i ")
        i++
    }
    print("\n\n")
    //2 - Faça um loop while que imprima todos os números pares de 0 a 20:
    var j = 0
    while (j <= 20){
        if (j % 2 == 0){
            print("$j ")
        }
        j++
    }
    print("\n\n")
    //3 - Faça um loop while que imprima todos os números ímpares de 10 a 0:
    var k = 10
    while (k >= 0){
        if (k % 2 != 0){
            print("$k ")
        }
        k--
    }
}