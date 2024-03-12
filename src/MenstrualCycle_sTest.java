import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class TestForMenstrualCycle {

    @Test
    void testIfTheAppWorks() {
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertNotNull(myMenstrualCycle_s);
    }

    @Test
    void testThatGetFullNameIsValid(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        myMenstrualCycle_s.setFullName("Moh Baba");
        assertEquals("Moh Baba", myMenstrualCycle_s.getFullName());

    }

    @Test
    void testThatGetGenderIsValid(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();

        myMenstrualCycle_s.setGender("female");
        assertEquals("female", myMenstrualCycle_s.getGender());

    }

    @Test
    void testThatGetAgeIsValid(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();

        myMenstrualCycle_s.setAge(23);
        assertEquals(23, myMenstrualCycle_s.getAge());


    }
    @Test
    void testThatSetAverageCycleIsValid(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();

        myMenstrualCycle_s.setAverageCycle(30);
        assertEquals( 30,myMenstrualCycle_s.getAverageCycle());
    }

    @Test
    void calculateAndDisplayCycleInfo() {
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();

        myMenstrualCycle_s.setAverageCycle(35);
        myMenstrualCycle_s.setLastPeriodDay(1);
        myMenstrualCycle_s.setLastPeriodMonth(3);
        assertEquals(LocalDate.of(2024, 04, 05), myMenstrualCycle_s.calculateAndDisplayCycleInfo());
    }

    @Test
    void InvalidAgeLimitBelowAgeLimit(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setAge(9));
    }

    @Test
    void InvalidAgeAboveAgeLimit(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setAge(69));
    }

    @Test
    void InvalidAverageCycleBelowLimit(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setAverageCycle(15));
    }

    @Test
    void InvalidAverageCycleAboveLimit(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setAverageCycle(49));
    }

    @Test
    void InvalidLastPeriodMonth(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setLastPeriodMonth(30));
    }

    @Test
    void NegativePeriodMonth(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setLastPeriodMonth(-2));

    }

    @Test
    void negativePeriodDay(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setLastPeriodDay(-2));
    }

    @Test
    void maximumPeriodDay(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setLastPeriodDay(35));
    }

    @Test
    void testGender(){
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();
        assertThrows(InputMismatchException.class,() -> myMenstrualCycle_s.setGender("male"));

    }


}