fun main(args: Array<String>) {
numbers()
 ageOld(20)
    ageOld(7)
    ageOld(3)
    work()




}
fun numbers() {
    for (num in 1..100) {

        if (num % 2 != 0) {
            println(num)
        }
    }
}
//fun topic(names:String):String{
//    var  titles =arrayOf("Ann" ,"Katey","Bani")
//     for (title in titles)
//         if(title  0..5)
//             if (names in 0..5){
//
//             }
//
//}
fun ageOld(years:Int){
    when(years){
        in 0..6->println(" from 1 to 6 years old a glass of milk")
        in 7..15->println("from 7 to 15 years old Fanta Orange")
        else-> println("above 15 years gets coca cola")
    }
}
fun work() {
    for (num in 1..100)
        if(num%3==0 && num%5==0)
            println("FizzBuzz")
    else if(num%3==0){
        println("Fizz")
        }
    else if (num%5==0){
        println("Buzz")
    }
      else{
          println(num)
        }
}