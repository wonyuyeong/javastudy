package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// 코로나 접종
public class Ex03 {
	public static void main(String[] args) {
		InputStream is = null ;
		InputStreamReader isr = null ;
		BufferedReader br = null ;
		
		String pathname = "D:/wyy/util/코로나 접종.text";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null ;
		
		try {
			URL url = new URL("https://raw.githubusercontent.com/paullabkorea/coronaVaccinationStatus/main/data/data.json") ;
			URLConnection conn = url.openConnection() ;
			
			is = conn.getInputStream() ;
			isr = new InputStreamReader(is) ;
			br = new BufferedReader(isr) ;
			
			String msg = null ;
			StringBuffer sb = new StringBuffer() ;
			while ((msg=br.readLine()) !=null) {
				sb.append(msg+"\n") ;
			}
			System.out.println(sb.toString());
			System.out.println();
			
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;
			bw.write(sb.toString()) ;
			bw.flush() ;
			
		Map<String, List<String>>	map = conn.getHeaderFields() ;
			for (String k : map.keySet()) {
				System.out.println(k+":"+map.get(k));
			}
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}
}
