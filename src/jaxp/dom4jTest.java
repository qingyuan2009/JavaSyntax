package jaxp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class dom4jTest {

	public static void main(String[] args) throws Exception {
		ReadXML();
		WriteXML();
		IterateXML();
		AddElement();
		EditElement();
		RemoveElement();
	}

	public static void ReadXML() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src/jaxp/breakfast.xml");
		System.out.println(doc.asXML());
	}
	
	public static void WriteXML() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src/jaxp/breakfast.xml");
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/jaxp/breakfastCopy.xml"));
		writer.write(doc);		
	}

	public static void IterateXML() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src/jaxp/breakfast.xml");
		Element root = doc.getRootElement();
		List<Element> foodList = root.elements("food");
		for (Element element : foodList) {
			String id = element.attributeValue("id");
			String name = element.elementText("name");
			String price = element.elementText("price");
			String description = element.elementText("description");
			String calories = element.elementText("calories");
			System.out.println(id + " " + name + " " + price  + " " + description + " " + calories);
		}		
	}
	
	public static void AddElement() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src/jaxp/breakfast.xml");
		Element root = doc.getRootElement();
		Element foodEle = root.addElement("food");
		foodEle.addAttribute("id", "06");
		//Element nameEle = foodEle.addElement("name");
		//nameEle.setText("Tea");
		foodEle.addElement("name").setText("Tea");
		foodEle.addElement("price").setText("$2.00");
		foodEle.addElement("description").setText("Morning tea");
		foodEle.addElement("calories").setText("10");
		OutputFormat format = new OutputFormat("\t", true);
		format.setTrimText(true);
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/jaxp/breakfastCopy.xml"), format);
		writer.write(doc);
	}
	
	public static void EditElement() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src/jaxp/breakfastCopy.xml");
		//Element root = doc.getRootElement();
		//可以用for来修改, 但效率不好		
		//更好的是用XPath
		Element foodEle = (Element) doc.selectSingleNode("//food[@id='06']");
		foodEle.element("name").setText("Black tea");		
		OutputFormat format = new OutputFormat("\t", true);
		format.setTrimText(true);
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/jaxp/breakfastCopy.xml"), format);
		writer.write(doc);
	}
	
	public static void RemoveElement() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read("src/jaxp/breakfastCopy.xml");		
		Element foodEle = (Element) doc.selectSingleNode("//food[name='Black tea']");
		doc.remove(foodEle);
		//foodEle.getParent().remove(foodEle);
		OutputFormat format = new OutputFormat("\t", true);
		format.setTrimText(true);
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/jaxp/breakfastCopy.xml"), format);
		writer.write(doc);
	}
	
}
