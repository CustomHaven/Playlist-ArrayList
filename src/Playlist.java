// https://www.codecademy.com/courses/learn-java/projects/java-desert-island-playlist
// Q1
import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        // Q2
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // Q3 add songs (more than 5)
        desertIslandPlaylist.add("Good for you - Olivia Rodrigo");
        desertIslandPlaylist.add("Say my name - Destiny Child");
        desertIslandPlaylist.add("Changes - Tupac");
        desertIslandPlaylist.add("Where is the love - Black eyed pee");
        desertIslandPlaylist.add("Ms Jackson - Outkast");
        desertIslandPlaylist.add("Imagine - John Lennon");

        // Q4
        System.out.println(desertIslandPlaylist);

        // Q5
        System.out.println(desertIslandPlaylist.size());

        // Q6 remove songs (until we have 5 left)
        desertIslandPlaylist.remove("Good for you - Olivia Rodrigo");
        System.out.println(desertIslandPlaylist.size());

        // Q7 Swap songs around Q8 (indexOf) Q9 (tempA ie a) Q10 (set) Q11 Swap set
        // I used get() to further play with ArrayList methods!
        String a = desertIslandPlaylist.get(2);
        String b = desertIslandPlaylist.get(0);
        int aIndex = desertIslandPlaylist.indexOf(a);
        int bIndex = desertIslandPlaylist.indexOf(b);
        System.out.println(aIndex);
        System.out.println(a);
        System.out.println(bIndex);
        System.out.println(b);

        desertIslandPlaylist.set(bIndex, a);
        desertIslandPlaylist.set(aIndex, b);

        // Q12
        System.out.println(desertIslandPlaylist);

    }

}