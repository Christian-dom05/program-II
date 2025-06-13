package model;

public class SecurityManagerBuilder {

    public static SecurityManager build() {
        return new SecurityManagerImpl();
    }
}
