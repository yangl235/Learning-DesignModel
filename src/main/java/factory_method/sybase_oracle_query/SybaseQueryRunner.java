package factory_method.sybase_oracle_query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SybaseQueryRunner extends QueryRunner {
    @Override
    protected Connection createConnection() {
        //代码逻辑
        return null;
    }

    @Override
    protected String createSql() {
        return "SELECT * FROM customers";
    }

    @Override
    protected ResultSet runSql(Connection conn, String sql) throws Exception {
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }
}
