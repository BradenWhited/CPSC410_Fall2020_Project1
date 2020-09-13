import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class ScraperProject {
    private static final String URL_TO_BE_SCRAPED = "https://www.imdb.com/calendar/";
    public static final Logger LOGGER = Logger.getLogger(ScraperProject.class.getName());
    private static final List<String> moviesList = new ArrayList<String>();

    public static void writeListToFile(List<String> list) {
        String filename = "results.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(filename));
            BufferedWriter out = new BufferedWriter
                    (new OutputStreamWriter(new FileOutputStream(new File(filename)),"UTF-16LE"));

            for(String movie: moviesList){
                out.write(movie+"\n");
            }
            out.flush();
            out.close();
            fileOutputStream.close();
        } catch(Exception e) {
            LOGGER.warning(String.format("Error while writing file: %s", filename));
        }
    }

    public static void main(String[] args){
        scrapeSite(URL_TO_BE_SCRAPED);
        writeListToFile(moviesList);
    }
    // DO NOT MODIFY ANY CODE ABOVE THIS LINE
    //      You may change any code below in order to complete your project
    //      Use the apache log4j logger to help you debug your project if you run into errors

    // You can edit this month to try pulling different data
    // I will change this during grading so please use this variable in your code
    private static final String TARGET_MONTH = "October";

    /*
    *   In this method you should...
    *
    *   Get the main portion of the html that contains the movie listings
    *   Obtain the children elements of that main portion
    *   Pass those children to findValidMovies for further processing
    *
    * */
    public static void scrapeSite(String url){
        try {
            Document doc = Jsoup.connect(url).get();
            // Your work goes here
        }
        catch(IOException exception){
            LOGGER.severe(String.format("There was an error trying to make a connection to the url: %s", url));
            exception.printStackTrace();
        }
    }

    /*
     *   In this method you should...
     *
     *   Check to see if the next set of movies are released during the correct month
     *   If so, add all movies coming out that day to the moviesList ArrayList
     *      Note - You should add the movies one at a time, not one string containing all movies that day
     *   If done correctly, you should see results.txt being generated, putting one movie on each line
     *
     *   The code to write the movies to a file is already done for you if you add them to moviesList
     *
     * */
    public static void findValidMovies(Elements upcomingMovies){
        if(upcomingMovies != null){
            // Your work goes here
        }
    }
}