/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brightvending;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class User {
    private String userName;
    private String password;
    
//    getter
    public String getName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    
//    setter
    public void setName(String newName) {
        this.userName = newName;
    }

    public void setPassword(String user_password) {
        this.password = user_password;
    }
    
//    validate for empty input when login/register
    public static boolean isEmptyFor2Input(String firstInput, String secondInput){
        if("".equals(firstInput) || "".equals(secondInput)){
            String msgTitle = "ALERT";
            String msgContent = "Please make sure every input is filled with valid input.";
            PopupMessageBox popupConfirmationMessage = new PopupMessageBox(msgTitle, msgContent);
            popupConfirmationMessage.setVisible(true);
            return true;
        } 
        else {
            return false;
        }
    }
    
    public Object[] login(String loginType) {
//        deciding the file path
        String filepath;
        if (null == loginType) {
            Object[] message = {"ERROR", "Login type unfound."};
            return message;
        }
        else switch (loginType) {
            case "admin":
                filepath = "src/main/java/com/mycompany/brightvending/files/user_admin.txt";
                break;
            case "customer":
                filepath = "src/main/java/com/mycompany/brightvending/files/user_customer.txt";
                break;
            default:
                Object[] message = {"ERROR", "Login type unfound."};
                return message;
        }       
//        fetch the record and check if the record exist
        Object[] userRecord = CRUDFileHandling.FetchOneRecord(filepath, userName);
        for (Object data : userRecord) {
            if (data == "ERROR") {
                Object[] message = {"ERROR", "No record is found"};
                return message;
            }
        }
        if (password.equals((String) userRecord[1])) {
            Object[] message = {"SUCCESS", "User details matched, now you may use our system!"};
            return message;
        }
        else {
            Object[] message = {"FAILED", "User details doesn't matches, please try again."};
            return message;
            }        
    }
}
