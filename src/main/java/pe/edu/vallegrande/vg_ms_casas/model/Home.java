package pe.edu.vallegrande.vg_ms_casas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("home")
public class Home {

    @Id
    @Column("id_home")
    private Integer idHome; // Nombre en camelCase
    private String names;
    private String address;
    private String status; // "A" = Activo, "I" = Inactivo
}
