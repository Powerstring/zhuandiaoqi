package com.zhuandiaoqi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/* F调转C调
 * created by Zhang Binqi
 **/
public class HalfHighFtoC {

	public static void main(String[] args) throws Exception{
		String filename=null;
		filename="E:\\yuanpu.txt"; //需要转换的简谱
		File file=new File(filename);
		FileReader reader=new FileReader(file);
		BufferedReader br=new BufferedReader(reader);
		FileWriter bw=new FileWriter(new File("E:\\daxiao.txt"));
		String line=null;
		while((line=br.readLine())!=null){
			String[] str=line.split(" ");
			for(int i=0;i<str.length;i++){
				if(str[i].equals("(1)")){
					str[i]="(4)";
				}else if(str[i].equals("(2)")){
					str[i]="(5)";
				}
				else if(str[i].equals("(3)")){
					str[i]="(6)";
				}
				else if(str[i].equals("(4)")){
					str[i]="(#6)";
				}
				else if(str[i].equals("(5)")){
					str[i]="1";
				}
				else if(str[i].equals("(6)")){
					str[i]="2";
				}
				else if(str[i].equals("(7)")){
					str[i]="3";
				}
				else if(str[i].equals("1")){
					str[i]="4";
				}
				else if(str[i].equals("2")){
					str[i]="5";
				}
				else if(str[i].equals("3")){
					str[i]="6";
				}
				else if(str[i].equals("4")){
					str[i]="#6";
				}
				else if(str[i].equals("5")){
					str[i]="[1]";
				}
				else if(str[i].equals("6")){
					str[i]="[2]";
				}
				else if(str[i].equals("7")){
					str[i]="[3]";
				}
				else if(str[i].equals("[1]")){
					str[i]="[4]";
				}
				else if(str[i].equals("[2]")){
					str[i]="[5]";
				}
				else if(str[i].equals("[3]")){
					str[i]="[6]";
				}
				else if(str[i].equals("[4]")){
					str[i]="[#6]";
				}
				bw.write(str[i]+" ");
				bw.flush();
				System.out.println(str[i]);
			}		
			}
		}

}
