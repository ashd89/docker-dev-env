package org.example.dockerdevenv;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @GetMapping("/version")
    public ResponseEntity<String> getVersion(){
        return ResponseEntity.ok("hello");
    }
}
