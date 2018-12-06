package world;

public class room {
    public room(String name,int n, int s, int e, int w, String description) {
        N = n;
        S = s;
        E = e;
        W = w;
        Name=name;
        this.description = description;
    }
    private int N;

    public int getN() {
        return N;
    }

    public int getS() {
        return S;
    }

    public String getName() {
        return Name;
    }

    public int getE() {
        return E;
    }

    public int getW() {
        return W;
    }

    public String getDescription() {
        return description;
    }

    private int S;
    private String Name;
    private int E;
    private int W;
    private String description;
    private void description(String desc){
        System.out.println(Name);
    }

}
