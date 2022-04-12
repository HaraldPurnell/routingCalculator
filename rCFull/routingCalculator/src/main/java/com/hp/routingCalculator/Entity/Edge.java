/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Edge {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edgeId")
    private Integer edgeId;
    
    @Column(name = "edgeStart")
    private String edgeStart;
    
    @Column(name = "edgeEnd")
    private String edgeEnd;
    
    @Column(name = "edgeWeight")
    private Integer edgeWeight;

    public Edge(String start, String end, Integer weight)
    {
        this.edgeStart = start;
        this.edgeEnd = end;
        this.edgeWeight = weight;
    }
    
    /**
     * @return the edgeId
     */
    public Integer getEdgeId() {
        return edgeId;
    }

    /**
     * @param edgeId the edgeId to set
     */
    public void setEdgeId(Integer edgeId) {
        this.edgeId = edgeId;
    }

    /**
     * @return the edgeStart
     */
    public String getEdgeStart() {
        return edgeStart;
    }

    /**
     * @param edgeStart the edgeStart to set
     */
    public void setEdgeStart(String edgeStart) {
        this.edgeStart = edgeStart;
    }

    /**
     * @return the edgeEnd
     */
    public String getEdgeEnd() {
        return edgeEnd;
    }

    /**
     * @param edgeEnd the edgeEnd to set
     */
    public void setEdgeEnd(String edgeEnd) {
        this.edgeEnd = edgeEnd;
    }

    /**
     * @return the edgeWeight
     */
    public Integer getEdgeWeight() {
        return edgeWeight;
    }

    /**
     * @param edgeWeight the edgeWeight to set
     */
    public void setEdgeWeight(Integer edgeWeight) {
        this.edgeWeight = edgeWeight;
    }
    
}
