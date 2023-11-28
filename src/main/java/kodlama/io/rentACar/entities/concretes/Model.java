package kodlama.io.rentACar.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="Models")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Model {
    @Column(name="name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name= "brand_id")
    private Brand brand;

/*    @OneToMany(mappedBy = "model")
    private List<Car> cars;*/
}
