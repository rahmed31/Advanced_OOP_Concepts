import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class TVShowsDatabase {

    String baseUrl = "http://api.tvmaze.com/search/";

/*Create a method getURLSource that returns a String and gets a URL object as a parameter. It should also throw an exception.
This method should read the open stream of the url and concatenate it in a String. It should then return that String.*/

    public String getURLSource(URL f) {
        String contents = "";

        try (Scanner urlScanner = new Scanner(f.openStream())) {
            while (urlScanner.hasNextLine()) {
                contents += urlScanner.nextLine();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "{'result':" + contents.substring(1,contents.length()-1) + "}";
    }

    ///* TODO
//You have to use the url to retrieve the contents of the website.
//This will be a String, but in JSON format. Use the auxiliary function you created above. */
//        /* TODO
//Remember to return a JSON object.*/

    public JsonObject getShowsByName(String name) throws Exception {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl + "shows?q=" + name);

        String contents = getURLSource(url);

        return (JsonObject) Jsoner.deserialize(contents, new JsonObject());
    }

        /* TODO 
Fill in this data type (Object) */  /* TODO
Fill in this datatype (Object) */

       /* TODO
Read the information coming from the web
 */
    /* TODO
return the appropriate result.
*/

    public JsonObject getPeopleInShows(String query) throws Exception {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl + "people?q=" + query);

        String contents = getURLSource(url);

        return (JsonObject) Jsoner.deserialize(contents, new JsonObject());
    }

        /* TODO
This should return a String with each show in four fields:
Name:the name of the show
Link:the link to the show
rating average:The rating average of the show, and
summary, the summary of the show.*/
    public String formatShowAsString(JsonObject doc) {
        String results = "";

        String[] metadata = {"name", "url", "premiered", "rating", "summary"};
        String[] format = {"Name: ", "Link: ", "Premiered: ", "Rating Average: ", "Summary"};

        JsonObject info = (JsonObject) doc.get(0);
        JsonArray show = (JsonArray) info.get("result");

        System.out.println(show);

        for (int i = 0; i < metadata.length; i++) {
            if (!metadata[i].equals("rating")) {
                results += format[i] + (String)show.get(metadata[i]) + '\n';
            } else {results += format[i] + (String)((JsonObject)info.get(10)).get("average");}
        }

        System.out.println(results);

        return results;
    }

    /* TODO
Given a String with some text in it, write that text to a file. 
The name of the file is given in outfile */
    public void saveShows(String text, String outfile) {

        try (BufferedWriter out = new BufferedWriter(new FileWriter(outfile))) {
            out.write(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
