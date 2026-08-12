public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2,6,8,4,9};
        int max = arr[0];

        System.out.print("The array is:-");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println();

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element from the array is :- "+ max);
    }
}
