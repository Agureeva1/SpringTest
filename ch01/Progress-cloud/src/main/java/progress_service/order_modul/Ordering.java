package progress_service.order_modul;

import progress_service.client_modul.Client;
import progress_service.finance_modul.PriceOrder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ordering {
    private static int num = 1;
    private final int id;
    private Client client;
    private LocalDateTime dateCreate;
    private LocalDateTime dateWork;
    private int periodWork;
    private StatusOrder statusOrder;
    private Employee whoCreate;
    private Employee whoWork;
    private String asset;
    private String defect;
    private PriceOrder price;
    private String comment;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM YYYY hh:mm");


    public Ordering(Client client, Employee whoCreate,
                    Employee whoWork, String asset, String defect, int prepayment) {
        this.periodWork = 5;
        this.id = num++;
        this.client = client;
        this.dateCreate = LocalDateTime.now();
        this.dateWork = this.dateCreate.plusDays(periodWork);
        this.statusOrder = new StatusOrder(StatusOrderType.NEW);
        this.whoCreate = whoCreate;
        this.whoWork = whoWork;
        this.asset = asset;
        this.defect = defect;
        this.price = new PriceOrder(prepayment);
        this.comment = null;
    }

    @Override
    public String toString() {
        return "Ordering{" +
                "id=" + id +
                ", client=" + client +
                ", dateCreate=" + dateCreate +
                ", dateWork=" + dateWork +
                ", periodWork=" + periodWork +
                ", statusOrder=" + statusOrder +
                ", whoCreate=" + whoCreate +
                ", whoWork=" + whoWork +
                ", asset='" + asset + '\'' +
                ", defect='" + defect + '\'' +
                ", price=" + price +
                ", comment='" + comment + '\'' +
                ", formatter=" + formatter +
                '}';
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Ordering o = new Ordering(new Client("Жанна", 345),
                new Employee("Jim"), new Employee("Jim"), "Сломан экран", "Описываю подробную поломку", 234);
        Ordering a = new Ordering(new Client("Жанна", 345),
                new Employee("Jim"), new Employee("Jim"), "Сломан экран", "Описываю подробную поломку", 3450);
        Ordering s = new Ordering(new Client("Жанна", 345),
                new Employee("Jim"), new Employee("Jim"), "Сломан экран", "Описываю подробную поломку", 456);

      //  System.out.println(o.formatter.format(o.dateCreate));
      //  System.out.println(o.dateWork);
      //  System.out.println(o);
      //  System.out.println(a);
      //  System.out.println(s);

       // System.out.println(o.price.getRemain());
        System.out.println(a.price);
        a.price.setPrice(34567.10);
        System.out.println(a.price);
    }

}
