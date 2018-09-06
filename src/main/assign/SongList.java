package assign;
import java.util.HashMap;

public class SongList {

    public static void main(String[] args) {
        HashMap<String,String> songlist = createSongList();
        showOneSong(songlist,"Edelweiss");
        showAllSongs(songlist);
    }

    public static HashMap<String,String> createSongList() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Shades Of Purple",
                "    Well I wonder could it be\n" +
                "    When I was dreaming about you baby\n" +
                "    You were dreaming of me\n" +
                "    Call me crazy\n" +
                "    Call me blind\n" +
                "    To still be suffering is stupid after all of this time\n" +
                "    Did I lose my love to someone better\n" +
                "    And does she love you like I do\n" +
                "    I do, you know I really really do" );

        map.put("It's Only Natural",
                "    Just one last dance\n" +
                "　　before we say goodbye\n" +
                "　　when we sway and turn round and\n" +
                "　　round and round\n" +
                "　　it's like the first time\n" +
                "　　Just one more chance\n" +
                "　　hold me tight and keep me warm\n" +
                "　　cause the night is getting cold\n" +
                "　　and I don't know where I belong");

        map.put("Booom 2003 The First",
                "    Remembering me,\n" +
                "　　Discover and see\n" +
                "　　All over the world,\n" +
                "　　She's known as a girl\n" +
                "　　To those who a free,\n" +
                "　　The mind shall be key\n" +
                "　　Forgotten as the past\n" +
                "　　Cause history will last");

        map.put("Edelweiss",
                "    Edelweiss, Edelweiss\n" +
                "    Every morning you greet me\n" +
                "    Small and white,\n" +
                "    clean and bright\n" +
                "    You look happy to meet me\n" +
                "    Blossom of snow may you bloom and grow\n" +
                "    Bloom and grow forever");

        return map;
    }

    public static void showOneSong(HashMap<String,String>songlist, String key){
        System.out.println("\nPull out the song by title: " + key);
        System.out.println(songlist.get(key));
    }

    public static void showAllSongs(HashMap<String,String>songlist) {
        System.out.println("\n\nList All Songs\n");
        for(Object key:songlist.keySet()) {
            System.out.println("\n"+key+":");
            System.out.println(songlist.get(key));
        }
    }

}
