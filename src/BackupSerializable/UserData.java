package BackupSerializable;
class UserData implements BackupSerializable {

    String username;
    int userId;

    UserData(String username, int userId) {
        this.username = username;
        this.userId = userId;
    }
}