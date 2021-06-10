package rafael.alcocer.caldera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rafael.alcocer.caldera.model.Thing;
import rafael.alcocer.caldera.service.ThingService;

@RestController
public class ThingController {
    
    private final ThingService thingService;
    
    public ThingController(ThingService thingService) {
        this.thingService = thingService;
    }

    @RequestMapping("/thing")
    public Thing showThing() {
        return thingService.generateThingData();
    }
}
