package main.java.pack_no_auth;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class Client{
    public static void main(String[] args) throws IOException_Exception, IOException {
        UniversityNoAuthorizationService_Service service=new UniversityNoAuthorizationService_Service();
        UniversityNoAuthorizationService ws=service.getUniversityNoAuthorizationServicePort();

        String encodedImage=ws.getStudentAvatar("J","B");
        byte[] decodedImage= Base64.getDecoder().decode(encodedImage);
        ByteArrayInputStream bis = new ByteArrayInputStream(decodedImage);
        BufferedImage bImage = ImageIO.read(bis);
        ImageIO.write(bImage, "jpg", new File("Q:\\studia\\INF, semestr VI\\SOA\\SOA_Skrzynski\\IdeaProjects\\MavenProjects\\SoaProject\\SoaProject-connector\\src\\main\\java\\pack_no_auth\\output.jpg") );
        System.out.println("image created");

    }
}

