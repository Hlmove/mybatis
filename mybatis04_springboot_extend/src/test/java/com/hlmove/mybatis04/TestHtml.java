package com.hlmove.mybatis04;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/12 16:25
 * @Description com.hlmove.mybatis04
 * @Note
 */
public class TestHtml {
    @Test
    public void test() throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        while(true) {
            Socket s = ss.accept(); // 客户端是浏览器
            System.out.println(s);
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(s.getInputStream()));


            // GET(请求方式) /（请求资源） HTTP/1.1（超文本传输协议）

            // 请求协议
            // 请求行 GET / HTTP/1.1
            // 请求头 格式 Content-Type 数据类型
            // 请求数据 周杰伦
            String readLine = br.readLine();
            System.out.println(readLine);

            // 响应协议
            // 响应行
            // 响应头
            // 响应数据
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            // 响应行
            pw.println("HTTP/1.1 200 OK");
            // 响应头 (普通文本/html/json)
            pw.println("Content-Type: text/plain;charset=UTF-8");
            pw.println(); // 空行间隔数据
            // html样式的标签
            pw.println("hello world"); // 响应数据
            pw.flush();
            // 浏览器如果以为服务器没写完
            s.shutdownOutput(); // 只关闭socket的输出流
            s.close(); // 关闭socket
        }
    }

}
