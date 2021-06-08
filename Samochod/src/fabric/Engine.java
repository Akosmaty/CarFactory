package fabric;

public class Engine implements Cars{
    public String data;

    public Engine(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
