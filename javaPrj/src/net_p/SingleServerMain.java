package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class SingleSender extends Thread {
	Socket socket;
	DataOutputStream dos;
	String name;

	SingleSender(Socket socket) {

		this.socket = socket;
		try {
			name = "[" + InetAddress.getLocalHost().getHostAddress() + "]";
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			while (dos != null) {
				String str = sc.nextLine();
				dos.writeUTF(name + str);
			}
		} catch (Exception e) {

		} finally {
			try {
				dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

class SingleReceiver extends Thread {
	DataInputStream dis;

	SingleReceiver(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (dis != null) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {

		} finally {
			try {
				dis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class SingleServerMain {

	public static void main(String[] args) {
		try {

			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버준비 완료");

			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " 접속 성공");

			new SingleSender(client).start();
			new SingleReceiver(client).start();

		} catch (Exception e) {

		}

	}

}
