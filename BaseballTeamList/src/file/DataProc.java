package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataProc {
	
	private File file;
	
	public DataProc(String filename) {
		file = new File("c:\\tmp\\" + filename + ".txt"); 
	}	
	
	// file 생성
	public void createFile() {
		try {		
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공!");
			}else {
				System.out.println("파일 생성 실패");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	// file load
	//data를 읽는다.
	public String[] fileLoad() {
		
		String datas[] = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// data 총수를 구한다
			int count = 0;
			String str = "";
						
			while((str = br.readLine()) != null) {
				count++;
			}
			br.close();			
			
			// datas 할당
			datas = new String[count];
			
			// data를 취합 -> datas
			br = new BufferedReader(new FileReader(file));
			int w = 0;
			while((str = br.readLine()) != null) {
				datas[w] = str;
				w++;
			}
			br.close();		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datas;
	}
		
	// file save
	public void fileSave(String[] datas) {		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			// 1001-홍길동-24-180-10-2-
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]);
			}			
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일에 저장되었습니다");
	}
	

}





