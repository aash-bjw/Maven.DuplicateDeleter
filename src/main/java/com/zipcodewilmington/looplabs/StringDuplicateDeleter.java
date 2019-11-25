package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public Long getOccurence(String s){

        return Arrays.stream(array).filter(z -> z.equals(s)).count();
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {


        return Arrays.stream(array).filter(z -> getOccurence(z) < maxNumberOfDuplications).toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Arrays.stream(array).filter(z -> getOccurence(z) != exactNumberOfDuplications).toArray(String[]::new);
    }
}
