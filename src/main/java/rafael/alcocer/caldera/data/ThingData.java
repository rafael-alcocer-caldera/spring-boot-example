package rafael.alcocer.caldera.data;

import org.springframework.stereotype.Component;

import rafael.alcocer.caldera.model.Thing;

@Component
public class ThingData {

    public Thing generateThingData() {
        Thing thing = new Thing();
        thing.setId(13);
        thing.setName("NEW THING NAME");
        thing.setDescription("is the pattern of narrative development that aims to make vivid a place, object, character, or group");
        
        return thing;
    }
}
