import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;

import org.xml.sax.SAXException;

public class Test_XML_DOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f= new File("MntnRoad.xml");
	
	try {
		DocumentBuilderFactory dFactory= DocumentBuilderFactory.newDefaultInstance();
		DocumentBuilder dBuilder= dFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(f);
System.out.println("Root Element:"+doc.getDocumentElement().getNodeName());		
System.out.println(doc.getDocumentElement().getAttribute("language"));	
NodeList nList= doc.getElementsByTagName("PI");
System.out.println(nList.getLength());

for (int i = 0; i < nList.getLength(); i++) {
	Node nNode=nList.item(i);
	System.out.println(nNode.getNodeType());
	if (nNode.getNodeType()==Node.ELEMENT_NODE) {
		Element eElement=(Element) nNode;
		if (eElement.getElementsByTagName("name").equals('6')) {
			System.out.println("6 found");
			
		}
		
	}
	
	
}

		
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

System.out.println("Finished");
	}

}
