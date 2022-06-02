package br.com.edsongustavotofolo.examplespringbootcache.person;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
@RequiredArgsConstructor
public class PersonRestController {

    private final PersonService personService;

    @GetMapping
    public ResponseEntity<String> getPersonsNames() {
        return ResponseEntity.ok(personService.getNames());
    }
}
