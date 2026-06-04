package g1.Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSerializer;
import g1.entity.Patient;

import java.time.LocalDate;

public class Utils {

    public static String convertToJson(Patient[] patients) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>) (date, type, context) ->
                        context.serialize(date.toString())
                )
                .create();

        return gson.toJson(patients);
    }
}
