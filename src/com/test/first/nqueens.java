package com.test.first;

import interview_question.A;

import java.util.ArrayList;
import java.util.List;

public class nqueens {


    public static void main(String[] args) {

        List<List<String>> lists = queeslist(4);
        for (List<String> list:lists){
            System.out.println(list);
        }

    }

    public static List<List<String>> queeslist(int num){

        List<List<String>> queen= new ArrayList<>();
        char [][]board = new char[num][num];
        backtrack(queen,board,0);

        return queen;
    }

    public static void backtrack(List<List<String>> queen_list, char [][] boards, int col){

        if (boards.length==col){
            saveboard(queen_list,boards);
            return;
        }

        for (int i=0;i<boards.length;i++){
            if(issafe(i,col,boards)){
                boards[i][col] = 'Q';
                backtrack(queen_list,boards,col+1);
                boards[i][col] = '.';
            }

        }
    }

    public static void saveboard(List<List<String>> list, char [][] boardsss){

        String row;
        List<String> boardlist = new ArrayList<>();
        for (int i=0;i<boardsss.length;i++){
            row = "";
            for (int j=0;j<boardsss[0].length;j++){
                if(boardsss[i][j] == 'Q'){
                    row +='Q';
                }else {
                    row +='.';
                }
            }
            boardlist.add(row);
        }
        list.add(boardlist);

    }
    public static boolean issafe(int rows, int cols, char[][] board){

        //horizontal
        for (int col=0;col<board.length;col++){
            if(board[rows][col] =='Q'){
                return false;
            }
        }

        //vertical
        for (int i=0;i<board.length;i++){
            if(board[i][cols]=='Q'){
                return false;
            }
        }

        //upper left
        int r = rows;
        for(int c=cols;c>=0 && r>=0;c--,r--){
            if(board[r][c] =='Q'){
                return false;
            }
        }

        //upper right
        r=rows;
        for(int c=cols;c<board.length&&r>=0;c++,r--){

            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r=rows;
        for (int c=cols;c>=0 && r<board.length;c--,r++){
            if(board[r][c] =='Q'){
                return false;
            }
        }

        //lower right
        r = rows;
        for(int c=cols;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }


}
