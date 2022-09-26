package corejava.collection.assignmentset2.question1.model;

public class Server {
    private String serverName;
    private String typesOfSoftware;
    private String applicationName;
    private Double version;

    public Server(String serverName, String typesOfSoftware, String applicationName, Double version) {
        this.serverName = serverName;
        this.typesOfSoftware = typesOfSoftware;
        this.applicationName = applicationName;
        this.version = version;
    }

    public Server() {
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getTypesOfSoftware() {
        return typesOfSoftware;
    }

    public void setTypesOfSoftware(String typesOfSoftware) {
        this.typesOfSoftware = typesOfSoftware;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        String placeHolder = "Server name :{0}, Types Of Software : {1}, Application Name: {2}, Version :{3}";
        return java.text.MessageFormat.format(placeHolder,serverName,typesOfSoftware,applicationName,version);
    }
}

