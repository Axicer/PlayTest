package models;

import io.ebean.Ebean;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product extends Model {

    @Id
    @GeneratedValue
    public int id;

    @Constraints.Required
    @Constraints.MaxLength(255)
    public String name;

    public String description;

    @Constraints.Required
    @Constraints.Min(0)
    public int price;

    public Product() {
    }

    public Product(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
