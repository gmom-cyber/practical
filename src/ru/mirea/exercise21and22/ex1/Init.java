package ru.mirea.exercise21and22.ex1;

public class Init {
    Action[] ran = {Action.ADD, Action.SUB, Action.MUL, Action.DIV};

    public ComplexInterface getComplex(Action type)
    {
        switch (type)
        {
            case ADD:
                return new AddDigit();
            case SUB:
                return new MinusDigit();
            case MUL:
                return new MultiplyDigit();
            case DIV:
                return new DivDigit();
        }
        return null;
    }

    public ComplexInterface getRandomComplex()
    {
        return getComplex(ran[randDigit()]);
    }

    public int randDigit()
    {
        return (int)(Math.random()*3);
    }
}

