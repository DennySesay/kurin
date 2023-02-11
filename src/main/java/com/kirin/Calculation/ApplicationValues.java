package com.kirin.Calculation;

public class ApplicationValues {
    protected int loopLenght;
    protected int videoLength;
    protected int result;

    public ApplicationValues() {

    }

    public int getLoopLenght() {
        return loopLenght;
    }

    public void setLoopLenght(int loopLenght) {
        this.loopLenght = loopLenght;
    }

    public int getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Values{" +
                "loopLenght=" + loopLenght +
                ", videoLength=" + videoLength +
                ", result=" + result +
                '}';
    }
}
