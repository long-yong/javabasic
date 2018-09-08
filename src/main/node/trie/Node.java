package node.trie;

import java.util.HashMap;

public class Node {

    public HashMap<Character, Node> children;

    public boolean isCompleteWord;

    public Node() {

        this.children = new HashMap<>();
        this.isCompleteWord = false;
    }

}
