import java.util.ArrayList;

public class p220218_3 {
    public static void main(String[] args) {
        var sol = new p220218_3();

        var board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};

        var moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(sol.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        var basket = new ArrayList<Integer>();
        var currentItem = 0;
        var answer = 0;

        for (var col : moves) {
            for (var row = 0; row < board.length; row++) {
                currentItem = board[row][col - 1];

                if (currentItem == 0)
                    continue;

                basket.add(currentItem);
                board[row][col - 1] = 0;

                System.out.println(basket);

                if (basket.size() < 2)
                    break;

                var isEqualsItem = basket.get(basket.size() - 1).equals(basket.get(basket.size() - 2));
                if (!isEqualsItem)
                    break;

                System.out.println("pang! : " + basket.get(basket.size() - 1));

                answer += 2;
                basket.remove(basket.size() - 1);
                basket.remove(basket.size() - 1);
                break;
            }
        }
        return answer;
    }
}

