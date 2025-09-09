package com.kh.jdbc.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * JDBC를 사용하기 위해서는 자바 프로젝트에 jdbc드라이버를 추가해줘야 한다.
 * 프로젝트를 우클릭 -> properties -> java build path -> library -> add external jar -> ojdbc.jar 추가
 * 
 * 	JDBC용 객체
 * - CONNECTION : DB의 연결정보를 담고 있는 객체
 * - Statement : 연결된 DB에 sql문을 전달해서 실행하고,  결과를 받아내는 객체
 * - ResultSet : 셀렉트문 실행 후 조회된 결과 담는 객체
 */
public class Run {
	//각자의 pc(localhost)에 jabc계정 연결 후 test테이블에 데이터 select
	//select ->결과 : ResultSet -> 데이터를 추출
	/*
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rest = null;
		List<Test> list = new ArrayList<>();
		
		//실행할 sql
		String sql = "SELECT * FROM TEST";
		
		try {
			//1)jdbc 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver 등록 완료");
			
			//2) connection 생성(db url, 계정명, 비밀번호)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##JDBC","JDBC");
			
			//3)Statement생성
			stmt = conn.createStatement();
			
			//4,5)sql문을 전달하면서 결과받아(select - >ResultSet)
			rest = stmt.executeQuery(sql);
			
			//rest.next()-> rest의 다음 행이 있는지 없는지를 알려주고 + 다음행을 가르킨다.
			while(rest.next()) {
				int tno = rest.getInt("TNO");
				String tName = rest.getString("TNAME");
				Date tDate = rest.getDate("TDATE");
				
				list.add(new Test(tno,tName, tDate.toLocalDate()));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rest.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}else {
			System.out.println(list);
		}
		
	}
	/*
	/*
	//각자의 pc(localhost)에 jabc계정 연결 후 test테이블에 데이터 insert
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null; // DB연결정보 보관 객체
		Statement stmt = null;  // SQL문을 전달해서 실행 후 결과를 받아올 객체
		int result=0;
		System.out.print("번호 : ");
		int tno = sc.nextInt();
		
		System.out.print("이름 : ");
		String tName = sc.next();
		sc.nextLine();
		
		//실행할 sql문(완전한 상태로 만듬, sql뒤에는 ;이 없어야함!!)
		String sql = "INSERT INTO TEST VALUES("+tno+",'"+tName+"',SYSDATE)";
		try {
		
			//1. jdbc Driver 등록
			//Class.forName() -> 문자열로 주어진 클래스 이름을 찾아서 JVM에 로드함.
			Class.forName("oracle.jdbc.driver.OracleDriver");//오타 | ojdbc.jar 파일을 추가하지 않았을 때	
			System.out.println("oracledriver 등록 성공");
			//127.0.0.1 -> 무조건적으로 지금 실행중인 컴퓨터의 ip(localhost)
			//2. Connection생성(url, 계정명, 비밀번호)	
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##JDBC","JDBC");
			conn.setAutoCommit(false);
			
			//3. Statement 생성
			stmt = conn.createStatement();
			
			//4,5.sql문 전달 후 결과를 받음(insert, update, delete -> 처리된 행 수)
			result = stmt.executeUpdate(sql);
			//insert, update, delete -> stmt.excuteUpdate : int
			//select -> stmt.excuteQuery(); : ResultSet
			
			//6.트랜잭션 처리
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					//7. 다쓴 자원 반납(생성의 역순)
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		sc.close();
		
		if(result>0) {
			System.out.println("데이터 추가 성공");
		}else {
			System.out.println("데이터 추가 실패");
		}
		  } 
	*/
	
	//3. PreparedStatement객체 사용 -> sql문 형태로 먼저 정의하고 각 데이터는 추후에 넣는 방법
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		System.out.print("수정할 번호를 입력하세요 : ");
		int tno = sc.nextInt();
		
		System.out.print("새로운 이름을 입력하세요 : ");
		String newName = sc.next();
		
		System.out.println("새로운 날짜를 입력하세여 : ");
		String newDate = sc.next();
		sc.nextLine();
		/*
		String sql = "UPDATE TEST SET TNAME = '"+newName +  ",TDATE = TO_DATE('"+newDate+"', 'YYYY--MM--DD')"+
		                   "WHERE TNO = "+tno;
		*/
		String sql = "UPDATE TEST SET TNAME = ?, TDATE = TO_DATE(?,'YYYY-MM--DD')WHERE TNO=?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##JDBC","JDBC");
			conn.setAutoCommit(false);
			
			//미완성된 sql문을 전달해서 pstmt객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//pstmt에 작성하지 않은 값들을 메서드를 통해 완성시키기(?개수만큼)
			pstmt.setString(1, newName);
			pstmt.setString(2, newDate);
			pstmt.setInt(3, tno);
			
			result = pstmt.executeUpdate();
			if(result > 0){
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
		if(result>0) {
			System.out.println(result+"개의 행 update");
		}else {
			System.out.println("update 실패");
		}

	}
}

