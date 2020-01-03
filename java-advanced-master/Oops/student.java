package Oops;//main within the clas
public class student {
    int id;//field or data member or instance variable
    String name;
    public static void main(String args[]){
        //Creating an object or instance
        student s1=new student();//creating an object of Student
        //Printing values of the object
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);
    }

}
