package sudoku.userinterface;

import java.util.HashMap;

import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sudoku.problemDomain.Coordinates;
import sudoku.problemDomain.SudokuGame;
import sudoku.userinterface.IUserInterfaceContract.EventListener;

public class UserInterfaceImpl implements IUserInterfaceContract.View, 
        javafx.event.EventHandler<KeyEvent> {

        private final Stage stage;
        private final Group root;

        private HashMap<Coordinates,SudokuTextField> textFiedlCoordinates;
        private IUserInterfaceContract.EventListener listener;
        private static final double WINDOW_Y = 732;
        private static final double WINDOW_X = 668;
        private static final double BOARD_PADDING = 50;
        private static final double BOARD_X_AND_Y = 576;

         private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 136);
         private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);
         private static final String Sudoku = "Sudoku";


    public UserInterfaceImpl(Stage stage, Group root) {
            this.stage = stage;
            this.root = new Group();
            this.textFiedlCoordinates = new HashMap<>();
            initalizeUserInterface(); 
        }

    private void initalizeUserInterface() {
    
        drawBackground(root);
        drawTitle(root);
        drawSudokuBoard(root);
        drawTextFields(root);
        drawGridLInes(root);
        stage.show();

    }

    private void drawGridLInes(Group root2) {
        int xAndY = 114;
        int index = 0;
        while(index < 8) {
        int thickness;
        if(index == 2 || index == 5) {
            thickness = 3;
        } else {
            thickness = 2;
        } Rectangle verticalLine = getLine(
            xAndY + 64 * index, 
            BOARD_PADDING,
            BOARD_X_AND_Y,
            thickness
        );
        Rectangle horizontalLine = getLine(
            xAndY + 64 * index, 
            BOARD_PADDING,
            BOARD_X_AND_Y,
            thickness
        );

        root.getChildren().addAll(verticalLine,horizontalLine);
        index++;
    } 
    }

    private Rectangle getLine(double x, double y, double height, double width) {
        Rectangle line = new Rectangle();
        
        line.setX(x);
        line.setY(y);
        line.setHeight(height);
        line.setWidth(width);
        line.setFill(Color.BLACK);
        return line;

    }

    private void drawTextFields(Group root2) {

        final int xOrigin = 50;
        final int yOrigin = 50;

        final int xAndYDelta = 64;

        `

    }

    private void drawSudokuBoard(Group root2) {
    }

    private void drawTitle(Group root2) {
    }

    private void drawBackground(Group root2) {
    }

    @Override
    public void handle(KeyEvent arg0) {

    }

    @Override
    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    @Override
    public void updateSquare(int x, int y, int input) {
        
    }

    @Override
    public void updateBoard(SudokuGame game) {
        
    }

    @Override
    public void showDialog(String Message) {
        
    }

    @Override
    public void showError(String messaage) {
        
    }

    
    }

