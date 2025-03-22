package mockdata;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import com.kurinto.forexams.car.Car;
import com.kurinto.forexams.person.Person;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MockData {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static List<Person> getPeople() throws IOException {
        return loadDataFromFile("people.json", new TypeReference<List<Person>>() {});
    }

    public static List<Car> getCars() throws IOException {
        return loadDataFromFile("cars.json", new TypeReference<List<Car>>() {});
    }

    private static <T> T loadDataFromFile(String fileName, TypeReference<T> typeReference) throws IOException {
        try (InputStream inputStream = MockData.class.getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IOException("Resource not found: " + fileName);
            }
            return objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            throw new IOException("Failed to load data from " + fileName, e);
        }
    }

}
