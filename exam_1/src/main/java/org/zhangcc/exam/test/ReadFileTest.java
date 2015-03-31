package org.zhangcc.exam.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadFileTest {
	private static List confuList=new ArrayList();
	public static void main(String[] args) {
		File file =new File ("C:\\Documents and Settings\\Administrator\\桌面\\xl.txt");
		List listxl =readFileToMap(file);
//		File file1 =new File ("C:\\Documents and Settings\\Administrator\\桌面\\2015-02-05_xgh_all.txt");
//		List listmy =readFileToMapMy(file);

		for(int i=0;i<confuList.size();i++){
			String ss =confuList.get(i).toString();
			if(confuList.contains(ss)){
				
			}else{
				System.out.println("=======================     "+ss);
			}
		}
		
	}
	
	public static List readFileToMap(File file ){
		List list =new ArrayList();
		try {
			
			FileReader fd =new FileReader(file);
			BufferedReader br=new BufferedReader(fd);
			String line="";
			String[] arrs=null;
			while ((line=br.readLine())!=null) {
				if(list.contains(line)){
					confuList.add(line);
				}else{
					list.add(line);
				}
			}
			br.close();
			fd.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
		return list;
	}
	public static List readFileToMapMy(File file ){
		List list =new ArrayList();
		try {
			
			FileReader fd =new FileReader(file);
			BufferedReader br=new BufferedReader(fd);
			String line="";
			String[] arrs=null;
			while ((line=br.readLine())!=null) {
				list.add(line.substring(0,line.indexOf(",")));
			}
			br.close();
			fd.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
