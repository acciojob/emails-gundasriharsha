package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    private boolean isValid(String password){
        if(password.contains(" ")){
            return false;
        }
        if(true){
            int count = 0;
            //checking numbers
            for(int i=0;i<=9;i++){
                String str1 = Integer.toString(i);

                if(password.contains(str1)){
                    count = 1;
                }
            }
            if(count==0){
                return false;
            }
        }
        if(true){
            int count = 0;
            //checking capital letters
            for(int i=65;i<=90;i++){
                String str1 = Integer.toString(i);

                if(password.contains(str1)){
                    count = 1;
                }
            }
            if(count==0){
                return false;
            }
        }
        if(true){
            int count = 0;
            //checking small letters
            for(int i=97;i<=122;i++){
                String str1 = Integer.toString(i);

                if(password.contains(str1)){
                    count = 1;
                }
            }
            if(count==0){
                return false;
            }
        }
        //checking special character
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return false;
        }
        //if all fails
        return true;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        int count = 0;
        if(oldPassword.length()>=newPassword.length()){
            count = 1;
        }
        if(count==1){
            boolean change = isValid(newPassword);
        }
    }
}