public static int countVowels(String str) {
    int count = 0;

    for (char ch : str.toLowerCase().toCharArray()) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }

    return count;
}
