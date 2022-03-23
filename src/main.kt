fun main(){
    var me = Human("Nadine", 60, 23)
    me.eat(5)
    println(me.weight)
    me.speak()
    me.birthday()
    var identity = User("Muhoza","Jada", "jadamuhoza@gmail.com", "0788537596", "Nadine-jada")
    println(identity.lastname)
    println(identity.email)


}
class Human (var name:String, var weight:Int, var age:Int) {
    fun eat(foodweight:Int) {
        weight += foodweight
        println("I am eating $foodweight kgs of food")
    }
    fun speak(){
        println("I am doing exercise everyday, I want to remain $weight kgs")
    }
    fun birthday() {
        age++
        println(age)
    }
}

data class User (var firstName:String, var lastname:String, var email: String,var phoneNumber: String, var password:String){

}