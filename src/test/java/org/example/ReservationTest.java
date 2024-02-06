package org.example;


import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */

public class ReservationTest
{
    @Mock
    Reservation reservation;

    @Test
    public void reservationTest(){
        Reservation jasmine = new Reservation(4, 20, true);
        jasmine.confirmReservation();

        assertTrue(jasmine.isConfirmed);

    }

    @Test
    public void reservationFalseTest(){
        Reservation jasmine = new Reservation(9, 10, false);
        jasmine.confirmReservation();

        assertFalse(jasmine.isConfirmed);

    }
}
