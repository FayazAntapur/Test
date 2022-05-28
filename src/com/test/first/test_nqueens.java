package com.test.first;

import interview_question.A;

import java.util.ArrayList;
import java.util.List;

public class test_nqueens {

    public static void main(String[] args) {

        List<List<String >> q_l=queen(4);

        for (List<String> ele:q_l){
            System.out.println(ele);
        }

    }

    public static List<List<String >> queen(int n){
        List<List<String>> queen_list = new ArrayList<>();
        char [][] chess_board = new char[n][n];
        get_queen_list(queen_list, chess_board, 0);
        return queen_list;
    }

    public static void get_queen_list(List<List<String>> param_queen_list, char [][] param_chess_board, int col){
        if(col==param_chess_board.length){
            saveBoard(param_chess_board,param_queen_list);
            return;
        }

        for(int i=0;i<param_chess_board.length;i++){
            if(isSafe(param_chess_board, i, col)){
                param_chess_board[i][col] ='Q';
                get_queen_list(param_queen_list, param_chess_board, col+1);
                param_chess_board[i][col] = '.';
            }

        }
    }

    public static void saveBoard(char [][] board_data, List<List<String>> all_list){
        String row = "";
        List<String> check_lst = new ArrayList<>();
        for (int i=0;i<board_data.length;i++){
            row = "";
            for (int j=0;j<board_data[0].length;j++){
                if(board_data[i][j] == 'Q')
                    row +='Q';
                else
                    row +='.';
            }
            check_lst.add(row);

        }
        all_list.add(check_lst);
    }
    public static boolean isSafe(char[][] chess_boarad, int row, int col){

        // horizontal
        for(int i=0;i<chess_boarad.length;i++){
            if(chess_boarad[i][col] == 'Q')
                return false;
        }

        //vertical

        for(int j=0;j<chess_boarad.length;j++){
            if(chess_boarad[row][j] =='Q')
                return false;
        }

        //upper right
        int r = row;
        for(int c=col;c>=0&&r>=0;c--,r--){
            if(chess_boarad[r][c] =='Q')
                return false;
        }

        //upper right
        r = row;
        for(int c=col;c<chess_boarad.length&&r>=0;c++,r--){
            if(chess_boarad[r][c]=='Q')
                return false;
        }

        //lower left
        r = row;
        for(int c=col;c>=0 && r<chess_boarad.length;c--,r++){
            if(chess_boarad[r][c]=='Q')
                return false;
        }

        // lower right
        r = row;
        for(int c=col;c<chess_boarad.length&&r<chess_boarad.length;c++,r++){
            if(chess_boarad[r][c]=='Q')
                return false;
        }
        return true;
    }
}
