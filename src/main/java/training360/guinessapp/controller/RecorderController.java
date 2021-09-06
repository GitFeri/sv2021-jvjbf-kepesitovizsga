package training360.guinessapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.RecorderShortDto;
import training360.guinessapp.service.RecorderService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/recorders")
@AllArgsConstructor
public class RecorderController {

    private RecorderService recorderService;

    @PostMapping()
    public RecorderDto createRecorder(@Valid @RequestBody RecorderCreateCommand command) {
        return recorderService.createRecorder(command);
    }

    @GetMapping
    public List<RecorderShortDto> listRecorders() {
        return recorderService.listRecorders();
    }
}
