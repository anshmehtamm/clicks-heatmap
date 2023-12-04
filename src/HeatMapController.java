import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/heatmap")
public class HeatMapController {

  @Autowired
  private HeatMapService heatMapService;

  @PostMapping("/event")
  public ResponseEntity<String> sendEvent(@RequestBody String event) {
    heatMapService.sendEvent(event);
    return ResponseEntity.ok("Event sent successfully");
  }
}