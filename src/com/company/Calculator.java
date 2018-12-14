package com.company;

public class Calculator {
    private Double num1;
    private Double num2;
    private Calculator.BiOperatorModes mode;

    public Calculator() {
        this.mode = Calculator.BiOperatorModes.normal;
    }

    private Double calculateBiImpl() {
        if (this.mode == Calculator.BiOperatorModes.normal) {
            return this.num2;
        } else if (this.mode == Calculator.BiOperatorModes.add) {
            return this.num1 + this.num2;
        } else if (this.mode == Calculator.BiOperatorModes.minus) {
            return this.num1 - this.num2;
        } else if (this.mode == Calculator.BiOperatorModes.multiply) {
            return this.num1 * this.num2;
        } else if (this.mode == Calculator.BiOperatorModes.divide) {
            return this.num1 / this.num2;
        } else if (this.mode == Calculator.BiOperatorModes.xpowerofy) {
            return Math.pow(this.num1, this.num2);
        } else {
            throw new Error();
        }
    }

    public Double calculateBi(Calculator.BiOperatorModes newMode, Double num) {
        if (this.mode == Calculator.BiOperatorModes.normal) {
            this.num2 = 0.0D;
            this.num1 = num;
            this.mode = newMode;
            return 0.0D / 0.0;
        } else {
            this.num2 = num;
            this.num1 = this.calculateBiImpl();
            this.mode = newMode;
            return this.num1;
        }
    }

    public Double calculateEqual(Double num) {
        return this.calculateBi(Calculator.BiOperatorModes.normal, num);
    }

    public Double reset() {
        this.num2 = 0.0D;
        this.num1 = 0.0D;
        this.mode = Calculator.BiOperatorModes.normal;
        return 0.0D / 0.0;
    }

    public Double calculateMono(Calculator.MonoOperatorModes newMode, Double num) {
        if (newMode == Calculator.MonoOperatorModes.square) {
            return num * num;
        } else if (newMode == Calculator.MonoOperatorModes.squareRoot) {
            return Math.sqrt(num);
        } else if (newMode == Calculator.MonoOperatorModes.oneDevidedBy) {
            return 1.0D / num;
        } else if (newMode == Calculator.MonoOperatorModes.cos) {
            return Math.cos(num);
        } else if (newMode == Calculator.MonoOperatorModes.sin) {
            return Math.sin(num);
        } else if (newMode == Calculator.MonoOperatorModes.tan) {
            return Math.tan(num);
        } else if (newMode == Calculator.MonoOperatorModes.log) {
            return Math.log10(num);
        } else if (newMode == Calculator.MonoOperatorModes.rate) {
            return num / 100.0D;
        } else {
            throw new Error();
        }
    }

    public static enum MonoOperatorModes {
        square,
        squareRoot,
        oneDevidedBy,
        cos,
        sin,
        tan,
        log,
        rate;

        private MonoOperatorModes() {
        }
    }

    public static enum BiOperatorModes {
        normal,
        add,
        minus,
        multiply,
        divide,
        xpowerofy;

        private BiOperatorModes() {
        }
    }
}
