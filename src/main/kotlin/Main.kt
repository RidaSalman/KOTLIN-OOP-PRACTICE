//Creating Class Car
//class Person constructor(val name:String,val  age:Int?,val password:Int?){
/*class Person (val name:String,val  age:Int?,val password:Int?){
    init{
        println("Here you can do something at object initialize")
    }
}

fun main(args: Array<String>) {

    // Create a person object
    var person = Person(name= "Rida", password = 10997 , age = null)
    println("person details name : ${person.name}, age : ${person.age}")
}*/
//--------------------------------------------------------------------------------------
//Creating Class Car
/*class car {
//creating member vatiables
var model: String = ""
    var engineNumber : Double = 0.0
    var timeToMaxSpeed : Int = 0
}
//Member Function
fun reachMaxSpeedIn(distance: Int, timeToMaxSpeed: Int) {
    println("Car Reach to its Max Speed in ${distance * timeToMaxSpeed}!")
}
fun printDetails(model : String, engineNumber : Double){
    println("Car is of Model :- $model having engine number $engineNumber ! ")
}
fun main() {
    val audi = car()
    // Accessing member variables
    audi.model = "AUDI800E"
    audi.engineNumber = 395.90
    audi.timeToMaxSpeed = 30

    reachMaxSpeedIn(distance = 30, timeToMaxSpeed = audi.timeToMaxSpeed)
    printDetails(model = audi.model, engineNumber = audi.engineNumber)
}*/
//-----------------------------------------------------------------------------------------
/*
class person(val name: String, val age: Int) {
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person =person("Rida" , 21)
    person.greet()
}*/
//-----------------------------------------------------------------------------------------
/*class Rectangle(val width: Double, val height: Double) {
    fun calculateArea(): Double {
        return width * height
    }

    fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 3.0)
    val area = rectangle.calculateArea()
    val perimeter = rectangle.calculatePerimeter()

    println("Rectangle Area: $area")
    println("Rectangle Perimeter: $perimeter")
}*/
//------------------------------------------------------------------------------------
/*class Student(val name: String, val age: Int) {
    fun displayDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

fun main() {
    val student = Student("Alice", 20)
    student.displayDetails()
}*/
//---------------------------------------------------------------------------------
/*class BankAccount(val accountNumber: String, var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
        println("Deposit successful. New balance: $balance")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Withdrawal successful. New balance: $balance")
        } else {
            println("Insufficient balance.")
        }
    }
}

fun main() {
    val account = BankAccount("1234567890", 1000.0)
    account.deposit(500.0)
    account.withdraw(200.0)
}*/
//----------------------------------------------------------------------------
/*class Book(val title: String, val author: String, val publicationYear: Int) {
    fun displayInfo() {
        println("Title: $title")
        println("Author: $author")
        println("Publication Year: $publicationYear")
    }
}

fun main() {
    val book = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)
    book.displayInfo()
}*/
//--------------------------------------------------------------------------------------
/*import kotlin.math.PI

class Circle(val radius: Double) {
    fun calculateArea(): Double {
        return PI * radius * radius
    }

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }
}

fun main() {
    val circle = Circle(5.0)
    val area = circle.calculateArea()
    val circumference = circle.calculateCircumference()

    println("Circle Area: $area")
    println("Circle Circumference: $circumference")
}*/
//-------------------------------------------------------------------------------------------------
/*class Employee(val name: String, val age: Int, var position: String) {
    fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Position: $position")
    }

    fun promote(newPosition: String) {
        println("Promoting $name to $newPosition")
        position = newPosition
    }
}

fun main() {
    val employee = Employee("Rida Salman", 22, "Android Developer")
    employee.displayInfo()
    employee.promote(" Junior Android Developer")
    employee.displayInfo()
}*/
//----------------------------------------------------------------------------------------------
/*class ShoppingCart {
    private val items: MutableList<String> = mutableListOf()

    fun addItem(item: String) {
        items.add(item)
        println("Added item: $item")
    }

    fun removeItem(item: String) {
        if (items.contains(item)) {
            items.remove(item)
            println("Removed item: $item")
        } else {
            println("Item not found in the shopping cart.")
        }
    }

    fun displayItems() {
        if (items.isEmpty()) {
            println("The shopping cart is empty.")
        } else {
            println("Items in the shopping cart:")
            for (item in items) {
                println(item)
            }
        }
    }
}

fun main() {
    val cart = ShoppingCart()

    cart.addItem("Shirt")
    cart.addItem("Pants")
    cart.displayItems()

    cart.removeItem("Shirt")
    cart.removeItem("Shoes")
    cart.displayItems()
}*/
//-------------------------------------------------------------------------------------------
class ShoppingCart {
    private val items: MutableList<String> = mutableListOf()

    fun addItem(item: String) {
        items.add(item)
        println("Added item: $item")
    }

    fun removeItem(item: String) {
        if (items.contains(item)) {
            items.remove(item)
            println("Removed item: $item")
        } else {
            println("Item not found in the shopping cart.")
        }
    }

    fun displayItems() {
        if (items.isEmpty()) {
            println("The shopping cart is empty.")
        } else {
            println("Items in the shopping cart:")
            for (item in items) {
                println(item)
            }
        }
    }
}

fun main() {
    val cart = ShoppingCart()

    var choice: Int
    do {
        println("===== Shopping Cart Menu =====")
        println("1. Add item")
        println("2. Remove item")
        println("3. Display items")
        println("4. Exit")
        print("Enter your choice: ")
        choice = readLine()?.toIntOrNull() ?: 0

        when (choice) {
            1 -> {
                print("Enter item to add: ")
                val item = readLine()
                if (item != null) {
                    cart.addItem(item)
                }
            }
            2 -> {
                print("Enter item to remove: ")
                val item = readLine()
                if (item != null) {
                    cart.removeItem(item)
                }
            }
            3 -> cart.displayItems()
            4 -> println("Exiting...")
            else -> println("Invalid choice. Please try again.")
        }

        println()
    } while (choice != 4)
}
