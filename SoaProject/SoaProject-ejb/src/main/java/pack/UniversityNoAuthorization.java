package pack;

import org.apache.commons.codec.binary.Base64;

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

@Stateless(name = "UniversityNoAuthorizationStateless")
@WebService(name = "UniversityNoAuthorizationService")
@XmlSeeAlso(Student.class)
public class UniversityNoAuthorization{
    @XmlElementWrapper(name="student_list_wrapper")
    @XmlElement(name="element")
    public LinkedList<Student> students = new LinkedList<>();

    public UniversityNoAuthorization(){System.out.println("UniversityNoAuthorization.UniversityNoAuthorization() CONSTRUCTOR");}

    @WebMethod(action="get_avatar")
    @WebResult(name="encoded_image")
    public String getStudentAvatar(@WebParam(name="name") String name, @WebParam(name="surname") String surname) throws IOException {
        System.out.println("getStudentAvatar was called");
        BufferedImage image = ImageIO.read(new File("Q:\\studia\\INF, semestr VI\\SOA\\SOA_Skrzynski\\IdeaProjects\\MavenProjects\\SoaProject\\SoaProject-ejb\\src\\main\\java\\pack\\student_avatar.jpg"));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", output);
        Base64 base64 = new Base64();
        String encodedImage = new String(base64.encodeBase64(output.toByteArray()));
        return encodedImage;
    }
}
