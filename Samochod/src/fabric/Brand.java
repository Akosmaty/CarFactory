package fabric;

public class Brand implements Cars{
    public String data;

    public Brand(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String toString(){

        return getData() + " ";
    }
}
