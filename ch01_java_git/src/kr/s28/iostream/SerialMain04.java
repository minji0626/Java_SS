package kr.s28.iostream;

import java.io.*;
import java.util.*;

public class SerialMain04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("UserInfo.ser");
			ois = new ObjectInputStream(fis);
			// 역직렬화 작업
			ArrayList<UserInfo>list = (ArrayList<UserInfo>)ois.readObject();
			System.out.println(list);
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
			if (ois != null) {
				try { ois.close(); } catch (IOException e)	{			}
			}
			if (fis != null) {
				try { fis.close(); } catch (IOException e)	{			}
			}
		}
	}

}
