package node.trie;

import java.util.Iterator;

public class Trie {
    public Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insertWord(String word) {
        Node r = this.root;
        for (int i = 0; i < word.length(); i++) {
            Character C = word.charAt(i);
            Node child = r.children.get(C);
            if (child == null) {
                child = new Node();
                r.children.put(C, child);
            }
            r = child;
        }
        r.isCompleteWord = true;
    }


    public void displayAllWords() {
        String word = "";
        displayAllWords(this.root, word);
    }

    public void displayAllWords(Node node, String word) {

        if (node.isCompleteWord) {  System.out.println(word); }
        for (Character C : node.children.keySet()) {
            displayAllWords(node.children.get(C),  word + C );
        }
    }


    public boolean isPrefixValid(String prefix) {

        String word = "";
        return isPrefixValid(this.root, prefix, word);
    }

    public boolean isPrefixValid(Node node, String prefix, String word) {

        if(prefix.equals(word)) return true;
        for (Character C : node.children.keySet()) {
            if(isPrefixValid(node.children.get(C), prefix, word+C ))
                return true;
        }
        return false;
    }


    public boolean isWordValid(String Word) {

        String word = "";
        return isWordValid(this.root, Word, word);
    }

    public boolean isWordValid(Node node, String Word, String word) {

        if(Word.equals(word)&&node.isCompleteWord) return true;
        for (Character C : node.children.keySet()) {
            if(isWordValid(node.children.get(C), Word, word+C ))
                return true;
        }
        return false;
    }


}