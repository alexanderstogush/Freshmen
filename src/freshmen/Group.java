package freshmen;

import java.util.ArrayList;
import java.util.Collections;

public class Group {
    private String /*faculty, cathedra, profession,*/ name;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Student captain;

    Group(/*String faculty, String cathedra, String profession,*/ String name, Student ... listOfStudents){
        //this.faculty = faculty;
        //this.cathedra = cathedra;
        //this.profession = profession;
        this.name = name;
        for (Student student: listOfStudents){
            students.add(student);
            student.setGroup(this.name);
            if (student.getSex() == "Ч") {
                System.out.println("Студент " + student.getName() + " зарахований в групу " + name);
            } else {
                System.out.println("Студентка " + student.getName() + " зарахована в групу " + name);
            }
        }
        System.out.println();
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    protected void setCaptain() {
        System.out.println("В групі " + name + " проводяться вибори старости.");
        int i = 0;
        System.out.println("Список кандидатів: ");
        for (Student student: students){
            System.out.println(++i + ". " + student.getName());
        }
        System.out.println();
        ArrayList<Integer> results = new ArrayList<Integer>(students.size());
        for (Student student: students){
            student.myChoise(students);
        }
        for (Student student: students){
            results.add(student.getVoices());
            //System.out.print(student.getVoices());
        }
        System.out.println();
        int idWinner = results.indexOf(Collections.max(results));
        //System.out.println(idWinner);

        captain = students.get(idWinner);
        System.out.println("Шляхом голосування");
        System.out.println("старостою групи " + name + " призначається " + getCaptain());
        System.out.println();

    }

    public String getName(){
        return name;
    }

    public String getCaptain() {
        return captain.getName();
    }
}
