package pack;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.LinkedList;

//@XmlRootElement(name="Student")
public class Student {
    @XmlElement
    String name;
    @XmlElement
    String surname;
    @XmlElementWrapper(name="courses_list_wrapper")
    @XmlElement(name="element")
    public LinkedList<Course> courses = new LinkedList<>();

    public Student(String name, String surname) {
//        System.out.println - to wyswietla sie w dzialaniach serwera
        System.out.println("Student.Student() CONSTRUCTOR");
        this.name = name;
        this.surname = surname;
    }
}
