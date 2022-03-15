public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    /* TODO
This constructor should take the contents of a CSV file and initialize the member variables of the Database class.
*/
    public Database(String contents) {
        String[] table = contents.split("\n");

        this.colNames = table[0].split(" ");
        this.numRows = table.length - 1;

        for (int i = 1; i < table.length; i++) {
            data[i-1] = table[i].split(" ");
        }

    }

    /* TODO
This method should return the data contained on row "row" and the column matching  @columname */
    public String getValue(String columnName, int row){
        int col = 0;

        for (int i = 0; i < colNames.length; i++) {
            if (colNames[i].equals(columnName)) col = i;
        }

        return data[row][col];
    }

}


