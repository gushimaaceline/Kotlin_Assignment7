fun main() {
    oddNum()
    println(arrayNames("anna","Sarah","Juliet","Pamela"))
    guests(3)
    guests(11)
    guests(25)
    multiples()
    }

fun oddNum(){
    for (number in 1..100){
        if (number%2 !=0)
            println(number)

    }
}
fun arrayNames(name1: String,name2: String,name3: String,name4: String):Int{
    var names= arrayOf(name1,name2,name3,name4)
    var count=0;
    for (name in names){
        if (name.length>5){
           count++
        }

    }
    return count
}

fun guests(age:Int){
    if (age<=6){
        println("Serve a glass of milk")
    }else if (age<=15 && age>6){
        println("Serve a bottle of fanta orange")
    }
    else{
      println("Serve a bottle of Coca cola")
    }
}
fun multiples() {
    for (num in 1..100) {
        if (num % 3 != 0 && num % 5 != 0) {
            println(num)}
             if (num % 3 == 0) {
                println("Fizz")
            }
            if (num % 5 == 0) {
                println("Buzz")
            }
            if (num % 3 == 0 && num % 5 == 0) {
                println("Fizz Buzz")
            }

        }
    }
