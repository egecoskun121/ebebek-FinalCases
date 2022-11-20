package org.egecoskun121;

public class BrandComparator implements java.util.Comparator<Brand> {
    @Override
    public int compare(Brand o1, Brand o2) {

        {
            return  o1.getName().compareTo(
                    o2.getName());
        }
    }
}
