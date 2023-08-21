package clojure_sample;

public interface Bar {

    int something();

    default int otherthing() {
        return 2;
    }
}
