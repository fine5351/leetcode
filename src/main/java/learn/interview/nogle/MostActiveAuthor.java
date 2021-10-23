package learn.interview.nogle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MostActiveAuthor {

    public static void main(String[] args) {

    }

//    public static List<String> getUsernames(int threshold) {
//    }

//    private static String getResponseFromAPI(int page) {
//        StringBuilder responseContent = new StringBuilder();
//        String urlFormat = "https://jsonmock.hackerrank.com/api/article_users?page=%d";
//        List<String> resultList = new ArrayList<>(page);
//        try {
//            URL url = new URL(String.format(urlFormat, page));
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
//                String input;
//                while ((input = bufferedReader.readLine()) != null) {
//                        responseContent.append(input);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return responseContent.toString();
//    }
}
