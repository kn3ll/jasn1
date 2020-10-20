package com.beanit.jasn1.ber.types;

import java.util.List;

public interface BerSequenceSet extends BerType {

    List<String> getFields();
    BerType getField(String fieldName);
    Class<? extends BerType> getFieldClass(String fieldName);
    void setField(BerType value, String fieldName);

}
