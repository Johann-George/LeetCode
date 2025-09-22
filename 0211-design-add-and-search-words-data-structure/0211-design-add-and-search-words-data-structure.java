class TrieNode{
    HashMap<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
}

class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for(char l : word.toCharArray()){
            curr.children.putIfAbsent(l,new TrieNode());
            curr = curr.children.get(l);
        }
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return searchHelper(word,0,root);
    }

    public boolean searchHelper(String word, int index, TrieNode node){
        if(index == word.length()){
            return node.isEndOfWord;
        }

        char c = word.charAt(index);

        if(c=='.'){
            for(TrieNode child : node.children.values()){
                if(searchHelper(word,index+1,child)){
                    return true;
                }
            }
            return false;
        }
        else{
            if(!node.children.containsKey(c)){
                return false;
            }
            return searchHelper(word,index+1,node.children.get(c));
        }
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */