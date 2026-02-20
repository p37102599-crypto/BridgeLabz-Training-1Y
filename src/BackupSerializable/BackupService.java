package BackupSerializable;
class BackupService {

    static void backup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("✅ Object backed up successfully");
            // Serialization logic here
        } else {
            System.out.println("❌ Backup not allowed for this object");
        }
    }
}
