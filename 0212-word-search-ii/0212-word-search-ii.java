class TrieNode{
    HashMap<Character, TrieNode> children;
    boolean isWord;

    public TrieNode(){
        children = new HashMap<>();
        isWord = false;
    }

    public void addWord(String word){
        TrieNode cur = this;
        for(char c : word.toCharArray()){
            cur.children.putIfAbsent(c, new TrieNode());
            cur = cur.children.get(c);
        }
        cur.isWord = true;
    }
}

class Solution {

    private boolean[][] visit;
    private Set<String> res;
    int ROWS, COLS;
    public List<String> findWords(char[][] board, String[] words) {
        ROWS = board.length;
        COLS = board[0].length;
        TrieNode root = new TrieNode();
        for(String word : words){
            root.addWord(word);
        }
        visit = new boolean[ROWS][COLS];
        res = new HashSet<>();
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                dfs(board, root, i, j, "");
            }
        }
        return new ArrayList<>(res);
    }

    public void dfs(char[][] board, TrieNode node, int r, int c, String word){
        if(r<0 || c<0 || r>=ROWS || c>=COLS || visit[r][c] || !(node.children.containsKey(board[r][c]))){
            return;
        }

        visit[r][c] = true;
        node = node.children.get(board[r][c]);
        word += board[r][c];
        if(node.isWord){
            res.add(word);
        }

        dfs(board, node, r+1, c, word);
        dfs(board, node, r-1, c, word);
        dfs(board, node, r, c+1, word);
        dfs(board, node, r, c-1, word);

        visit[r][c] = false;
    }
}