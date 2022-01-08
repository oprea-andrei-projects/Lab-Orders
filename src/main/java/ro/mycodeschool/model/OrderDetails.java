package ro.mycodeschool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrderDetails {

    private int id;
    private int order_id;
    private int m1;
    private int m2;
    private int m3;

    public OrderDetails(int order_id, int m1, int m2, int m3) {
        this.order_id = order_id;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}
