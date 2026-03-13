class Solution {
    public int strStr(String haystack, String needle) {
       int i=0, j=0;
       int ans=0;
       while (i < haystack.length()){
        if (haystack.charAt(i) == needle.charAt(j)){
            i++;
            j++;
        } else {
            i = i-j+1;
            j = 0;
            ans = i ;
        }
        if(j==needle.length()){
            return ans;
        }
       } 
       return -1;
    }
}