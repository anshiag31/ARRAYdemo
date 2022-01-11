import java.util.Scanner;

public class IArraydemo {
   static  int arr[];//instance variable /declaration statement
    public IArraydemo()
    {
        //create the array
    }
    public static void main(String[] args) {
   //     int arr[]=new int[5];  //as a local variable
        IArraydemo obj1= new IArraydemo();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < obj1.arr.length; i++) {
            obj1.arr[i]=s.nextInt();
        }
        for (int i = 0; i < obj1.arr.length; i++) {
            System.out.println(obj1.arr[i]);

        }
    }
}
