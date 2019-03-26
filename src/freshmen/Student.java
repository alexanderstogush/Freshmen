package freshmen;

import java.util.ArrayList;
import java.util.Random;

public class Student extends Person {

    private String group;
    private boolean presence;
    private int rating;
    private int voices = 0;


    Student(String firstName, String  lastName, int age, String sex, int rating){
        super(firstName, lastName, age, sex);
        Random random = new Random();
        presence = random.nextBoolean();
        this.rating = rating;
    }

    protected void myChoise(ArrayList<Student> candidates){
        Random random = new Random();
        int choise = random.nextInt(candidates.size());
        candidates.get(choise).setVoices(candidates.get(choise).getVoices() + 1);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean getPresence(){
        return presence;
    }

    public int getVoices() {
        return voices;
    }

    public void setVoices(int voices) {
        this.voices = voices;
    }
}
