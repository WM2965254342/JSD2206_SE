package socket;

/**
 * 聊天室客户端
 */
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;//Socket 套接字

    /**
     * Socket实例化需要传入两个参数
     * 参数1:服务端的地址信息
     * 参数2:服务端打开的服务端口
     * 客户端通过服务端的地址找到网络上的服务器计算机，通过端口可以连接上该及其上运行的服务端应用程序
     */
    public Client(){
        try {
            System.out.println("正在连接服务端……");
            socket =new Socket("172.88.26.5",8088);
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        //客户端向服务端发送数据，则需要使用socket获取输出流
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=null;
        try {
            OutputStream out= socket.getOutputStream();
            OutputStreamWriter osw=new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw=new BufferedWriter(osw);
            pw=new PrintWriter(bw,true);
            while (true){
                String line=(sc.nextLine().trim());
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(pw!=null)pw.close();
        }
    }

    public static void main(String[] args) {
        Client client=new Client();
        client.start();
    }
}
