public class Item {
    String name;
    int length;
    String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String raw() {
        StringBuffer padded = new StringBuffer(this.value);
        while (padded.toString().getBytes().length < this.length) {
            padded.append(' ');
        }

        return padded.toString();
    }

    public static Item create(String name, int length, String value) {
        Item item = new Item();
        item.setName(name);
        item.setLength(length);
        item.setValue(value);
        return item;
    }

    public static void main(String[] args) {
        Packet packet = new Packet();

        Item item1 = new Item();
        item1.setName("이름");
        item1.setLength(20);
        item1.setValue("홍길동");

        Item item2 = new Item();
        item2.setName("전화번호");
        item2.setLength(11);
        item2.setValue("01099998888");

        packet.addItem(item1);
        packet.addItem(item2);

        System.out.println("[" + packet.raw() + "]");
    }
}
