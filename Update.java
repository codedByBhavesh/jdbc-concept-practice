package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) throws Exception {

        String city1="pune";
        String email1="komal@gmai";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","KARMA2003@kr");

        PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
        ps.setString(1,city1);
        ps.setString(2,email1);

        int i =ps.executeUpdate();
        if(i>0){
            System.out.println("updated sucessfully...");
        }else{
            System.out.println("update not done");
        }
    }
}
