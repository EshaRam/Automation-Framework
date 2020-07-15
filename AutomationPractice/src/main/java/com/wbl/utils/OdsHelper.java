package com.wbl.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jopendocument.dom.spreadsheet.SpreadSheet;


import java.io.File;
import java.io.IOException;

public class OdsHelper {

    private static Logger log = LogManager.getLogger(OdsHelper.class);

    public static Object[][] readODS(File file) {

        Object[][] data = null;
        SpreadSheet sheet;
        try {
            //Getting the 0th sheet for manipulation| pass sheet name as string

            sheet = SpreadSheet.createFromFile(file);

            int nColCount = sheet.getSheet(0).getColumnCount();
            int nRowCount = sheet.getSheet(0).getRowCount();

            log.info("total rows:" + nRowCount);
            data = new Object[nRowCount][nColCount];

            for(int nRowIndex = 1; nRowIndex < nRowCount; nRowIndex++)
            {
                //Iterating through each column
                for(int nColIndex = 0; nColIndex < nColCount; nColIndex++)
                {
                    data[nRowIndex][nColIndex] = sheet.getSheet(0).getValueAt(nColIndex, nRowIndex);
                    System.out.print(data[nRowIndex][nColIndex].toString()+ " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;

    }

    //public static void main(String[] args) {
        //Creating File object of .ods file
      //  File file = new File("/Users/easwarimuthu/IdeaProjects/AutomationPractice/src/main/Resources/test-data/HomePageData.ods");
      //  OdsHelper objODSReader = new OdsHelper();
       // objODSReader.readODS(file);
    }




