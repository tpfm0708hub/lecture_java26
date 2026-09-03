package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) {
		System.out.println("파일 복사를 시작합니다.");
//		copyImgFileByte();
		copyTextFileArr();
		System.out.println("파일 복사를 완료하였습니다.");
	}
	
	public static void copyImgFileByte() {
//		String sourceFilename = "Curi_01.jpg";
//		String targetFilename = "Curi_01_copied.jpg";
		String sourceFilename = "AtMyOwnPace.txt";
		String targetFilename = "AtMyOwnPace_copied.txt";
		
		try {
			InputStream fis = new FileInputStream(sourceFilename);
			OutputStream fos = new FileOutputStream(targetFilename);
			
			while(true) {
				int bytedata = fis.read();
				if(bytedata == -1) break;
				System.out.println(bytedata);
				fos.write(bytedata);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void copyImgFileByteArr() {
		String sourceFilename = "Curi_01.jpg";
		String targetFilename = "Curi_01_copied.jpg";
		
		try {
			InputStream fis = new FileInputStream(sourceFilename);
			OutputStream fos = new FileOutputStream(targetFilename);
			
			while(true) {
				byte[] byteArr = new byte[100];
				int numBytes =  fis.read(byteArr);
				if(numBytes == -1) break;
				fos.write(numBytes);
			}
			
			fis.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void copyTextFile() {
		String sourceFilename = "AtMyOwnPace.txt";
		String targetFilename = "AtMyOwnPace_copied.txt";
		
		try (FileReader fr = new FileReader(sourceFilename);
			 FileWriter fw = new FileWriter(targetFilename)){
			while(true) {
				int chardata = fr.read();
				if(chardata == -1) break;
//				System.out.println(chardata);
				fw.write(chardata);
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public static void copyTextFileArr() {
		String sourceFilename = "AtMyOwnPace.txt";
		String targetFilename = "AtMyOwnPace_copied.txt";
		
		try {
			FileReader fr = new FileReader(sourceFilename);
			FileWriter fw = new FileWriter(targetFilename);
			
			
			while(true) {
				char[] cbuf = new char[100];
				int result = fr.read(cbuf);
				if (result == -1) break;
				fw.write(cbuf);
			}
			
			fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}


}
