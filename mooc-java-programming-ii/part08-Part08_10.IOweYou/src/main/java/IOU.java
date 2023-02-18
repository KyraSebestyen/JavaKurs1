import java.util.HashMap;
public class IOU {
    private HashMap<String, Double> nameAmount = new HashMap<>();

    public void setSum(String toWhom, double amount) {
        this.nameAmount.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.nameAmount.getOrDefault(toWhom, 0.0);
    }
}
