/**
 * ����һ���ͻ��˳��򣬿������ӷ�����
 */
package com.test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MyClient1
{
	public MyClient1()
	{
		try
		{
			// Socket()����ȥ����ĳ���������� 127.0.0.1��ʾ��������ip 
			// 9999�����Ķ˿ں�
			Socket socket = new Socket("127.0.0.1", 9999);
			
			// ���s���ӳɹ����Ϳ��Է������ݸ�������
			// ���ͨ��pw,��socketд���ݣ�true��ʾ��ʱˢ��
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			pw.println("�����?���ǿͻ���");
			
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String respon = br.readLine();
			System.out.println("���ǿͻ���,���յ����������͵���Ϣ:"+respon);
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String args[])
	{
		MyClient1 myClient1 = new MyClient1();
	}
}
