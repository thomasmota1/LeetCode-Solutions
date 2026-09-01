class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] linhas = new boolean[9][9];
        boolean[][] colunas = new boolean[9][9];
        boolean[][] blocos = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char atual = board[i][j];

                if (atual == '.') {
                    continue;
                }

                int numero = atual - '1';
                int indiceBloco = (i / 3) * 3 + (j / 3);

                if (linhas[i][numero]
                        || colunas[j][numero]
                        || blocos[indiceBloco][numero]) {
                    return false;
                }

                linhas[i][numero] = true;
                colunas[j][numero] = true;
                blocos[indiceBloco][numero] = true;
            }
        }

        return true;
    }
}