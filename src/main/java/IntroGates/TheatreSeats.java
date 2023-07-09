package IntroGates;

/*Given the total number of rows and columns in the theater
 (nRows and nCols, respectively), and the row and column you're
 sitting in, return the number of people who sit strictly behind
 you and in your column or to the left, assuming all seats are occupied.

Example

For nCols = 16, nRows = 11, col = 5, and row = 3, the output should be
solution(nCols, nRows, col, row) = 96*/
public class TheatreSeats {
    public static void main(String[] args) {
        System.out.println(solution(16,5,11,3));
    }
   static int solution(int nCols,int col,int nRows,int row){
        int seatsToLeft = col -1;
        int seatsBehind = (nCols - seatsToLeft)*(nRows - row);
        return seatsBehind;
    }
}
