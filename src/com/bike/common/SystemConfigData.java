/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bike.common;

/**
 *
 * @author CHAMA COMPUTERS
 */
public class SystemConfigData {

    private static String activeUser;
    private static String user_type;
    private static String employee;
    private static String loginID;
    private static String sytemEmployee;
    private static String AllinvID;
    private static String AllGrnID;
     private static String AllPOID;

    public static String getActiveUser() {
        return activeUser;
    }

    public static void setActiveUser(String aActiveUser) {
        activeUser = aActiveUser;
    }

    public static String getUsertype() {
        return user_type;
    }

    public static void setUsertype(String aUsertype) {
        user_type = aUsertype;
    }

    public static String getEmployee() {
        return employee;
    }

    public static void setEmployee(String aEmployee) {
        employee = aEmployee;
    }

    public static String getUser_type() {
        return user_type;
    }

    public static void setUser_type(String aUser_type) {
        user_type = aUser_type;
    }

    public static String getLoginID() {
        return loginID;
    }

    public static void setLoginID(String aLoginID) {
        loginID = aLoginID;
    }

    public static String getSytemEmployee() {
        return sytemEmployee;
    }

    public static void setSytemEmployee(String aSytemEmployee) {
        sytemEmployee = aSytemEmployee;
    }

    public static String getAllinvID() {
        return AllinvID;
    }

    public static void setAllinvID(String aAllinvID) {
        AllinvID = aAllinvID;
    }

    public static String getAllGrnID() {
        return AllGrnID;
    }

    public static void setAllGrnID(String aAllGrnID) {
        AllGrnID = aAllGrnID;
    }

    public static String getAllPOID() {
        return AllPOID;
    }

    public static void setAllPOID(String aAllPOID) {
        AllPOID = aAllPOID;
    }

}
