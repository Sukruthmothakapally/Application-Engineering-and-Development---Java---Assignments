//this java program writes to an xml file (bookshelf.xml) (confirming it has been added correctly)

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class xml_put {

    public static void main(String argv[]) {

        try {
            DocumentBuilderFactory dbFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("bookshelf");
            doc.appendChild(rootElement);

            // supercars element
            Element supercar = doc.createElement("book");
            rootElement.appendChild(supercar);

            // title element
            Element title = doc.createElement("title");
            title.appendChild(doc.createTextNode("harry potter"));
            supercar.appendChild(title);

            // [ublished year element
            Element publishedYear = doc.createElement("publishedYear");
            publishedYear.appendChild(doc.createTextNode("1998"));
            supercar.appendChild(publishedYear);

            //number of pages element
            Element numberOfPages = doc.createElement("numberOfPages");
            numberOfPages.appendChild(doc.createTextNode("600"));
            supercar.appendChild(numberOfPages);

            //authors element
            Element authors = doc.createElement("authors");
            authors.appendChild(doc.createTextNode("J K Rowling"));
            supercar.appendChild(authors);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\Dell\\IdeaProjects\\Exercise_8\\src\\bookshelf.xml"));
            transformer.transform(source, result);

            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}