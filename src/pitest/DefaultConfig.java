/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitest;


import java.util.ArrayList;

/**
 *
 * @author christianmccabe
 */
public class DefaultConfig {
    
    
 
    private String jasPort;
    private String jasHost;
    private String jasProtocol;
    private String defaultEnvironment;
    private String defaultRole;
    private boolean displayEnvironment;
    private boolean displayRole;
    private boolean displayJasServer;
    private String defaultJasServer;
    private boolean ssoAllowed;
    private boolean allowSelfSignedSsl;
    private String sessionTimeout;
    private String timeToLive;
    private String aisVersion;
    private ArrayList capabilityList;
    private boolean requiredCapabilityMissing;
    private boolean keepJasSessionOpen;
    private String jasSessionCookieName;

    /**
     * @return the jasPort
     */
    public String getJasPort() {
        return jasPort;
    }

    /**
     * @param jasPort the jasPort to set
     */
    public void setJasPort(String jasPort) {
        this.jasPort = jasPort;
    }

    /**
     * @return the jasHost
     */
    public String getJasHost() {
        return jasHost;
    }

    /**
     * @param jasHost the jasHost to set
     */
    public void setJasHost(String jasHost) {
        this.jasHost = jasHost;
    }

    /**
     * @return the jasProtocol
     */
    public String getJasProtocol() {
        return jasProtocol;
    }

    /**
     * @param jasProtocol the jasProtocol to set
     */
    public void setJasProtocol(String jasProtocol) {
        this.jasProtocol = jasProtocol;
    }

    /**
     * @return the defaultEnvironment
     */
    public String getDefaultEnvironment() {
        return defaultEnvironment;
    }

    /**
     * @param defaultEnvironment the defaultEnvironment to set
     */
    public void setDefaultEnvironment(String defaultEnvironment) {
        this.defaultEnvironment = defaultEnvironment;
    }

    /**
     * @return the defaultRole
     */
    public String getDefaultRole() {
        return defaultRole;
    }

    /**
     * @param defaultRole the defaultRole to set
     */
    public void setDefaultRole(String defaultRole) {
        this.defaultRole = defaultRole;
    }

    /**
     * @return the displayEnvironment
     */
    public boolean isDisplayEnvironment() {
        return displayEnvironment;
    }

    /**
     * @param displayEnvironment the displayEnvironment to set
     */
    public void setDisplayEnvironment(boolean displayEnvironment) {
        this.displayEnvironment = displayEnvironment;
    }

    /**
     * @return the displayRole
     */
    public boolean isDisplayRole() {
        return displayRole;
    }

    /**
     * @param displayRole the displayRole to set
     */
    public void setDisplayRole(boolean displayRole) {
        this.displayRole = displayRole;
    }

    /**
     * @return the displayJasServer
     */
    public boolean isDisplayJasServer() {
        return displayJasServer;
    }

    /**
     * @param displayJasServer the displayJasServer to set
     */
    public void setDisplayJasServer(boolean displayJasServer) {
        this.displayJasServer = displayJasServer;
    }

    /**
     * @return the defaultJasServer
     */
    public String getDefaultJasServer() {
        return defaultJasServer;
    }

    /**
     * @param defaultJasServer the defaultJasServer to set
     */
    public void setDefaultJasServer(String defaultJasServer) {
        this.defaultJasServer = defaultJasServer;
    }

    /**
     * @return the ssoAllowed
     */
    public boolean isSsoAllowed() {
        return ssoAllowed;
    }

    /**
     * @param ssoAllowed the ssoAllowed to set
     */
    public void setSsoAllowed(boolean ssoAllowed) {
        this.ssoAllowed = ssoAllowed;
    }

    /**
     * @return the allowSeldSignedSsl
     */
    public boolean isAllowSelfSignedSsl() {
        return allowSelfSignedSsl;
    }

    /**
     * @param allowSeldSignedSsl the allowSeldSignedSsl to set
     */
    public void setAllowSelfSignedSsl(boolean allowSeldSignedSsl) {
        this.allowSelfSignedSsl = allowSeldSignedSsl;
    }

    /**
     * @return the sessionTimeout
     */
    public String getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * @param sessionTimeout the sessionTimeout to set
     */
    public void setSessionTimeout(String sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    /**
     * @return the timeToLive
     */
    public String getTimeToLive() {
        return timeToLive;
    }

    /**
     * @param timeToLive the timeToLive to set
     */
    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * @return the aisVersion
     */
    public String getAisVersion() {
        return aisVersion;
    }

    /**
     * @param aisVersion the aisVersion to set
     */
    public void setAisVersion(String aisVersion) {
        this.aisVersion = aisVersion;
    }

    /**
     * @return the capabilityList
     */
    public ArrayList getCapabilityList() {
        return capabilityList;
    }

    /**
     * @param capabilityList the capabilityList to set
     */
    public void setCapabilityList(ArrayList capabilityList) {
        this.capabilityList = capabilityList;
    }

    /**
     * @return the requiredCapabilityMissing
     */
    public boolean isRequiredCapabilityMissing() {
        return requiredCapabilityMissing;
    }

    /**
     * @param requiredCapabilityMissing the requiredCapabilityMissing to set
     */
    public void setRequiredCapabilityMissing(boolean requiredCapabilityMissing) {
        this.requiredCapabilityMissing = requiredCapabilityMissing;
    }

    /**
     * @return the keepJasSessionOpen
     */
    public boolean isKeepJasSessionOpen() {
        return keepJasSessionOpen;
    }

    /**
     * @param keepJasSessionOpen the keepJasSessionOpen to set
     */
    public void setKeepJasSessionOpen(boolean keepJasSessionOpen) {
        this.keepJasSessionOpen = keepJasSessionOpen;
    }

    /**
     * @return the jasSessionCookieName
     */
    public String getJasSessionCookieName() {
        return jasSessionCookieName;
    }

    /**
     * @param jasSessionCookieName the jasSessionCookieName to set
     */
    public void setJasSessionCookieName(String jasSessionCookieName) {
        this.jasSessionCookieName = jasSessionCookieName;
    }
    
    

}
