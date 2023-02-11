package com.kirin.Calculation;

import org.jetbrains.annotations.NotNull;

public class KurinCalculator extends ApplicationValues {

    String videoLength;
    String loopLength;
    int intLoopLength;
    int intVideoLength;

    ApplicationValues values = new ApplicationValues();

    public KurinCalculator(String videoLength, String loopLength) {
        this.videoLength = videoLength;
        this.loopLength = loopLength;
    }

    boolean videoHourCheck = videoLength.endsWith("h");
    boolean videoMinuteCheck = videoLength.endsWith("m");

    boolean loopHourCheck = loopLength.endsWith("h");
    boolean loopMinuteCheck = loopLength.endsWith("m");

    int loopMinuteConverter = Integer.parseInt(loopLength.replace("m", "")) * 60;
    int loopHourConverter = Integer.parseInt(loopLength.replace("h", ""));

    int videoMinuteConverter = Integer.parseInt(videoLength.replace("m", "")) * 60;
    int videoHourConverter = Integer.parseInt(videoLength.replace("h", ""));

    private Boolean hourMinuteCheck() {
        if (loopHourCheck == false || loopMinuteCheck == false) {
            System.out.println("Please end with h/our or m/inutes");
            throw new RuntimeException();
        } else if (!videoHourCheck || !videoMinuteCheck) {
            System.out.println("Please end with h/our or m/inutes");
            throw new RuntimeException();
        } else if (loopHourCheck) {
            intLoopLength = loopHourConverter;
            values.setLoopLenght(intLoopLength);
            return true;
        } else if (loopMinuteCheck) {
            intLoopLength = loopMinuteConverter;
            values.setLoopLenght(intLoopLength);
            return true;
        } else if (videoHourCheck) {
            intVideoLength = videoHourConverter;
            values.setVideoLength(intVideoLength);
            return true;
        } else if (videoMinuteCheck) {
            intVideoLength = videoMinuteConverter;
            values.setVideoLength(intVideoLength);
            return true;
        }
        return true;
    }

    int result = 0;

    private void internalCalculation(int intLoopLength, int intVideoLength) {

        boolean hmCheckResult = hourMinuteCheck();

        if (hmCheckResult) {
            for (int i = 0; i < intLoopLength; i++) {
                result = intVideoLength += intVideoLength ;
            }
        }
        System.out.println("result = " + result);
    }

    public void calculate() {
        hourMinuteCheck();
//        internalCalculation();
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "videoLength='" + videoLength + '\'' +
                ", loopLength='" + loopLength + '\'' +
                ", intLoopLength=" + intLoopLength +
                ", intVideoLength=" + intVideoLength +
                ", values=" + values +
                ", result=" + result +
                '}';
    }
}
