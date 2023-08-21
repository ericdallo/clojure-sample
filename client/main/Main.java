package client.main;

import clojure_sample.Foo;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.something();
        foo.otherthing(); // Throws UnsuportedOperationException
    }
}
