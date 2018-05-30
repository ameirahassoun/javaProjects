package com.company;

public class DataReader implements InternetConnection {
    public boolean checkConnection(){
        return true;
    };
    public boolean getConnected(){
        return true;
    };
    public boolean getDisconnected(){
        return true;
    };
    public String parseXML(String url){
        return "Hello prarsexml";
    };
    public String parseJSON(String url){
        return "parsejoson";
    };
    public String downloadPageContent(String url){
        return "parsejoson";
    };
    public void start(){
        System.out.println("Hello from start");
    };
    public void stop(){
        System.out.println("Hello from stop");
    };
}
