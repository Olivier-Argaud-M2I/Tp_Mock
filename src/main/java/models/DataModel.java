package models;

import enums.OperationType;

public class DataModel {

    private Double arg1;
    private Double arg2;
    private OperationType operation;
    private Double resultat;


    public Double getArg1() {
        return arg1;
    }

    public void setArg1(Double arg1) {
        this.arg1 = arg1;
    }

    public Double getArg2() {
        return arg2;
    }

    public void setArg2(Double arg2) {
        this.arg2 = arg2;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }

    public Double getResultat() {
        return resultat;
    }

    public void setResultat(Double resultat) {
        this.resultat = resultat;
    }

    public DataModel(Double arg1, Double arg2, OperationType operation) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operation = operation;
    }

    public DataModel(Double arg1, Double arg2, OperationType operation, Double resultat) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operation = operation;
        this.resultat = resultat;
    }
}
