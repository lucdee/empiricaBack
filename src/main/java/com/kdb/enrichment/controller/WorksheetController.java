package com.kdb.enrichment.controller;

import com.kdb.enrichment.model.FileValidatedResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/work-book/api")
public class WorksheetController {

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_RELATED_VALUE)
    public ResponseEntity<FileValidatedResponse> handleFileUpload(@RequestParam("file") MultipartFile file) {

        String asS = null;

        String asS1 = null;

        String asS2 = null;
        return null;
    }
}
