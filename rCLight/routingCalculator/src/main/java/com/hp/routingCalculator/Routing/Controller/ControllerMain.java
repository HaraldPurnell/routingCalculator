/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Routing.Controller;

import com.hp.routingCalculator.Entity.Edge;
import com.hp.routingCalculator.Entity.Verticies;
import com.hp.routingCalculator.Routing.Service.ServiceEdgeXML;
import com.hp.routingCalculator.Routing.Service.ServiceVerticiesXML;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMain {

    @Autowired
    private ServiceEdgeXML xmlEdgeService;
    
    @Autowired
    private ServiceVerticiesXML xmlVerticiesService;

    @GetMapping(value = "/")
    public String defaultHome(Model model)
    {
        // Create arrays
        List<Edge> edgeSet = xmlEdgeService.xopCreateSet();
        List<Verticies> vertSet = xmlVerticiesService.xopCreateSet();
        
        model.addAttribute("edges", edgeSet);
        model.addAttribute("verts", vertSet);
        return "ViewMain";
    }
}
