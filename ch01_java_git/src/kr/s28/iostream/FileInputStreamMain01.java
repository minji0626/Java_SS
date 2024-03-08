package kr.s28.iostream;
import java.io.*;

public class FileInputStreamMain01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte;
		try {
			fis = new FileInputStream("file.txt"); // file.txt 를 읽기
			
			// 파일의 정보를 한 문자씩 읽어 들여 아스키 코드로 반환
			// 영문 이외의 문자는 깨짐
			while( (readbyte = fis.read()) != -1 ) {
				System.out.print((char)readbyte);
			}
			
		}
				// 파일 찾을 수 없음
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			//자원 정리 ---> 작업을 하지 못하게 함
			if ( fis != null) {
				try { fis.close(); } catch(IOException e) {}
			} //end of if
		} // end of finally
	
	
	}

}
