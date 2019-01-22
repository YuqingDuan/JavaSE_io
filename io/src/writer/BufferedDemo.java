package writer;

import java.io.*;

/*
 * 字符缓冲流的特殊方法：
 * BufferedWriter:
 * 		public void newLine():根据系统来决定换行符
 * BufferedReader:
 * 		public String readLine()：一次读取一行数据
 * 		包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        // write();
        read();
    }

    public static void read() throws IOException {
        // 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("bw2.txt"));

        // public String readLine()：一次读取一行数据
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //释放资源
        br.close();
    }

    public static void write() throws IOException {
        // 创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));

        for (int x = 0; x < 10; x++) {
            bw.write("hello" + x);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
