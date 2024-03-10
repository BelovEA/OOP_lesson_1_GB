import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.imple.Azitromin;
import pharmacy.imple.Penicilinum;
import pharmacy.imple.Vetbicid;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<MedicineComponent> medList = new ArrayList<>();
        MedicineComponent asitron = new Azitromin("Asitro", 120, 10000);
        MedicineComponent penicillinium = new Penicilinum("Penicil", 100, 120);
        MedicineComponent vetbic = new Vetbicid("Vetbic", 40, 30);
//        for (MedicineComponent component: medicine1) {
//        }
//        Iterator<MedicineComponent> med = medicine1;
//        while (medicine1.hasNext()) {
//            System.out.println(med.next());
//        }

//        for (MedicineComponent component: medicine1) {
//            System.out.println(component);
//
//        }
//        LESSSON3
        medList.add(asitron);
        medList.add(penicillinium);
        medList.add(vetbic);
        System.out.println(medList);
        Collections.sort(medList, (comp1, comp2) -> (int) (comp1.getWeight() - comp2.getWeight()));
        System.out.println(medList);
        Medicine2 medicine1 = new Medicine2("Vodka");
        medicine1.addComponent(asitron).addComponent(penicillinium).addComponent(vetbic);
        Medicine2 medicine2 = new Medicine2("Pills");
        medicine2.addComponent(asitron).addComponent(penicillinium);
        Medicine2 medicine3 = new Medicine2("Injections");
        medicine3.addComponent(penicillinium).addComponent(vetbic);
        List<Medicine2> medicines = new ArrayList<>();
        medicines.add(medicine1);
        medicines.add(medicine2);
        medicines.add(medicine3);
        printSortedMedicines(medicines);


//          LESSON2
//        Doctor doc = new Doctor("Mr Esuoh", LocalDate.of
//                (1995, 5, 21), LocalDate.of
//                (2020, 10, 31), 120000);
//        Nurse nurse = new Nurse("Lida", LocalDate.of
//                (1977, 1, 20), LocalDate.of
//                (2022, 9, 13), 90000);
//        Animal fish = new Fish("Пучеглаз", 0.45f, LocalDate.now(), new Owner());
//        Animal duck = new Duck("Дональд", 3, LocalDate.now(), null);
//        Animal bird = new Bird("Кеша", 5, null, null);
//        VetClinic clinic = new VetClinic("Вет+");
//        clinic.addPersonall(doc);
//        clinic.addPersonall(nurse);
//        clinic.addAnimal(fish);
//        clinic.addAnimal(duck);
//        nurse.Vacinate(bird);
//        System.out.println(clinic.getIllGoable());
//        System.out.println(clinic.getSalary(doc));
//        clinic.setSalary(doc, 180000);
//        System.out.println(clinic.getSalary(doc));
    }
    private static void printSortedMedicines(List<Medicine2> medicines) {
        System.out.println("Medicines sorted:");
        Collections.sort(medicines);
        for (Medicine2 medicine : medicines) {
            System.out.println(medicine);
        }
    }
}