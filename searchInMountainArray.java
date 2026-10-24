public class searchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = peakIndexMountainArray(arr);
        int ascResult = ascSearch(arr, target, peak);
        
        if (ascResult != -1) {
            System.out.println(ascResult);
        } else {
            int finalResult = descSearch(arr, target, peak);
            System.out.println(finalResult);
        }
        
        
    }
    static int peakIndexMountainArray(int[] arr){
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

    static int ascSearch(int[] arr , int target, int peak){
        int start = 0;
        int end = peak;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    static int descSearch(int[] arr, int target, int peak){
        int start = peak+1;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                start = mid + 1;
            }else if (target > arr[mid]){
                end = mid -1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
