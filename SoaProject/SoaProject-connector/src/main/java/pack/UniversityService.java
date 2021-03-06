
package main.java.pack;

import main.java.pack_no_auth.IOException_Exception;
import main.java.pack_no_auth.ObjectFactory;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UniversityService", targetNamespace = "http://pack/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UniversityService {


    /**
     * 
     * @param courseName
     * @param surname
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "addCourse")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCourseToStudent", targetNamespace = "http://pack/", className = "pack.AddCourseToStudent")
    @ResponseWrapper(localName = "addCourseToStudentResponse", targetNamespace = "http://pack/", className = "pack.AddCourseToStudentResponse")
    public String addCourseToStudent(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname,
        @WebParam(name = "course_name", targetNamespace = "")
        String courseName);

    /**
     * 
     * @param surname
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "addStudent")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addStudent", targetNamespace = "http://pack/", className = "pack.AddStudent")
    @ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://pack/", className = "pack.AddStudentResponse")
    public String addStudent(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname);

    /**
     * 
     * @param surname
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "delete")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteStudent", targetNamespace = "http://pack/", className = "pack.DeleteStudent")
    @ResponseWrapper(localName = "deleteStudentResponse", targetNamespace = "http://pack/", className = "pack.DeleteStudentResponse")
    public String deleteStudent(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname);

    /**
     * 
     * @param surname
     * @param name
     * @return
     *     returns java.lang.String
     * @throws main.java.pack_no_auth.IOException_Exception
     */
    @WebMethod(action = "get_avatar")
    @WebResult(name = "encoded_image", targetNamespace = "")
    @RequestWrapper(localName = "getStudentAvatar", targetNamespace = "http://pack/", className = "main.java.pack_no_auth.GetStudentAvatar")
    @ResponseWrapper(localName = "getStudentAvatarResponse", targetNamespace = "http://pack/", className = "main.java.pack_no_auth.GetStudentAvatarResponse")
    public String getStudentAvatar(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname)
        throws IOException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<main.java.pack_no_auth.Student>
     */
    @WebMethod(action = "get")
    @WebResult(name = "students", targetNamespace = "")
    @RequestWrapper(localName = "getStudents", targetNamespace = "http://pack/", className = "pack.GetStudents")
    @ResponseWrapper(localName = "getStudentsResponse", targetNamespace = "http://pack/", className = "pack.GetStudentsResponse")
    public List<Student> getStudents();

}
