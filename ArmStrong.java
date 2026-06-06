public class ArmStrong {
    public static void main(String[] args){
        int num =370;
        int org=num ;
        int sum =0;
        while (num>0){
            int digit = num%10;
            sum = sum + digit*digit*digit;
            num = num /10;
        }
        if (sum == org ){
            System.out.println("yes , Armstrong number");
        }
        else{
            System.out.println("OOPS ,it's not ");
        }
    }

}
