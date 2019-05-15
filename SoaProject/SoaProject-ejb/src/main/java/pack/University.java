package pack;

import org.apache.commons.codec.binary.Base64;
import org.jboss.annotation.security.SecurityDomain;
import org.jboss.ws.api.annotation.WebContext;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

@Stateless(name = "UniversityStateless")
@WebService(name = "UniversityService")
@SecurityDomain("new-domain")
@DeclareRoles({"developer,guest"})
@WebContext(authMethod="BASIC",transportGuarantee="NONE",secureWSDLAccess=false)
//@XmlRootElement(name="Universiy")
@XmlSeeAlso(Student.class)
@RolesAllowed("developer")
public class University{
    @XmlElementWrapper(name="student_list_wrapper")
    @XmlElement(name="element")
    public LinkedList<Student> students = new LinkedList<>();
//    private static University single_instance=null;

    public University(){System.out.println("University.University() CONSTRUCTOR");}
//    private University(){System.out.println("University.University() CONSTRUCTOR");}

//    @WebMethod
//    @WebResult(name="university_instance")
//    public static University getInstance()
//    {
//        System.out.println("getInstance was called");
//        if (single_instance == null)
//            single_instance = new University();
//
//        return single_instance;
//    }

    @WebMethod(action="addStudent")
    @RolesAllowed("developer")
    public String addStudent(@WebParam(name="name") String name, @WebParam(name="surname") String surname){
        System.out.println("addStudent was called");
        students.add(new Student(name, surname));
        return "Student added";
    }

    @WebMethod(action="addCourse")
    @RolesAllowed("developer")
    public String addCourseToStudent(@WebParam(name="name") String name, @WebParam(name="surname") String surname, @WebParam(name="course_name") String course_name){
        System.out.println("addCourseToStudent was called");
        for(Student s:students){
            if (s.name.equals(name) && s.surname.equals(surname)) {
                s.courses.add(new Course(course_name));
                break;
            }
        }
        return "Course added";
    }

    @WebMethod(action="delete")
    @RolesAllowed("developer")
    public String deleteStudent(@WebParam(name="name") String name, @WebParam(name="surname") String surname){
        boolean del=false;
        System.out.println("deleteStudent was called");
        for(Student s:students){
            if (s.name.equals(name) && s.surname.equals(surname)) {
                students.remove(s);
                del=true;
                break;
            }
        }
        if (del)
            return "Student deleted";
        else
            return "No student deleted";
    }

    @WebMethod(action="get")
    @WebResult(name="students")
    @PermitAll
    public LinkedList<Student> getStudents(){
        System.out.println("getStudents was called");
        return students;
    }

    @WebMethod(action="get_avatar")
    @WebResult(name="encoded_image")
    @PermitAll
    public String getStudentAvatar(@WebParam(name="name") String name, @WebParam(name="surname") String surname) throws IOException {
        System.out.println("getStudentAvatar was called");
//        dla kazdego studenta ten sam avatar
        BufferedImage image = ImageIO.read(new File("Q:\\studia\\INF, semestr VI\\SOA\\SOA_Skrzynski\\IdeaProjects\\MavenProjects\\SoaProject\\SoaProject-ejb\\src\\main\\java\\pack\\student_avatar.jpg"));
//        BufferedImage image =this.getClass().getResource("student_avatar.jpg");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", output);
        Base64 base64 = new Base64();
        String encodedImage = new String(base64.encodeBase64(output.toByteArray()));
        return encodedImage;
    }
}
