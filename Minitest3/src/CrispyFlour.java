import java.time.LocalDate;

public class CrispyFlour extends Material{
    private int quantity;

    @Override
    public double getAmount() {
        return quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }
}
