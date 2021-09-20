package com.csv_example.csv_reader;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CsvReaderApplication {

    public static void main(String[] args) throws IOException {
        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();
        List<Integer> valueList = new ArrayList<Integer>();

        FileInputStream fileInputStream = new FileInputStream(String.valueOf("/home/elton/Documents/Java/Springboot/CSVs/CSV-test.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFRow currentRow = sheet.getRow(1);
        XSSFCell currentCell = currentRow.getCell(0);

        int i = 1;

        while (sheet.getRow(i) != null) {
            currentRow = sheet.getRow(i);
            currentCell = currentRow.getCell(0);
            idList.add((int) currentCell.getNumericCellValue());
            i++;
        }

        i = 1;

        while (sheet.getRow(i) != null) {
            currentRow = sheet.getRow(i);
            currentCell = currentRow.getCell(1);
            nameList.add(currentCell.getStringCellValue());
            i++;
        }

        i = 1;

        while (sheet.getRow(i) != null) {
            currentRow = sheet.getRow(i);
            currentCell = currentRow.getCell(2);
            valueList.add((int) currentCell.getNumericCellValue());
            i++;
        }

        System.out.println(idList);
        System.out.println(nameList);
        System.out.println(valueList);
    }
}
