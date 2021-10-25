package com.company.ClassDay5;

class UserAlreadyLoggedInException extends Exception{}



class Authentication{
    private boolean is_logged_in = false;

    public void login(String email, String password) throws UserAlreadyLoggedInException{
        if(!is_logged_in){
            if(email.equals("admin") && password.equals("123")){
                System.out.println("Login successful!");
                is_logged_in = true;
            }
            else{
                System.out.println("Login failed! Please try again.");
            }
        }
        else{
            throw new UserAlreadyLoggedInException();
        }
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        try{
            auth.login("admin","1223");
        }
        catch(UserAlreadyLoggedInException e){
            System.out.println("HEY! You ARE logged in!");
        }
        try{
            auth.login("admin","123");
        }
        catch(UserAlreadyLoggedInException e){
            System.out.println("HEY! You ARE logged in!");
        }
        try{
            auth.login("admin","123");
        }
        catch(UserAlreadyLoggedInException e){
            System.out.println("HEY! You ARE logged in!");
        }
    }
}
