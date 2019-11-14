package sort;

public class QuickSort {

    public void division(int arr[],int left,int right){
        int i = left;
        int j = right;
        int base = arr[left];
        if(i>=j){
            return;
        }
        while (i!=j){
            while (arr[i]<=base&&i<j){
                i++;
            }
            if(i<j){
                arr[j] = arr[i];
            }
            while (arr[j]>=base&&i<j){
                j--;
            }
            if(j>i){
                arr[i] = arr[j];
            }
        }
        arr[i] = base;
        division(arr, left, i -1);
        division(arr,i+1,right);
    }

    public static void main(String[] args) {
        int []a = new int[] {1,2,4,5,6,4,9,8,0};
        int left = 0;
        int right = a.length-1;
        QuickSort quickSort = new QuickSort();
        quickSort.division(a, left, right);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
