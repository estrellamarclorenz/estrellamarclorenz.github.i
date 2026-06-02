import java.util.ArrayList;
import java.util.HashMap;

public class ElectionData {
    public static ArrayList<String> presidents = new ArrayList<>();
    public static ArrayList<String> vicePresidents = new ArrayList<>();
    public static ArrayList<String> secretaries = new ArrayList<>();
    public static ArrayList<String> treasurers = new ArrayList<>();

    public static HashMap<String, Integer> presidentVotes = new HashMap<>();
    public static HashMap<String, Integer> vicePresidentVotes = new HashMap<>();
    public static HashMap<String, Integer> secretaryVotes = new HashMap<>();
    public static HashMap<String, Integer> treasurerVotes = new HashMap<>();

    public static ArrayList<String> voters = new ArrayList<>();

    public static ArrayList<String> fullNames = new ArrayList<>();
    public static ArrayList<String> voterIDs = new ArrayList<>();
    public static ArrayList<String> usernames = new ArrayList<>();
    public static ArrayList<String> passwords = new ArrayList<>();

    public static String adminUsername = "admin";
    public static String adminPassword = "admin";

    static {
        fullNames.add("Sample User");
        voterIDs.add("2026-0001");
        usernames.add("Sample User");
        passwords.add("1234");

        addCandidate("President", "Alice");
        addCandidate("President", "Bob");
        addCandidate("Vice President", "Carol");
        addCandidate("Vice President", "David");
        addCandidate("Secretary", "Emma");
        addCandidate("Secretary", "Frank");
        addCandidate("Treasurer", "Grace");
        addCandidate("Treasurer", "Henry");
    }

    public static void addCandidate(String position, String name) {
        switch (position) {
            case "President":
                presidents.add(name);
                presidentVotes.put(name, 0);
                break;
            case "Vice President":
                vicePresidents.add(name);
                vicePresidentVotes.put(name, 0);
                break;
            case "Secretary":
                secretaries.add(name);
                secretaryVotes.put(name, 0);
                break;
            case "Treasurer":
                treasurers.add(name);
                treasurerVotes.put(name, 0);
                break;
        }
    }

    public static void resetElection() {
        presidentVotes.replaceAll((k, v) -> 0);
        vicePresidentVotes.replaceAll((k, v) -> 0);
        secretaryVotes.replaceAll((k, v) -> 0);
        treasurerVotes.replaceAll((k, v) -> 0);
        voters.clear();
    }
}


