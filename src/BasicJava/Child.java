package BasicJava;

class Parent {
//    Parent(){
//        System.out.println("hiiiii");
//    }

    Parent (String s){
        System.out.println("Parent Class Param  "+s);
    }
}

public class Child extends Parent {

    Child (){
       // super("shukla");
         this("dhruv");
        System.out.println("Child Class Default Constructor");
    }

    Child (String s){
        super(s);
        System.out.println("Child Class Param Constructor "+s);
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }

}