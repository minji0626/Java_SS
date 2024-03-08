package kr.s28.iostream;
import java.io.*;

public class FileMain04 {

	public static void main(String[] args) {
			// 상대 경로
			String path = "example.txt";
			
			File f1 = new File(path);
			System.out.println("---- 파일 삭제 ----");
			
			// delete() : 삭제할 수 있으면 삭제하고 true 반환하고 삭제가 불가능하면 false 를 반환한다
			if(f1.delete()) {
				System.out.println(f1.getName() + " 파일 삭제");
			}
			else {
				System.out.println("파일 삭제에 실패하였습니다.");
			}
			
	}

}
