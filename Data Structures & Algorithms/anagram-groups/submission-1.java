class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] strS = str.toCharArray();
            int[] intArr = new int[26];
            for(char c : strS){
                intArr[c - 'a']++;
            }
            String Strkey = Arrays.toString(intArr);
            map.putIfAbsent(Strkey, new ArrayList<>());
            map.get(Strkey).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
