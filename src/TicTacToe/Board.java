package TicTacToe;

import java.util.Scanner;

public class Board {
    private int size;
    PlayerSymbolBaseClass[][] playerboard;

    public Board() {
        playerboard = new PlayerSymbolBaseClass[3][3];
    }


    public boolean isspaceavailable() {
        for (int i=0;i<playerboard.length;i++){
            for(int j=0;j<playerboard[i].length;j++){
                if(playerboard[i][j]==null){
                    return true;
                }
            }
        }
        return false;
    }

    public void printBoard() {
    for(int i=0;i< playerboard.length;i++){
        for(int j=0;j<playerboard[i].length;j++){
            if(playerboard[i][j]!=null) {
                System.out.print(playerboard[i][j].getSupportedSymbol() + " | ");
            }
            else{
                System.out.print(" | ");
            }
        }
        System.out.println();
        System.out.print("------------");
        System.out.println();
    }
    }

    public void setNumber(int row, int col, PlayerSymbolBaseClass playerSymbol) {
        playerboard[row][col]=playerSymbol;
    }

    public boolean isanyWinner(PlayerSymbolBaseClass playerSymbol) {
        boolean isrowmatch = true;
        boolean iscolmatch = true;
        boolean isdia1gmatch = true;
        boolean isdia2gmatch = true;
        for(int i=0;i<playerboard.length;i++){
            isrowmatch = true;
            for(int j=0;j<playerboard[i].length;j++){
                if(playerboard[i][j]!=playerSymbol){
                    isrowmatch=false;
                    break;
                }
                }
            if(isrowmatch){
                break;
            }
        }
        for(int i=0;i<playerboard.length;i++){
            iscolmatch = true;
            for(int j=0;j<playerboard[i].length;j++){
                if(playerboard[j][i]!=playerSymbol){
                    iscolmatch=false;
                    break;
                }
            }
            if(iscolmatch){
                break;
            }
        }
        for(int i=0;i<playerboard.length;i++){
            if(playerboard[i][i]!=playerSymbol){
                isdia1gmatch=false;
                break;
            }
        }
        int col = playerboard[0].length-1;
        for(int i=0;i<playerboard.length;i++){
            if(playerboard[i][col]!=playerSymbol){
                isdia2gmatch = false;
                break;
            }
            col--;
        }
        return isrowmatch||iscolmatch||isdia1gmatch||isdia2gmatch;
    }
}
