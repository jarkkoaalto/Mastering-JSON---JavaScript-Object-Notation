import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonEx1 {
    private static final String filePath = "//E://GITHUB//Mastering-JSON---JavaScript-Object-Notation//Examples//wonders.json";
   
    public static void main(String [] args){

        try{
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            String ListName = (String)jsonObject.get("List-Name");
            long id = (long) jsonObject.get("List-No");
            System.out.println(id+")"+ListName);
            System.out.println("Creator(s): ");

            JSONArray creators = (JSONArray)jsonObject.get("Creator");
            // Take the elements of the json array
            for(int i=0; i<creators.size(); i++) {
                System.out.println(creators.get(i)+" ");
            }
            System.out.println();

            JSONAarray wonders = (JSONArray)jsonObject.get("Wonders");
            Iterator i = wonders.iterator();
            while(i.hasNext()){
                jSONObject innerObj = (JSONObject) i.next();
                System.out.println(
                    innerObj.get("Name")+
                    ", " + innerObj.get("Build")+
                    ", " + innerObj.get("Present-Now")+
                    ", " + innerObj.get("Additinal-Info"));
            }
        }

        catch (FileNotFoundException ex) {ex.printStackTrace();}
        catch (IOException ex) {ex.printStackTrace();}
       // catch (ParseException ex) {ex.printStackTrace();}
        catch (NullPointerException ex){ex.printStackTrace();}

    }
}