package com.doomdagger.jextractor.test;

import static com.doomdagger.jextractor.Extractor.$;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.doomdagger.jextractor.support.DomElement;

public class MainTest {
	public static void main(String[] args) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/Users/apple/Desktop/evaItem.html"))));
		
		StringBuilder fileContent = new StringBuilder();
		String line;
		while((line=bufferedReader.readLine())!=null){
			fileContent.append(line); 
		}
		
		List<DomElement> domElements = $("table[class=infolist_hr] > tr", fileContent.toString());
		
		System.err.println(domElements.size());
		
		for(DomElement domElement : domElements){
			System.err.println(domElement.getTag());
			List<DomElement> domElements2 = domElement.children("td[class=center]");
			for(DomElement domElement2: domElements2){
				System.err.println("\t"+domElement2.getHtml());
			}
		}
		
		bufferedReader.close();
	}
}
