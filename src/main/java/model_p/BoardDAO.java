package model_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BoardDAO {
	
	Connection con = null;
	PreparedStatement ptmt = null;  
	ResultSet rs = null;

	public BoardDAO() {
		
		// 2. DB 연결 객체 생성
		String url = "jdbc:mysql://localhost:3306/onop_db?characterEncoding=utf-8";
		String user = "onop";
		String pw = "123456";	
		
		try {
			
			// 1. JDBC Driver 로드
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pw);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
	}
	
	// list 실행
	public ArrayList<BoardDTO> list(PageDTO pDTO){
		
		ArrayList<BoardDTO> res = new ArrayList<BoardDTO>();
		
		// 4. 쿼리문 실행 및 결과 호출
		String sql = "select * from board order by gid desc, seq limit ?, ?";
		try {
			// 3. 쿼리문 실행하기 위한 객체 생성
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, pDTO.start);
			ptmt.setInt(2, pDTO.cnt);
			
			rs = ptmt.executeQuery();
			
			// 5. 쿼리 실행 결과 호출
			while(rs.next()) {
				
				BoardDTO dto = new BoardDTO();
				
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setSeq(rs.getInt("seq"));
				dto.setLev(rs.getInt("lev"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setTitle(rs.getString("title"));
				dto.setPname(rs.getString("pname"));
				dto.setRegDate(rs.getTimestamp("reg_date"));	// 시분초까지 나오게 한다. getTimestamp
				
				res.add(dto);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
		}
		
		return res;
	}
	
	
	public int totalCnt(){
		int res = 0;
		
		String sql = "select count(*) from board ";
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			rs.next();				
			res = rs.getInt(1);	//첫번째 컬럼
	
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
		}
		
		return res;
	}
	
	public BoardDTO detail(int id){
		BoardDTO dto =  null;
		
		String sql = "select * from board where id = "+id;
		try {
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				
				dto = new BoardDTO();
				
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setSeq(rs.getInt("seq"));
				dto.setLev(rs.getInt("lev"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setTitle(rs.getString("title"));
				dto.setPname(rs.getString("pname"));
				dto.setRegDate(rs.getTimestamp("reg_date"));	// 시분초까지 나오게 한다. getTimestamp
				dto.setUpfile(rs.getString("upfile"));
				dto.setContent(rs.getString("content"));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
		}
		
		return dto;
	}
	
	
	// 조회수 증가
	public void addCount(int id){
		BoardDTO dto =  null;
		
		String sql = "update board set cnt = cnt + 1 where id = ? ";
		try {
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, id);	// 첫번째 물음표에 id 대입
			
			ptmt.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
		}

	}

	// 글쓰기
	public void write(BoardDTO dto){
		
		//새로 들어갈 id 확인
		String sql = "select max(id)+1 as max_id from board";
		try {
			ptmt = con.prepareStatement(sql);
			
			rs = ptmt.executeQuery();
			
			rs.next();
			
			int max_id = rs.getInt("max_id");
			
			sql = "insert into board "
					+ "(id,gid,seq,lev,cnt,title,content,pname,pw,upfile,reg_date) values "
					+ "(? , ? , 0 , 0 ,-1 , ? ,    ? ,    ? ,   ? ,  ?   , now())";
			
			ptmt = con.prepareStatement(sql);
				
			ptmt.setInt(1, max_id);
			ptmt.setInt(2, max_id);
			ptmt.setString(3, dto.getTitle());
			ptmt.setString(4, dto.getContent());
			ptmt.setString(5, dto.getPname());
			ptmt.setString(6, dto.getPw());
			ptmt.setString(7, dto.getUpfile());
			
			ptmt.executeUpdate();
			
			dto.setId(max_id);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
		}

	}
	
	// 삭제
	public int delete(BoardDTO dto){
		
		int res = 0;
		
		//새로 들어갈 id 확인
		String sql = "delete from board where id = ? and pw = ?";
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			res = ptmt.executeUpdate();
	
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			close();
		}

		return res;
	}
	
	// 수정
	public int modify(BoardDTO dto){
			
			int res = 0;
		
			String sql = "update board set pname = ?, title=?, content=?, cnt =  cnt - 1 "
					+ "where id = ? and pw = ? ";
			try {
				
				ptmt = con.prepareStatement(sql);
				
				ptmt.setString(1, dto.getPname());
				ptmt.setString(2, dto.getTitle());
				ptmt.setString(3, dto.getContent());
				ptmt.setInt(4, dto.getId());
				ptmt.setString(5, dto.getPw());
				
				res = ptmt.executeUpdate();
		
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			} finally {
				
				close();
			}

			return res;
	}
	

	// 답변
	public void reply(BoardDTO dto){
			
			//기존글 변경
			String sql = "update board set seq = seq + 1 where gid = ? and seq > ? ";
			try {
				
				ptmt = con.prepareStatement(sql);
				
				ptmt.setInt(1, dto.getGid());
				ptmt.setInt(2, dto.getSeq());
				
				ptmt.executeUpdate();
								
				// 글 작성
				sql = "insert into board "
						+ "(gid,seq,lev,cnt,title,content,pname,pw, reg_date) values "
						+ "(? , ? , ?  ,-1 , ? ,    ? ,    ? ,   ?  , now() )";
				
				ptmt = con.prepareStatement(sql);
					
				ptmt.setInt(1, dto.getGid());
				ptmt.setInt(2, dto.getSeq()+1);
				ptmt.setInt(3, dto.getLev()+1);
				ptmt.setString(4, dto.getTitle());
				ptmt.setString(5, dto.getContent());
				ptmt.setString(6, dto.getPname());
				ptmt.setString(7, dto.getPw());
				
				ptmt.executeUpdate();
				
				// 새 글 id 받아오기
				sql = "select max(id) as max_id from board";
				ptmt = con.prepareStatement(sql);
				rs = ptmt.executeQuery();
				
				rs.next();
				dto.setId(rs.getInt("max_id"));
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			} finally {
				
				close();
			}
	}
	
	public void close() {
		
		// 6. 쿼리문 실행 종료
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(ptmt!=null) try {ptmt.close();} catch (SQLException e) {}
		
		// 7. 연결 객체 종료
		if(con!=null) try {con.close();} catch (SQLException e) {}
	}
 	
}
