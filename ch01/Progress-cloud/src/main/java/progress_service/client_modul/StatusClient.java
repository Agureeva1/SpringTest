package progress_service.client_modul;

public class StatusClient {
    private String statusClient;

    public StatusClient (StatusClientType type) {
        switch (type) {
            case NEW: this.statusClient="Новый";
            break;
            case REGULAR: this.statusClient="Постоянный";
                break;
            case STOP_LIST: this.statusClient="Черный список";
                break;
        }

    }

    public StatusClient (String statusClient) {
        this.statusClient=statusClient;
    }

    public String getStatusClient() {
        return statusClient;
    }

    public void setStatusClient(String statusClient) {
        this.statusClient = statusClient;
    }
}
