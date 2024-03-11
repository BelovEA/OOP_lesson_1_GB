package pharmacy;

import java.util.*;

public class Medicine2 implements Iterable<MedicineComponent>, Comparable<Medicine2> {
    public List<MedicineComponent> components;
    private final String name;

    public Medicine2(String name) {
        this.components = new ArrayList<>();
        this.name = name;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Medicine: " + name + components + "\n";
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return components.iterator();
    }

    @Override
    public int compareTo(Medicine2 o) {
        double totalPower = calculateTotalPower();
        double ototalPower = o.calculateTotalPower();
        return Double.compare(totalPower, ototalPower);
    }

    private double calculateTotalPower() {
        return components.stream()
                .mapToDouble(MedicineComponent::getPower)
                .sum();
    }

    public void sortComponents() {
        components.sort(Comparator.comparingDouble(MedicineComponent::getPower));
    }
}
