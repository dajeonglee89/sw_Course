package com.exam.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.exam.vo.MemberVO;


public class MemberDao {
   // DB �젒�냽�젙蹂�
   String url = "jdbc:oracle:thin:@localhost:1521:XE";
   String user = "scott";
   String password = "tiger";

   private static MemberDao instance = new MemberDao();

   public static MemberDao getInstance() {
      return instance;
   }

   private MemberDao() {
   }
   
   //아이디중복확인 
   public boolean isIdDuplicated(String id) {
	   //중복이면 true, 중복아니면 false
	   boolean isIdDuplicated = false;
	   int count = 0; //id값이 일치하는 행의 개수 
	   
	   Connection con = null;
	   PreparedStatement pstmt = null;
	   ResultSet rs = null;
	   String sql = "";
	   
	   try {
		con = DBManager.getConnection();
		sql = "SELECT COUNT(*) AS cnt FROM member WHERE id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		rs = pstmt.executeQuery();
		
		rs.next(); //커서옮기기
		count = rs.getInt(1);
		if(count == 1) {
			isIdDuplicated = true; //중복이다
		}else { //count == 0
			isIdDuplicated = false; //중복아니다 
		}
	} catch (Exception e) {

		e.printStackTrace();
	}finally {
		DBManager.close(con, pstmt, rs);
	}
	   	   
	   return isIdDuplicated;
   }

   public int insertMember(MemberVO vo) {

      Connection con = null;
      PreparedStatement pstmt = null;
      int rowCount = 0;

      try {
         con = DBManager.getConnection();
         // 3�떒怨�: sql臾� 以�鍮�
         String sql = "INSERT INTO member (id, passwd, name, email, address, tel, mtel, reg_date)";
         sql += " VALUES (?,?,?,?,?,?,?,?)";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, vo.getId());
         pstmt.setString(2, vo.getPasswd());
         pstmt.setString(3, vo.getName());
         pstmt.setString(4, vo.getEmail());
         pstmt.setString(5, vo.getAddress());
         pstmt.setString(6, vo.getTel());
         pstmt.setString(7, vo.getMtel());
         pstmt.setTimestamp(8, vo.getRegDate());
         // 4�떒怨�: sql臾� �떎�뻾
         rowCount = pstmt.executeUpdate();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         DBManager.close(con, pstmt);
      }
      return rowCount;
   } // insertMember
   
   
   public int deleteMember(String id) {
	   int rowCount = 0;
	   Connection con = null;
	   PreparedStatement pstmt = null;
	   String sql = "";
	   try {
		con = DBManager.getConnection();
		sql = "DELETE FROM member WHERE id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		rowCount = pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBManager.close(con,pstmt);
	}
	   return rowCount;
   }
   
   
   public MemberVO getMember(String id) {
      MemberVO memberVO = null;
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = "";
      
      try {
         con = DBManager.getConnection();
         sql = "SELECT * FROM member WHERE id = ?";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, id);
         //4�떒怨�: sql臾� �떎�뻾
         rs = pstmt.executeQuery();
         //5�떒怨�: rs �뜲�씠�꽣 �궗�슜
         if (rs.next()) {
            memberVO = new MemberVO();
            
            memberVO.setId(rs.getString("id"));
            memberVO.setPasswd(rs.getString("passwd"));
            memberVO.setName(rs.getString("name"));
            
            // rs.getInt("age"); �닽�옄媛믪씠 null�씠 �븘�땲怨� �빆�긽 議댁옱�븷 �븣
            String strAge = rs.getString("age");
            if (strAge != null) {

            }

            memberVO.setEmail(rs.getString("email"));
            memberVO.setRegDate(rs.getTimestamp("reg_date"));
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         DBManager.close(con, pstmt, rs);
      }
            
      return memberVO;
   } // getMember
   
   
   
   public int userCheck(String id, String passwd) {
      // -1 �븘�씠�뵒 遺덉씪移�. 0 �뙣�뒪�썙�뱶 遺덉씪移�. 1 �씪移섑븿
      int check = -1; 
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      try {
         con = DBManager.getConnection();
         
         //3�떒怨�: sql臾� 以�鍮�
         String sql = "SELECT passwd FROM member WHERE id = ?";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, id);
         //4�떒怨�: sql臾� �떎�뻾
         rs = pstmt.executeQuery();
         //5�떒怨�: rs �뜲�씠�꽣 �궗�슜
//            rs�뜲�씠�꽣(�뻾)�씠 �엳�쑝硫� �븘�씠�뵒 �엳�쓬
//                           �뙣�뒪�썙�뱶鍮꾧탳 留욎쑝硫� 濡쒓렇�씤�씤利�(�꽭�뀡媛� �깮�꽦)
//                                     ��由щ㈃ �뙣�뒪�썙�뱶��由�.�뮘濡쒓�湲�
//                        �뾾�쑝硫� �븘�씠�뵒 �뾾�쓬.�뮘濡쒓�湲�
         if (rs.next()) { // �븘�씠�뵒 �엳�쓬
            if (passwd.equals(rs.getString("passwd"))) {
               check = 1; // �븘�씠�뵒, �뙣�뒪�썙�뱶 �씪移�
            } else { 
               check = 0; // �뙣�뒪�썙�뱶 遺덉씪移�
            }
         } else { 
            check = -1; // �븘�씠�뵒 �뾾�쓬
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         DBManager.close(con, pstmt, rs);
      }
      return check;
   } // userCheck method
   
   
   
   // �쟾泥댄쉶�썝�젙蹂� 媛��졇�삤湲�
   public List<MemberVO> getMembers() {
      List<MemberVO> list = new ArrayList<MemberVO>();
      
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      String sql = "";
      
      try {
         //1�떒怨�: DB �뱶�씪�씠踰� 濡쒕뵫
         //2�떒怨�: DB �뿰寃�
         con = DBManager.getConnection();
         //3�떒怨�: sql臾� 以�鍮�
         sql = "SELECT * FROM member ORDER BY id ASC";
         stmt = con.createStatement();
         //4�떒怨�: sql臾� �떎�뻾 -> rs �깮�꽦
         rs = stmt.executeQuery(sql);
         //5�떒怨�: while臾�   rs.next() �떎�쓬�뻾�씠 �엳�쑝硫�
         //      �옄諛붾퉰媛앹껜 �깮�꽦 MemberVO �깮�꽦 <- rs �뻾 1媛� ���옣
         //      �옄諛붾퉰 �븳媛� -> 諛곗뿴由ъ뒪�듃�뿉 異붽�
         while (rs.next()) {
            MemberVO memberVO = new MemberVO();
            memberVO.setId(rs.getString("id"));
            memberVO.setPasswd(rs.getString("passwd"));
            memberVO.setName(rs.getString("name"));
            
            // rs.getInt("age"); �닽�옄媛믪씠 null�씠 �븘�땲怨� �빆�긽 議댁옱�븷 �븣
            String strAge = rs.getString("age");
            if (strAge != null) {

            }

            memberVO.setEmail(rs.getString("email"));
            memberVO.setRegDate(rs.getTimestamp("reg_date"));
            
            list.add(memberVO);
         } // while
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         DBManager.close(con, stmt, rs);
      }
      return list;
   } // getMembers method
   

   // �쉶�썝�젙蹂� �닔�젙�븯湲� 硫붿냼�뱶
   // 留ㅺ컻蹂��닔 memberVO�뿉 passwd�븘�뱶�뒗 �닔�젙�쓽 ���긽�씠 �븘�땲�씪
   // 蹂몄씤 �솗�씤 �슜�룄濡� �궗�슜
   public int updateMember(MemberVO memberVO) {
      int result = 0; // 1 �닔�젙�꽦怨�, 0 �닔�젙�떎�뙣
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = "";
      
      try {
         //1�떒怨�: DB �뱶�씪�씠踰� 濡쒕뵫
         //2�떒怨�: DB �뿰寃�
         con = DBManager.getConnection();
         //3�떒怨�: sql臾� 以�鍮�
         sql ="SELECT passwd FROM member WHERE id = ?";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, memberVO.getId());
         //4�떒怨�: sql臾� �떎�뻾 -> rs �깮�꽦
         rs = pstmt.executeQuery();
         //5�떒怨�: rs �궗�슜
         if (rs.next()) {
            if (memberVO.getPasswd().equals(rs.getString("passwd"))) {
               pstmt.close(); // SELECT臾� �닔�뻾�븳 pstmt �떕湲�
                
               sql = "UPDATE member SET name=?, age=?, gender=?, email=? WHERE id=?";
               pstmt = con.prepareStatement(sql);
               pstmt.setString(1, memberVO.getName());

               //pstmt.setInt(2, memberVO.getAge()); // age�븘�뱶媛믪씠 �빆�긽

               pstmt.setString(4, memberVO.getEmail());
               pstmt.setString(5, memberVO.getId());
               // �떎�뻾
               pstmt.executeUpdate();
               
               result = 1;
            } else {
               result = 0; // �뙣�뒪�썙�뱶 遺덉씪移섎줈 �닔�젙�떎�뙣瑜� �쓽誘명븿
            }
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         DBManager.close(con, pstmt, rs);
      }
      
      
      return result;
   }
   
   
   
   
} // MemberDao class