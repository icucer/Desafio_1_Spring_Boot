package cl.praxis.mi_primer_spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad;
    }
}
