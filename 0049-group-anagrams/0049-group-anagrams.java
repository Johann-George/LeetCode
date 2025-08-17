class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ga = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }
        ga.addAll(map.values());
        return ga;
    }
}