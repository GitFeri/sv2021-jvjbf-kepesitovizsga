package training360.guinessapp.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.RecorderShortDto;
import training360.guinessapp.entity.Recorder;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.repository.RecorderRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class RecorderService {
    private RecorderRepository recorderRepository;
    private ModelMapper modelMapper;


    @Transactional
    public RecorderDto createRecorder(RecorderCreateCommand command) {
        Recorder recorder = new Recorder(command.getName(), command.getDateOfBirth());
        recorderRepository.save(recorder);
        return modelMapper.map(recorder, RecorderDto.class);
    }

    public List<RecorderShortDto> listRecorders() {
        List<Recorder> recorders = recorderRepository.findAll();
        java.lang.reflect.Type targetListType = new TypeToken<List<RecorderShortDto>>() {
        }.getType();
        return modelMapper.map(recorders, targetListType);
    }
}

