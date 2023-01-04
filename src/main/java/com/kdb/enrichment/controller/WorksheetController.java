package com.kdb.enrichment.controller;

import com.kdb.enrichment.model.FileValidatedResponse;
import com.kdb.enrichment.model.Parameter;
import com.kdb.enrichment.service.WorksheetService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/work-book/api")
public class WorksheetController {

    private final WorksheetService service;

    public WorksheetController(WorksheetService service) {
        this.service = service;
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<FileValidatedResponse> handleFileUpload(@RequestParam("file") MultipartFile file,
                                                                  @RequestParam(value = "colunmName1", required=false) String colunmName1,
                                                                  @RequestParam(value = "colunmName2", required=false) String colunmName2,
                                                                  @RequestParam(value = "colunmName3", required=false) String colunmName3,
                                                                  @RequestParam(value = "colunmName4", required=false) String colunmName4,
                                                                  @RequestParam(value = "colunmName5", required=false) String colunmName5,
                                                                  @RequestParam(value = "colunmName6", required=false) String colunmName6,
                                                                  @RequestParam(value = "colunmName7", required=false) String colunmName7,
                                                                  @RequestParam(value = "colunmName8", required=false) String colunmName8,
                                                                  @RequestParam(value = "colunmName9", required=false) String colunmName9,
                                                                  @RequestParam(value = "colunmName10", required=false) String colunmName10
                                                                  ) throws IOException {

        List<Parameter> parameterList = createParameterList(colunmName1, colunmName2, colunmName3, colunmName4,
                colunmName5, colunmName6, colunmName7, colunmName8, colunmName9, colunmName10);

        return ResponseEntity.ok(service.validateXML(parameterList, file));
    }

    private List<Parameter> createParameterList(String colunmName1, String colunmName2,
                                             String colunmName3, String colunmName4,
                                             String colunmName5, String colunmName6,
                                             String colunmName7, String colunmName8,
                                             String colunmName9, String colunmName10){
        List<Parameter> parameters = new ArrayList<>();
        Parameter parameter = new Parameter();

        if (colunmName1 != null){
            parameter.setNameColunm(colunmName1);
            parameters.add(parameter);
        }
        if (colunmName2 != null){
            parameter.setNameColunm(colunmName2);
            parameters.add(parameter);
        }
        if (colunmName3 != null){
            parameter.setNameColunm(colunmName3);
            parameters.add(parameter);
        }
        if (colunmName4 != null){
            parameter.setNameColunm(colunmName4);
            parameters.add(parameter);
        }
        if (colunmName5 != null){
            parameter.setNameColunm(colunmName5);
            parameters.add(parameter);
        }
        if (colunmName6 != null){
            parameter.setNameColunm(colunmName6);
            parameters.add(parameter);
        }
        if (colunmName7 != null){
            parameter.setNameColunm(colunmName7);
            parameters.add(parameter);
        }
        if (colunmName8 != null){
            parameter.setNameColunm(colunmName8);
            parameters.add(parameter);
        }
        if (colunmName9 != null){
            parameter.setNameColunm(colunmName9);
            parameters.add(parameter);
        }
        if (colunmName10 != null){
            parameter.setNameColunm(colunmName10);
            parameters.add(parameter);
        }

        return parameters;
    }
}
