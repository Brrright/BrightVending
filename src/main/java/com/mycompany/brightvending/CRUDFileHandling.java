/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brightvending;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CRUDFileHandling {
    
//    create file
    public static Object[] CreateFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                Object[] message = {"SUCCESS","File successfully created" + file.getName()};
                return message;
            }
            else {
             Object[] message = {"FAILED","File name already exist."};
                return message;
            }
        }
        catch (IOException e) {
            Object[] message = {"FAILED","Error occured. Err: " + e.getMessage()};
            e.printStackTrace();
            return message;
        }
    }
    
    
    
//    insert record - append mode @ update record - overwrite mode
    public static Object[]  InsertRecord (String filePath, String[] fileContent, String fileHeader, String mode){
        File file = new File(filePath);
        
        try {
            if ("append".equals(mode)) {
                FileWriter fwriter = new FileWriter(file, true); //append
                
    //            read file to see if the record is empty
                try (BufferedWriter bwriter = new BufferedWriter(fwriter)) {
                    FileReader freader = new FileReader(file);
                    BufferedReader breader = new BufferedReader(freader);
                    Object [] tableLines = breader.lines().toArray();

    //                if the file is empty, we need add header, if not then we just skip this step
                    if (tableLines.length == 0){
                        String firstLine = fileHeader;
                        bwriter.write(firstLine + "\n");
                    }

                    for (String i : fileContent) {
                        bwriter.write(i);
                        bwriter.newLine();
                    }
                    breader.close();
                    freader.close();
                    bwriter.close();
                    fwriter.close();
                }
                catch (IOException e) {
                    Object[]  message = {"ERROR","appending process failed, error occured. Err:"+ e.getMessage()};
                    e.printStackTrace();
                    return message;
                }
            }
            else if("overwrite".equals(mode)) {
                FileWriter fOverwriter = new FileWriter(file, false); //override
                try (BufferedWriter bOverwriter = new BufferedWriter(fOverwriter)) {
//                    System.out.println("get in overwrite part");
                    String firstLine = fileHeader;
                    bOverwriter.write(firstLine + "\n");
                    for (String i : fileContent) {
                            bOverwriter.write(i);
                            bOverwriter.newLine();
                    }              
                    bOverwriter.close();
                    fOverwriter.close();
                }
                catch (IOException e) {
                    Object[]  message = {"ERROR","err occered when overwriting: " +e.getMessage()};
                    return message;
                }
            }
            
            Object[]  message = {"SUCCESS","File content is writen and inserted successfully"};
            return message; 
            
        } catch (IOException e) {
                Object[]  message = {"ERROR","Error occured. Err: "+e.getMessage()};
                e.printStackTrace();

                return message;
        }
    }
    
    public static int IDgeneration(String filePath) {
            // a. fetch all record from  file, determine the last id
            // b. then +1 and assign it to new  id
            Object[] record = CRUDFileHandling.FetchRecord(filePath);
            
            int numberOfRecord = record.length;
            //if there is no record or only header exist
            if (numberOfRecord == 0 || numberOfRecord == 1) {
                return 1;
            }
            
            if (record[0] == "ERROR") {
                String error_message = (String) record[1];
                JOptionPane.showMessageDialog(null,error_message,"ERROR",JOptionPane.WARNING_MESSAGE); 
                return -1;
            }
            else {
                Object lastRow = record[numberOfRecord-1];
                String dataRecord = lastRow.toString().trim();
                String[] data = dataRecord.split(";");
                int last_id = Integer.parseInt(data[0]);
                return last_id+1;
            }

    }
    
    
//    fetch record
    public static Object[] FetchRecord (String filePath){
        try {
            File file = new File(filePath);
            FileReader freader = new FileReader(file);
            BufferedReader breader =  new BufferedReader(freader);
            Object[] tableLines = breader.lines().toArray();
            breader.close();
            freader.close();

            return  tableLines;
        }
        catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
            Object[] message = {"ERROR","Err occured while fetching records. Err:"+e.getMessage()};
            return message;
        }
    }
    
    
//    update record - if have time, do the check id, and change the specific row only
//    public static String UpdateRecord (String filePath, String PrimaryKey, String[] Content){
//         try {
//            File file = new File(filePath);
//            FileWriter fwriter = new FileWriter(file);
//            BufferedWriter = new BufferedWriter(fwriter);
//         }
//    }
    
    
//    fetch 1 record
    public static Object[] FetchOneRecord(String filePath, String PrimaryKey) {
        Object[] result = null;
        try {
            File file = new File(filePath);
            FileReader freader = new FileReader(file);
            BufferedReader breader = new BufferedReader(freader);
            Object[] tableLines =  breader.lines().toArray();
            breader.close();
            freader.close();
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] dataRow = line.split(";");
//                System.out.println(Arrays.toString(dataRow));
                for (int i = 0; i < dataRow.length; i++) {
                    if (dataRow[0].equals(PrimaryKey)) {
//                        result = Arrays.toString(dataRow);
                        result = dataRow;
                        return result; // it will be xxx;xxx;xxx (example only)
                    }
                }
            }
            
            if (result == null) {
                Object[] message = {"ERROR","No record is found."};
                return message;
            }
            
            return result;

        }
        catch (IOException e){
            Object[] message = {"ERROR","error occured. err: "+ e.getMessage()};
            return message;
        }
    }
    
    
    public static Object[]  DeleteRecord(String filePath, Object[] toBeDelete) {
//        Object[]  message;
        Boolean isRemoved = false;
        ArrayList<String> listOfOriginalRecord = new ArrayList<>();
//        ArrayList<String> recordToBeDeleted = new ArrayList<>();
        
        //fetch all record
        Object[] originalRecords = FetchRecord(filePath);
        // check err, if no, append to the arraylist
        for (Object record : originalRecords) {
            if(record != "ERROR") {
                listOfOriginalRecord.add((String) record);
            }
            else { //if err occured
                Object[] message = {"ERROR","err msg: " + record};
                return message;
            }
        }
        
        // check if the array is exist, if yes, remove
        for (int num = 0; num < listOfOriginalRecord.size(); num++) {
            String[] line = listOfOriginalRecord.get(num).split(";");
            if (Arrays.equals(line, toBeDelete)) {
                // String recordString = listOfOriginalRecord.get(num); 
                // return "Found the record " + recordString;
                listOfOriginalRecord.remove(num);
                isRemoved = true;
            }
        }
        
        if (isRemoved == false) {
            Object[] message = {"ERROR","Record not found"};
            return message;
        }
        else {
            ArrayList<String> modifiedRecord = listOfOriginalRecord;
            try {
                FileWriter fwriter = new FileWriter(filePath);
                BufferedWriter bwriter= new BufferedWriter(fwriter);
                for (String eachline : modifiedRecord) {
                    bwriter.write(eachline+"\n");
                }
                bwriter.close();
                fwriter.close();
                Object[] message = {"SUCCESS","Record deleted!"};
                return message;
            }
            catch (IOException e) {
                Object[] message = {"ERROR", "Err occured during deleting... Err: " +e.getMessage()};
                return message;
            }
        }
//            return listOfOriginalRecord.toString();
    }
    
    
    public static boolean isExist(String filePath, String Pkey) {
        Object[] theRecord = FetchOneRecord(filePath, Pkey);
        return theRecord[0] != "ERROR";
    }
    
    
////    ----------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        String filepath = "src\\main\\java\\com\\mycompany\\brightvending\\files\\testing.txt";
        
////        CREATE FILE - filepath

//        String message = CreateFile(filepath);
//        System.out.println(message);

////----------------------------------------------------------------------------------

////        INSERT RECORD - filepath, recordList, header, mode

//        String[] recordList = {"line1;record1;konichiwa;3","line2;record2;konimama;2"};
//        String header = "line;record;content;qty";
//        String insertfilemsg = InsertRecord(filepath, recordList,header,"append");
//        System.out.println(insertfilemsg);


////        INSERT (UPDATE) -overwrite

//        String[] recordList = {"line1;record2;konichiwa;3","lineEDITED;record2;konimama;2"};
//        String header = "line;record;content;qty";
//        String insertfilemsg = InsertRecord(filepath, recordList,header,"overwrite");
//        System.out.println(insertfilemsg);

////----------------------------------------------------------------------------------

////      FETCH RECORD (all)- filepath
////      remember to check if error message is returned or not

//        Object[] recordList = FetchRecord(filepath);
//        for (Object i : recordList) {
//            if (i != "ERROR") {
//                
//                // print line by line
//                 String fetched = i.toString();
//                 System.out.println(fetched);
//
//                // print each data
//                String[] data = fetched.split(";"); 
//                for (String y : data) {
//                    System.out.println(y);
//                }
//                
//            }
//            else {
//                System.out.println("error:"+i);
//            }
//        }

////      FETCH ONE RECORD - filepath, pkey
////      WORK WITH DELETE, FETCH THAT RECORD AND DELETE THAT RECORD

//        String Pkey = "line1";
//        Object[] recordMessage = FetchOneRecord(filepath, Pkey);
//       for (Object record : recordMessage) {
//            if (record != "ERROR") {
//                System.out.println(record);
//            }
//            else {
//                System.out.println("Issue: "+record);
//            }
//        }
//        System.out.println(Arrays.toString(recordMessage));

////----------------------------------------------------------------------------------
//
////      DELETE RECORD - filepath, tobedeletedRecord[]
//
////fetch1record
//        Boolean errOccured = false;
//        String Pkey = "line2";
//        
//        Object[] recordMessage = FetchOneRecord(filepath, Pkey);
//       for (Object record : recordMessage) {
//            if (record == "ERROR") {
//                System.out.println("Error details: "+record);
//                errOccured = true;
//                return;
//            }
//        }
//       if (errOccured != true) {
//            String deleteMessage = DeleteRecord(filepath, recordMessage);
//            System.out.println(deleteMessage); 
//       }
       
       
       
//    }
}
