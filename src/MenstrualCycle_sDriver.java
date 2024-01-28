public class MenstrualCycle_sDriver {
    public static void main(String[] args) {
        MenstrualCycle_s myMenstrualCycle_s = new MenstrualCycle_s();

                myMenstrualCycle_s.setFullName("IKA");
                myMenstrualCycle_s.setGender("Female");
                myMenstrualCycle_s.setAge(26);
                myMenstrualCycle_s.setLastPeriodDay(15);
                myMenstrualCycle_s.setLastPeriodMonth(01);
                myMenstrualCycle_s.setAverageCycle(25);

        System.out.println("Hello:  " + myMenstrualCycle_s.getFullName() + "  Your Gender Type is " + myMenstrualCycle_s.getGender() + "  And Your Current Age is " + myMenstrualCycle_s.getAge());
        System.out.println("Below Is Your Next Period Date: ");
        System.out.println(myMenstrualCycle_s.calculateAndDisplayCycleInfo());

    }
}
