/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Routing.Service;

import com.hp.routingCalculator.Entity.Edge;
import com.hp.routingCalculator.Entity.Verticies;
import com.hp.routingCalculator.Operations.OperationsDatabase;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDatabase implements OperationsDatabase {

    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void datopSetDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    // To delete FK's from PostgreSQL, one must cascade
    @Override
    public void datopTruncateMany(String[] tableNames) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlStatement = "TRUNCATE ";
        
        for (int i = 0; i < tableNames.length - 1; i++)
        {
            sqlStatement = sqlStatement + tableNames[i] + ", "; 
        }

        sqlStatement = sqlStatement + tableNames[tableNames.length - 1]+ " CASCADE";

        jdbcTemplate.update(sqlStatement);  
    }

    @Override
    public void datopInsertMany(List objectArray, String tableName) {
        jdbcTemplate = new JdbcTemplate(dataSource);

        for (Object obj : objectArray)
        {
            String sqlStatement = "";
            
            switch(tableName)
            {
                case "verticies" -> {
                    Verticies vert = (Verticies) obj;

                    sqlStatement = "INSERT INTO verticies (verticiesName, verticiesXCoor, verticiesYCoor) VALUES ("
                            + "'"+vert.getVerticiesName()+"'" + ", " + vert.getVerticiesXCoor()+ ", " 
                            + vert.getVerticiesYCoor() + ")";
                }

                case "edge" -> {
                    Edge edge = (Edge) obj;
                    
                    sqlStatement = "INSERT INTO edge (edgeStart, edgeEnd, edgeWeight) VALUES ("
                            + "'" + edge.getEdgeStart() + "'" + ", " + "'" + edge.getEdgeEnd() + "'" + ", " 
                            + edge.getEdgeWeight() + ")";
                }
            }
            
            jdbcTemplate.update(sqlStatement);
        }
    }
}
