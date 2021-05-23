public class MainClass {

        public static void main(String args[]){
            // accessimg properties
            Person p1 = new Person(); // Person() -- default constructor, creates an obj
            p1.age =20;
            p1.name= "abc";
            
            Person p2  = new Person(33, "abc"); // gets constructed and initialized at the same time
            //p2.age  = 33;
            //p2.name = "abc";
    
            System.out.println(p1.age + " " +p1.name);
            System.out.println(p2.age + " " + p2.name); 

            // accessing behaviour
            p1.eat();
            p2.walk(2);

            System.out.println(Person.count); //prints 2 as there are 2 objects.
            Developer d1 = new Developer(24 , "abc");    
            d1.walk();    
        }
    }
class Developer extends Person{
    
    Developer(int age, String name){
        super(age, name); // super() keyword is used to call a parent/ base class constructor.
    }
    public Developer() {
    }
    void walk() {
        System.out.println("Developer " + name + " is walking."); // addinf a method tat is special to only Developer or, child class.
}
}   
class Person {
        String name;
        int age;
        static int count; //static means it will become a property of class, not property of an object.

        public Person(){
            count++;
            System.out.println("This is a default constructor and it creates an object.");
        }
        // parameterized constructor and constructor overloading
        public Person(int Age, String Name){
            //this(); // 1st use - this() has no param, hence this also calls the default constructor Person(). this() calls other constructors of the same class.
            this.name =  Name;
            this.age = Age;
            // 2nd use - this.var is also used to access parameters of a specific class.

        }
        // method or function- void name_of_method(params if any){body}
         void walk() {
            System.out.println(name + " is walking.");
        }
         void eat() {
            System.out.println(name + " is eating.");

        }
         void doWork(){
             System.out.println("Person is working.");
         }
         
         // function with parameter
          void walk(int steps){
             System.out.println(name + " walked " + steps + " steps.");
         }
    }

// function or method walk is using polymorphism here - poly = multiple , morphism = form

//This kind of polymorphism that void walk() exists, is called compile-time-polymorphism.

// Note - every object in java has a predefined parent object class. 

/*
Case 1- Compile time polymorphism
Here,  void walk() and void walk(int steps) exhibits compile-time-polymorphism.

Compile time polymorphism - We can specify which walk() function will be called at the compile time.

Case 2- Runtime Polymorphism
In the method overriding, a subclass overrides a method with the same signature as that of in its superclass. 
Method overriding is an example of runtime polymorphism. Here we have a void walk() in person class, as well as one
in the developer class. So, to determine which of this function will be called it has 
to wait until the runtime to link the perfct match. 
*/
