package solid;

import solid.srp.models.FactoryCreator;
import solid.srp.models.Order;
import solid.srp.models.Preserved;
import solid.srp.models.SaveToJson;

public class Main {
    // Разделили все методы по разным классам.
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new FactoryCreator().inputFromConsole();
        new SaveToJson(order).save();
    }
}
