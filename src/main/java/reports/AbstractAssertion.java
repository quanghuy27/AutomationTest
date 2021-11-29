package reports;

public abstract class AbstractAssertion {
    private static final String FAILED_MESSAGE_FORMAT = "<br>&emsp;&emsp;&emsp;&emsp;-Expected Result: %s</br><br>&emsp;&emsp;&emsp;&emsp;-Actual Result: %s</br><br>";

    public static String formatFailedMessage(String expected, String actual) {
        return String.format(FAILED_MESSAGE_FORMAT, expected, actual);
    }
}
