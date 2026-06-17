import java.util.Scanner;
public class Evensum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        int sum = 0 ;
        for (int i =0 ;i<=n ;i++){
            sum = sum +2*i;
        }
        System.out.println(sum);
        }
}