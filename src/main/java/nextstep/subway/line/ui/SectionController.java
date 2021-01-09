package nextstep.subway.line.ui;

import nextstep.subway.line.application.SectionService;
import nextstep.subway.line.dto.SectionRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lines")
public class SectionController {
    private final SectionService sectionService;

    public SectionController(final SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @PostMapping("/{lineId}/sections")
    public ResponseEntity createLine(@PathVariable Long lineId, @RequestBody SectionRequest sectionRequest) {
        //sectionService.addSection(lineId, sectionRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
