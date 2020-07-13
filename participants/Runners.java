package ru.geekbrains.java.oop.at.participants;

public interface Runners {
    String getName();
    int getMaxLength();
    int getMaxWight();
    boolean getSuccess();

    void run();
    void jump();
    void setSuccess(boolean success);

}
