package fabric;

public class Color implements Cars{
    public String data;

    public Color(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
