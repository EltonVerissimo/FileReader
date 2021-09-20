package Controller;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ReadExcelFile {

    @GetMapping("/")
    public String getIDs() {

        List<Integer> idList = new ArrayList<Integer>();

        try(FileInputStream fileInputStream = new FileInputStream(String.valueOf("/home/elton/Documents/Java/Springboot/CSVs/CSV-test.xlsx"))){
            try (XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)){
                XSSFSheet sheet = workbook.getSheetAt(0);

                XSSFRow currentRow = sheet.getRow(2);
                XSSFCell currentCell = currentRow.getCell(0);

                System.out.println(currentCell);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
