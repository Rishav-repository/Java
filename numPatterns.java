public class numPatterns{
    public static void main(String[] args) {
        // using while loop
        int n = 1;
        while (n <= 5) {
            int spaces = 5 - n;
            int num = n;

            // Print spaces
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            // Print decreasing numbers
            while (num > 0) {
                System.out.print(num);
                num--;
            }

            num = 2;

            // Print increasing numbers
            while (num <= n) {
                System.out.print(num);
                num++;
            }

            System.out.println();
            n++;
        }



        //using for loop 
// for(int i=1; i<=n; i++){
//     int spaces=n-i;
//     for(int j=1; j<=spaces;j++){
//         System.out.print(" ");
//     }
//     for(int j=i; j>=1;j--){
//         System.out.print(j);
      
//     }
//     for(int j=2; j<=i; j++){
//         System.out.print(j);
       
//     }
//     System.out.println();

// }
    }
}

// In terms of time complexity, both versions have three nested loops, each iterating up to the value of n. Therefore, the time complexity of both versions is O(n^2), where n is the number of rows in the pattern (in this case, n = 5).

// In terms of space complexity, both versions use a constant amount of extra space for variables like n, spaces, and num. Therefore, the space complexity of both versions is O(1).