package org.example.lesson3;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.lang.String;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cube {
    private Integer edge;
    private String color;
    private String material;


    public int getVolume() {
        return edge * edge * edge;
    }
}
