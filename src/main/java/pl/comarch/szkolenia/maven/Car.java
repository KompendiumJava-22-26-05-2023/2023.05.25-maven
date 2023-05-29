package pl.comarch.szkolenia.maven;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {
    private String brand;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String model;
    private String plate;
    private double price;
    private boolean rent;
}
