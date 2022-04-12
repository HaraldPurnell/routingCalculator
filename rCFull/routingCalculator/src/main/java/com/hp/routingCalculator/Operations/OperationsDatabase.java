/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Operations;

import java.util.List;
import javax.sql.DataSource;

public interface OperationsDatabase {
    public void datopSetDataSource(DataSource dataSource);
    public void datopTruncateMany(String[] tableNames);
    public void datopInsertMany(List objectArray, String tableName);
}
