
import java.util.ArrayList;

public class Video {

    private String Id ;
    private String name ;
    private  int size ;

    public Video(){}

    public Video(String id, String name, int size) {
        Id = id;
        this.name = name;
        this.size = size;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Video{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

