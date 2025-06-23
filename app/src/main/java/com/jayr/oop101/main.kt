package com.jayr.oop101

import android.graphics.Rect
import java.util.Calendar
import kotlin.math.PI

/*
/*
* Class(blueprint to build our object):
* - keyword: class
* - names
* - headers: properties, mehtods
* - curly braces ( our code resides)
* */
class Book // empty class-> useless

// abstraction
abstract class Responsibilities{
    abstract fun laundry()
    abstract fun payBills()
}

// interface -contract between classes that enable or creates commont processes/
// functionilities but now when implemented in respective classes each calss defines it by itself

interface Tasks{
    val taskName:String
    fun cooking()
    fun cycling()
    fun reading()
}


class Person(var username:String,var surname:String, var age:Int): Tasks // primary constructor // interface implementation
{
    override val taskName: String = this.username
    // created a simple state
//    var yearBorn:Int
    val calendar: Calendar = Calendar.getInstance()
      var currentYear: Int

    // initializer -> run this bit, holds runnable code
    init {
        currentYear = calendar.get(Calendar.YEAR)
    }
    // secondary constructor:
    constructor(name:String, guardian:Person) : this(name, guardian.surname, 100)

    // method
    fun getYearBorn():Int{
        return currentYear - this.age
    }

    fun welcomePerson():String{
        return "Hi I am ${this.username} ${this.surname}. Welcome!"
    }
    init {
        getYearBorn()
    }

    override fun cooking() {
        TODO("Not yet implemented")
    }

    override fun cycling() {
        TODO("Not yet implemented")
    }

    override fun reading() {
        TODO("Not yet implemented")
    }


}
class Quiz(var description:String){
    constructor(description: String, suffix:String):this(description){
        this.description +=  suffix
    }

    init {
        description +="hard"
    }

}
// classes: normal class,
// abstract class
// inheritance
// encapsulation
// polymorphism: poly-many morph-forms,

interface  A{
    fun print(){ println("A")}
}
interface  B{
    fun print(){ println("B")}
}
abstract class  C{
    open fun print(){ println("C")}
}
abstract class D{
   open fun print(){ println("D")}
}

class Example: D(), A, B {
    override fun print() {
        println("Example")    }

}


*/


/*
* class(blueprint to create a real world object)... objects(instance of a class)  // theoretical
* keyword: class
* name:
* constructor(primary, secondary)
* body
* */

class SteamVehicle // empty class


class Rectangle(var width:Float, var height:Float):Shape(){
    override fun area(): Float {
        return width*height
    }

    override fun circumference(): Float {
        return 0f
    }


}

class Circle(var radius:Float):Shape(){
    override fun area(): Float {
        return (PI * radius * radius).toFloat()
    }

    override fun circumference(): Float {
        return (PI *  (2 * radius)).toFloat()
    }

}
// rule make sure that all shapes implement the following( circumference, area)
// it does ont retain state (those entities that hold data)
//interface Shape{
//    fun area():Float
//    fun circumference():Float
//}

// abstract class - able ot store state but you cannot instanciate
abstract class Shape{
    abstract fun area():Float
    abstract fun circumference():Float
}
class Cylinder(var radius:Float):Density() {

}

open class Density(){
    var rad:Double = 0.0
    var height: Double = 0.0

    fun volume(): Double {
        return ((PI * rad * rad)* height)
    }
}
//data class : it is used for handling data itself
data class User(var name:String, var age:Int)

// store constants efficiently
enum class Country(var code:String){
    GERMANY("GER"), KENYA("KEN"), SENEGAL("SEN"), CONGO("DRC")
}
enum class Gender{
    MALE, FEMALE
}
var rect1:Rectangle = Rectangle(width = 10f, height = 12f)
//    var rect2:Rectangle = Rectangle(width = 12f, height = 14f)
//    var circle:Circle = Circle(radius = 21f)
//
//    var cylinder:Cylinder = Cylinder(radius = 21.0f)
//    cylinder.volume()
//
//    var user: User = User(name = "John Doe", age =12)
//    var user2: User = User(name = "John Doe", age =12)
//    var (name, age) = user // object destructuring
//    print("My name is $name and I am $age years old.")
fun main(){

    fun nameOfFunction(){
        println("hellow world")
    }
    // lambda function : anonymous functions =>
//    var count = {number:Int ->
//         println(number)
//    }
//    count(10)

    fun danceInGerman(vararg name: String){

    }
//
    for (country in Country.entries){
        when(country){
            Country.GERMANY -> danceInGerman()
            Country.KENYA -> "Habaru"
            Country.SENEGAL -> "Bonjour"
            Country.CONGO -> "Bonjour"
        }
    }

    /*
    * COLLECTIONS:
    * - hold multiple entities inside a container
    * - by default all collections are immutable but you can make the collection mutable using a specific keyword
    * - List (ordered and u can access each entity using an index)
    * - Set(unique elements)
    * - Map(key .. value )
    *
    * */

    var fruitList: List<String> = listOf("apple", "mango","mint","pineapple","pineapple", "mango")
    fruitList.forEach { fruit ->
//        println(fruit)
    }

    var fruitSet: Set<String> = setOf("apple", "mango","mint","pineapple","pineapple", "mango")
    fruitSet.forEach { fruit ->
//        println(fruit)
    }

    var fruitMap:Map<String, String> = mapOf(
        "a" to "apple",
        "b" to "banana",
        "c" to "cherries",
           )
    fruitMap.forEach { fruit ->
        println(fruit)
    }



}








// classes (abstract, enum, open, interfaces)
// collections ( lists, sets, maps, collection "operations")
















