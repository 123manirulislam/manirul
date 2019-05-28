package in.embryotechnology;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXmlWithDom {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse( new File("new.xml"));
		
		NodeList accountNodeList = document.getElementsByTagName("employee");
		
		
		ArrayList<Employee> accList = new ArrayList<Employee>();
		
		for(int i=0;i<accountNodeList.getLength();i++) {
			Employee account = new Employee();
			Element accountElement =(Element) accountNodeList.item(i);
			account.setEno(Integer.parseInt(accountElement.getElementsByTagName("eno").item(0).getTextContent()));
			account.setName(accountElement.getElementsByTagName("name").item(0).getTextContent());
			accList.add(account);
		}
		accList.forEach(list->{
			System.out.println(list.getEno());
			System.out.println(list.getName());
		});
		
	}

}
