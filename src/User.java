public class User {
    private String pseudo;
    private int userId;
    private boolean available;

    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public User(String pseudo, int userId, boolean available) {
        this.pseudo = pseudo;
        this.userId = userId;
        this.available = available;
    }
}