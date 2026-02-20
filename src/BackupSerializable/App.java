package BackupSerializable;
public class App {

    public static void main(String[] args) {

        UserData user = new UserData("Pragyan", 101);
        //TempCache cache = new TempCache("Session123");

        BackupService.backup(user);
       // BackupService.backup(cache);
    }
}