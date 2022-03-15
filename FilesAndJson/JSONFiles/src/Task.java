import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import netscape.javascript.JSObject;

import java.io.*;

public class Task {
    public static void main(String[] args){
        Task t = new Task();
        JsonObject doc = t.readJson("./test/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }

    public String readFile(String filename) {
        StringBuilder contents = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            String line;

            while((line = in.readLine()) != null) {
                contents.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return contents.toString();
    }

   /* TODO: create a JSON object with the contents of "filename".
       You can use the method below to help you read the file. */
       /* Put in the variable that should be returned. */

    public JsonObject readJson(String filename) {
        String json = readFile(filename);

        return Jsoner.deserialize(json, new JsonObject());
    }

}