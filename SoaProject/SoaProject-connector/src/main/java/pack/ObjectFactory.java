
package main.java.pack;

import main.java.pack_no_auth.Course;
import main.java.pack_no_auth.GetStudentAvatar;
import main.java.pack_no_auth.GetStudentAvatarResponse;
import main.java.pack_no_auth.IOException;
import main.java.pack_no_auth.Student;

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

    private final static QName _AddCourseToStudentResponse_QNAME = new QName("http://pack/", "addCourseToStudentResponse");
    private final static QName _AddStudentResponse_QNAME = new QName("http://pack/", "addStudentResponse");
    private final static QName _DeleteStudent_QNAME = new QName("http://pack/", "deleteStudent");
    private final static QName _GetStudentAvatarResponse_QNAME = new QName("http://pack/", "getStudentAvatarResponse");
    private final static QName _IOException_QNAME = new QName("http://pack/", "IOException");
    private final static QName _DeleteStudentResponse_QNAME = new QName("http://pack/", "deleteStudentResponse");
    private final static QName _GetStudentsResponse_QNAME = new QName("http://pack/", "getStudentsResponse");
    private final static QName _AddCourseToStudent_QNAME = new QName("http://pack/", "addCourseToStudent");
    private final static QName _AddStudent_QNAME = new QName("http://pack/", "addStudent");
    private final static QName _GetStudentAvatar_QNAME = new QName("http://pack/", "getStudentAvatar");
    private final static QName _GetStudents_QNAME = new QName("http://pack/", "getStudents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.Student }
     * 
     */
    public main.java.pack_no_auth.Student createStudent() {
        return new main.java.pack_no_auth.Student();
    }

    /**
     * Create an instance of {@link AddCourseToStudent }
     * 
     */
    public AddCourseToStudent createAddCourseToStudent() {
        return new AddCourseToStudent();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.GetStudentAvatar }
     * 
     */
    public main.java.pack_no_auth.GetStudentAvatar createGetStudentAvatar() {
        return new GetStudentAvatar();
    }

    /**
     * Create an instance of {@link GetStudents }
     * 
     */
    public GetStudents createGetStudents() {
        return new GetStudents();
    }

    /**
     * Create an instance of {@link DeleteStudentResponse }
     * 
     */
    public DeleteStudentResponse createDeleteStudentResponse() {
        return new DeleteStudentResponse();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
    }

    /**
     * Create an instance of {@link AddCourseToStudentResponse }
     * 
     */
    public AddCourseToStudentResponse createAddCourseToStudentResponse() {
        return new AddCourseToStudentResponse();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link DeleteStudent }
     * 
     */
    public DeleteStudent createDeleteStudent() {
        return new DeleteStudent();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.GetStudentAvatarResponse }
     * 
     */
    public main.java.pack_no_auth.GetStudentAvatarResponse createGetStudentAvatarResponse() {
        return new main.java.pack_no_auth.GetStudentAvatarResponse();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.IOException }
     * 
     */
    public main.java.pack_no_auth.IOException createIOException() {
        return new main.java.pack_no_auth.IOException();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.Course }
     * 
     */
    public main.java.pack_no_auth.Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link main.java.pack_no_auth.Student.CoursesListWrapper }
     * 
     */
    public Student.CoursesListWrapper createStudentCoursesListWrapper() {
        return new main.java.pack_no_auth.Student.CoursesListWrapper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCourseToStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "addCourseToStudentResponse")
    public JAXBElement<AddCourseToStudentResponse> createAddCourseToStudentResponse(AddCourseToStudentResponse value) {
        return new JAXBElement<AddCourseToStudentResponse>(_AddCourseToStudentResponse_QNAME, AddCourseToStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "deleteStudent")
    public JAXBElement<DeleteStudent> createDeleteStudent(DeleteStudent value) {
        return new JAXBElement<DeleteStudent>(_DeleteStudent_QNAME, DeleteStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link main.java.pack_no_auth.GetStudentAvatarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "getStudentAvatarResponse")
    public JAXBElement<main.java.pack_no_auth.GetStudentAvatarResponse> createGetStudentAvatarResponse(main.java.pack_no_auth.GetStudentAvatarResponse value) {
        return new JAXBElement<main.java.pack_no_auth.GetStudentAvatarResponse>(_GetStudentAvatarResponse_QNAME, GetStudentAvatarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link main.java.pack_no_auth.IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "IOException")
    public JAXBElement<main.java.pack_no_auth.IOException> createIOException(IOException value) {
        return new JAXBElement<main.java.pack_no_auth.IOException>(_IOException_QNAME, main.java.pack_no_auth.IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "deleteStudentResponse")
    public JAXBElement<DeleteStudentResponse> createDeleteStudentResponse(DeleteStudentResponse value) {
        return new JAXBElement<DeleteStudentResponse>(_DeleteStudentResponse_QNAME, DeleteStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "getStudentsResponse")
    public JAXBElement<GetStudentsResponse> createGetStudentsResponse(GetStudentsResponse value) {
        return new JAXBElement<GetStudentsResponse>(_GetStudentsResponse_QNAME, GetStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCourseToStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "addCourseToStudent")
    public JAXBElement<AddCourseToStudent> createAddCourseToStudent(AddCourseToStudent value) {
        return new JAXBElement<AddCourseToStudent>(_AddCourseToStudent_QNAME, AddCourseToStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link main.java.pack_no_auth.GetStudentAvatar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "getStudentAvatar")
    public JAXBElement<main.java.pack_no_auth.GetStudentAvatar> createGetStudentAvatar(main.java.pack_no_auth.GetStudentAvatar value) {
        return new JAXBElement<main.java.pack_no_auth.GetStudentAvatar>(_GetStudentAvatar_QNAME, main.java.pack_no_auth.GetStudentAvatar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack/", name = "getStudents")
    public JAXBElement<GetStudents> createGetStudents(GetStudents value) {
        return new JAXBElement<GetStudents>(_GetStudents_QNAME, GetStudents.class, null, value);
    }

}
