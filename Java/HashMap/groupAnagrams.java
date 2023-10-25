import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            s = String.valueOf(arr);
            if (map.containsKey(s)) {
                map.get(s).add(strs[i]);
            } else {
                map.put(s, new ArrayList<>());
                map.get(s).add(strs[i]);
            }
        }

        for (var key : map.keySet()) {
            res.add(new ArrayList<>(map.get(key)));
        }
        return res;
    }
}
