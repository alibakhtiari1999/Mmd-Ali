package File1;

public class Item {
    public ItemType itemType;
    String name;
    String desc;
    int Mp;

    public Item(ItemType itemType, String name, String desc, int mp) {
        this.itemType = itemType;
        this.name = name;
        this.desc = desc;
        Mp = mp;
    }
    public void show(){
        System.out.println(name+","+desc);
    }
}
