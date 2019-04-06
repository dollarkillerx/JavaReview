package com.genericparadigm;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午4:11
 * Description: No Description
 */
public class NumGeneric<E> {
    private E num;
    public E getNum() {
        return num;
    }
    public void setNum(E num) {
        this.num = num;
    }

    public static void main(String[] args) {
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(16);
        System.out.println(intNum.getNum());
    }
}
