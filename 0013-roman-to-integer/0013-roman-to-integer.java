class Solution {

    public int values(char a) {
        if (a == 'I') {
            return 1;
        }
        if (a == 'V') {
            return 5;
        }
        if (a == 'X') {
            return 10;
        }
        if (a == 'L') {
            return 50;
        }
        if (a == 'C') {
            return 100;
        }
        if (a == 'D') {
            return 500;
        }
        if (a == 'M') {
            return 1000;
        } else {
            return 0;
        }
    }

    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i == s.length() - 1) {
                ans = ans + values(s.charAt(i));
                continue;
            }

            if ((s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') || (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X')) {
                ans = ans + values(s.charAt(i)) - 2;
                 continue;
            }
            if ((s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') || (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C')) {
                ans = ans + values(s.charAt(i)) - 20;
                 continue;
            }
            if ((s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') || (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M')) {
                ans = ans + values(s.charAt(i)) - 200;
                 continue;
            }

                 ans = ans + values(s.charAt(i));
         }
        return ans;
    }
}