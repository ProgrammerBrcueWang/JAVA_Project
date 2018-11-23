/**
 * 功能：这是第一个服务器端程序 让他在9999端口监听，可以接收从客户端发送过来的数据
 * 1、从cmd netstat -an可以看到9999端口被监听了
 * 2、在内容启动后，不关闭的话，再启动会报端口已经被占用错误
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
			// 在9999号端口监听
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("我是服务器，在9999端口监听");
			// 等待某个客户端来连接该函数会返回一个Scoket连接
			// 这个socket与client的socket是一个(因为是同一个端口吧？)
			Socket socket = ss.accept();
			
			// 要读取socket中传递的数据
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String info = br.readLine();
			System.out.println("服务器接收到:"+info);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.println("我是服务器，你也好！");
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
