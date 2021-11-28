package helpers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import commons.GlobalVariable;


import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class JsonHelper {
    private static final String BASE_PATH = "src/test/resources/data/";

    public static <T> List<T> getDataFromJson(String fileName, Class<T> clazz) {
        String filePath = BASE_PATH + "/" + GlobalVariable.getTestDataType() + "/" + fileName;
        Gson gson = new Gson();
        try {
            Reader reader = new FileReader(filePath);

            Type typeOfT = TypeToken.getParameterized(List.class, clazz).getType();
            return gson.fromJson(reader, typeOfT);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

