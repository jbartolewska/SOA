package pack;

import javax.xml.bind.annotation.XmlElement;

public class Course {
    @XmlElement(name="course_name")
    String name;

    public Course(String name){
        this.name=name;}
}
