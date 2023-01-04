package com.kdb.enrichment.service;

import com.kdb.enrichment.model.FileValidatedResponse;
import com.kdb.enrichment.model.Parameter;
import com.kdb.enrichment.model.ParameterBody;
import com.kdb.enrichment.model.RegistrationData;
import com.kdb.enrichment.model.enumeration.Parameters;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class WorksheetService {

    public WorksheetService() {
    }

    public FileValidatedResponse validateXML(List<Parameter> parameterList, MultipartFile file) throws IOException {

        String SHEET = file.getName();
        List<Parameter> HEADERS = parameterList;

        Workbook workbook = new XSSFWorkbook(file.getInputStream());
        Sheet sheet = workbook.getSheet(SHEET);
        Iterator<Row> rows = sheet.iterator();

        int rowNumber = 0;

        Row currentRow = null;
        while (rows.hasNext()) {
            currentRow = rows.next();
            if (rowNumber == 0) {
                rowNumber++;
                continue;
            }
        }

        List<RegistrationData> registrationDataList = new ArrayList<RegistrationData>();
        Iterator<Cell> cellsInRow = currentRow.iterator();

        RegistrationData registrationData = new RegistrationData();

        int cellIdx = 0;
        while (cellsInRow.hasNext()) {
            Cell currentCell = cellsInRow.next();

            ParameterBody parameterBody = parameterExist(parameterList);

            if (parameterBody.getColunm1().equals(Parameters.NAME)){
                registrationData.setName(currentCell.getStringCellValue());
            }









        }



        registrationDataList.add(registrationData);

        workbook.close();
        return null;

    }

    public ParameterBody parameterExist(List<Parameter> parameters){

        ParameterBody parameter = new ParameterBody();
        for (Parameter p : parameters){

            if (p.getNameColunm().equals(Parameters.NAME)){
                parameter.setColunm1(p.getNameColunm());
            }

            if (p.getNameColunm().equals(Parameters.MOTHER_NAME)){
                parameter.setColunm1(p.getNameColunm());
                //todo validar posicao dos parametros a serem salvos
            }


        }




        return null;
    }

    public RegistrationData validationInformationColunm(List<Parameter> listParameters){

        for (Parameter p : listParameters){
            if (p.getNameColunm().equals(Parameters.NAME.getShortName())){

            }



        }
















        return null;
    }



    public static boolean hasExcelFormat(MultipartFile file) {

    //TODO QUANDO TIVER VARIOS TIPOS DE FORMATOS, VALIDAR SE É O MESMO CONFIGURADO

        return true;
    }

}
