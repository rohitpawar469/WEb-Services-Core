package com.sax.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

import com.sax.handler.MyHandler;

public class SAXTest 
{
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		SAXParser saxParser=saxParserFactory.newSAXParser();
		MyHandler myHandler=new MyHandler();
		System.out.println("Started Reading the file");
		File file=new File("E:\\JAXP Programming\\SAXParsing\\Resource\\PO.xml");
		saxParser.parse(file, myHandler);
		
	}
}
