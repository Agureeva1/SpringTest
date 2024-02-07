package progress_service.client_modul;

public class Client {
  private String name;
    private long tel;
    private String comment;
    private StatusClient status;

    public Client (String name,long tel) {
        this.name=name;
        this.tel=tel;
        this.comment=null;
        this.status= new StatusClient(StatusClientType.NEW);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", tel=" + tel +
                ", comment='" + comment + '\'' +
                '}';
    }
}
