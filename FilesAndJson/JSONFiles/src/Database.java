import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    /* TODO 
Declare a member variable that can 
be EASILY set from the constructor. */
    JsonObject myReviewSet;

        /* TODO 
set the member variable declared above.*/
    public Database(JsonObject data) {
        this.myReviewSet = data;
    }

        /* TODO
Complete this method as specified. */
    public JsonObject getRestaurant(String name) {
        JsonArray restaurants = (JsonArray)myReviewSet.get("restaurants");

        JsonObject myRestaurant = null;

        for (Object restaurant:restaurants) {
            if (((JsonObject)restaurant).get("name").equals(name)) {
                myRestaurant = (JsonObject) restaurant;
            }
        }

        return myRestaurant;
    }

        /* TODO 
Complete this method as specified.
 The previous method may be of help. */
    public double getAvgReviews(String name){
        JsonObject myRestaurant = getRestaurant(name);

        JsonArray myReviews = (JsonArray) myRestaurant.get("reviews");

        double sum = 0;

        for (Object review:myReviews) {
            sum += Integer.parseInt(String.valueOf(((JsonObject)review).get("rating")));
        }

        return sum/myReviews.size();
    }
}
