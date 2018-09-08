package node.trie;

public class TrieTest {

        public static void main(String[] args) {

                Trie trie = new Trie();
                trie.insertWord("car");
                trie.insertWord("card");
                trie.insertWord("chip");
                trie.insertWord("trie");
                trie.insertWord("try");
                trie.displayAllWords();

                System.out.println(" ");

                System.out.println("Check isPrefixValid( ch ) = " + trie.isPrefixValid("ch") );
                System.out.println("Check isPrefixValid( chs ) = " + trie.isPrefixValid("chs") );

                System.out.println("Check isWordValid( ch ) = " + trie.isWordValid("ch") );
                System.out.println("Check isWordValid( chip ) = " + trie.isWordValid("chip") );

        }

}
