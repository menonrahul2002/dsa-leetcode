package neetcode150.arraysandhashing;

import java.util.*;

class GroupAnagrams {   //O(n.klogk)  --> n- number of strings, k- length of longest string)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String key= new String(charArr);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

//class GroupAnagrams {    O(n.k)
//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map = new HashMap<>();
//        for(String s: strs) {
//            char[] count = new char[26];
//            for(int i=0; i< s.length(); i++) {
//                count[s.charAt(i)-'a']++;
//            }
//            String key = new String(count);
//            if(!map.containsKey(key))
//                map.put(key, new ArrayList<>());
//            map.get(key).add(s);
//        }
//        return new ArrayList<>(map.values());
//    }
//}
