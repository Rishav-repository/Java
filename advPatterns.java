public class advPatterns {
    public  static void main(String[]args){
        int n=5;
        


        // Butterfly

    //     for(int i=1; i<=n; i++){

    //         for(int j=1; j<=i; j++){
    //           System.out.print("*");
    //         }

    //         int spaces=2*(n-i);
    //         for(int  j=1; j<=spaces;  j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //           System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //    for(int i=n; i>=1; i--){

    //         for(int j=1; j<=i; j++){
    //           System.out.print("*");
    //         }

    //         int spaces=2*(n-i);
    //         for(int  j=1; j<=spaces;  j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //           System.out.print("*");
    //         }
    //       System.out.println();  
    //     }





    // Rhombus

// for(int i=1; i<=n; i++){
//    int spaces=n-i;
//     for (int j=1; j<=spaces;j++ ){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=n; j++){
//               System.out.print("*");
//             }
//             System.out.println();
// }

// for(int i=0; i<=n; i++){
//     int spaces=n-i;
//     for(int j=0; j<=spaces;j++){
//         System.out.print(" ");
//     }
//    int num=n-(n-i);
//    for(int j=1; j<=num; j++){
//     System.out.print(num);
//     System.out.print(" ");
//    }
//     System.out.println();
// }



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





// Diamond

 for(int i=1; i<=n; i++){
    int spaces=n-i;
    for(int j=1; j<=spaces;j++){
        System.out.print(" ");
    }
     int stars=(2*i)-1;
    for(int j=1; j<=stars; j++){
       System.out.print("*");
    }
    System.out.println();
    }
    for(int i=n; i>=1; i--){
    int spaces=n-i;
    for(int j=1; j<=spaces;j++){
        System.out.print(" ");
    }
     int stars=(2*i)-1;
    for(int j=1; j<=stars; j++){
       System.out.print("*");
    }
    System.out.println();
    }


}
}
