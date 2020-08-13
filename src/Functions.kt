fun main(){
    val user = setUser("Yoga Bayu Samudra", 16,"Nyantai")
    println(user)
}
fun setUser(name: String, age: Int, hobby: String) = "My name is $name, I like $hobby, and I'm $age years old"