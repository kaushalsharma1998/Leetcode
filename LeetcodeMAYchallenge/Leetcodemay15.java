package LeetcodeMAYchallenge;

public class Leetcodemay15 {

	class TrieNode {
        boolean endOfWord;
       TrieNode[] childrens;
       TrieNode(){
           childrens = new TrieNode[26];
       }
   }
class Trie {

   /** Initialize your data structure here. */
   
   TrieNode root;
   public Trie() {
       root = new TrieNode();
   }
  
   /** Inserts a word into the trie. */
   public void insert(String word) {
       
       TrieNode ptr = root;
       for(int i=0;i<word.length();i++){
           int index = word.charAt(i) - 'a';
           if(ptr.childrens[index] == null){
               ptr.childrens[index] = new TrieNode();
           }
           ptr = ptr.childrens[index];
       }
       ptr.endOfWord = true;
   }
   
   /** Returns if the word is in the trie. */
   public boolean search(String word) {
       TrieNode ptr = root;
       for(int i=0;i<word.length();i++){
           int index = word.charAt(i) - 'a';
           if(ptr.childrens[index] == null){
               return false;
           }
           ptr = ptr.childrens[index];
       }
       return ptr.endOfWord;
   }
   
   /** Returns if there is any word in the trie that starts with the given prefix. */
   public boolean startsWith(String prefix) {
       TrieNode ptr = root;
       for(int i=0;i<prefix.length();i++){
           int index = prefix.charAt(i) - 'a';
           if(ptr.childrens[index] == null){
               return false;
           }
           ptr = ptr.childrens[index];
       }
       return true;
   }
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
