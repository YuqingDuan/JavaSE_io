package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节输入流操作步骤：
 * A:创建字节输入流对象
 * B:调用read()方法读取数据，并把数据显示在控制台
 * C:释放资源
 *
 * 读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // FileInputStream(String name)
        FileInputStream fis = new FileInputStream("fis.txt");

        // 调用read()方法读取数据，并把数据显示在控制台
        int by = 0;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        // 释放资源
        fis.close();
    }
}
