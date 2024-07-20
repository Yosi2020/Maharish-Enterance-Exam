public class Customer {
    private String name;
    private int unitConsumed;

    //Property methods
    public String getName() {
        return name;
    }

    public int getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(int unitConsumed) {
        this.unitConsumed = unitConsumed;
    }

    //Constructor methods
    public Customer(String name) {
        this.name = name;
        unitConsumed = 0;
    }

    public Customer(String name, int unitConsumed) {
        this.name = name;
        setUnitConsumed(unitConsumed);
    }

    public double calculateFee() {
        double amountPaid;
        if (unitConsumed <= 100) {
            amountPaid = unitConsumed * 0.25;
        } else {
            amountPaid = 25;
        }
        return amountPaid;
    }

    public void detail() {
        System.out.print("Name: " + name + ", " + "Unit Consumed: " + unitConsumed + ", " + "Total Fee: " + calculateFee());
    }
}

class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer("Wege", 80);
        c.detail();
    }
}
