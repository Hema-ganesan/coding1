class oddeven {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 2, 7, 8, 5};
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];
        int oi = 0, ei = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even[ei++] = arr[i];
            else
                odd[oi++] = arr[i];
        }
        for (int i = 0; i < odd.length; i++) {
            for (int j = i + 1; j < odd.length; j++) {
                if (odd[i] > odd[j]) {
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }
        for (int i = 0; i < even.length; i++) {
            for (int j = i + 1; j < even.length; j++) {
                if (even[i] < even[j]) {
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }
        ei = 0;
        oi=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                if(ei<even.length)
                    arr[i] = even[ei++];
            else
                if(oi<odd.length)
                    arr[i] = odd[oi++];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}