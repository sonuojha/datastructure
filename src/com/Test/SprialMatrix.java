package com.Test;

/**
 * Created by aojha on 6/13/17.
 */
public class SprialMatrix {

    public void createMatrix(int N) {
        int sz = 2*N -1;
        int[][] a = new int[sz][sz];

        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                a[i][j]  = N;
            }
        }
    }
}

class SprialMatrixMain{
    public static void main(String[] args) {

        SprialMatrix sm = new SprialMatrix();
        //sm.printMatrix(2);
    }
}
