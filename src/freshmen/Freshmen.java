package freshmen;

public class Freshmen {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Всі імена видумані. Будь-які збіги з реальністю -- випадковість!!!");
        System.out.println();

        Professor professor1 = new Professor("Людмила", "Васіна", 40, "Ж", "Математики", "Вища математика");
        Professor professor2 = new Professor("Марія", "Заяць", 45, "Ж", "Інформаційних технологій", "Бази Даних");
        Professor professor3 = new Professor("Віктор", "Терехов", 47, "Ч", "Інформаційних технологій", "Архітектура ПК" );

        Student student1 = new Student("Іван", "Лях", 18, "Ч", 1);
        Student student2 = new Student("Максим", "Кутельмах", 17, "Ч", 2);
        Student student3 = new Student("Богдана", "Метилюк", 17, "Ж", 3);
        Student student4 = new Student("Олександр", "Медвідь", 17, "Ч", 4);
        Student student5 = new Student("Уляна", "Садикова", 18, "Ж", 5);
        Student student6 = new Student("Юрій", "Синявський", 17, "Ч", 6);
        Student student7 = new Student("Уляна", "Здебська", 17, "Ж", 7);
        Student student8 = new Student("Руслан", "Дуда", 17, "М",8);
        Student student9 = new Student("Назар", "Янчишин", 17, "М", 9);
        Student student10 = new Student("Ірина", "Крайківська", 18, "Ж", 10);
        Student student11 = new Student("Данило", "Копитко", 17, "Ч", 11);
        Student student12 = new Student("Назарій", "Нестор", 17, "Ч", 12);
        Student student13 = new Student("Тарас", "Бень", 18, "Ч", 13);
        Student student14 = new Student("Роман", "Ковалик", 17, "Ч", 14);
        Student student15 = new Student("Богдан", "Чолач", 18, "Ч", 15);


        Group group1 = new Group("34PZ", student1, student3, student4, student10, student14);
        group1.setCaptain();
        Group group2 = new Group("33PZ", student2, student6, student8, student9, student15);
        group2.setCaptain();
        Group group3 = new Group("32PZ", student5, student7, student11, student12, student13);
        group3.setCaptain();

        System.out.println("Перша пара в групі " + group1.getName());
        professor1.roller(group1);
        System.out.println();
        System.out.println("Перша пара в групі " + group2.getName());
        professor2.roller(group2);
        System.out.println();
        System.out.println("Перша пара в групі " + group3.getName());
        professor3.roller(group3);

    }
}
