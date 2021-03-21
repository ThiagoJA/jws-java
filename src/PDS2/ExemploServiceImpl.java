package PDS2;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "PDS2.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }

    @WebMethod
    public String getFullName(String name) {
        return name;
    }
}