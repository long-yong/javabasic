package node.trie;

public class Trie {
    public Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insertWord(String word) {

        Node currentNode = this.root;

        for(int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child);
            }
            currentNode = child;
        }

        currentNode.isCompleteWord = true;
    }


}
