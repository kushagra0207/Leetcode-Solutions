class Solution {
    public int myAtoi(String s) {
        
        // Kushagra Gupta Date -2 Feb 2023
        
        
        /*
        
        Done by 2 methods...
        */
        s = s.strip();
    if (s.isEmpty())
      return 0;

    final int sign = s.charAt(0) == '-' ? -1 : 1;
    if (s.charAt(0) == '+' || s.charAt(0) == '-')
      s = s.substring(1);

    long num = 0;

    for (final char c : s.toCharArray()) {
      if (!Character.isDigit(c))
        break;
      num = num * 10 + (c - '0');
      if (sign * num <= Integer.MIN_VALUE)
        return Integer.MIN_VALUE;
      if (sign * num >= Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
    }

    return sign * (int) num;
        
    }
}