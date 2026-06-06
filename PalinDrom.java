public class PalinDrom {
    public static void main(String[] args){
        int num =121;
        int org=num ;
        int rev =0;
        while (num>0){
            int digit = num%10;
            rev =rev*10+digit;
            num = num /10;
        }
        if (rev== org ){
            System.out.println("yes , Pallindrom number");
        }
        else{
            System.out.println("OOPS ,it's not ");
        }
    }

}


