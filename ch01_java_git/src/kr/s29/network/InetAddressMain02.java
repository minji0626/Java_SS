package kr.s29.network;
import java.io.*;
import java.net.*;

public class InetAddressMain02 {
	public static void main(String[] args) {
		BufferedReader br = null;
		InetAddress[] addresses;
		String name;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("도메인명 입력 > ");
			name = br.readLine()	;

			//해당 도메인과 매핑되어있는 모든 주소를 읽어옴
			addresses = InetAddress.getAllByName(name);
			for ( int i = 0 ; i < addresses.length; i++) {
				System.out.println("호스트 이름 > " + addresses[i].getHostName()
						+ " , IP 주소 > "  + addresses[i].getHostAddress());
			}
		} 
		catch (UnknownHostException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();	
		}
		finally {
			if ( br != null ) {
				try { br.close(); } catch (IOException e) { }
			} //end of if
		} //end of finally
	}
}
