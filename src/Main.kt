fun main() {
var girl=Human("Lucy",22, 62)
    girl.weight
    girl.eat(40)

    var x=girl.speak("She is an amazing girl who likes partying")
    println(x)

    var g=girl.birthday()
    println(g)
var t=Person("Mary", "Wangare","marywangare@gmail.com",67875877,544)
    println(t.firstName)
    println(t.email)
}

class Human(var name:String, var age:Int, var weight:Int) {
    fun eat(foodweight: Int): Int {
        weight += foodweight
        println("I am eating $weight kgs of food")
        return weight
    }

    fun speak(Speech: String): String {
        return Speech

    }

    fun birthday(){
        age += 1
        println(age)
    }
}
class Person(var firstName:String, var lastName:String, var email:String, var PhoneNumber:Int,var password:Int)



