public class App {
    int arr[] = {0, 1, 9, 8, 4, 0, 0, 2,
        7, 0, 6, 0, 9};
        int indexForZero = 0;
        boolean encounteredFirstZero = false;
        //move all zero to end of array
         public static void main(String[] args) throws Exception {
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[indexForZero++]=temp;
                if(encounteredFirstZero){
                    arr[i]=0;
                }
            }
        }
    }
}
