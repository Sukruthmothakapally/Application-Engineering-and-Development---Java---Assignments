//java program to read from original json file

import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Book_shelf
{
    public static void main(String[] args) throws Exception
    {


        // parsing file "bookshelf.json"
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Exercise_8\\src\\bookshelf.json"));

        // typecasting obj to JSONObject
        JSONObject jobj = (JSONObject) obj;

        Map m = new LinkedHashMap(4);
        m.put("book_title", "peter pan");
        m.put("book_publishedYear", 1930);
        m.put("book_numberOfPages", 400);
        m.put("book_authors", "James williams");

        jobj.put("address", m);
        //obj.write(jobj.toJSONString());

        // getting bookshelf
        Map bookshelf = ((Map)jobj.get("bookshelf"));

        // iterating bookshelf
        Iterator<Map.Entry> i1 = bookshelf.entrySet().iterator();
        while (i1.hasNext()) {
            Map.Entry pair = i1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        // getting books
        JSONArray jarray = (JSONArray) jobj.get("books");

        // iterating books
        Iterator i2 = jarray.iterator();

        while (i2.hasNext())
        {
            i1 = ((Map) i2.next()).entrySet().iterator();
            while (i1.hasNext()) {
                Map.Entry pair = i1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }



    }
}
