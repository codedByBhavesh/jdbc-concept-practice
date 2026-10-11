package com.jdbc;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
    public static void main(String[] args) throws Exception {
        String name1 ="komal";
        String email1="komal@gmai";
        String pass1="komal@123";
        String gender1 ="female";
        String city1 ="akola";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","KARMA2003@kr" );
//      1 PreparedStatement ps =con.prepareStatement("insert into register value('"+name1+"','arjun@123','arjun122','male','mumbai')");
//      2  PreparedStatement ps =con.prepareStatement("insert into register value('"+name1+"','"+email1+"','"+pass1+"','"+gender1+"','"+city1+"')");

        PreparedStatement ps =con.prepareStatement("insert into register value(?,?,?,?,?)"); //positional parametr
        ps.setString(1,name1);
        ps.setString(2,email1);
        ps.setString(3,pass1);
        ps.setString(4,gender1);
        ps.setString(5,city1);

        int i = ps.executeUpdate();
       if(i>0){
           System.out.println("valuea store...");
       }else{
           System.out.println("value not store...");
       }

    }
}
