import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    @Override
    public double getAmount() {
        return cost * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }
}
