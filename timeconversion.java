import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeconversion {
    public static void main(String[] args) {
        // Example input time in 12-hour AM/PM format
        String time12HourFormat = "07:45:30 PM";

        // Conversion of 12-hour format to 24-hour format
        String time24HourFormat = convertTo24HourFormat(time12HourFormat);

        // Getting the outpu
        System.out.println("12-hour format: " + time12HourFormat);
        System.out.println("24-hour format: " + time24HourFormat);
    }

    private static String convertTo24HourFormat(String time12Hour) {
        try {
            // Parse the input time using SimpleDateFormat
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            Date date = inputFormat.parse(time12Hour);

            // Format the parsed date to 24-hour format using another SimpleDateFormat
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            // Handle parsing exception if necessary
            e.printStackTrace();
            return null;
        }
    }
}