import java.util.ArrayList;

/**
 * This class saves bean data and prints the results.
 */
public class BeanStatisticsSetup {

    private static Queue<BeanStatisticsSetup> beanStatisticsSetupQueue = new Queue<>();

    private int black;
    private int pinto;
    private int kidney;
    private int cannellini;
    private int green;
    private static int tabulator = 1;
    static int finalBlack;
    static int finalPinto;
    static int finalKidney;
    static int finalCannellini;
    static int finalGreen;

    /**
     * Constructor to reset the number of beans whenever a new instance is created.
     */
    public BeanStatisticsSetup() {

    }

    /**
     * Prints the data for the 5 instances of bean stat setup. Also prints the total number of beans.
     */
    public static void print() {
        while(!beanStatisticsSetupQueue.isEmpty()) {
            BeanStatisticsSetup tab = beanStatisticsSetupQueue.dequeue();
            System.out.println("Tabulator: " + tabulator + " count " + tab.getBlack() + " for bean type black");
            System.out.println("Tabulator: " + tabulator + " count " + tab.getPinto() + " for bean type pinto");
            System.out.println("Tabulator: " + tabulator + " count " + tab.getKidney() + " for bean type kidney");
            System.out.println("Tabulator: " + tabulator + " count " + tab.getCannellini() + " for bean type cannellini");
            System.out.println("Tabulator: " + tabulator + " count " + tab.getGreen() + " for bean type green");
            finalBlack += tab.getBlack();
            finalPinto += tab.getPinto();
            finalKidney += tab.getKidney();
            finalCannellini += tab.getCannellini();
            finalGreen += tab.getGreen();

            System.out.println(" ");
            tabulator++;
        }

            System.out.println("===Totals===");
            System.out.println("count " + finalBlack + " for bean type black");
            System.out.println("count " + finalPinto + " for bean type pinto");
            System.out.println("count " + finalKidney + " for bean type kidney");
            System.out.println("count " + finalCannellini + " for bean type cannellini");
            System.out.println("count " + finalGreen + " for bean type green");
    }

    /**
     * Sorts beans by type from list from RequestProcessor.
     *
     */
    public void sort(ArrayList<Integer> list){
        for(int x: list) {

            switch (x) {
                case 0:
                    black++;
                    break;
                case 1:
                    pinto++;
                    break;
                case 2:
                    kidney++;
                    break;
                case 3:
                    cannellini++;
                    break;
                case 4:
                    green++;
                    break;
            }
        }

    }
    /**
     * Bean getters and setters.
     * */


    public int getBlack() {
        return black;
    }

    public int getPinto() {
        return pinto;
    }

    public int getKidney() {
        return kidney;
    }

    public int getCannellini() {
        return cannellini;
    }

    public int getGreen() {
        return green;
    }

    public static void enqueue(BeanStatisticsSetup tabulator){
        beanStatisticsSetupQueue.enqueue(tabulator);

    }
    }


