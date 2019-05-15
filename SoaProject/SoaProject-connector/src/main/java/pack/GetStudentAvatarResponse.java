
package main.java.pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStudentAvatarResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStudentAvatarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encoded_image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "4b", name = "getStudentAvatarResponse", propOrder = {
    "encodedImage"
})
public class GetStudentAvatarResponse {

    @XmlElement(name = "encoded_image")
    protected String encodedImage;

    /**
     * Gets the value of the encodedImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedImage() {
        return encodedImage;
    }

    /**
     * Sets the value of the encodedImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedImage(String value) {
        this.encodedImage = value;
    }

}
