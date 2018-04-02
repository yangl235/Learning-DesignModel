package factory_method.sybase_oracle_query;

import java.sql.Connection;
import java.sql.ResultSet;

abstract public class QueryRunner {
    public ResultSet run() throws Exception {
        Connection conn = createConnection();
        String sql = createSql();
        return runSql(conn,sql);
    }
    protected abstract Connection createConnection();
    protected abstract String createSql();
    protected abstract ResultSet runSql(Connection conn,String sql) throws Exception;
}
