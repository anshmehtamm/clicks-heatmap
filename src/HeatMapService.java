import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HeatMapService {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @Autowired
  private HeatMapEventRepository heatMapEventRepository;

  public void sendEvent(String event) {
    kafkaTemplate.send("heatmap-events", event);

    // Save event to the database
    HeatMapEvent heatMapEvent = new HeatMapEvent();
    heatMapEvent.setEventName(event);
    heatMapEventRepository.save(heatMapEvent);
  }
}