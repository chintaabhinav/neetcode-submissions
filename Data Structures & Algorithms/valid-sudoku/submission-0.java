class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            HashSet<Character> set = new HashSet<>();

            for(int col=0;col<9;col++){
                char num = board[row][col];

                if(num=='.') continue;

                if(!set.add(num)){
                    return false;
                }
            }
        }
        for(int col =0;col<9;col++){
            HashSet<Character> set = new HashSet<>();
            for(int row=0;row<9;row++){
                char num = board[row][col];
            
            if(num=='.') continue;

                if(!set.add(num)){
                    return false;
                }
            }
        }
        for(int Startrow=0;Startrow<9;Startrow+=3){
            for(int Startcol=0;Startcol<9;Startcol+=3){
                HashSet<Character> set =  new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        char num = board[Startrow+i][Startcol+j];
                        if(num=='.') continue;

                if(!set.add(num)){
                    return false;
                }
                    }
                }
            }
        }
        return true;

    }
}
