/*
in this lesson we will see the another feature of java that is type casting. there are two type of casting in java
first is upcasting and second is down-casting , in this section first we will see about upcasting.
 */
/*
Approach for solving the question:
In order to perform class type casting we have to follow these two rules as follows:
1: Classes must be “IS-A-Relationship “.
2: An object must have the property of a class in which it is going to cast.
 */
/*
Question section: we have to make two class in which we have to call child class by the help of parent class.
 */
class  A{
    void show(){
        System.out.println("parent class method is called.");
    }
}
class  B extends A{
    @Override
    void show(){
        System.out.println("child class method is called.");
    }
}
public class type_casting1 {
    public static void main(String[] args) {

        A c = new B();
        c.show();
    }
}
