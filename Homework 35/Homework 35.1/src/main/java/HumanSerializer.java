import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.List;

public class HumanSerializer implements JsonSerializer<Human> {

    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("Name - ",human.getName());
        object.addProperty("Age - ", human.getAge());
        object.addProperty("Gender", human.getGender());
        object.addProperty("Height", human.getHeight());
        object.addProperty("Weight", human.getWeight());

        JsonArray petArray = new JsonArray();
        List<Pet> pets = human.getPetLists();
        pets.forEach(pet -> petArray.add(context.serialize(pet)));

        object.add("Pets",petArray);

        return object;
    }
}
