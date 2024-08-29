public class students {
    int roll,age;
    students(){
        roll=24;
        age=12;
    }
    students(int x ,int y){
        roll= x;
        age=y;

    }
    void display(){
        System.out.println("roll and age is"+roll +" " +age);
    }
    void justfun(){
        int p;
        p=roll*0;
        System.out.println("roll and age is"+p);
    }
    public static void main(String []args){
        students ob1 =new students();
        ob1.display();
        students ob =new students(23 ,34);
        ob.display();
        students ob2 =new students(23 ,34);
        ob2.justfun();
        students ob4 =new students(211113 ,34);
        ob4.display();
    }
    
}
