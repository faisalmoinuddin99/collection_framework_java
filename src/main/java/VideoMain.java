import java.util.*;

public class VideoMain {
    public static void main(String[] args) {
        List<Video> videoList = new ArrayList<>() ;
        videoList.add(new Video("abcd", "Avengers: Endgame", 500));
        videoList.add(new Video("qwer", "Java | Session 1", 200)) ;
        videoList.add(new Video("ijkl", "Mad Max: Fury Road", 300)) ;

        System.out.println("No Sorting " + videoList + "\n");

        Comparator<Video> sortById  = Comparator.comparing(Video::getId) ;
        videoList.sort(sortById);
        System.out.println("Sort by id " + videoList);

        Comparator<Video> sortByName = Comparator.comparing(Video::getName) ;
        videoList.sort(sortByName);
        System.out.println("Sort by name: " + videoList);

        Comparator<Video> sortBySize = Comparator.comparing(Video::getSize) ;
        videoList.sort(sortBySize);
        System.out.println("Sort By Size: " + videoList);

        Comparator<Video> sortBySizeThenName = Comparator.comparing(Video::getSize).thenComparing(Comparator.comparing(Video::getName)) ;
        videoList.sort(sortBySizeThenName);
        System.out.println("Sort by Size then Sort by name: " + sortBySizeThenName);
    }
}
