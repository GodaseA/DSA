class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;   // Left pointer of sliding window
        int maxLength = 0;  // Stores the maximum length found so far
        HashSet<Character> charSet = new HashSet<>(); // To store current unique characters


        for (int right = 0; right < s.length(); right++) {

            // If duplicate found, shrink window from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left)); // remove leftmost char
                left++; // move left pointer forward
            }

            // Add the current character to the set
            charSet.add(s.charAt(right));

            // Update max length of substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
