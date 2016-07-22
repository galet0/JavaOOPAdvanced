package _02_generics._11_threeuple;

import _02_generics._11_threeuple.interfaces.Threeuple;
import _02_generics._11_threeuple.models.ThreeupleImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 22.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String peoplesInfo = reader.readLine();

        String regex = "([a-zA-Z]+\\s*[a-zA-Z]+)\\s+([a-zA-Z]+)\\s+([a-zA-Z]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(peoplesInfo);
        Threeuple<String, String, String> peoples = null;
        if(matcher.find()) {
            String names = matcher.group(1);
            String address = matcher.group(2);
            String town = matcher.group(3);
            peoples = new ThreeupleImpl<>(names, address, town);
        }


        String[] beersDrunk = reader.readLine().split("\\s+");
        String name = beersDrunk[0];
        Long count = Long.parseLong(beersDrunk[1]);
        String condition = beersDrunk[2];
        Threeuple<String, Long, String> beers = null;
        if(condition.equals("drunk")){
            beers = new ThreeupleImpl<>(name, count, "true");
        } else if(condition.equals("not")){
            beers = new ThreeupleImpl<>(name, count, "false");
        }

        String[] bankInfo = reader.readLine().split("\\s+");
        String user = bankInfo[0];
        double balance = Double.parseDouble(bankInfo[1]);
        String bankName = bankInfo[2];
        Threeuple<String, Double, String> banks = new ThreeupleImpl<>(user, balance, bankName);

        System.out.println(peoples.toString());
        System.out.println(beers.toString());
        System.out.println(banks.toString());


    }
}
