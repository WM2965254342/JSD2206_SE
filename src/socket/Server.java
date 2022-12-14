package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室服务端
 */
public class Server {
    private ServerSocket serverSocket;
    public Server(){
        try {
            System.out.println("正在启动服务端……");
            /*
            * 如果执行下面代码出现异常:
            * java.net.BindException:address already in use
            * 原因是申请的8088端口已经被系统其他程序占用了.
            * */
            serverSocket=new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void strat(){
        BufferedReader br=null;
        try {
            System.out.println("等待客户端连接");
            Socket socket=serverSocket.accept();//阻塞方法
            System.out.println("一个客户端连接了");

            //通过刚接受连接的socket,获取输入流来读取该客户端发送过来的消息
            InputStream in= socket.getInputStream();
            InputStreamReader isr=new InputStreamReader(in, StandardCharsets.UTF_8);
            br=new BufferedReader(isr);

            String line;
            while ((line=br.readLine())!=null){
                System.out.println("客户端说:"+line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Server server =new Server();
        server.strat();
    }
}
