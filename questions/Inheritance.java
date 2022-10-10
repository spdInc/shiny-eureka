import java.security.Principal;

class Mobile{

    public String model;
    
    Mobile(){
 
        model = "OnePlus 10T";
 
    }
 
    public String getProperties(){

        return model;
 
    }
 
 }

public class A_Q3 {

    public static void main(String agrs[]){
        Mobile m1 = new Mobile();
        String  mobile = m1.getProperties();
        System.out.println("Mobile is: "+mobile);

    }
    
}
