package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorldRecordCreateCommand {

    private String description;
    private Double value;
    private String unitOfMeasure;
    private LocalDate dateOfRecord;
    private Long recorderId;

}
