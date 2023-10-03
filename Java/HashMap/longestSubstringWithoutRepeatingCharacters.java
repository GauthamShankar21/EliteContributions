class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        int i=0, j=0, n = s.length();

        int len = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();

        while(j<n){
            char ch = s.charAt(j);
            if(set.contains(ch)){
                while(i<n && s.charAt(i)!=ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                set.remove(ch);
            }
            set.add(ch);
            len = Math.max(len, j-i+1);
            j++;
        }

        return len;
    }
}
