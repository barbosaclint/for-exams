package mockdata;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import dto.Car;
import dto.Person;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockData {

    public static List<dto.Person> getPeople() throws IOException {
        InputStream inputStream = Resources.getResource("people.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static List<Car> getCars() throws IOException {
        InputStream inputStream = Resources.getResource("cars.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Car>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public List<Person> parsePersonList(String json) throws JsonProcessingException {
        return Arrays.asList(objectMapper.readValue(json, Person[].class));
    }

}
