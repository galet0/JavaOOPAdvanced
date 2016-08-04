package _05_communication_and_events._02_kings_gambit;

import _05_communication_and_events._02_kings_gambit.interfaces.King;
import _05_communication_and_events._02_kings_gambit.interfaces.Unit;
import _05_communication_and_events._02_kings_gambit.models.Footman;
import _05_communication_and_events._02_kings_gambit.models.KingImpl;
import _05_communication_and_events._02_kings_gambit.models.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 02.08.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String kingsName = reader.readLine();
        String[] royalGurads = reader.readLine().split("\\s+");
        String[] footmans = reader.readLine().split("\\s+");

        King king = new KingImpl(kingsName);
        List<Unit> units = new LinkedList<>();

        addGuards(king, royalGurads, units);
        addFootmen(king, footmans, units);

        king.addUnits(units);

        while (true){
            String[] params = reader.readLine().split("\\s+");
            if(params[0].equals("End")){
                break;
            }
            switch (params[0]){
                case "Attack":
                    king.respondsToAttacks();
                    break;
                case "Kill":
                    king.respondToKill(params[1]);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    private static void addFootmen(King king, String[] footmans, List<Unit> units) {
        for (String footman : footmans) {
            Unit unit = new Footman(footman, king);
            units.add(unit);

        }
    }

    private static void addGuards(King king, String[] royalGurads, List<Unit> units) {
        for (String royalGurad : royalGurads) {
            Unit unit = new RoyalGuard(royalGurad, king);
            units.add(unit);
        }
    }
}
