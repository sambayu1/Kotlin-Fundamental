import java.util.*
fun main() {
    print("Nilai : ")
    val reader = Scanner(System.`in`)
    val nilai:Int = reader.nextInt()
    if (nilai > 90 && nilai>80){
        println('A')
    }else if (nilai > 80 && nilai>70) {
        println('B')
    }else if (nilai > 70 && nilai>60){
        println('C')
    }else if (nilai > 60 && nilai<=50){
        println('D')
    }else if (nilai <= 50 ){
        println('E')
    }
}