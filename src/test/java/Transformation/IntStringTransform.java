package Transformation;

import cucumber.api.Transformer;

public class IntStringTransform extends Transformer<Integer> {

    @Override
    public Integer transform(String value) {
        return Integer.parseInt(value);
    }
}
