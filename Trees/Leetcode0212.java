class 	Leetcode0212 {
  class Trie{
        class Node{
            char c;
            Node[] arr;
            String word;
            
            Node(char c){
                this.c = c;
                this.arr = new Node[26];
                for(int i = 0; i < 26; i++){
                    this.arr[i] = null;
                }
                this.word = null;
            }
        }
        
        Node root;
        
        Trie(){
            root = new Node('\0');
        }
        
        void insert(String word){
            Node node = root;
            for(char c : word.toCharArray()){
                Node temp = node.arr[c - 'a'];
                if(temp == null){
                    temp = new Node(c);
                    node.arr[c - 'a'] = temp;
                }
                node = temp;
            }
            node.word = word;
        }
    }
    
    List<String> res;
    public List<String> findWords(char[][] board, String[] words) {
        res = new ArrayList<>();
        Trie trie = new Trie();
        for(String word : words) trie.insert(word);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(trie.root.arr[board[i][j] - 'a'] != null) dfs(board, i, j, trie.root);
            }
        }
        
        return res;
    }
    
    void dfs(char[][] board, int i, int j, Trie.Node node){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#' || node.arr[board[i][j] - 'a'] == null) return ;
        
        char c = board[i][j];
        node = node.arr[c - 'a'];
        if(node.word != null){
            res.add(node.word);
            node.word = null;
        }
        board[i][j] = '#';
        dfs(board, i - 1, j, node);
        dfs(board, i, j - 1, node);
        dfs(board, i, j + 1, node);
        dfs(board, i + 1, j, node);
        board[i][j] = c;
    } 
}