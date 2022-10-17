class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']++;
        }
        for(int j=0;j<26;j++){
            if(arr[j]==0){
                return false;
            }
        }
        return true;
    }
}