package com.beanit.jasn1.ber.types;

import java.util.List;

public interface BerSequenceOf extends BerType {

    List<? extends BerType> getSeqOf();
    Class<? extends BerType> getSeqOfElementClass();

}
