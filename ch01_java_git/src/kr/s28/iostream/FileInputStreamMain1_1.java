package kr.s28.iostream;
import java.io.*;

public class FileInputStreamMain1_1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		byte[] readbyte2;
		try {
			fis = new FileInputStream("file.txt");
			//영문 이외의 문자도 처리 가능
			readbyte2 = new byte[fis.available()];
			//파일로부터 읽은 데이터들을 byte[]에 저장
			fis.read(readbyte2);
										//byte [] -> String 변환
			System.out.println(new String(readbyte2));
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
