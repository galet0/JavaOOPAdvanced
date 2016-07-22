package _01_interfaces._04_telephony;

import _01_interfaces._04_telephony.interfaces.Browser;
import _01_interfaces._04_telephony.interfaces.Phone;

/**
 * Created by User on 16.07.2016.
 */
public class Smartphone implements Browser, Phone {

    @Override
    public String call(String number) {
        if(number.matches(".*\\D.*"))
            return "Invalid number!";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("Calling... ")
                    .append(number);
            return sb.toString();
        }
    }

    @Override
    public String browse(String url) {
        if(url.matches(".*\\d.*"))
            return "Invalid URL!";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("Browsing: ")
                    .append(url)
                    .append("!");
            return sb.toString();
        }
    }
}
