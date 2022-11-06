// Java program for write JSON to a file

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class book_shelf_put
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // creating JSONObject
        JSONObject jobj = new JSONObject();

        // for bookshelf data, first create LinkedHashMap
        Map m = new LinkedHashMap(4);
        m.put("book_title", "peter pan");
        m.put("book_publishedYear", 1930);
        m.put("book_numberOfPages", 400);
        m.put("book_authors", "James williams");


        // putting address to JSONObject
        jobj.put("address", m);

        // for phone numbers, first create JSONArray
        JSONArray jarray = new JSONArray();

        m = new LinkedHashMap(4);
        m.put("book_title", "house of the dragon");
        m.put("book_publishedYear", 2008);
        m.put("book_numberOfPages", 1009);
        m.put("book_authors", "George rr martin");

        // adding map to list
        jarray.add(m);

        // putting phoneNumbers to JSONObject
        jobj.put("phoneNumbers", jarray);

        // writing JSON to file:"bookshelf.json" in cwd
        PrintWriter pw = new PrintWriter("C:\\Users\\Dell\\IdeaProjects\\Exercise_8\\src\\bookshelf2.json");
        pw.write(jobj.toJSONString());

        pw.flush();
        pw.close();
    }
}
