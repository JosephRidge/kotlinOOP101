package com.jayr.oop101

import java.util.Calendar

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
fun main(){
    var parent: Person = Person(username="John Doe", surname = "Does", age = 50) // parent
    var parent2: Person = Person(username="John Doe", surname = "Does", age = 50) // parent
    var individual1:Person = Person(name = "Bob", guardian = parent)// parent
    parent.welcomePerson().also(::println)
    parent.currentYear.also(::println)

    println(parent2 == parent)
    println(parent2)
    println(parent)
}








// classes (abstract, enum, open, interfaces)
// collections ( lists, sets, maps, collection "operations")
















