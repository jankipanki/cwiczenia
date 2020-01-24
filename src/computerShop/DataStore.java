package computerShop;

public class DataStore {
    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int counter = 0;


    public void add(Computer computer) {
        if (counter < MAX_COMPUTERS && computer != null) {
            computers[counter] = computer;
            counter++;
        }
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[counter]; //nowa tablica
        for (int i = 0; i < counter; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    int checkAvailability(Computer find) {
        if (find == null)
            return 0;
        
        int count = 0;
        for (int i = 0; i < counter; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }

}