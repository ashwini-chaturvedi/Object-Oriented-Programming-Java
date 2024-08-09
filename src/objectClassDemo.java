public class objectClassDemo {
    @Override
    public int hashCode() {//Provide a HashCode for the element//Random Integer value
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {//checks if the content of both the objects are equal
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {//it gives the String representation
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {//When Garbage Collection is Called it is called this is used
        super.finalize();
    }

}
