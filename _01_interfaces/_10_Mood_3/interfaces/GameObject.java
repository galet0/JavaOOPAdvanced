package _01_interfaces._10_Mood_3.interfaces;

/**
 * Created by User on 06.08.2016.
 */
public interface GameObject {
    String getUsername();
    String generateHashedPassword(String username);
    String getSpecialPointsType();
    int getLevel();
}
