class exception_test{
    public static void main(String[] args) {
        try {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);

        } catch (Exception e) {
            //  System.out.println(e);
            System.out.println("can't divide by zero");
             System.out.println(1);
          e.printStackTrace();//provides exception all information
           System.out.println(2);
           System.out.println(e);//not povides stack trace info
            System.out.println(3);
            System.out.println(e.getMessage());//provides only description
        }
        
    }
}