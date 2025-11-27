class Solution {
    public String intToRoman(int num) {
         int[] integers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder result = new StringBuilder();

        for (int i = integers.length - 1; i >= 0 && num > 0; i--) {
            int number = integers[i];
            while (num >= number) {
                num = num - number;
                result.append(romans[i]);
            }
        }
        return result.toString();
        
    }
}