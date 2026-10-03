public class Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};
        char target = 'c';
        char ans = greaterLetter(letter , target);
        System.out.println(ans); 
    }
    public static char greaterLetter(char[] letter, char target){
        int start = 0;
        int end = letter.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target >= letter[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(start == letter.length){
            return letter[0];
        }
        return letter[start];
    }
}
