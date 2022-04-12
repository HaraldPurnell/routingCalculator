/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Routing.Service;

import com.hp.routingCalculator.Entity.Edge;
import com.hp.routingCalculator.Operations.OperationsXML;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service; 

import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  

@Service
public class ServiceEdgeXML extends OperationsXML {

    @Override
    public List xopCreateSet() {
        
        List data = new ArrayList();
        
        NodeList list = xopParseFile("link");
        
        for (int i = 0; i <= list.getLength() - 1; i++) {
            
            Node node = list.item(i);
            Element element = (Element) node;
            
            Edge edge = new Edge(element.getAttribute("start"),
                    element.getAttribute("end"),
                    Integer.parseInt(element.getElementsByTagName("weight").item(0).getTextContent()));
            
            data.add(edge);
        } 
        
        return data;
    }


}
