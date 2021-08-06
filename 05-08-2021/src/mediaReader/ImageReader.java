// Task 1 - Create file copy of an image.
//          InputStream -> FileInputStream, BufferedInputStream
//          OutputStream - FileOutputStream, BufferedOutputStream


package mediaReader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream reader = new FileInputStream("C:\\Users\\jinda\\OneDrive\\Desktop\\mohit.jpg");
			BufferedInputStream bi = new BufferedInputStream(reader);
			BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\jinda\\OneDrive\\Desktop\\copy1.jpg"));
			
			int a = bi.read();
			while(a!=-1) {
				bo.write(a);
				a = bi.read();
			}
			bi.close();
			bo.close();
			//reader.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
