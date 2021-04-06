public class Employees {

    private String fio;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employees(String fio, String position, String email, String phone, float salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }
//   2 вид вывода
    public void printInfo() {
        System.out.println("ФИО " + fio + " Должность  "+ position +  " возраст " + age);
    }

    @Override
    public String toString() {
        return "Сотрудники{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
