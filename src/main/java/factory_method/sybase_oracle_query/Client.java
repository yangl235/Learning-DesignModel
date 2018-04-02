package factory_method.sybase_oracle_query;

import java.sql.ResultSet;

public class Client {
    private static QueryRunner runner;
    public static void main(String [] args) throws Exception{
        runner = new SybaseQueryRunner();
        ResultSet rs = runner.run();
    }
}
