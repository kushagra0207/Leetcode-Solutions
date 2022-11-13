class Solution {
    public String reverseWords(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                     .reduce((ss, w) -> w + " " + ss)
                     .orElse("");

    }
}