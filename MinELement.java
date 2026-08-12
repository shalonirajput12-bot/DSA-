public class MinELement {
    public static void main(String[] args) {
        int arr[] = {6,7,8,5,4};
        int min = arr[0];

        //Printing the array 
        System.out.print("The array is :-");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Searching for the minimum element
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        //Printing the minimum element
        System.out.println("The minimum element is :-"+ min);
    }
}
