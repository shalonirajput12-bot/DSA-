public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3 ,2};
        int ans = peakIndexMountainArray(arr);
        System.out.println(arr[ans] +" is the peak element at index "+ans);
    }
    public static int peakIndexMountainArray(int[] arr){
        int start = 0 ;
        int end  = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
