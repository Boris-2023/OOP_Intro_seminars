package Model;

/**
 * Class to process logging - only console printing is realized yet...
*/
public class Logging {

    /**
     * method to print log into console
     * 
     * @param line - log sentence
     * @see Logging#log(String)
     */
    public void log(String line)
    {
        System.out.println("Log: " + line);
    }    
}
