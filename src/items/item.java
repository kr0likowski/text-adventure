package items;

public class item{
    private String name;
    private String desc;
    private int value;
    public item (String name, String desc, int value)
    {
        this.name=name;
        this.desc=desc;
        this.value=value;
    }
    public void itemInfo(){
        System.out.println("This is "+name+" " + desc + " \n"+ "Value: " + value);
    }
}