abstract class Able{
    
 abstract public void say();
    
}


public class AnonymousClassDemo {
    public static void main(String args[]) {
       Able ab=new Able(){
         @Override
         public void say(){
             System.out.println("Overriden func of an anonymous child class(concrete)");
         }
       };
       ab.say();
    }
}
