package com.tutorialspoint.xml;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserDemo {
	/*
	 * public static void main(String[] args) {
	 * 
	 * String textfile = "" + new Double(12.00000000000); String filename =
	 * textfile.split("\\.")[0]; String extension = textfile.split("\\.")[1];
	 * System.out.println(filename); System.out.println(extension);
	 * 
	 * 
	 * String key = "A1"; switch (key) {
	 * 
	 * case "A": System.out.println("A"); break;
	 * 
	 * case "B": System.out.println("B");
	 * 
	 * break; default: System.out.println("Goingf "); ;
	 * 
	 * }
	 * 
	 * }
	 */
	public static void main(String[] args) {

		System.out.println("Excecution Start " + System.currentTimeMillis());
		try {
			File inputFile = new File("/home/agsuser/agsuser/3/TestApp/src/abc.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("student");
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
					System.out.println(
							"First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println(
							"Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println(
							"Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Excecution Ends  " + System.currentTimeMillis());

	}

}