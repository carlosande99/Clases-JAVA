package com.ipartek;

public class Calculo {

    private int op1,op2;
    private Operacion operacion;

    /// //////////////////////////////////////////////////////

    public Calculo(int op1, int op2, Operacion operacion) {
        this.op1 = op1;
        this.op2 = op2;
        this.operacion = operacion;
    }


    /// /////////////////////////////////////////////////////

    public int calcular(){
        return operacion.calcular(this.op1,this.op2);
    }
}
