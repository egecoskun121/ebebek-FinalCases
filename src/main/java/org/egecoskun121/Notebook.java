package org.egecoskun121;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notebook extends Product{
    private static Long counter=0L;
    private Long id= 0L;

    public Notebook(double unitPrice,int discountRate,int stockUnit,String productName,Brand brand,int RAM,double screenSize,int storage) {
        super(unitPrice,discountRate,stockUnit,productName,brand,RAM,screenSize,storage);
      counter++;
      this.id=counter;
    }

    public Long getId() {
        return id;
    }
}
