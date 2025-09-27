class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Integer, Set<Character>> groupedFreq = new HashMap<>();
        for(char l : s.toCharArray()){
            freq.put(l,freq.getOrDefault(l,0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            groupedFreq.putIfAbsent(entry.getValue(), new HashSet<>());
            groupedFreq.get(entry.getValue()).add(entry.getKey());
        }

        int bestFreq = -1;
        int maxSize = -1;
        for(Map.Entry<Integer, Set<Character>> entry: groupedFreq.entrySet()){
            if(entry.getValue().size() > maxSize || entry.getValue().size() == maxSize && entry.getKey() > bestFreq){
                bestFreq = entry.getKey();
                maxSize = entry.getValue().size();
            }
        }

        StringBuilder result = new StringBuilder();
        for(char ch: groupedFreq.get(bestFreq)){
            result.append(ch);
        }

        return result.toString();
    }
}