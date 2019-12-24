package com.comapny.collectionpractical;

import java.util.Comparator;

public class NameSort implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
       Account acc1=(Account)o;
       Account acc2=(Account)t1;
        return acc1.Account_holder_name.compareTo(acc2.Account_holder_name);
    }
}
