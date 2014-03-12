public class Field {

  private static final int FIELD_SIZE = 3;
  private static final char DEFAULD_CELL_VOLUE = ' ';
  
  private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];
  
  public void eraseField(){
    for(int b=0; b<FIELD_SIZE; b++){
      eraseLine(b);
    }
  }
  
  public void showField() {
    System.out.println();
    for(int b=0; b<FIELD_SIZE; b++) {
      showLine(b);
      System.out.println();
    }
    System.out.println();
  }

  private void eraseLine(int lineNumber) {
    for(int b=0; b<FIELD_SIZE; b++) {
      field[b][lineNumber] = DEFAULD_CELL_VOLUE;
    }
  }

  private void showLine(int lineNumber) {
    for(int b=0; b<FIELD_SIZE; b++) {
      showCell(b, lineNumber);
    }
  }
  
  private void showCell(int x, int y) {
    System.out.print("[" + field[x][y] + "]");
  }


}
