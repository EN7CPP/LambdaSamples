interface Functional{
    public void display(String s);
}

class JustAClass{
    
    public static void justAFunc(Functional f,String a){
        f.display(a);
    }
    
}
class AnotherClass{
    public void show(String s){
        System.out.println(s);
    }
}
public class MethodReferences_2 {
    
    public static void main(String args[]) {
       String toBePassed="I'm string";
       Functional obj=new AnotherClass()::show;
       JustAClass.justAFunc(obj,toBePassed);
       
       
    }
}
