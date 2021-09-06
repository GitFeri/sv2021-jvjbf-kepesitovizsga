package training360.guinessapp.service;


import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.repository.WorldRecordRepository;

@Service
@AllArgsConstructor
public class WorldRecordService {
    private WorldRecordRepository worldRecordRepository;
    private ModelMapper modelMapper;

}
