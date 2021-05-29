public class MyClass<T extends Number> {
    private T var1;
    private T var2;

    public MyClass() {
    }

    public MyClass(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public T getVar2() {
        return var2;
    }

    public void setVar2(T var2) {
        this.var2 = var2;
    }
}
