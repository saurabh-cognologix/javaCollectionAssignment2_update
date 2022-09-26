package corejava.collection.assignmentset2.question1.mapper;

import corejava.collection.assignmentset2.question1.model.Server;

public class ServerMapper {
    public static Server map(String data){
        String[] arr = data.split(",");
        String serverName = arr[0].trim();
        String typesOfSoftware = arr[1].trim();
        String applicationName = arr[2].trim();
        Double version = Double.parseDouble(arr[3].trim());
        Server server = new Server(serverName,typesOfSoftware,applicationName,version);
        return server;
    }
}
