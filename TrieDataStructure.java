class Trie {
    
    class TrieNode {
   
       TrieNode[] alphabet = new TrieNode[26];
       boolean endOfWorld;
       public TrieNode(){
           endOfWorld=false;
           for(int i=0;i<26;i++)
               alphabet[i]=null;
       }
   }
   
    TrieNode root=null;
   
   /** Initialize your data structure here. */
   public Trie() {
       root = new TrieNode(); 
   }
   
   /** Inserts a word into the trie. */
   public void insert(String word) {
    int length= word.length();
       TrieNode node=root;
       for(int i =0;i<length;i++){
           int index=word.charAt(i)-'a';
           if(node.alphabet[index]==null)
               node.alphabet[index]=new TrieNode();
           node=node.alphabet[index];
       }
       node.endOfWorld=true;
   }
   
   /** Returns if the word is in the trie. */
   public boolean search(String word) {
       TrieNode node=root;
       for(int i=0;i<word.length();i++){
           int index=word.charAt(i)-'a';
           if(node.alphabet[index]==null)
               return false;
           
           node=node.alphabet[index];
       }
       
       return (node!=null && node.endOfWorld);
   }
   
   /** Returns if there is any word in the trie that starts with the given prefix. */
   public boolean startsWith(String prefix) {
    TrieNode node=root;
       for(int i=0;i<prefix.length();i++){
           int index=prefix.charAt(i)-'a';
           if(node.alphabet[index]==null)
               return false;
           
           node=node.alphabet[index];
       }
       
       return node!=null;
   }
}

/**
* Your Trie object will be instantiated and called as such:
* Trie obj = new Trie();
* obj.insert(word);
* boolean param_2 = obj.search(word);
* boolean param_3 = obj.startsWith(prefix);
*/