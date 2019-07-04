interface Functional{
    public void display(String s);
}

class JustAClass{
    
    public static void justAFunc(Functional f,String a){
        f.display(a);
    }
    
}
class AnotherClass{
    public static void show(String s){
        System.out.println(s);
    }
}
public class MethodReferences {
    
    public static void main(String args[]) {
       String toBePassed="I'm string";
       Functional obj=AnotherClass::show;
       JustAClass.justAFunc(obj,toBePassed);
       
       
    }
}
