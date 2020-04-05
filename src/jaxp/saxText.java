package jaxp;

import java.io.File;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class saxText {

	public static void main(String[] args) throws Exception {
		SAXParserFactory factor = SAXParserFactory.newInstance();
		SAXParser parser = factor.newSAXParser();
		parser.parse(new File("src/jaxp/breakfast.xml"), new MyHandler());
	}

}

//�Զ���SAX������
class MyHandler extends DefaultHandler {
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("��ʼ����...");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("��������...");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("��ʼ����Ԫ�أ�" + qName);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("��������Ԫ�أ�" + qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length);
		str.trim();
		if(!str.isEmpty()) {
			System.out.println("�ַ���" + str);
		}
	}
	
	
}
