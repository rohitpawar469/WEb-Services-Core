package com.sax.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler 
{

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException 
	{
		System.out.print(new String(ch,start,length));
	}

	@Override
	public void endDocument() throws SAXException
	{
		System.out.println("Ended Reading the XML");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException 
	{
		System.out.print("</"+qName+">");
		
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException 
	{
		System.out.println("Reading the Processing Insruction");
	}

	@Override
	public void startDocument() throws SAXException 
	{
		System.out.println("Started Reading the XML");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
	{
		System.out.print("<"+qName+">");
		if(attributes.getLength()!=0)
		{
			for(int i=0;i<attributes.getLength();i++)
			{
				System.out.println("  "+attributes.getQName(i)+"="+attributes.getValue(i)+">");
			}
		}
	}
	
}
