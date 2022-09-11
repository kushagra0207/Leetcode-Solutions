public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        int result = 0;
        int flag = 1;
        int start = 0;
        if (str == null || str.length() == 0){
            return 0;
        }
        if (str.charAt(0) == '-'){
            flag = -1;
            start = 1;
        }
        else if (str.charAt(0) == '+'){
            start = 1;
        }
        for (int i = start; i < str.length(); i ++){
            if (str.charAt(i) != '0'){
                start = i;
                break;
            }
        }
        for (int i = start; i < str.length(); i ++){
            char c = str.charAt(i);
            if (c < 48 || c > 57){
                break;
            }
            int digit = c - 48;
            int tmp = result * 10 + digit;
            if (tmp == Integer.MIN_VALUE && i == (str.length() -1) && str.charAt(0) == '-'){
                return Integer.MIN_VALUE;
            }
            else if ((tmp - digit) / 10 != result || (result > 0 && tmp < 0)){
                //overflow
                if (str.charAt(0) == '-'){
                    return Integer.MIN_VALUE;
                }
                else{
                    return Integer.MAX_VALUE;
                }
            }
            else{
                result = tmp;
            }
        }
        return result * flag;
    }
}
