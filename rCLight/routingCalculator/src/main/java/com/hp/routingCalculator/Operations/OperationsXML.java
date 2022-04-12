/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Operations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public abstract class OperationsXML {

    public abstract List xopCreateSet();
    
    public NodeList xopParseFile(String tag)
    {
        try
        {
            File file = new File("input/graph.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName(tag);
            return nodeList;
        }
        catch (IOException | ParserConfigurationException | DOMException | SAXException e)
        {
            System.out.println("Oh No!");
        }  
        
        return null;
    }    
}
