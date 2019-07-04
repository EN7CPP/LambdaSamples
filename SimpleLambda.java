interface Able{
    
 public void say();
    
}


public class SimpleLambda {
    public static void main(String args[]) {
       Able ab=()->{System.out.println("I'm a lambda function");};
       ab.say();
    }
}
