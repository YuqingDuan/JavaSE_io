package others.stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * BufferedReader
 * 		|--LineNumberReader
 * 			public int getLineNumber(): 获得当前行号。
 * 			public void setLineNumber(int lineNumber): 设置初始行号。
 */
public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("my.txt"));

        String line = null;
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + ": " + line);
        }

        lnr.close();
    }
}
