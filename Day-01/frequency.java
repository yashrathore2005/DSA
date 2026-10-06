public static int frequency(int[] arr, int target) {
    int count = 0;

    for (int num : arr) {
        if (num == target) {
            count++;
        }
    }

    return count;
}
