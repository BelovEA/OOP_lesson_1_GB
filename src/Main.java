import Workers.VetClinic;
import Workers.Doctor;
import Workers.Nurse;
import clients.impl.*;
import clients.*;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Mr Esuoh", LocalDate.of
                (1995, 5, 21), LocalDate.of
                (2020, 10, 31), 120000);
        Nurse nurse = new Nurse("Lida", LocalDate.of
                (1977, 1, 20), LocalDate.of
                (2022, 9, 13), 90000);
        Animal fish = new Fish("Пучеглаз", 0.45f, LocalDate.now(), new Owner());
        Animal duck = new Duck("Дональд", 3, LocalDate.now(), null);
        Animal bird = new Bird("Кеша", 5, null, null);
        VetClinic clinic = new VetClinic("Вет+");
        clinic.addPersonall(doc);
        clinic.addPersonall(nurse);
        clinic.addAnimal(fish);
        clinic.addAnimal(duck);
        nurse.Vacinate(bird);
        System.out.println(clinic.getIllGoable());
        System.out.println(clinic.getSalary(doc));
        clinic.setSalary(doc, 180000);
        System.out.println(clinic.getSalary(doc));
    }
}