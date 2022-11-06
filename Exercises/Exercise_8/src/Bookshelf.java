//this Java program is used to read and print the existing xml file (bookshelf2.xml)

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class Bookshelf
{
    public static void main(String argv[])
    {
        try
        {
//creating a constructor of file class and parsing an XML file
            File file = new File("C:\\Users\\Dell\\IdeaProjects\\Exercise_8\\src\\bookshelf2.xml");
//an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("book");
// nodeList is not iterable, so we are using for loop
            for (int itr = 0; itr < nodeList.getLength(); itr++)
            {
                Node node = nodeList.item(itr);
                System.out.println("\nNode Name :" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    System.out.println("title : "+ eElement.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("published Year : "+ eElement.getElementsByTagName("publishedYear").item(0).getTextContent());
                    //System.out.println("number Of Pages : "+ eElement.getElementsByTagName("numberOfPages").item(0).getTextContent());
                    System.out.println("authors : "+ eElement.getElementsByTagName("authors").item(0).getTextContent());

                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}