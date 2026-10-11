package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.sql.DriverManager.getConnection;

public class Delete {
    public static void main(String[] args)throws Exception {
        String email1="komal@gmai";
        Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","KARMA2003@kr" );
        PreparedStatement ps = con.prepareStatement("Delete from register where email=?");

        ps.setString(1,email1);

        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("Delete query execute...");
        }else{
            System.out.println("Not Run Delete Query.....");
        }
        ps.close();
        con.close();
    }
}
