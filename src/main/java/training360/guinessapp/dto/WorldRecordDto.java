package training360.guinessapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class WorldRecordDto {
    private Long id;
    private String description;
    private Double value_d;
    private String unitOfMeasure;
    private LocalDate dateOfRecord;
    private String recorderName;

}
