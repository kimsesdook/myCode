package com.kh.jdbc.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.kh.jdbc.model.vo.Member;

/*
 * Dao(Date access object) : db에 직접적으로 접근해서 사용자의 요청에 맞게 sql문을 실행 후 결과를 반환
 */
public class MemberDao {
	
	public int insertMember(Member m) {
		//db에 member를 insert
		//jdbc를 사용
		/*
		 * jdbc사용순서
		 * 1) JDBC 드라이버 등록 : JDBC내의 다양한 인터페이스가 특정 DBMS가 제공하는 클래스에 의해서 구현됨(사용할 수 있도록 등록)
		 * 2) CONNECTION 생성 : 연결하고자하는 DB정보를 입력해서 해당 DB와 연결할 수 있는 객체 생성
		 * 3)[PREPARED]STATEMENT : CONNECTION객체를 이용해서 생성, SQL문을 실행하고 결과를 받아주는 객체
		 * 4) SQL문을 전달해서 실행 : STATEMENT객체를 이용해서 SQL문을 실행
		 * 5)결과받기 -> SELECT문 실행 ->RESULTSET객체(조회된 결과를 담아줌) - >6_1
		 *          -> DML(INSERT, UPDATE, DELETE)-> 처리된 행 수    - > 6_2
		 * 6_1) RESULTSET객체에 담겨있는 데이터를 하나씩 추출해서 자바메모리에 담아 사용
		 * 6_2) 트랜잭션 처리(성공했으면 COMMIT, 실패했다면 ROLLBACK 실행)
		 * 7) 다 사용한 JDBC객체를 반드시 반납(CLOSE -> 생성의 역순)
		 */
		
		//INSERTMEMBER - > INSERT -> 처리된 행 수(INT)
		
		//필요한 변수 세팅
		int result =0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//실행할 sql(SQL뒤에 ;없어야함)
		String sql = "INSERT INTO MEMBER VALUES(SEQ_USER_NO.NEXTVAL,?,?,?,?,?,?,?,?,?,SYSDATE)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##JDBC","JDBC");
			conn.setAutoCommit(false);
			
			//아직 미완성 sql 문으로 ?의 값을 전부 채워야함
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,m.getUserId());
			pstmt.setString(2,m.getUserPwd());
			pstmt.setString(3,m.getUserName());
			pstmt.setString(4,m.getGender());
			pstmt.setInt(5,m.getAge());
			pstmt.setString(6,m.getEmail());
			pstmt.setString(7,m.getPhone());
			pstmt.setString(8,m.getAddress());
			pstmt.setString(9,m.getHobby());
			
			result = pstmt.executeUpdate();
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	//회원 목록을 반환하는 메서드
	public ArrayList<Member> selectMemberList(){
		//select문(여러개) -> ResultSet -> ArrayList담기
		
		ResultSet rest = null;
		ArrayList<Member> list = new ArrayList<>(); //비어있는 상테
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "SELECT * FROM MEMBER";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##JDBC","JDBC");
			
			//완성된 sql
			pstmt = conn.prepareStatement(sql);
			rest = pstmt.executeQuery();
			
			while(rest.next()) {
				Member m = new Member();
				m.setUserNo(rest.getInt("USER_NO"));
				m.setUserId(rest.getString("USER_ID"));
				m.setUserPwd(rest.getString("USER_PWD"));
				m.setUserName(rest.getString("USER_NAME"));
				m.setGender(rest.getString("GENDER"));
				m.setAge(rest.getInt("AGE"));
				m.setEmail(rest.getString("EAMIL"));
				m.setPhone(rest.getString("PHONE"));
				m.setAddress(rest.getString("ADDRESS"));
				m.setHobby(rest.getString("HOBBY"));
				m.setEnrollDate(rest.getTimestamp("ENROLL_DATE").toLocalDateTime());
				
				list.add(m);
				
		
			}
			//반복문이 끝난시점
			//list -> 비어있거나/데이터가 들어있거나
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rest.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

		
	}
	//member 객체 m을 통해서 update sql을 전달하는 메서드
	public int updateMember(Member m) {
		//update문 -> 처리된 행 수 : int -> 트랜잭션 처리
		//필요한 변수 세팅
			int result =0;
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			//실행할 sql(SQL뒤에 ;없어야함)
			String sql = "UPDATE MEMBER SET EAMIL =?, PHONE=?,ADDRESS=?,HOBBY=? WHERE USER_ID=?";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##JDBC","JDBC");
				conn.setAutoCommit(false);
				
				//아직 미완성 sql 문으로 ?의 값을 전부 채워야함
				pstmt = conn.prepareStatement(sql);
				

				pstmt.setString(1,m.getEmail());
				pstmt.setString(2,m.getPhone());
				pstmt.setString(3,m.getAddress());
				pstmt.setString(4,m.getHobby());
				pstmt.setString(5,m.getUserId());
				
				result = pstmt.executeUpdate();
				if(result>0) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return result;
		}
	public int deleteMember(Member m) {
		//update문 -> 처리된 행 수 : int -> 트랜잭션 처리
		//필요한 변수 세팅
			int result =0;
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			//실행할 sql(SQL뒤에 ;없어야함)
			String sql = "DELETE FROM MEMBER WHERE USER_ID=?";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##JDBC","JDBC");
				conn.setAutoCommit(false);
				
				//아직 미완성 sql 문으로 ?의 값을 전부 채워야함
				pstmt = conn.prepareStatement(sql);
				

				pstmt.setString(1,m.getUserId());
				
				result = pstmt.executeUpdate();
				if(result>0) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return result;
		}
	
}


