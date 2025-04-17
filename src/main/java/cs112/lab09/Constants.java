package cs112.lab09;
import javafx.scene.image.Image;

public class Constants {
    public static final String MAIN_DESCRIPTION = "In 1919, Red Summer was a pattern of white-on-black violence that occurred in more than three dozen cities across the United States and in one rural county in Arkansas. The term 'Red Summer' was coined by civil rights activist and author James Weldon Johnson, who had been employed as a field secretary by the National Association for the Advancement of Colored People (NAACP) since 1916. It was branded 'Red Summer' because of the bloodshed that occurred during the worst white-on-black violence in U.S. history.";
    public static final String MAIN_TITLE = "Interactive Revisionist History Map";
    public static final String MAIN_SUBTITLE = "Red Summer Edition";

    public static final String REDSUMMER_IMAGE_PATH = "file:./images/Red-Summer.jpg";

    

    public static final String MAIN_VIEW_RESOURCE = "main-view.fxml";
    public static final String CITY_VIEW_RESOURCE = "city-view.fxml";
    public static final String MAP_VIEW_RESOURCE = "map-view.fxml";

    public static final String MAIN_VIEW_TITLE = "Red Summer";
    public static final String MAP_VIEW_TITLE = "Red Summer Map";
    public static final String CITY_VIEW_TITLE = "Detail View";

    public enum Event {
        SAN_FRANCISCO,
        BISBEE;

       

    }

    public static final String[][] HISTORICAL_DATA = {
            {
                    "file:./src/main/resources/images/sanfrancisco.jpg",
                    "San Francisco, CA",
                    "The following 'history' was told for many years: a minor riot between Black and White soldiers occred in the Presidio in San Francisco",
                    "05-15-1919",
                    "By correcting history, not just rewriting it, we are revising it to-embark on the process of righting a wrong. Here is the revised history: a minor riot between Black and White soliders occured in the Presidio in San Francisco after a dispute about a Thai soldier who was moved from the 'colored quarters' to the white military housing. Despite defending our country, housing for Black soliders was not only segregated but often inferior. Black soldiers also faced increased attacks and other forms of discrimination upon returning home",
                    "https://www.legendsofamerica.com/red-summer-civil-unrest/"
            },
            {
                    "file:./src/main/resources/images/bisbee.png",
                    "Bisbee, AZ",
                    "The following 'history' was told for many years: Local police in Bisbee, Arizona attacked the 10th U.S. Cavalrty, an African-American unitn known as the 'Buffalo Soliders,' formed in 1866",
                    "07-13-1919",
                    "By correcting history, not just rewriting it, we are revising it to-embark on the process of righting a wrong. Here is the revised history: Although sources are limited, the attack occurred on the even of celebrations mean to honor returning soldiers (like in Norfolk Virginia).",
                    "https://en.wikipedia.org/wiki/Bisbee_Riot"
            }
    };
}
