package progress_service.finance_modul;

import java.text.DecimalFormat;

public class PriceOrder {
    //предоплата
    private double prepayment;
    //должен заплатить клиент, переменная должна соответствовать фактической сумме прихода
    private double price;
    //должен заплатить клиент - остаток
    private double remain;
    DecimalFormat dec = new DecimalFormat( "###,###.##" );

    public PriceOrder(double prepayment) {
        this.prepayment=prepayment;
    }
    public PriceOrder(int prepayment, int price) {
        this.prepayment=prepayment;
        this.price=price;
        this.remain = price-prepayment;
    }

    public double getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(double prepayment) {
        this.prepayment = prepayment;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.remain = this.price-this.prepayment;
    }

    public double getRemain() {
        return remain;
    }

    @Override
    public String toString() {
        return "PriceOrder{" +
                "prepayment=" + dec.format(prepayment) +
                ", price=" + dec.format(price) +
                ", remain=" + dec.format(remain) +
                '}';
    }
}
