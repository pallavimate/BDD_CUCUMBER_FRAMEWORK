package LibraryFiles;
//use to create selenium related common reusable methods
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{
    //This method is use to get method from property file
    // Author = Sanjay
    public static String getPFData(String key) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\palla\\IdeaProjects\\BDDCucumberFramework\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");
        Properties p = new Properties();
        p.load(file);
        String value=p.getProperty(key);
        return value;
    }
}

