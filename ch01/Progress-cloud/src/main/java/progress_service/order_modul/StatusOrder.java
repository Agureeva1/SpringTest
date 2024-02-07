package progress_service.order_modul;

public class StatusOrder {
    private String status;

    public StatusOrder(StatusOrderType type) {
        switch (type) {
            case NEW: this.status = "Новый";
            break;
            case IN_WORK: this.status = "В работе";
                break;
            case DID: this.status = "Готов";
                break;
            case NO: this.status = "Отказ";
                break;
        }
    }
    public StatusOrder(String status) {
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                '}';
    }
}
