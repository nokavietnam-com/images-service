package com.nokavietnam.imagesservice.controller;

import com.nokavietnam.imagesservice.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author : NOKA NGUYEN
 * @since : 6/26/2021, Sat
 **/
@RestController
@RequestMapping(value = "/")
public class HomeController {

    private Environment environment;

    @Autowired
    private HomeController(Environment env) {
        this.environment = env;
    }

    @GetMapping("/")
    public String home() {
        return "This is Images Service running at port: " +
                environment.getProperty("local.server.port");
    }

    @GetMapping(value = "/images")
    public List<Image> getImages() {
        List<Image> images = Arrays.asList(
                new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
        return images;
    }

}
