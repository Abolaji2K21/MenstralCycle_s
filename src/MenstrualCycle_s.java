import java.time.LocalDate;

public class MenstrualCycle_s {

    private static int currentYear = LocalDate.now().getYear();
    private String fullName;

    private String gender;
    private int lastPeriodDay ;
    private int lastPeriodMonth;
    private int averageCycle;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLastPeriodDay() {
        return lastPeriodDay;
    }

    public void setLastPeriodDay(int lastPeriodDay) {
        if (lastPeriodDay < 1 || lastPeriodDay > 31) {
            System.out.println("Invalid input. Day should be between 1 and 31 days.");
        } else {
            this.lastPeriodDay = lastPeriodDay;
        }
    }

    public int getLastPeriodMonth() {
        return lastPeriodMonth;
    }

    public void setLastPeriodMonth(int lastPeriodMonth) {

        if (lastPeriodMonth < 1 || lastPeriodMonth > 12) {
            System.out.println("Invalid input. Month should be between 1 and 12 days.");
        } else {

            this.lastPeriodMonth = lastPeriodMonth;
        }
    }

    public int getAverageCycle() {
        return averageCycle;
    }

    public void setAverageCycle(int averageCycle) {
        if (averageCycle < 20 || averageCycle > 41) {
            System.out.println("Invalid input. Average Cycle should be between 20 and 41 days.");
        }else {
            this.averageCycle = averageCycle;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 10 || age > 65) {
            System.out.println("Sorry, This App Is Not Suitable For Your Age.");
        } else {
            this.age = age;
        }
    }

    public LocalDate calculateAndDisplayCycleInfo() {
        LocalDate checkPeriodDate = LocalDate.of(currentYear, getLastPeriodMonth(), getLastPeriodDay());
        LocalDate nextPeriodDate = checkPeriodDate.plusDays(getAverageCycle());
        LocalDate ovulationDate = checkPeriodDate.plusDays(getAverageCycle() - 14);
        LocalDate safeDate = checkPeriodDate.plusDays(ovulationDate.getDayOfMonth() - 5);

        System.out.println("\nCycle Information:");
        System.out.println("Congratulations! You Are Not Pregnant");
        System.out.println("Last Period Date: " + checkPeriodDate);
        System.out.println("Ovulation Date: " + ovulationDate);
        System.out.println("Safe Date: " + safeDate);
        System.out.print("Next Period Date: ");
        return nextPeriodDate;

    }
}
