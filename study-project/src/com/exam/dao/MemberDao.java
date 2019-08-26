package com.exam.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.exam.vo.MemberVO;


public class MemberDao {
   // DB 접속정보
   String url = "jdbc:oracle:thin:@localhost:1521:XE";
   String user = "scott";
   String password = "tiger";

   private static MemberDao instance = new MemberDao();

   public static MemberDao getInstance() {
      return instance;
   }

   private MemberDao() {
   }

   public int insertMember(MemberVO vo) {

      Connection con = null;
      PreparedStatement pstmt = null;
      int rowCount = 0;

      try {
         con = DBManager.getConnection();
         // 3단계: sql문 준비
         String sql = "INSERT INTO member (id, passwd, name, age, gender, email, reg_date)";
         sql += " VALUES (?,?,?,?,?,?,?)";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, vo.getId());
         pstmt.setString(2, vo.getPasswd());
         pstmt.setString(3, vo.getName());
         pstmt.setInt(4, vo.getAge());
         pstmt.setString(5, vo.getGender());
         pstmt.setString(6, vo.getEmail());
         pstmt.setTimestamp(7, vo.getRegDate());
         // 4단계: sql문 실행
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
         //4단계: sql문 실행
         rs = pstmt.executeQuery();
         //5단계: rs 데이터 사용
         if (rs.next()) {
            memberVO = new MemberVO();
            
            memberVO.setId(rs.getString("id"));
            memberVO.setPasswd(rs.getString("passwd"));
            memberVO.setName(rs.getString("name"));
            
            // rs.getInt("age"); 숫자값이 null이 아니고 항상 존재할 때
            String strAge = rs.getString("age");
            if (strAge != null) {
               memberVO.setAge(Integer.parseInt(strAge));
            }
            memberVO.setGender(rs.getString("gender"));
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
      // -1 아이디 불일치. 0 패스워드 불일치. 1 일치함
      int check = -1; 
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      try {
         con = DBManager.getConnection();
         
         //3단계: sql문 준비
         String sql = "SELECT passwd FROM member WHERE id = ?";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, id);
         //4단계: sql문 실행
         rs = pstmt.executeQuery();
         //5단계: rs 데이터 사용
//            rs데이터(행)이 있으면 아이디 있음
//                           패스워드비교 맞으면 로그인인증(세션값 생성)
//                                     틀리면 패스워드틀림.뒤로가기
//                        없으면 아이디 없음.뒤로가기
         if (rs.next()) { // 아이디 있음
            if (passwd.equals(rs.getString("passwd"))) {
               check = 1; // 아이디, 패스워드 일치
            } else { 
               check = 0; // 패스워드 불일치
            }
         } else { 
            check = -1; // 아이디 없음
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         DBManager.close(con, pstmt, rs);
      }
      return check;
   } // userCheck method
   
   
   
   // 전체회원정보 가져오기
   public List<MemberVO> getMembers() {
      List<MemberVO> list = new ArrayList<MemberVO>();
      
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      String sql = "";
      
      try {
         //1단계: DB 드라이버 로딩
         //2단계: DB 연결
         con = DBManager.getConnection();
         //3단계: sql문 준비
         sql = "SELECT * FROM member ORDER BY id ASC";
         stmt = con.createStatement();
         //4단계: sql문 실행 -> rs 생성
         rs = stmt.executeQuery(sql);
         //5단계: while문   rs.next() 다음행이 있으면
         //      자바빈객체 생성 MemberVO 생성 <- rs 행 1개 저장
         //      자바빈 한개 -> 배열리스트에 추가
         while (rs.next()) {
            MemberVO memberVO = new MemberVO();
            memberVO.setId(rs.getString("id"));
            memberVO.setPasswd(rs.getString("passwd"));
            memberVO.setName(rs.getString("name"));
            
            // rs.getInt("age"); 숫자값이 null이 아니고 항상 존재할 때
            String strAge = rs.getString("age");
            if (strAge != null) {
               memberVO.setAge(Integer.parseInt(strAge));
            }
            memberVO.setGender(rs.getString("gender"));
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
   

   // 회원정보 수정하기 메소드
   // 매개변수 memberVO에 passwd필드는 수정의 대상이 아니라
   // 본인 확인 용도로 사용
   public int updateMember(MemberVO memberVO) {
      int result = 0; // 1 수정성공, 0 수정실패
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = "";
      
      try {
         //1단계: DB 드라이버 로딩
         //2단계: DB 연결
         con = DBManager.getConnection();
         //3단계: sql문 준비
         sql ="SELECT passwd FROM member WHERE id = ?";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, memberVO.getId());
         //4단계: sql문 실행 -> rs 생성
         rs = pstmt.executeQuery();
         //5단계: rs 사용
         if (rs.next()) {
            if (memberVO.getPasswd().equals(rs.getString("passwd"))) {
               pstmt.close(); // SELECT문 수행한 pstmt 닫기
                
               sql = "UPDATE member SET name=?, age=?, gender=?, email=? WHERE id=?";
               pstmt = con.prepareStatement(sql);
               pstmt.setString(1, memberVO.getName());
               pstmt.setObject(2, memberVO.getAge()); // age필드값이 null일수 있으면
               //pstmt.setInt(2, memberVO.getAge()); // age필드값이 항상
               pstmt.setString(3, memberVO.getGender());
               pstmt.setString(4, memberVO.getEmail());
               pstmt.setString(5, memberVO.getId());
               // 실행
               pstmt.executeUpdate();
               
               result = 1;
            } else {
               result = 0; // 패스워드 불일치로 수정실패를 의미함
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