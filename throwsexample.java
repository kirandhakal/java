// import java.*;
public class throwsexample {
    static void validate(int age){
     
            if (age<18){
                throw new ArithmeticException("cant vote ");
                // System.out.println("cant vote");
            }
            else{
                 System.out.println("cant vote");

            }
            try{
                validate(24);
                
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
            

    }
}
