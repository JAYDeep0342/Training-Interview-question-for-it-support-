public class LargestNUMBER {
    public static void main (String[] args){
        int [] arr ={10,2,3,11,91,8};
        int largest=arr[0];
        for (int i =1;i<arr.length;i++){
          if (largest<arr[i]){
             largest =arr[i] ;
          }

        }
        System.err.println(largest);

    }
}
