
package PDS2.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the PDS2.cliente package. 
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

    private final static QName _GetFullNameResponse_QNAME = new QName("http://PDS2/", "getFullNameResponse");
    private final static QName _Calcula_QNAME = new QName("http://PDS2/", "calcula");
    private final static QName _CalculaResponse_QNAME = new QName("http://PDS2/", "calculaResponse");
    private final static QName _GetFullName_QNAME = new QName("http://PDS2/", "getFullName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: PDS2.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFullNameResponse }
     * 
     */
    public GetFullNameResponse createGetFullNameResponse() {
        return new GetFullNameResponse();
    }

    /**
     * Create an instance of {@link CalculaResponse }
     * 
     */
    public CalculaResponse createCalculaResponse() {
        return new CalculaResponse();
    }

    /**
     * Create an instance of {@link Calcula }
     * 
     */
    public Calcula createCalcula() {
        return new Calcula();
    }

    /**
     * Create an instance of {@link GetFullName }
     * 
     */
    public GetFullName createGetFullName() {
        return new GetFullName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PDS2/", name = "getFullNameResponse")
    public JAXBElement<GetFullNameResponse> createGetFullNameResponse(GetFullNameResponse value) {
        return new JAXBElement<GetFullNameResponse>(_GetFullNameResponse_QNAME, GetFullNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PDS2/", name = "calcula")
    public JAXBElement<Calcula> createCalcula(Calcula value) {
        return new JAXBElement<Calcula>(_Calcula_QNAME, Calcula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PDS2/", name = "calculaResponse")
    public JAXBElement<CalculaResponse> createCalculaResponse(CalculaResponse value) {
        return new JAXBElement<CalculaResponse>(_CalculaResponse_QNAME, CalculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PDS2/", name = "getFullName")
    public JAXBElement<GetFullName> createGetFullName(GetFullName value) {
        return new JAXBElement<GetFullName>(_GetFullName_QNAME, GetFullName.class, null, value);
    }

}
