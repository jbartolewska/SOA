package main.java.pack;


import main.java.pack_no_auth.Course;
import main.java.pack_no_auth.IOException_Exception;

import javax.imageio.ImageIO;
import javax.xml.ws.BindingProvider;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

public class Client {
    public static void main(String[] args) throws IOException, IOException_Exception {
        UniversityService_Service service=new UniversityService_Service();
        UniversityService ws=service.getUniversityServicePort();
        setCred(ws);

        System.out.println(ws.addStudent("J","B"));
        System.out.println(ws.addStudent("J","J"));
        System.out.println(ws.addStudent("F","N"));
        System.out.println(ws.addCourseToStudent("J","B","biologia"));
        System.out.println(ws.addCourseToStudent("J","B","chemia"));
        System.out.println(ws.addCourseToStudent("J","J","informatyka"));

        List<Student> list=ws.getStudents();
        for(Student element : list){
                System.out.println("Name: " + element.getName() + " Surname: " + element.getSurname());
                if (element.getCoursesListWrapper().getElement().size()!=0){
                System.out.println("Courses: ");
                for (Course el : element.getCoursesListWrapper().getElement())
                {
                    System.out.print(" - " + el.getCourseName());
                }
                System.out.println();}
        }

        System.out.println(ws.deleteStudent("J","B"));

        String encodedImage=ws.getStudentAvatar("J","B");
        byte[] decodedImage= Base64.getDecoder().decode(encodedImage);
        ByteArrayInputStream bis = new ByteArrayInputStream(decodedImage);
        BufferedImage bImage = ImageIO.read(bis);
        ImageIO.write(bImage, "jpg", new File("Q:\\studia\\INF, semestr VI\\SOA\\SOA_Skrzynski\\IdeaProjects\\MavenProjects\\SoaProject\\SoaProject-connector\\src\\main\\java\\pack\\output.jpg") );
        System.out.println("image created");

        for(Student element : list)
            System.out.println("Name: " + element.getName() + " Surname: " + element.getSurname());
    }

    private static void setCred(UniversityService service){
        BindingProvider provider = (BindingProvider) service;
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"dev");
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,"soa");
    }
}
