package com.example.kanthivel.roomdemo.database.typeConverters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DateTypeConverterTest {

    @Test
    public void shouldConvertDateToLongAndViceVerse() {
        long millis = System.currentTimeMillis();

        Date date = DateTypeConverter.toDate(millis);
        assertEquals(millis, date.getTime());

        long longMillis = DateTypeConverter.toLong(date);
        assertEquals(date.getTime(), longMillis);
    }
}