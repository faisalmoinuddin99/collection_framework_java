import java.util.*;

public class NamesIterator {

    public static void iterateUsingForLoop(List<String> name){
        for(int i = 0 ; i < name.size() ; i++){
            System.out.println(name.get(i));
        }
    }

    public static void iterateUsingForEach(List<String> name) {
        for(String names : name){
            System.out.println(names);
        }
    }
    public static void iterateUsingIterator(List<String> name) {
        Iterator<String> iterator = name.iterator() ;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        List<String> names = new ArrayList<>() ;
        names.add("faisal") ;
        names.add("rahul") ;
        names.add("dhoni") ;
        names.add("messi") ;

        iterateUsingForLoop(names);
        System.out.println("================");
        iterateUsingForEach(names);
        System.out.println("================");
        iterateUsingIterator(names);

    }
}