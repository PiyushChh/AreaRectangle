package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest{
    
    @Test
    void shouldReturnOneWhenLengthIsOneAndBreadthIsOne(){
        Rectangle rectangle=new Rectangle(1,1);

        int expected=1;

        int actual=rectangle.area();

        assertThat(actual, is(equalTo(expected)));


    }
}