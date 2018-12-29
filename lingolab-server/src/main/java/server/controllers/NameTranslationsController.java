package server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameTranslationsController {

    @RequestMapping("/translate")
    public NameTranslations translate(@RequestParam(value="name") String name) {
        return new NameTranslations(name, "language");
    }
}