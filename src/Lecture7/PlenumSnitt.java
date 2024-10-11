package Lecture7;

public class PlenumSnitt {
    public static void main(String[] args) {
        int[] arr ={8,6,7,2,8,1,9};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println((double)sum/arr.length);
    }
}
