package codes.ducksource.mcn.database.Objects;

public class Player {
    String mcUUID;
    long joinDate;

    public Player(String mcUUID, long joinDate) {
        this.mcUUID = mcUUID;
        this.joinDate = joinDate;
    }

    public String getMcUUID() {
        return mcUUID;
    }

    public long getJoinDate() {
        return joinDate;
    }
}
