package ru.mirea.exercise13and14;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Controller {

    private byte who=1;
    private char[][] table;
    private char step;

    @FXML
    private Button x1y1;

    @FXML
    private Button x1y2;

    @FXML
    private Button x1y3;

    @FXML
    private Button x1y4;

    @FXML
    private Button x2y1;

    @FXML
    private Button x2y2;

    @FXML
    private Button x2y3;

    @FXML
    private Button x2y4;

    @FXML
    private Button x3y1;

    @FXML
    private Button x3y2;

    @FXML
    private Button x3y3;

    @FXML
    private Button x3y4;

    @FXML
    private Button x4y1;

    @FXML
    private Button x4y4;

    @FXML
    private Button x4y3;

    @FXML
    private Button x4y2;
    @FXML
    private Button buttonSTOP;


    @FXML
    void initialize() {
        table = new char[4][4];
        initTable();
        //Окно на случай победы крестиков
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("УРА!");
        alert.setHeaderText(null);
        buttonSTOP.setOnAction(event -> {initTable();});
        x1y1.setOnAction(event -> {

        if(who==1)
        {
            x1y1.setDisable(true);//блокировка кнопки после нажатия
            x1y1.setText("X");
            who=0;
            table[0][0]='X';
            step = 'X';

        }
        else
        {
            x1y1.setDisable(true);//блокировка кнопки после нажатия
            x1y1.setText("O");
            who=1;
            table[0][0]='O';
            step = 'O';
        }
        if (checkWin(step))
        {
            alert.setContentText("Победил игрок, играющий за '"+ step+"'");
            alert.showAndWait();
            totalBlock();
        }
        if (isTableFull())
        {
            alert.setContentText("Ничья!");
            alert.showAndWait();

        }
    });
        x1y2.setOnAction(event -> {

            if(who==1)
            {
                x1y2.setDisable(true);//блокировка кнопки после нажатия
                x1y2.setText("X");
                who=0;
                table[0][1]='X';
                step = 'X';

            }
            else
            {
                x1y2.setDisable(true);//блокировка кнопки после нажатия
                x1y2.setText("O");
                who=1;
                table[0][1]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x1y3.setOnAction(event -> {

            if(who==1)
            {
                x1y3.setDisable(true);//блокировка кнопки после нажатия
                x1y3.setText("X");
                who=0;
                table[0][2]='X';
                step = 'X';

            }
            else
            {
                x1y3.setDisable(true);//блокировка кнопки после нажатия
                x1y3.setText("O");
                who=1;
                table[0][2]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x1y4.setOnAction(event -> {

            if(who==1)
            {
                x1y4.setDisable(true);//блокировка кнопки после нажатия
                x1y4.setText("X");
                who=0;
                table[0][3]='X';
                step = 'X';

            }
            else
            {
                x1y4.setDisable(true);//блокировка кнопки после нажатия
                x1y4.setText("O");
                who=1;
                table[0][3]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x2y2.setOnAction(event -> {

            if(who==1)
            {
                x2y2.setDisable(true);//блокировка кнопки после нажатия
                x2y2.setText("X");
                who=0;
                table[1][1]='X';
                step = 'X';

            }
            else
            {
                x2y2.setDisable(true);//блокировка кнопки после нажатия
                x2y2.setText("O");
                who=1;
                table[1][1]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x2y1.setOnAction(event -> {

            if(who==1)
            {
                x2y1.setDisable(true);//блокировка кнопки после нажатия
                x2y1.setText("X");
                who=0;
                table[1][0]='X';
                step = 'X';

            }
            else
            {
                x2y1.setDisable(true);//блокировка кнопки после нажатия
                x2y1.setText("O");
                who=1;
                table[1][0]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x2y3.setOnAction(event -> {

            if(who==1)
            {
                x2y3.setDisable(true);//блокировка кнопки после нажатия
                x2y3.setText("X");
                who=0;
                table[1][2]='X';
                step = 'X';

            }
            else
            {
                x2y3.setDisable(true);//блокировка кнопки после нажатия
                x2y3.setText("O");
                who=1;
                table[1][2]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x2y4.setOnAction(event -> {

            if(who==1)
            {
                x2y4.setDisable(true);//блокировка кнопки после нажатия
                x2y4.setText("X");
                who=0;
                table[1][3]='X';
                step = 'X';

            }
            else
            {
                x2y4.setDisable(true);//блокировка кнопки после нажатия
                x2y4.setText("O");
                who=1;
                table[1][3]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x3y1.setOnAction(event -> {

            if(who==1)
            {
                x3y1.setDisable(true);//блокировка кнопки после нажатия
                x3y1.setText("X");
                who=0;
                table[2][0]='X';
                step = 'X';

            }
            else
            {
                x3y1.setDisable(true);//блокировка кнопки после нажатия
                x3y1.setText("O");
                who=1;
                table[2][0]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x3y2.setOnAction(event -> {

            if(who==1)
            {
                x3y2.setDisable(true);//блокировка кнопки после нажатия
                x3y2.setText("X");
                who=0;
                table[2][1]='X';
                step = 'X';

            }
            else
            {
                x3y2.setDisable(true);//блокировка кнопки после нажатия
                x3y2.setText("O");
                who=1;
                table[2][1]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x3y3.setOnAction(event -> {

            if(who==1)
            {
                x3y3.setDisable(true);//блокировка кнопки после нажатия
                x3y3.setText("X");
                who=0;
                table[2][2]='X';
                step = 'X';

            }
            else
            {
                x3y3.setDisable(true);//блокировка кнопки после нажатия
                x3y3.setText("O");
                who=1;
                table[2][2]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x3y4.setOnAction(event -> {

            if(who==1)
            {
                x3y4.setDisable(true);//блокировка кнопки после нажатия
                x3y4.setText("X");
                who=0;
                table[2][3]='X';
                step = 'X';

            }
            else
            {
                x3y4.setDisable(true);//блокировка кнопки после нажатия
                x3y4.setText("O");
                who=1;
                table[2][3]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x4y1.setOnAction(event -> {

            if(who==1)
            {
                x4y1.setDisable(true);//блокировка кнопки после нажатия
                x4y1.setText("X");
                who=0;
                table[3][0]='X';
                step = 'X';

            }
            else
            {
                x4y1.setDisable(true);//блокировка кнопки после нажатия
                x4y1.setText("O");
                who=1;
                table[3][0]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x4y2.setOnAction(event -> {

            if(who==1)
            {
                x4y2.setDisable(true);//блокировка кнопки после нажатия
                x4y2.setText("X");
                who=0;
                table[3][1]='X';
                step = 'X';

            }
            else
            {
                x4y2.setDisable(true);//блокировка кнопки после нажатия
                x4y2.setText("O");
                who=1;
                table[3][1]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x4y3.setOnAction(event -> {

            if(who==1)
            {
                x4y3.setDisable(true);//блокировка кнопки после нажатия
                x4y3.setText("X");
                who=0;
                table[3][2]='X';
                step = 'X';

            }
            else
            {
                x4y3.setDisable(true);//блокировка кнопки после нажатия
                x4y3.setText("O");
                who=1;
                table[3][2]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
        x4y4.setOnAction(event -> {

            if(who==1)
            {
                x4y4.setDisable(true);//блокировка кнопки после нажатия
                x4y4.setText("X");
                who=0;
                table[3][3]='X';
                step = 'X';

            }
            else
            {
                x4y4.setDisable(true);//блокировка кнопки после нажатия
                x4y4.setText("O");
                who=1;
                table[3][3]='O';
                step = 'O';
            }
            if (checkWin(step))
            {
                alert.setContentText("Победил игрок, играющий за '"+ step+"'");
                alert.showAndWait();
                totalBlock();
            }
            if (isTableFull())
            {
                alert.setContentText("Ничья!");
                alert.showAndWait();
                return;
            }
        });
    }
    boolean checkWin(char dot) {
        for (int i = 0; i < 4; i++)//Проверка столбов и строк
            if ((table[i][0] == dot && table[i][1] == dot &&
                    table[i][2] == dot && table[i][3] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&
                            table[2][i] == dot && table[3][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot && // проверка диагоналей
                table[2][2] == dot && table[3][3] == dot) ||
                ( table[3][0] == dot && table[2][1] == dot && table[1][2] == dot &&
                        table[0][3] == dot))
            return true;
        return false;
    }
    boolean isTableFull() {// Провекрка на ничью
        for (int row = 0; row < 4; row++)
            for (int col = 0; col < 4; col++)
                if (table[row][col] == '?')
                    return false;
        return true;
    }
    void totalBlock()
    {
        x1y1.setDisable(true);
        x1y2.setDisable(true);
        x1y3.setDisable(true);
        x1y4.setDisable(true);
        x2y1.setDisable(true);
        x2y2.setDisable(true);
        x2y3.setDisable(true);
        x2y4.setDisable(true);
        x3y1.setDisable(true);
        x3y2.setDisable(true);
        x3y3.setDisable(true);
        x3y4.setDisable(true);
        x4y1.setDisable(true);
        x4y3.setDisable(true);
        x4y4.setDisable(true);
        x4y2.setDisable(true);

    }
    void totalAnLock()
    {
        x1y1.setDisable(false);
        x1y2.setDisable(false);
        x1y3.setDisable(false);
        x1y4.setDisable(false);
        x2y1.setDisable(false);
        x2y2.setDisable(false);
        x2y3.setDisable(false);
        x2y4.setDisable(false);
        x3y1.setDisable(false);
        x3y2.setDisable(false);
        x3y3.setDisable(false);
        x3y4.setDisable(false);
        x4y1.setDisable(false);
        x4y3.setDisable(false);
        x4y4.setDisable(false);
        x4y2.setDisable(false);

    }
    void initTable() {// Очистка поля
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                table[row][col] = '?';

            }
        }
        x1y1.setText(" ");
        x1y2.setText(" ");
        x1y3.setText(" ");
        x1y4.setText(" ");
        x2y1.setText(" ");
        x2y2.setText(" ");
        x2y3.setText(" ");
        x2y4.setText(" ");
        x3y1.setText(" ");
        x3y2.setText(" ");
        x3y3.setText(" ");
        x3y4.setText(" ");
        x4y1.setText(" ");
        x4y2.setText(" ");
        x4y3.setText(" ");
        x4y4.setText(" ");
        totalAnLock();
        who=1;


    }

    //short who(){};
}
