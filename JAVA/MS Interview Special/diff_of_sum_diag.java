// JAVA Code for Find difference between sums 
// of two diagonals 
class diff_of_sum_diag {

    public static int difference(int arr[][], int n) {
        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr[i][j];

                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int n = 3;

        int arr[][] = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };

        System.out.println(difference(arr, n));

        int m = 2;

        int arr2[][] = { { 10, 2 }, { 4, 5 } };

        System.out.println(difference(arr2, m));

    }
}
// This code is contributed by Arnav Kr. Mandal.
