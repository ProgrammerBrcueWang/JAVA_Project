/**
 * 这是一个客户端程序，可以连接服务器
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
			// Socket()就是去连接某个服务器端 127.0.0.1表示服务器的ip 
			// 9999是他的端口号
			Socket socket = new Socket("127.0.0.1", 9999);
			
			// 如果s连接成功，就可以发送数据给服务器
			// 如果通过pw,向socket写数据，true表示即时刷新
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			pw.println("你好吗?我是客户端");
			
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String respon = br.readLine();
			System.out.println("我是客户端,我收到服务器回送的信息:"+respon);
			
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
