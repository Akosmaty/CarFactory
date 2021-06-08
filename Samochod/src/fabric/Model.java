package fabric;

public class Model implements Cars {
    public String data;

    public Model(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
