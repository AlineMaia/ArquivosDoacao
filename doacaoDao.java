package com.javatpoint.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.javatpoint.bean.doacao;

public class doacaoDao {
	
	public static Connection getConnection(){
		Connection con=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		}catch(Exception e){
		System.out.println("Erro Connection SQL");
		System.out.println(e);
		}
		return con;
		}
		
	/* CRUD - Create */
	public static int save(doacao u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement(
			"insert into register(isbn, nome_livro, genero, autor, editora, ano_publicacao, qtd_pagina, foto_1, "
			+ "foto_2, foto_3, estado, rasuras, peso_aprox, endereco, email_1, email_2, feedback_usuario, "
			+ "preco, data_entra, data_sai) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,u.getisbn());
			ps.setString(2,u.getnome_livro());
			ps.setString(3,u.getgenero());
			ps.setString(4,u.getautor());
			ps.setString(5,u.geteditora());
			ps.setString(6,u.getano_publicacao());
			ps.setString(7,u.getqtd_pagina());
			ps.setString(8,u.getfoto_1());
			ps.setString(9,u.getfoto_2());
			ps.setString(10,u.getfoto_3());
			ps.setString(11,u.getestado());
			ps.setString(12,u.getrasuras());
			ps.setInt(13,u.getpeso_aprox());
			ps.setInt(14,u.getpreco());
			ps.setString(15,u.getendereco());
			ps.setString(16,u.getemail_1());
			ps.setString(17,u.getemail_2());
			ps.setString(18,u.getfeedback_usuario());
			ps.setDate(19,new java.sql.Date(u.getdata_entra().getTime()));
			ps.setDate(20,new java.sql.Date(u.getdata_sai().getTime()));
			status=ps.executeUpdate();
		}catch(Exception e){
		System.out.println("Erro Insert SQL");
		System.out.println(e);
		}
		return status;
	}
	
	/* CRUD - Update */
	public static int update(doacao u){
	    int status=0;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement(  
	"UPDATE register SET isbn, nome_livro, genero, autor, editora, ano_publicacao, qtd_pagina, foto_1, \"\r\n"
	+ "			+ \"foto_2, foto_3, estado, rasuras, peso_aprox, endereco, email_1, email_2, feedback_usuario, \"\r\n"
	+ "			+ \"preco, data_entra, data_sai WHERE ID_donatario=?");
	        ps.setString(1,u.getisbn());
			ps.setString(2,u.getnome_livro());
			ps.setString(3,u.getgenero());
			ps.setString(4,u.getautor());
			ps.setString(5,u.geteditora());
			ps.setString(6,u.getano_publicacao());
			ps.setString(7,u.getqtd_pagina());
			ps.setString(8,u.getfoto_1());
			ps.setString(9,u.getfoto_2());
			ps.setString(10,u.getfoto_3());
			ps.setString(11,u.getestado());
			ps.setString(12,u.getrasuras());
			ps.setInt(13,u.getpeso_aprox());
			ps.setInt(14,u.getpreco());
			ps.setString(15,u.getendereco());
			ps.setString(16,u.getemail_1());
			ps.setString(17,u.getemail_2());
			ps.setString(18,u.getfeedback_usuario());
			ps.setDate(19,new java.sql.Date(u.getdata_entra().getTime()));
			ps.setDate(20,new java.sql.Date(u.getdata_sai().getTime()));
			ps.setInt(21,u.getID_donatario());
			status=ps.executeUpdate();
	        
	    }catch(Exception e){
	    	System.out.println("Erro Update SQL");
	    	System.out.println(e);
	    }
	    return status;
	}
	
	/* CRUD - Delete */
	public static int delete(doacao u){
	    int status=0;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("DELETE FROM doacao WHERE ID_doacao=?");
	        ps.setInt(1,u.getID_doacao());
	        status=ps.executeUpdate();
	    }catch(Exception e){
	    	System.out.println("Erro Delete SQL");
	    	System.out.println(e);
	    }
	  
	    return status;
	}
	
	/* CRUD - Read */
	public static List<doacao> getAllRecords(){
	    List<doacao> list=new ArrayList<doacao>();
	      
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM register");
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	        	doacao u=new doacao();
	            u.setId(rs.getInt("id"));
	            u.setName(rs.getString("name"));
	            u.setPassword(rs.getString("password"));
	            u.setEmail(rs.getString("email"));
	            u.setSex(rs.getString("sex"));
	            u.setCountry(rs.getString("country"));
	            list.add(u);
	        }
	    }catch(Exception e){
	    	System.out.println("Erro getAllRecords SQL");
	    	System.out.println(e);
	    }
	    return list;
	}
	
	/* CRUD - Read */
	public static doacao getRecordById(int id){
		doacao u=null;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM register WHERE id=?");
	        ps.setInt(1,id);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	            u=new doacao();
	            u.setId(rs.getInt("id"));
	            u.setName(rs.getString("name"));
	            u.setPassword(rs.getString("password"));
	            u.setEmail(rs.getString("email"));
	            u.setSex(rs.getString("sex"));
	            u.setCountry(rs.getString("country"));
	        }
	    }catch(Exception e){
	    	System.out.println("Erro getRecordById SQL");
	    	System.out.println(e);
	    }
	    return u;
	}
	
	/* CRUD - Read */
	public static List<doacao> getRecordsBySQL(String sql){
	    List<doacao> list=new ArrayList<doacao>();
	    
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement(sql);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	        	doacao u=new doacao();
	            u.setId(rs.getInt("id"));
	            u.setName(rs.getString("name"));
	            u.setPassword(rs.getString("password"));
	            u.setEmail(rs.getString("email"));
	            u.setSex(rs.getString("sex"));
	            u.setCountry(rs.getString("country"));
	            list.add(u);
	        }
	    }catch(Exception e){
	    	System.out.println("Erro getAllRecords SQL");
	    	System.out.println(e);
	    }
	    return list;
	}
}

