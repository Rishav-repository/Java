import java.util.*;

public class Array {
    public static void main(String args[]) {
        // int marks[] = new int[3];
        // marks[0]=98;
        // marks[1]=97;
        // marks[2]=95;
        // for( int i=0 ;i<3; i++){
        // System.out.println(marks[i]);
        // }
// find the number and print index
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }
int x=scanner.nextInt();

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i]== x) {
            System.out.println("x found at index : "+ i);
            }
         } 

    }
}
