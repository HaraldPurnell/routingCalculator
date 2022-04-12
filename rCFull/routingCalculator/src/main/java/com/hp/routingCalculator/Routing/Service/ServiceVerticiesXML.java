/**
 *
 * @author Uglybear
 */
package com.hp.routingCalculator.Routing.Service;

import com.hp.routingCalculator.Entity.Verticies;
import com.hp.routingCalculator.Operations.OperationsXML;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Service
public class ServiceVerticiesXML extends OperationsXML {

    @Override
    public List xopCreateSet() {
        
        List data = new ArrayList();
        
        NodeList list = xopParseFile("node");
        
        for (int i = 0; i <= list.getLength() - 1; i++) {
            
            Node node = list.item(i);
            Element element = (Element) node;
            
            Verticies vert = new Verticies(element.getAttribute("name"),
                    Integer.parseInt(element.getElementsByTagName("x").item(0).getTextContent()),
                    Integer.parseInt(element.getElementsByTagName("y").item(0).getTextContent())
            );
            
            data.add(vert);
        } 
        
        return data;
    }
    
}
