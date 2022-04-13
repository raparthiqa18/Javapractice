package Pactice2.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ActiveAuthors {
    public static void main(String[] args) throws IOException {
        //Set variables
        ArrayList<String> usernames = new ArrayList<String>();
        int page = 1;
        int totalpages = 1;
        URL url = null;//your url i.e fetch data from .
        HttpURLConnection conn = null;

//        while(page<=totalpages){
        // make request for each page
        url = new URL("https://jsonmock.hackerrank.com/api/article_users?page=1");
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output;
        while ((output = br.readLine()) != null) {
            System.out.println(output);
//            }
//            System.out.println(output.split("[]").length);



//        JSONArray array = new JSONArray(str);
//        for(int i=0; i < array.length(); i++)
//        {
//            JSONObject object = array.getJSONObject(i);
//            System.out.println(object.getString("No"));
//            System.out.println(object.getString("Name"));
//        }
//            }
        }


        //Get data for each user


        // Check if submission count is greater than threshold


//        try {
//            URL url = new URL("https://jsonmock.hackerrank.com/api/article_users?page=1");//your url i.e fetch data from .
//            HttpURLConnection conn = null;
//            conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.setRequestProperty("Accept", "application/json");
//            if (conn.getResponseCode() != 200) {
//                throw new RuntimeException("Failed : HTTP Error code : "
//                        + conn.getResponseCode());
//            }
//            InputStreamReader in = new InputStreamReader(conn.getInputStream());
//            BufferedReader br = new BufferedReader(in);
//            String output;
//            while ((output = br.readLine()) != null) {
//                System.out.println(output);
//            }
//            conn.disconnect();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//    }
    }
}

