package com.beanit.jasn1.ber.types;

import java.util.List;

public interface BerChoice extends BerType {

    List<String> getFields();
    BerType getField(String fieldName);
    Class<? extends BerType> getFieldClass(String fieldName);
    void setField(String fieldName, BerType value);

}
