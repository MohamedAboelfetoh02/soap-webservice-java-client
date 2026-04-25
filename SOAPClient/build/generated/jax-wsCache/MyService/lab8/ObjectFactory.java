
package lab8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lab8 package. 
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

    private final static QName _AddNumbers_QNAME = new QName("http://lab8/", "addNumbers");
    private final static QName _AddNumbersResponse_QNAME = new QName("http://lab8/", "addNumbersResponse");
    private final static QName _DisturbSequence_QNAME = new QName("http://lab8/", "disturbSequence");
    private final static QName _DisturbSequenceResponse_QNAME = new QName("http://lab8/", "disturbSequenceResponse");
    private final static QName _GenerateLogSequence_QNAME = new QName("http://lab8/", "generateLogSequence");
    private final static QName _GenerateLogSequenceResponse_QNAME = new QName("http://lab8/", "generateLogSequenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lab8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNumbers }
     * 
     */
    public AddNumbers createAddNumbers() {
        return new AddNumbers();
    }

    /**
     * Create an instance of {@link AddNumbersResponse }
     * 
     */
    public AddNumbersResponse createAddNumbersResponse() {
        return new AddNumbersResponse();
    }

    /**
     * Create an instance of {@link DisturbSequence }
     * 
     */
    public DisturbSequence createDisturbSequence() {
        return new DisturbSequence();
    }

    /**
     * Create an instance of {@link DisturbSequenceResponse }
     * 
     */
    public DisturbSequenceResponse createDisturbSequenceResponse() {
        return new DisturbSequenceResponse();
    }

    /**
     * Create an instance of {@link GenerateLogSequence }
     * 
     */
    public GenerateLogSequence createGenerateLogSequence() {
        return new GenerateLogSequence();
    }

    /**
     * Create an instance of {@link GenerateLogSequenceResponse }
     * 
     */
    public GenerateLogSequenceResponse createGenerateLogSequenceResponse() {
        return new GenerateLogSequenceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNumbers }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab8/", name = "addNumbers")
    public JAXBElement<AddNumbers> createAddNumbers(AddNumbers value) {
        return new JAXBElement<AddNumbers>(_AddNumbers_QNAME, AddNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNumbersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab8/", name = "addNumbersResponse")
    public JAXBElement<AddNumbersResponse> createAddNumbersResponse(AddNumbersResponse value) {
        return new JAXBElement<AddNumbersResponse>(_AddNumbersResponse_QNAME, AddNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisturbSequence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisturbSequence }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab8/", name = "disturbSequence")
    public JAXBElement<DisturbSequence> createDisturbSequence(DisturbSequence value) {
        return new JAXBElement<DisturbSequence>(_DisturbSequence_QNAME, DisturbSequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisturbSequenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisturbSequenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab8/", name = "disturbSequenceResponse")
    public JAXBElement<DisturbSequenceResponse> createDisturbSequenceResponse(DisturbSequenceResponse value) {
        return new JAXBElement<DisturbSequenceResponse>(_DisturbSequenceResponse_QNAME, DisturbSequenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateLogSequence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateLogSequence }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab8/", name = "generateLogSequence")
    public JAXBElement<GenerateLogSequence> createGenerateLogSequence(GenerateLogSequence value) {
        return new JAXBElement<GenerateLogSequence>(_GenerateLogSequence_QNAME, GenerateLogSequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateLogSequenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateLogSequenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab8/", name = "generateLogSequenceResponse")
    public JAXBElement<GenerateLogSequenceResponse> createGenerateLogSequenceResponse(GenerateLogSequenceResponse value) {
        return new JAXBElement<GenerateLogSequenceResponse>(_GenerateLogSequenceResponse_QNAME, GenerateLogSequenceResponse.class, null, value);
    }

}
