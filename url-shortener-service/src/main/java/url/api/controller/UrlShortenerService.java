package url.api.controller;

import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/url-shortener")
public class UrlShortenerService {

  @GetMapping(path = "/home", produces = APPLICATION_JSON_VALUE)
  @ResponseBody
  @ResponseStatus(OK)
  public String welcome() {
    return "Welcome to the URL shortening service home!!!";
  }
}
