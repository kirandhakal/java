class userdefinedexception extends Exception
{
    userdefinedexception(){
        super();
    }
}
class voting{
  public static void main(String[] args) {
        int age =23;
        try{
            if(age>18)
            throw new userdefinedexception();
            System.out.println("you can vote");
        }
       catch (userdefinedexception e) {
           
            System.out.println("you cant vote");
        }
    }
}

