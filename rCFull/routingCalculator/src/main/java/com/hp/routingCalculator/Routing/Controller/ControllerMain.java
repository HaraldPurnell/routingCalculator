/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Routing.Controller;

import com.hp.routingCalculator.Entity.Edge;
import com.hp.routingCalculator.Entity.Verticies;
import com.hp.routingCalculator.Routing.Service.ServiceDatabase;
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
    private ServiceDatabase databaseService;

    @Autowired
    private ServiceEdgeXML xmlEdgeService;
    
    @Autowired
    private ServiceVerticiesXML xmlVerticiesService;
    
    /*
    * FK deleted and recreated each time
    * See ServiceDatabase.java for explanation
    */
    @GetMapping(value = "/")
    public String defaultHome(Model model)
    {
        String[] tableNames = {"edge", "verticies"};

        // Delete all values in tables
        databaseService.datopTruncateMany(tableNames);

        // Create arrays
        List<Edge> edgeSet = xmlEdgeService.xopCreateSet();
        List<Verticies> vertSet = xmlVerticiesService.xopCreateSet();

        // Save arrays to database
        databaseService.datopInsertMany(vertSet, "verticies");
        databaseService.datopInsertMany(edgeSet, "edge");

        model.addAttribute("edges", edgeSet);
        model.addAttribute("verts", vertSet);
        return "ViewMain";
    }
}
