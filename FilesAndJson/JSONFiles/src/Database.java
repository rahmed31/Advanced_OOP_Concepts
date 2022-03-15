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
        myReviewSet = data;
    }

        /* TODO
Complete this method as specified. */
    public JsonObject getRestaurant(String name) {
        JsonArray restaurants = (JsonArray)myReviewSet.get("restaurants");

        JsonObject myRestaurant = null;

        for (int i = 0; i < restaurants.size(); i++) {
            JsonObject restaurant = (JsonObject) restaurants.get(i);

            if (restaurant.get("name").equals(name)) {
                myRestaurant = restaurant;
            }
        }

        return myRestaurant;
    }

        /* TODO 
Complete this method as specified.
 The previous method may be of help. */
    public Double getAvgReviews(String name){
        JsonObject myRestaurant = getRestaurant(name);

        JsonArray myReviews = (JsonArray) myRestaurant.get("reviews");

        double sum = 0;
        double count = 0;

        for (int i = 0; i < myReviews.size(); i++) {
            JsonObject review = (JsonObject) myReviews.get(i);
            sum += (double)review.get("rating");
            count ++;
        }

        return sum/count;
    }
}
