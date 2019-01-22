package others.stream;

import java.io.*;

/*
 * 需求：pw.txt复制到copy.txt中
 *
 * 数据源：
 * 		DataStreamDemo.java -- 读取数据 -- FileReader -- BufferedReader
 * 目的地：
 * 		copy.java -- 写出数据 -- FileWriter -- BufferedWriter -- PrintWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        BufferedReader br = new BufferedReader(new FileReader("pw.txt"));
        // 封装目的地
        PrintWriter pw = new PrintWriter(new FileWriter("copy.txt"), true);

        String line = null;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }

        pw.close();
        br.close();
    }
}
