package lesson2;

public class ConditionChecker {
    public static void main(String[] args) {
        if (true) {
            System.out.println("This line always be executed");
        }

        if (5 == 3) {
            System.out.println("This line won't be shown");
        }

        String text = "IT-Academy";
        if (text.contains("-")) {
            System.out.println("Text contains - : " + text);
        }

        int number = 5;
        if (number >= 10) {
            System.out.println("Number is >= 10");
        } else {
            System.out.println("Number is < 10");
        }

        double temperature = 20.5;
        if (temperature > 90) {
            System.out.println("Shut down PC!");
        } else if (temperature > 60) {
            System.out.println("Run cooler FAN on high speed");
        } else if (temperature > 35) {
            System.out.println("Run cooler FAN on low speed");
        } else {
            System.out.println("Switch off FAN");
        }

        System.out.println("==========================================");

        double airTemperature = 25.1;
        String weatherCondition = airTemperature > 19 ? "warm weather" : "cold weather";
        System.out.println(weatherCondition + " today");

        String weatherCondition2 = "";
        if (airTemperature > 19) {
            weatherCondition2 = "warm weather";
        } else {
            weatherCondition2 = "cold weather";
        }
        System.out.println(weatherCondition2 + " today");

        System.out.println("==================================");

        boolean isChairWhite = false;
        boolean isChairContainsBackSupport = true;
        if (isChairWhite || isChairContainsBackSupport) {
            System.out.println("We want to buy this chair!");
        } else {
            System.out.println("We don't want this chair!");
        }

        boolean isBiedronkaClosed = false;
        if (!isBiedronkaClosed) {
            System.out.println("We want to buy a toilet paper!");
        }

        System.out.println("==============================");

        String dayOfWeek = "Friday";
        switch (dayOfWeek) {
            case "Monday":
                System.out.println("Go to work!");
                break;
            case "Tuesday":
                System.out.println("Go to work!");
                break;
            case "Friday":
                System.out.println("Go to work!");
                break;
            case "Saturday":
                System.out.println("Finally stay at home");
                break;
            case "Sunday":
                System.out.println("Finally stay at home");
                break;
            default:
                System.out.println("Corona virus pandemic - everybody stays at home!");
        }

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Application end");

    }
}
