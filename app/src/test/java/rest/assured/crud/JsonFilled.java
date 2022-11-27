package rest.assured.crud;

import com.github.javafaker.Faker;
import org.json.JSONObject;

import java.util.concurrent.TimeUnit;

public class JsonFilled {
    private static JSONObject json;
    private static Faker faker;

    public static String bodyPost() {
        faker = new Faker();
        json = new JSONObject();

        json.append(KeysSchema.NAME.label, faker.name().fullName());
        json.append(KeysSchema.CREATED_AT.label, faker.date().future(1, TimeUnit.DAYS));
        json.append(KeysSchema.AVATAR.label, faker.avatar().image());

        return json.toString();
    }

    public static String bodyPatch() {
        faker = new Faker();
        json = new JSONObject();

        json.append(KeysSchema.NAME.label, faker.name().fullName());
        json.append(KeysSchema.CREATED_AT.label, faker.date().future(1, TimeUnit.DAYS));

        return json.toString();
    }

}
