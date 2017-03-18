package co.com.ias.model;

/**
 * Created by SAM on 17/03/2017.
 */

import javax.persistence.*;


@Entity
@Table(name="TONT_PAISES")
public class Pais {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="CDPAIS")
    private String id;
    @Column(name="DSNOMBRE")
    private String dsNombre;

    @Column(name="CDZONA")
    @ManyToOne(fetch=FetchType.LAZY)
    private Zona zone;

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

    public Zona getZone() {
        return zone;
    }

    public void setZone(Zona zone) {
        this.zone = zone;
    }
}

