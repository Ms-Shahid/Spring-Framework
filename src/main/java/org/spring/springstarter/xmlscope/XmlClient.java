package org.spring.springstarter.xmlscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class XmlClient {

    @Autowired
    XmlJDBCConnection xmlJDBCConnection;

    public XmlJDBCConnection getXmljdbcconnection() {
        return xmlJDBCConnection;
    }

    public void setXmlJdbcConnection(XmlJDBCConnection jdbcConnection) {
        this.xmlJDBCConnection = jdbcConnection;
    }
}
