
package com.eterra._public.services.data.historicaltrendprovider;

import javax.xml.ws.WebFault;
import com.eterra._public.services.data.datatypes.InternalServerFaultDetail;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InternalServerFaultDetail", targetNamespace = "http://www.eterra.com/public/services/data/dataTypes")
public class InternalServerFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InternalServerFaultDetail faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InternalServerFault(String message, InternalServerFaultDetail faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InternalServerFault(String message, InternalServerFaultDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.eterra._public.services.data.datatypes.InternalServerFaultDetail
     */
    public InternalServerFaultDetail getFaultInfo() {
        return faultInfo;
    }

}
