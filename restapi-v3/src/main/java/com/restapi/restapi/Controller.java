package com.restapi.restapi;
import com.restapi.restapi.RestEntity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
public class Controller {

    @Autowired
    private RestRepository repository;

    @GetMapping("/test")
    public String helloWorld() {
        return "Test Success";
    }

    @PostMapping("/insertRecord")
    public ResponseEntity<ResponseModel> insertRecord(@RequestBody RequestPayloadModel payload){

        log.info("Inside POST"+" "+String.valueOf(payload));
        String username = payload.getUsername();
        RestEntity user = RestEntity.builder().username(username).build();
        repository.save(user);

        return new ResponseEntity<>(ResponseModel.builder().id(user.getId()).build() , HttpStatus.OK);

    }

    @DeleteMapping("/deleteRecord/{id}")
    public ResponseEntity<ResponseModel> deleteRecord(@PathVariable int id) {

        Optional<RestEntity> user = repository.findById(id);
        log.info(String.valueOf(user));
        if (user.toString() == "Optional.empty") {
            return new ResponseEntity<>(ResponseModel.builder().response("Record doesn't exist for id: " + "" + id).build(), HttpStatus.NOT_FOUND);
        } else {
            repository.deleteById(id);
            return new ResponseEntity<>(ResponseModel.builder().response("Record deleted successfully for id: " + "" + id).build(), HttpStatus.OK);
        }
    }

}
