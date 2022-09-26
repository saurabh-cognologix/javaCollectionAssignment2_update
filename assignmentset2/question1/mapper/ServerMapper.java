package corejava.collection.assignmentset2.question1.mapper;

import corejava.collection.assignmentset2.question1.model.Server;
/* NumberFormatException
when it is not possible to convert a string in any numeric type (float, int, etc), this exception is thrown.
*/
public class ServerMapper {
    public static Server map(String data){
        String[] arr = data.split(",");
       try{
           String serverName = arr[0].trim();
           String typesOfSoftware = arr[1].trim();
           String applicationName = arr[2].trim();
           Double version = Double.parseDouble(arr[3].trim());
           Server server = new Server(serverName,typesOfSoftware,applicationName,version);
           return server;

       }catch (NumberFormatException | IndexOutOfBoundsException ex){
           throw new RuntimeException(ex);
       }
//        String serverName = arr[0].trim();
//        String typesOfSoftware = arr[1].trim();
//        String applicationName = arr[2].trim();
//        Double version = Double.parseDouble(arr[3].trim());
//        Server server = new Server(serverName,typesOfSoftware,applicationName,version);
//        return server;
    }
}
