import java.io.Serializable;

public class file implements Serializable {
    String name;

    public file(String name1) {
        this.name = name1;
    }

    public String getfilename() {
        return name;
    }

    public void setfilename(String name2) {
        this.name = name2;
    }

}
