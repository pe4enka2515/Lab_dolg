package com.company;

import java.util.Stack;

public class GameOnStack {

    static void outputDeck(Stack stack){
        Stack<Object> temp = new Stack<>();
        for (Object element: stack)
            temp.push(element);
        while(!temp.isEmpty()){
            System.out.print(temp.pop() + " ");
        }
    }

    static String determineWinner(Stack first, Stack second, int turns){
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
        Stack<Integer> firstPlayer = new Stack<>();
        firstPlayer.push(7);
        firstPlayer.push(2);
        firstPlayer.push(0);
        firstPlayer.push(6);
        firstPlayer.push(3);

        Stack<Integer> secondPlayer = new Stack<>();
        secondPlayer.push(5);
        secondPlayer.push(1);
        secondPlayer.push(8);
        secondPlayer.push(4);
        secondPlayer.push(9);

        Stack<Integer> tempStack = new Stack<>();
        int summaryNumberOfElements = firstPlayer.size() + secondPlayer.size();
        int countOfTurns = 0;

        while(firstPlayer.size() != summaryNumberOfElements && secondPlayer.size() != summaryNumberOfElements){
            if(firstPlayer.peek() > secondPlayer.peek()){
                int temp = firstPlayer.pop();
                while(!firstPlayer.isEmpty())
                    tempStack.push(firstPlayer.pop());
                tempStack.push(temp);
                tempStack.push(secondPlayer.pop());
                while(!tempStack.isEmpty())
                    firstPlayer.push(tempStack.pop());
            }
            else{
                int temp = secondPlayer.pop();
                while(!secondPlayer.isEmpty())
                    tempStack.push(secondPlayer.pop());
                tempStack.push(temp);
                tempStack.push(firstPlayer.pop());
                while(!tempStack.isEmpty())
                    secondPlayer.push(tempStack.pop());
            }
            countOfTurns++;
            System.out.println("Ход №" + countOfTurns);
            outputDeck(firstPlayer);
            System.out.println();
            outputDeck(secondPlayer);
            System.out.println();
            System.out.println();
        }
        System.out.println(determineWinner(firstPlayer, secondPlayer, countOfTurns));
    }
}

