package Example1;

import java.util.Scanner;

public class Index {
    static Scanner input = new Scanner(System.in);

    public static Item getItem() {
        String desc;
        int
                amount,
                pri;

        System.out.print("Amount: ");
        amount = Integer.parseInt(input.next());
        System.out.print("Priority: ");
        pri = Integer.parseInt(input.next());
        System.out.print("Description: ");
        input.skip("\\R");
        desc = input.nextLine();

        return new Item(desc, amount, pri);
    }
    public static void main(String[] args) {
        System.out.println("Type information of first item: ");
        Item obj1 = getItem();
        System.out.println("Type information of second item: ");
        Item obj2 = getItem();

        System.out.printf("\nFirst object.\nDescription: %s", obj1.getDescription());
        System.out.printf("\nAmount: %s", obj1.getAmount());
        System.out.printf("\nPriority: %s\n", obj1.getPriority());

        System.out.printf("\nSecond object.\nDescription: %s", obj2.getDescription());
        System.out.printf("\nAmount: %s", obj2.getAmount());
        System.out.printf("\nPriority: %s\n", obj2.getPriority());
    }
}
