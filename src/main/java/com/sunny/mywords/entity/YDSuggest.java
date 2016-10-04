package com.sunny.mywords.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/10/4.
 */

public class YDSuggest {
    private String word;
    private List<YDSuggest> suggests;

    @Override
    public String toString() {
        return "YDSuggest{" +
                "suggests=" + suggests +
                ", word='" + word + '\'' +
                '}';
    }

    public List<YDSuggest> getSuggests() {
        return suggests;
    }

    public void setSuggests(List<YDSuggest> suggests) {
        this.suggests = suggests;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
