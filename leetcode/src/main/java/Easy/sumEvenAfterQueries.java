package Easy;

public class sumEvenAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sums[] = new int[A.length];
        int sum = 0;
        for (int i = 0; i < queries.length; i++){
            sum = 0;
            int val = queries[i][0];
            int value = queries[i][1];
            for (int j = 0; j<A.length;j++){
                if(j != val){
                    sum += A[j];
                }else{
                   sum += A[val] + value;
                }
            }
            sums[i] = sum;
        }
        return sums;
    }

    public static void main(String[] args) {

        int  A[] = new int[] {1,2,3,4};
        int queries[][] =new int[][] {{1,0},{-3,1},{-4,0},{2,3}};

        sumEvenAfterQueries sumEvenAfterQueries = new sumEvenAfterQueries();
        int sums[] = sumEvenAfterQueries.sumEvenAfterQueries(A,queries);
        for (int sum:sums){
            System.out.print(sum +" ");
        }
        System.out.println();
    }
}
