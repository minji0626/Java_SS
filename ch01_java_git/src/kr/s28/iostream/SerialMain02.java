package kr.s28.iostream;

import java.io.*;

public class SerialMain02 {
	public static void main(String[] args){
		System.out.println("----객체 역직렬화 하기----");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			// 파일 읽기
			fis = new FileInputStream("object.ser");
			ois = new ObjectInputStream(fis);
			
			//역직렬화 수행
			Customer m = (Customer) ois.readObject()	;
			System.out.println(m);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(ois!=null) { try { ois.close();} catch(IOException  e) {} }
			if(fis!=null) { try { fis.close();} catch(IOException  e) {} }
		}
	}
}
