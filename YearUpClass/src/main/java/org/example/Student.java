package org.example;

public class Student extends Person{

    private int id;
    private String github;
    private String linkedin;
    private String codingNickname;
    private String codeWarsXPoints;
    private String imageURL;
    private String deviceType;
    private int pageNumber;
    private String currentlyWorkingOn;

    public Student(String _firstName, String _lastName, String _email, String _gender, int id, String github, String linkedin, String codingNickname, String codeWarsXPoints, String imageURL, String deviceType, int pageNumber, String currentlyWorkingOn) {
        super(_firstName, _lastName, _email, _gender);
        this.id = id;
        this.github = github;
        this.linkedin = linkedin;
        this.codingNickname = codingNickname;
        this.codeWarsXPoints = codeWarsXPoints;
        this.imageURL = imageURL;
        this.deviceType = deviceType;
        this.pageNumber = pageNumber;
        this.currentlyWorkingOn = currentlyWorkingOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getCodingNickname() {
        return codingNickname;
    }

    public void setCodingNickname(String codingNickname) {
        this.codingNickname = codingNickname;
    }

    public String getCodeWarsXPoints() {
        return codeWarsXPoints;
    }

    public void setCodeWarsXPoints(String codeWarsXPoints) {
        this.codeWarsXPoints = codeWarsXPoints;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getCurrentlyWorkingOn() {
        return currentlyWorkingOn;
    }

    public void setCurrentlyWorkingOn(String currentlyWorkingOn) {
        this.currentlyWorkingOn = currentlyWorkingOn;
    }
}
