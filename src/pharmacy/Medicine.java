package pharmacy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine  implements Iterator<MedicineComponent>, Comparable<Medicine>{
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponents(MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public int compareTo(Medicine o) {
        double thisTotalPower = calculateTotalPower();
        double otherTotalPower = o.calculateTotalPower();
        return Double.compare(thisTotalPower, otherTotalPower);
    }

    private double calculateTotalPower() {
        return components.stream()
                .mapToDouble(MedicineComponent::getPower)
                .sum();
    }
}
