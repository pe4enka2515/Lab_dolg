package com.company;

import java.util.LinkedList;

public class GameOnDoubleList {
    static void outputList(LinkedList list){
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }

    static String determineWinner(LinkedList first, LinkedList second, int turns){
        if(turns != 106) {
            if(!first.isEmpty())
                return ("first " + turns);
            else
                return ("second " + turns);
        }
        else
            return "botva";
    }

    public static void main(String[] args) {
        LinkedList<Integer> firstPlayer = new LinkedList<>();
        firstPlayer.add(3);
        firstPlayer.add(6);
        firstPlayer.add(0);
        firstPlayer.add(2);
        firstPlayer.add(7);

        LinkedList<Integer> secondPlayer = new LinkedList<>();
        secondPlayer.add(9);
        secondPlayer.add(4);
        secondPlayer.add(8);
        secondPlayer.add(1);
        secondPlayer.add(5);

        System.out.print("Игрок 1: ");
        outputList(firstPlayer);
        System.out.print("\nИгрок 2: ");
        outputList(secondPlayer);
        System.out.println();
        System.out.println();

        int countOfTurns = 0;

        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.getFirst() > secondPlayer.getFirst()){
                firstPlayer.addLast(firstPlayer.remove());
                firstPlayer.addLast(secondPlayer.remove());
            }
            else {
                secondPlayer.addLast(secondPlayer.remove());
                secondPlayer.addLast(firstPlayer.remove());
            }
            countOfTurns++;
            System.out.println("Ход №" + countOfTurns);
            outputList(firstPlayer);
            System.out.println();
            outputList(secondPlayer);
            System.out.println();
            System.out.println();
        }

        System.out.println(determineWinner(firstPlayer, secondPlayer, countOfTurns));

    }
}

