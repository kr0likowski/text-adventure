package world;

import items.item;

import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Void> getActions() {
        return actions;
    }
    public void addAction(String s, Void v)
    {
        actions.put(s,v);
    }
    public boolean ifAction(String s)
    {
       return actions.containsKey(s);
    }
    public boolean makeAction(String s){
        if(ifAction(s))
    {
        actions.get(s);
        return true;
    }
    return false;
    }

    HashMap<String,Void> actions = new HashMap<>();

    public ArrayList<item> getItems() {
        return items;
    }
    public void addItem(item newItem){
        items.add(newItem);
    }
    public boolean ifItem(item newItem)
    {
        return items.contains(newItem);
    }
    public void removeItem(item newItem)
    {
        items.remove(newItem);
    }

    private ArrayList<item> items = new ArrayList<>();

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
