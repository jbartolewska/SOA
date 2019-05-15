package first.pack;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@Stateless(name = "FirstEjbStateless")
@WebService(name = "FirstEjbService")
public class FirstEjb {
    @WebMethod
    public String FirstJavaMethod(@WebParam(name="usr_name") String usr_name) {
        return "Hello user: " + usr_name + ".";
    }
}
