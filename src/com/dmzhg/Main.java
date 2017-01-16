package com.dmzhg;

import com.dmzhg.xmlparser.XMLParser;

import java.net.InetAddress;
import java.net.Socket;

/**
 * @author dmzhg
 */
public class Main {

    public static void main(String[] args) {
        testConnection();
        XMLParser xmlParser = new XMLParser();
        xmlParser.parseXML();
    }

    private static void testConnection() {
        for (int i = 0; i != -1; i++) {
            try {
                String ipAddress = "89.223.47.132";
                InetAddress inet = InetAddress.getByName(ipAddress);
                if (inet.isReachable(5000)) {
                    System.out.println("You're online now!");
                    return;
                } else {
                    System.out.println("Regular check is done - no internet");
                }
            } catch (Exception e) {
                System.out.println("Host is not resolved");
            }
        }
    }
}
