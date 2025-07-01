public class palindromesubstring {

    // To find the longest palindromic substring
    public static String palindromesubstring(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // it is used for Odd length
            int len2 = expandAroundCenter(s, i, i + 1);   //it is used for Even length
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end   = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // to checking palindrome using helper method.
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Main method
    public static void main(String[] args) {
        String input = "abcba";
        String result = palindromesubstring(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
