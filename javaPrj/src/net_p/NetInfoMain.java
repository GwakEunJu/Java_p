package net_p;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetInfoMain {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.naver.com");
			
			System.out.println(ip.getHostName());		// 이름
			System.out.println(ip.getHostAddress());	// ip 주소
			System.out.println(ip);
			
			InetAddress [] arr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress inetAdress : arr) {
				System.out.println(inetAdress.getHostAddress());
			}
			
			System.out.println("-----------------------------");
			
			ip = InetAddress.getLocalHost();
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}

	}

}
