@Entity
@Table(name = "heatmap_events")
public class HeatMapEvent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String eventName;

  // other fields as needed

  // getters and setters
}
