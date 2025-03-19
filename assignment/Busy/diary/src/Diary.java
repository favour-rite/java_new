import java.util.ArrayList;

public class Diary {

    public String userName;
    public String password;
    private ArrayList<Entry> entries;
    private boolean isLocked;

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = false;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public boolean isLocked() {
        this.isLocked = true;
        return true;
    }

    public void isUnLocked() {
        this.isLocked = false;
    }
    public String getUsername() {
        return userName;
    }

    public void unlockDiary(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            isUnLocked();
        } else {
            throw new IllegalArgumentException("Incorrect credentials");
        }
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String content) {
        if (!isLocked) {
            Entry entry = findEntryById(id);
            if (entry != null) {
                entry.setBody(content);
            } else {
                throw new IllegalArgumentException("Entry with the given ID not found.");
            }
        } else {
            throw new IllegalStateException("Diary is locked. Cannot update entry.");
        }
    }


    public void deleteEntry(int id) {
        if (!isLocked) {
            Entry entry = findEntryById(id);
            if (entry != null) {
                entries.remove(entry);
            } else {
                throw new IllegalArgumentException("Entry with the given ID not found.");
            }
        } else {
            throw new IllegalStateException("Diary is locked. Cannot delete entry.");
        }
    }

    public void viewEntry(int id) {
        if (!isLocked) {
            Entry entry = findEntryById(id);
            if (entry != null) {
                System.out.println(entry.getBody());
            } else {
                throw new IllegalArgumentException("Entry with the given ID not found.");
            }
        } else {
            throw new IllegalStateException("Diary is locked. Cannot view entry.");
        }
    }

    public void unlock(String password) {
        if (this.password.equals(password)) {
            isLocked();
        } else {
            throw new IllegalArgumentException("Incorrect credentials");
        }

    }

    public void createEntry(int id,String title, String body) {
        if (!isLocked) {
            Entry newEntry = new Entry(id,title,body);
            entries.add(newEntry);
        } else {
            System.out.println("Diary is locked. Cannot create new entry.");
        }
    }

    public boolean checkPassword(String password) {
        if (password.equals(this.password)) {
            return true;
        }
        return false;
    }

}