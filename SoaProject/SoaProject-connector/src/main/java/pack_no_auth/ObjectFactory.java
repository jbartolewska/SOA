
package main.java.pack_no_auth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pack package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStudentAvatarResponse_QNAME = new QName("http://", "getStudentAvatarResponse");
    private final static QName _IOException_QNAME = new QName("http://", "IOException");
    private final static QName _GetStudentAvatar_QNAME = new QName("http://", "getStudentAvatar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.GetStudentAvatar }
     * 
     */
    public main.java.pack_no_auth.GetStudentAvatar createGetStudentAvatar() {
        return new main.java.pack_no_auth.GetStudentAvatar();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.GetStudentAvatarResponse }
     * 
     */
    public main.java.pack_no_auth.GetStudentAvatarResponse createGetStudentAvatarResponse() {
        return new main.java.pack_no_auth.GetStudentAvatarResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.Course }
     * 
     */
    public main.java.pack_no_auth.Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link Student.CoursesListWrapper }
     * 
     */
    public Student.CoursesListWrapper createStudentCoursesListWrapper() {
        return new Student.CoursesListWrapper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link main.java.pack_no_auth.GetStudentAvatarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "getStudentAvatarResponse")
    public JAXBElement<main.java.pack_no_auth.GetStudentAvatarResponse> createGetStudentAvatarResponse(GetStudentAvatarResponse value) {
        return new JAXBElement<main.java.pack_no_auth.GetStudentAvatarResponse>(_GetStudentAvatarResponse_QNAME, main.java.pack_no_auth.GetStudentAvatarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link pack.IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link main.java.pack_no_auth.GetStudentAvatar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "getStudentAvatar")
    public JAXBElement<main.java.pack_no_auth.GetStudentAvatar> createGetStudentAvatar(main.java.pack_no_auth.GetStudentAvatar value) {
        return new JAXBElement<main.java.pack_no_auth.GetStudentAvatar>(_GetStudentAvatar_QNAME, GetStudentAvatar.class, null, value);
    }

}
