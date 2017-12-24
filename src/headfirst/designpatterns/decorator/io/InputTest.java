package headfirst.designpatterns.decorator.io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			/*InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")));
						
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}*/
			
			byte[] b = {'A','B','C'};
			InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(b));
			System.out.println(in.read(b,0,3));
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
