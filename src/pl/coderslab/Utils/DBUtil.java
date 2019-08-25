package pl.coderslab.Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public final class DBUtil {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/szkola_programowania?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "coderslab";

    private DBUtil() {}

    public static Connection createConnection() {
        return DriverManager.getConnection()
    }

}
