package com.sunny.mywords.network;

import com.sunny.mywords.entity.YDWord;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/4.
 */

public class HtmlWordGetter {
    private  HttpClient mClient;
    private String url;
    /**
     * 有道词典查询单词的网络地址
     */
    private static final String YD_WORD_QUERY_URL="http://www.youdao.com/w/";
    private static final String YD_WORD_SOUND_URL="http://dict.youdao.com/dictvoice";
    private Document mDoc;
    private String mSoundMarkClass="phonetic";
    private String mTransClass="trans-container";

    public HtmlWordGetter() {
        this.mClient=new HttpClient();
    }

    /**
     * 查询一个单词并得到查询到的结果
     * @param word 要查询的单词
     * @return
     * @throws IOException
     */
    public YDWord queryWord(String word) throws IOException {
        this.mDoc=mClient.get(YD_WORD_QUERY_URL+word);

        YDWord ydWord=new YDWord();
        ydWord.setWord(word);
        ydWord.setTrans(getTrans(word));
        ydWord.setSoundMark(getSoundMark(word));
        ydWord.setSoundUrl(getSoundUrl(word));
        return ydWord;
    }

    /**
     * 得到音标的音频地址
     * @param word 要查询的单词
     * @return 获取到的音标网络地址
     */
    private String getSoundUrl(String word) {
        return YD_WORD_SOUND_URL+"?audio="+word+"&type=2";
    }

    /**
     * 得到单词的音标（默认：美音)
     * @param word 要查询的单词
     * @return 获取到的音标
     */
    private String getSoundMark(String word) {
        String soundMark = mDoc.getElementsByClass(mSoundMarkClass).get(1).text();
        return soundMark;
    }

    /**
     * 得到，中文意思的集合
     * @param word 要查询的单词
     * @return 获取到的中文意思集合
     */
    private List<String> getTrans(String word) {
        List<String> trans=new ArrayList<String>();
        Element transContainer = mDoc.getElementsByClass(mTransClass).first();
        Elements transContainerList = transContainer.getElementsByTag("li");
        for (int i = 0; i < transContainerList.size(); i++) {
            Element transItem = transContainerList.get(i);
            trans.add(transItem.text());

        }
        return trans;
    }


}


