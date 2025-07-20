public class Relationships {
    public  static final int[][] grid = {
            // White Blood Cell / Human / Bacteria
            {0, -1, 3},    // White Blood Cell
            {0, 0 , 2},    // Human Cell
            {3, 2 , -1},    // Bacteria
    };

    public static int reversepolynomial(int x){
        return -(x*x-10*x)/5;
    }

    public static int powerCalculator(Character cell1 , Character cell2){
        if (reversepolynomial(cell2.age)!=0){
            return (type_power(cell1.index, cell2.index)* reversepolynomial(cell1.age))/reversepolynomial(cell2.age);
        }
        return (type_power(cell1.index, cell2.index)* reversepolynomial(cell1.age));
    }

    public static int type_power(int t1, int t2) {
        return grid[t2][t1];
    }
}