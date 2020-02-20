public class LeapYear {

    public boolean isLeapYear(int year){

        return isNotMultipleOf400(year) || isnotMultiple100_and_isMultiple4(year);

    }

    private boolean isNotMultipleOf400(int year) {
        return isMultipleOf(year, 400);
    }

    private boolean isnotMultiple100_and_isMultiple4(int year){

        return ((year % 100) != 0) && (year % 4) == 0;
    }

    private boolean isMultipleOf(int year, int divisibleNumber) {

        return (year % divisibleNumber) == 0;
    }




}
