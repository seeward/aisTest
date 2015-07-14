/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author christianmccabe
 */
public class PiTest {

        private static long startTime;
        private static long endTime;
        private static long elapsedTime;

    public static void main(String[] args) {

        String holder = "";
    
        String requestURL = "http://demo.steltix.com/jderest/defaultconfig";
        try {
            startTime = System.currentTimeMillis();

            HttpUtility.sendGetRequest(requestURL);
            String[] response = HttpUtility.readMultipleLinesRespone();
            
            endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
            for (String line : response) {
                //System.out.println(line);
                holder += line;
            }
            
          

            JsonParser parser = new JsonParser();
            JsonObject o = (JsonObject) parser.parse(holder);
           
            
            
            System.out.println("AIS Default Configration Details");
            System.out.println("=====================================");
            System.out.println("Jas Port : " + o.get("jasPort"));
            System.out.println("Jas Host : " + o.get("jasHost"));
            System.out.println("Display Environment : " + o.get("displayEnvironment"));
            System.out.println("Jas Protocol : " + o.get("jasProtocol"));
            System.out.println("Jas Session Cookie Name: " + o.get("jasSessionCookieName"));
            System.out.println("Keep Jas Sesion Open : " + o.get("keepJasSessionOpen"));
            System.out.println("Default Jas Server : " + o.get("defaultJasServer"));
            System.out.println("AIS Version : " + o.get("aisVersion"));
            System.out.println("Default Environment : " + o.get("defaultEnvironment"));
            System.out.println("Session Timeout : " + o.get("sessionTimeout"));
            System.out.println("=====================================\n\n");
            System.out.println("Round Trip Time : " + elapsedTime  + " milliseconds");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        HttpUtility.disconnect();

        System.out.println("=====================================");

    }

}
