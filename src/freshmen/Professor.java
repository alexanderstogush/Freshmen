package freshmen;

public class Professor extends Person {
    private String cathedra, subject;

    Professor(String firstName, String lastName, int age, String  sex, String cathedra, String subject) {
        super(firstName, lastName, age, sex);
        this.cathedra = cathedra;
        this.subject = subject;
    }

    protected void roller(Group group) {
        System.out.println("Добрий день. Я " + this.getName() + ". Я веду предмет " + subject + ".");
        int present = 0, missing = 0;
        for (Student student : group.getStudents()) {
            System.out.print(student.getName() + " присутній?");
            if (student.getPresence() == true) {
                present++;
                System.out.println(" Так");
                System.out.println("Добре. Наступний: ");
            } else {
                System.out.println(" ...");
                System.out.println("Угу. Наступний: ");
                missing++;
            }
        }
        System.out.println("Відсутні: " + missing + "\nПрисутні: " + present);
    }
}
