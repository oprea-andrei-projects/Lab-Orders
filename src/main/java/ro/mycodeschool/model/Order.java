package ro.mycodeschool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    private int id;
    private int user_id;
    private LocalDate issue_date;
    private boolean order_status;

    public Order(int user_id, LocalDate issue_date, boolean order_status) {
        this.user_id = user_id;
        this.issue_date = issue_date;
        this.order_status = order_status;
    }
}
