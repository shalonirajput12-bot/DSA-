public class InfinteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,21,23,30,32};
        int target = 15;
        int ans = findingRange(arr , target);
        System.out.println(ans);

    }
    public static int findingRange(int[] arr, int target){
        //initiate with the chunks or window of length two.
        int start = 0;
        int end = 1;
    
        //condition for increasing the box size is target should greater than the arr[end], then only you can increase the size of the box .We will double the size of the box again and again till the target lies between the range.
        while(target > arr[end]){
            int temp = end  + 1;
            end = end + (end - start + 1)* 2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);

        

    }
    public static int BinarySearch(int[] arr, int target, int start, int end){
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1 ;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
