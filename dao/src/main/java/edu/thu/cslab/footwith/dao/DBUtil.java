package edu.thu.cslab.footwith.dao;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: cscg
 * Date: 13-3-12
 * Time: 下午9:53
 * To change this template use File | Settings | File Templates.
 */
public class DBUtil {
    private DBUtil() {
        try{
            Class.forName(driver);

            conn = DriverManager.getConnection(url, user,passwd);
            if(!conn.isClosed()){
                System.out.println("Succeeded connecting to the DataBase!");
            }else{
                System.out.println("Failed connecting to the DataBase!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    /**
     *
     * @return DBUtil instance
     */
    public static DBUtil getDBUtil(){

       return DBUtilInstance;
    }

    /**
     * deal with query operate to database
     * @param SQLCommand
     * @return result set of query
     * @throws SQLException
     */
    public ResultSet executeQuery(String SQLCommand) throws SQLException {
        if(conn == null){    //Failed at connection step (DBUtil Construction)
            System.out.println("Ever failed at connection step");
            throw new SQLException();
        }
        Statement statement = null;
        ResultSet rs = null;
        statement = conn.createStatement();
        rs = statement.executeQuery(SQLCommand);
        return rs;

    }

    /**
     * deal with update delete add operates to database
     * @param SQLCommand
     * @return result set contains ID
     * @throws SQLException
     */
    public ResultSet executeUpdate(String SQLCommand) throws SQLException {
        ResultSet result ;
        if(conn == null){    //Failed at connection step (DBUtil Construction)
            System.out.println("Ever failed at connection step");
            throw new SQLException();
        }
        Statement statement = conn.createStatement();
        statement.executeUpdate(SQLCommand);
        result = statement.getGeneratedKeys();
        return result;
    }
    private final String driver="com.mysql.jdbc.Driver";  //jdbc Driver
    private final String url = "jdbc:mysql://127.0.0.1:3306/footwith?useUnicode=true&characterEncoding=UTF-8";    //FootWith is the DataBase Name
    private final String user = "footwith";   //DataBase user to connect to DataBase
    private final String passwd = "123"; //DataBase user password
    private Connection conn=null;
    private static final DBUtil DBUtilInstance = new DBUtil();
}
