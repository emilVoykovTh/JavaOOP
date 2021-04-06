package interfacesandAbstraction.exercises.Telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.setNumbers(numbers);
        this.setUrls(urls);
    }

    private void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    private void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String browse() {
        Pattern patternForPhoneNumber = Pattern.compile("^[\\D]*$");
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : this.urls) {
            Matcher matcher = patternForPhoneNumber.matcher(url);
            if (matcher.find()) {
                stringBuilder.append("Browsing: " + url + "!").append(System.lineSeparator());
            } else {
                stringBuilder.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String call() {
        Pattern patternForPhoneNumber = Pattern.compile("^[0-9]*$");
        StringBuilder stringBuilder = new StringBuilder();
        for (String phoneNumber : this.numbers) {
            Matcher matcher = patternForPhoneNumber.matcher(phoneNumber);
            if (matcher.find()) {
                stringBuilder.append("Calling... " + phoneNumber).append(System.lineSeparator());
            } else {
                stringBuilder.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return stringBuilder.toString().trim();
    }
}
