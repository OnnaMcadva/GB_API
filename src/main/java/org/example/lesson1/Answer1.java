package org.example.lesson1;

class Answer1 {
    public int countNTriangle(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
