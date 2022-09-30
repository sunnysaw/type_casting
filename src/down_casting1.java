import java.util.concurrent.Callable;

/*
Now we are going to make a program of down-casting in java.
 */
/*
Here solution also is same as the solution in upcasting in java that is :
In order to perform class type casting we have to follow these two rules as follows:
1: Classes must be “IS-A-Relationship “.
2: An object must have the property of a class in which it is going to cast.
 */
/*
Question section: we have to make two class in which we have to ......
 */
class C{
    String name;
    long number;
    void show(){
        System.out.println(name  );
    }
}
class D extends A{
   @Override
    void show(){
       System.out.println("this is child class method.");
    }
}
public class down_casting1 {
    public static void main(String[] args) {

        C d = new C();
       d.name = "khushi";
       d.number = 8084401;
        d.show();
    }
}
