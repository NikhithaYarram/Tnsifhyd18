import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        int size;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter numbers:");

        for(int i=0;i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prime numbers are");

        for(int i=0; i<size; i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2; i<=a/2; i++){
            if(a%2==0){
                return false;
            }

        }
        return true;
    }
}

// Java Program to demonstrate Optimized method to check if a number is prime
// import java.util.Scanner;

// class PrimeNumberChecker {
//     static boolean isPrime(int n)
//     {
//         // Corner case
//         if (n <= 1)
//             return false;

//         // Check from 2 to sqrt(n)
//         for (int i = 2; i <= Math.sqrt(n); i++)
//             if (n % i == 0){
//                 return false;
//     }

//         return true;
//     }

//     // Driver Program
//     public static void main(String args[])
//     {
//         int num = 4;
//         if (isPrime(num)) {
//             System.out.println(num + " is prime");
//         }
//         else {
//             System.out.println(num + " is not prime");
//         }
//     }
// }


