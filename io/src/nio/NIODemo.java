package nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * nio包在JDK4出现，提高了IO流的操作效率。但是目前还不是大范围的使用。
 * 有空的话了解下。
 *
 * JDK7之后的nio：
 * Path:路径
 * Paths:有一个静态方法返回一个路径
 * 		public static Path get(URI uri)
 * Files:提供了静态方法供我们使用
 * 		public static long copy(Path source,OutputStream out):复制文件
 * 		public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset cs,OpenOption... options)
 */
public class NIODemo {
    public static void main(String[] args) throws IOException {
        // public static long copy(Path source,OutputStream out)
        // Files.copy(Paths.get("BufferedDemo.java"), new FileOutputStream("copy.java"));

        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("java");

        Files.write(Paths.get("array.txt"), array, Charset.forName("UTF-8"));
    }
}
