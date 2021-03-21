
package PDS2.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExemploService", targetNamespace = "http://PDS2/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExemploService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcula", targetNamespace = "http://PDS2/", className = "PDS2.cliente.Calcula")
    @ResponseWrapper(localName = "calculaResponse", targetNamespace = "http://PDS2/", className = "PDS2.cliente.CalculaResponse")
    @Action(input = "http://PDS2/ExemploService/calculaRequest", output = "http://PDS2/ExemploService/calculaResponse")
    public int calcula(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFullName", targetNamespace = "http://PDS2/", className = "PDS2.cliente.GetFullName")
    @ResponseWrapper(localName = "getFullNameResponse", targetNamespace = "http://PDS2/", className = "PDS2.cliente.GetFullNameResponse")
    @Action(input = "http://PDS2/ExemploService/getFullNameRequest", output = "http://PDS2/ExemploService/getFullNameResponse")
    public String getFullName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
