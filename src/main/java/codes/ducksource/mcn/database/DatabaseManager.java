package codes.ducksource.mcn.database;

import codes.ducksource.mcn.database.Objects.Player;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.UUID;

public class DatabaseManager {

    private ManagedChannel channel;
    private DatabaseServiceGrpc.DatabaseServiceBlockingStub stub;
    private DatabaseServiceGrpc.DatabaseServiceStub asyncStub;

    DatabaseService service;

    public DatabaseManager() {
        channel = ManagedChannelBuilder.forAddress("127.0.0.1", 10000).usePlaintext().build();
        stub = DatabaseServiceGrpc.newBlockingStub(channel);
        asyncStub = DatabaseServiceGrpc.newStub(channel);
        service = new DatabaseService();
    }

    public DatabaseManager(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        stub = DatabaseServiceGrpc.newBlockingStub(channel);
        asyncStub = DatabaseServiceGrpc.newStub(channel);
        service = new DatabaseService();
    }

    public void close() {
        channel.shutdown();
        stub = null;
    }

    public boolean createPlayer(UUID userUUID) {
        Database.CreatePlayerRequest request = service.createPlayerRequest(String.valueOf(userUUID));

        Database.CreatePlayerResponse response;

        try{
            response = stub.createPlayer(request);
        } catch (StatusRuntimeException e) {
            System.out.println("RPC failed: " + e.getStatus());
            return false;
        }

        return true;
    }

    public Player getPlayer(UUID userUUID) {
        Database.GetPlayerRequest request = service.getPlayerRequest(String.valueOf(userUUID));

        Database.GetPlayerResponse response;

        Player player;
        try{
            response = stub.getPlayer(request);
            player = new Player(response.getMcUuid(), response.getJoinDate());

        } catch (StatusRuntimeException e) {
            System.out.println("RPC failed: " + e.getStatus());
            return null;
        }

        return player;
    }

    public boolean deletePlayer(UUID userUUID) {
        Database.DeletePlayerRequest request = service.deletePlayerRequest(String.valueOf(userUUID));

        Database.DeletePlayerResponse response;

        try{
            stub.deletePlayer(request);
        } catch (StatusRuntimeException e) {
            System.out.println("RPC failed: " + e.getStatus());
            return false;
        }

        return true;
    }
}
