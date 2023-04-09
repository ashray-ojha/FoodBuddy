package foodBuddy.foodBuddy.inventory;

import foodBuddy.foodBuddy.groupManagement.ViewGroupUsers;
import lombok.*;

import java.util.List;

@EqualsAndHashCode
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteItemResponse {
    private String status;
    private String message;
    //private int itemId;
}