package Example1;

public class Item {
    private String description;
    private int amount, priority;

    public Item(String desc, int amt, int pri) {
        description = desc;
        amount = amt;
        priority = pri;
    }
    public String getDescription() {
        return description;
    }
    public int getAmount() {
        return amount;
    }
    public int getPriority() {
        return priority;
    }
}
