package jaxp;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class domTest {

	public static void main(String[] args) throws Exception {
		
		//创建工厂
		//通过工厂得到解析器
		//解析xml
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = documentBuilder.parse(new File("src/jaxp/breakfast.xml"));
		
		// 遍历Document
		// 获取root
		// 通过root获取所有child
		Element root = document.getDocumentElement();
		NodeList foodList = root.getElementsByTagName("food");
		
		// 遍历NodeList
		for (int i = 0; i < foodList.getLength(); i++) {
			Node node = foodList.item(i);
			Element food = (Element) node;
			//获取Node attribute
			String id = food.getAttribute("id");
			System.out.println("id: " + id);
			Node nameNode = food.getElementsByTagName("name").item(0);
			//获取Node文本内容
			System.out.println("name: " + nameNode.getTextContent());
			System.out.println("name: " + food.getElementsByTagName("price").item(0).getTextContent());
			System.out.println("name: " + food.getElementsByTagName("description").item(0).getTextContent());
			
		}
		

	}

}
