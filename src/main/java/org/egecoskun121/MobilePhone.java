package org.egecoskun121;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class MobilePhone extends Product {

    private static Long counter=0L;
    private Long id= 0L;
    private String color;
    private int batteryPower;

    public MobilePhone(double unitPrice,int discountRate,int stockUnit,String productName,Brand brand,int RAM,double screenSize,int storage,String color, int batteryPower) {
        super(unitPrice,discountRate,stockUnit,productName,brand,RAM,screenSize,storage);
        counter++;
        this.id=counter;
        this.color = color;
        this.batteryPower = batteryPower;
    }

    public Long getId() {
        return id;
    }
}
