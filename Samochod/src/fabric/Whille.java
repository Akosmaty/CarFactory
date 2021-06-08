package fabric;

public class Whille implements Cars{
    public String getData() {
        return data;
    }

    public String data;

    public Whille(String data) {
        this.data = data;
    }

    public String toString(){

        return getData() + " ";
    }


}
