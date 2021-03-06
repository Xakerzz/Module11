public class Crate<T> {
    private T contents;

    public Crate(T contents) {
        this.contents = contents;
    }

    public Crate() {

    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Crate{" +
                "contents=" + contents +
                '}';
    }
}
