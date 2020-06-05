/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8algoritmos;

/**
 *
 * @author Ferhammaren
 */
public class Persona {

    private int age;
    private char sex;
    private String occupation;
    private String education;
    private String name;

    public Persona(String name, int age, char sex, String occupation, String education) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.occupation = occupation;
        this.education = education;
    }

    public Persona(int age){
        this.age=age;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Persona{ name=" + name + " age=" + age + ", sex=" + sex + ", occupation=" + occupation + ", education=" + education + '}';
    }
}
