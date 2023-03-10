package ticTacToe;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> getValidCombinations() {
        List<List<Integer>> validCombinations = new ArrayList<>();
        List<Integer> combinationFirstRow = new ArrayList<>();
        combinationFirstRow.add(0);
        combinationFirstRow.add(1);
        combinationFirstRow.add(2);

        List<Integer> combinationSecondRow = new ArrayList<>();
        combinationSecondRow.add(3);
        combinationSecondRow.add(4);
        combinationSecondRow.add(5);

        List<Integer> combinationThirdRow = new ArrayList<>();
        combinationThirdRow.add(6);
        combinationThirdRow.add(7);
        combinationThirdRow.add(8);

        List<Integer> combinationFirstColumn = new ArrayList<>();
        combinationFirstColumn.add(0);
        combinationFirstColumn.add(3);
        combinationFirstColumn.add(6);

        List<Integer> combinationSecondColumn = new ArrayList<>();
        combinationSecondColumn.add(1);
        combinationSecondColumn.add(4);
        combinationSecondColumn.add(7);

        List<Integer> combinationThirdColumn = new ArrayList<>();
        combinationThirdColumn.add(2);
        combinationThirdColumn.add(5);
        combinationThirdColumn.add(8);

        List<Integer> combinationFirstDiagonal = new ArrayList<>();
        combinationFirstDiagonal.add(0);
        combinationFirstDiagonal.add(4);
        combinationFirstDiagonal.add(8);

        List<Integer> combinationSecondDiagonal = new ArrayList<>();
        combinationSecondDiagonal.add(6);
        combinationSecondDiagonal.add(4);
        combinationSecondDiagonal.add(2);

        validCombinations.add(combinationFirstRow);
        validCombinations.add(combinationSecondRow);
        validCombinations.add(combinationThirdRow);
        validCombinations.add(combinationFirstColumn);
        validCombinations.add(combinationSecondColumn);
        validCombinations.add(combinationThirdColumn);
        validCombinations.add(combinationFirstDiagonal);
        validCombinations.add(combinationSecondDiagonal);
        return validCombinations;
    }
}
