class nextPermutation {
    public void nextPermutatio(int[] num) {
        int n = num.length;
        int k = n - 2;

        // null check
        if (num.length == 0 || num == null)
            return;

        // find k
        for (int i = n - 1; i >0; i--) {
            if (num[i] < num[i - 1])k--;
            else {
                break;
            }
        }
        if (k == -1) {
            reverse(num, 0, n - 1);

        }

        // else replace k with greater number
        for (int i = n - 1; i > 0; i--) {

            if (num[i] > num[k]) {
                int temp = num[k];
                num[k] = num[i];
                num[i] = temp;
                break;
            }

        }

        // reverse with greter number

        reverse(num, k + 1, n - 1);

    }

    void reverse(int[] num, int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;

        }
    }

}