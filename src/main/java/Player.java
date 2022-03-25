import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;

@Entity(name = "Player")
public class Player {
    @Id
    private Integer Id;

    private Integer Number;
    private Integer Name;

    private Integer Weight;
    private Integer Height;
    private Integer Experience;
    private Integer Country;
}
