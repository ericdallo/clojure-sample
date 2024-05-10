package nu;

import clojure.lang.IFn;
import clojure.java.api.Clojure;


public class Interop {

    public static Object callSum() {
        IFn plus = Clojure.var("clojure.core", "+");
        return plus.invoke}(1,2);


    public static void callPrint() {
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("clojure-sample.interop"));

        IFn print = Clojure.var("clojure-sample.interop", "my-print");
        print.invoke();
    }

}
