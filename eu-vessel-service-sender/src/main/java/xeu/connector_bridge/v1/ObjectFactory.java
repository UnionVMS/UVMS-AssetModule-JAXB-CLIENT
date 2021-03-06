/*
﻿Developed with the contribution of the European Commission - Directorate General for Maritime Affairs and Fisheries
© European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can
redistribute it and/or modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or any later version. The IFDM Suite is distributed in
the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. You should have received a
copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package xeu.connector_bridge.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xeu.connector_bridge.v1 package. 
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

    private final static QName _POSTMSG_QNAME = new QName("urn:xeu:connector-bridge:v1", "POSTMSG");
    private final static QName _POSTMSGOUT_QNAME = new QName("urn:xeu:connector-bridge:v1", "POSTMSGOUT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xeu.connector_bridge.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostMsgType }
     * 
     */
    public PostMsgType createPostMsgType() {
        return new PostMsgType();
    }

    /**
     * Create an instance of {@link PostMsgOutType }
     * 
     */
    public PostMsgOutType createPostMsgOutType() {
        return new PostMsgOutType();
    }

    /**
     * Create an instance of {@link AssignedONType }
     * 
     */
    public AssignedONType createAssignedONType() {
        return new AssignedONType();
    }

    /**
     * Create an instance of {@link ExtElementType }
     * 
     */
    public ExtElementType createExtElementType() {
        return new ExtElementType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostMsgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xeu:connector-bridge:v1", name = "POSTMSG")
    public JAXBElement<PostMsgType> createPOSTMSG(PostMsgType value) {
        return new JAXBElement<PostMsgType>(_POSTMSG_QNAME, PostMsgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostMsgOutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xeu:connector-bridge:v1", name = "POSTMSGOUT")
    public JAXBElement<PostMsgOutType> createPOSTMSGOUT(PostMsgOutType value) {
        return new JAXBElement<PostMsgOutType>(_POSTMSGOUT_QNAME, PostMsgOutType.class, null, value);
    }

}