import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenstrualCycleTest {
    @Test
    public void testIfTheAppWorks() {
        MenstrualCycle myMenstrualCycle = new MenstrualCycle();
        assertNotNull(myMenstrualCycle);
    }

    @Test
    public void testThatNextMenstrualDateIsCorrect() {
        MenstrualCycle myMenstrualCycle = new MenstrualCycle();

//        myMenstrualCycle.displayWelcomingCode();
//        myMenstrualCycle.displayFirstSetOfQuestions();
        System.out.println(myMenstrualCycle.calculateAndDisplayCycleInfo(myMenstrualCycle.getLastPeriodMonth(), myMenstrualCycle.getLastPeriodDay()));
    }

}