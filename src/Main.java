import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Иванов", "водитель", "11@mail.ru", "89265554411", 45000, 35);
        employees[1] = new Employees("Петров", "бухгалтер", "22@mail.ru", "89265554422", 46000, 42);
        employees[2] = new Employees("Сидоров", "кладовщик", "33@mail.ru", "89265554331", 47000, 38);
        employees[3] = new Employees("Сюткин", "механик", "44@mail.ru", "89265554444", 48000, 48);
        employees[4] = new Employees("Дюжев", "техник", "55@mail.ru", "89265554455", 35000, 23);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40) {
                System.out.println(employees[i].toString());
//                employees[i].printInfo();
//                2 вид вывода в консоль
            }
        }
    }
}

