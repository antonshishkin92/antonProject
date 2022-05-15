package antonProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Cars")
public class Car {
    @Id
    @Column(name = "Car_id")
    private Integer id;

    @Column(name = "category")
    private String category;

    @Column(name = "brand")
    private String brand;

    @Column(name = "number_state")
    private String numberState;

    @Column(name = "name_owner")
    private String nameOwner;

    @Column(name = "surname_owner")
    private String surnameOwner;

    @Column(name = "region_code")
    private Integer region;

    public Car(Integer id, String category, String brand, String numberState, String nameOwner, String surnameOwner, Integer region) {
        this.id = id;
        this.category = category;
        this.brand = brand;
        this.numberState = numberState;
        this.nameOwner = nameOwner;
        this.surnameOwner = surnameOwner;
        this.region = region;
    }

    public Integer getCarId() {
        return id;
    }

    public Integer getRegion() {
        return region;
    }
}