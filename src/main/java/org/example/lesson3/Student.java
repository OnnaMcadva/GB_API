package org.example.lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.lang.String;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String name;
    private Integer group;
    private Integer scholarship;
    private List<Integer> marks;

}
