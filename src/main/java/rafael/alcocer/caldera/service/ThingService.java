package rafael.alcocer.caldera.service;

import org.springframework.stereotype.Service;

import rafael.alcocer.caldera.data.ThingData;
import rafael.alcocer.caldera.model.Thing;

@Service
public class ThingService {

    private final ThingData thingData;
    
    public ThingService(ThingData thingData) {
        this.thingData = thingData;
    }
    
    public Thing generateThingData() {
        return thingData.generateThingData();
    }
}
