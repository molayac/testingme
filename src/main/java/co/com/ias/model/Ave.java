package co.com.ias.model;

/**
 * Created by SAM on 17/03/2017.
 */
import javax.persistence.*;


@Entity
@Table(name="TONT_AVES")
public class Ave {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="CDAVE")
    private String id;
    @Column(name="DSNOMBRE_COMUN")
    private String dsNombreComun;
    @Column(name="DSNOMBRE_CIENTIFICO")
    private String dsNombreCientifico;
    @ManyToMany()
    @JoinTable(name = "TONT_PAIS",
            joinColumns = {@JoinColumn(name = "CDPAIS", referencedColumnName = "CDPAIS")},
            inverseJoinColumns = {@JoinColumn(name = "CDAVE", referencedColumnName = "CDAVE")})
    private Pais pais;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDsNombreComun() {
        return dsNombreComun;
    }

    public void setDsNombreComun(String dsNombreComun) {
        this.dsNombreComun = dsNombreComun;
    }

    public String getDsNombreCientifico() {
        return dsNombreCientifico;
    }

    public void setDsNombreCientifico(String dsNombreCientifico) {
        this.dsNombreCientifico = dsNombreCientifico;
    }
}
