import java.util.*;

class A{
    public void show1(){
        System.out.println("Class A show1 method");
    }
}
class B extends A{
    public void show2(){
        System.out.println("Class B show2 method");
    }
    public void show1Demo(){
        super.show1();
    }
}

class C extends B{
    //want to call A class show1 method
    public void show3(){
        System.out.println("Class C show3 method");
    }
    @Override
    public void show1Demo() {
        super.show1Demo();
    }
}
public class BankAccountMain1{
 

    public static void main(String[] args) {
        String str = null;
        // System.out.println(str.length());
        Optional<String> opt = Optional.ofNullable(str);
        // if(opt.isPresent()){
        //     System.out.println(opt.get().length());  
        // }   
        // else{
        //     System.out.println("String is null");
        // }
        opt.ifPresentOrElse((s) -> System.out.println("abcd"),
                            () -> System.out.println("String is null"));

                        
    }
    
}


//comparable interface comapreTo() method
//comparator interface compare() method