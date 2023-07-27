package codes.ducksource.mcn.database;

public class DatabaseService extends DatabaseServiceGrpc.DatabaseServiceImplBase {

    public Database.CreatePlayerRequest createPlayerRequest(String userUUID) {
        return Database.CreatePlayerRequest.newBuilder().setMcUuid(userUUID).build();
    }

    public Database.GetPlayerRequest getPlayerRequest(String userUUID) {
        return Database.GetPlayerRequest.newBuilder().setMcUuid(userUUID).build();
    }

    public Database.DeletePlayerRequest deletePlayerRequest(String userUUID) {
        return Database.DeletePlayerRequest.newBuilder().setMcUuid(userUUID).build();
    }
}