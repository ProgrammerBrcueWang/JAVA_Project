/**
 * ���ܣ����ǵ�һ���������˳��� ������9999�˿ڼ��������Խ��մӿͻ��˷��͹���������
 * 1����cmd netstat -an���Կ���9999�˿ڱ�������
 * 2�������������󣬲��رյĻ����������ᱨ�˿��Ѿ���ռ�ô���
 */
package com.test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MyServer1
{
	public MyServer1()
	{
		try
		{
			// ��9999�Ŷ˿ڼ���
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("���Ƿ���������9999�˿ڼ���");
			// �ȴ�ĳ���ͻ��������Ӹú����᷵��һ��Scoket����
			// ���socket��client��socket��һ��(��Ϊ��ͬһ���˿ڰɣ�)
			Socket socket = ss.accept();
			
			// Ҫ��ȡsocket�д��ݵ�����
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String info = br.readLine();
			System.out.println("���������յ�:"+info);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.println("���Ƿ���������Ҳ�ã�");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		MyServer1 myServer1 = new MyServer1();
	}
}
