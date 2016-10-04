package com.sunny.mywords.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/10/4.
 */

public class YDWord {
    private String word;
    private List<String> trans;
    private String soundMark;
    private String soundUrl;
    private int viewCount;

    @Override
    public String toString() {
        return "YDWord{" +
                "soundMark='" + soundMark + '\'' +
                ", word='" + word + '\'' +
                ", trans=" + trans +
                ", soundUrl='" + soundUrl + '\'' +
                ", viewCount=" + viewCount +
                '}';
    }

    public String getSoundMark() {
        return soundMark;
    }

    public void setSoundMark(String soundMark) {
        this.soundMark = soundMark;
    }

    public String getSoundUrl() {
        return soundUrl;
    }

    public void setSoundUrl(String soundUrl) {
        this.soundUrl = soundUrl;
    }

    public List<String> getTrans() {
        return trans;
    }

    public void setTrans(List<String> trans) {
        this.trans = trans;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
