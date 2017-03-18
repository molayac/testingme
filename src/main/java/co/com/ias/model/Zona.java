package co.com.ias.model;

/**
 * Created by SAM on 17/03/2017.
 */

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="TONT_ZONAS")
public class Zona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="CDZONA")
    private String id;
    @Column(name="DSNOMBRE")
    private String dsNombre;
    @OneToMany(mappedBy = "zone")
    private List<Pais> paises;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDsNombre() {
        return dsNombre;
    }

    public void setDsNombre(String dsNombre) {
        this.dsNombre = dsNombre;
    }
}

