package com.sunny.mywords.network;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/4.
 */

public class HttpClient {

    public Document get(String url) throws IOException {


        return Jsoup.connect(url).url(url).get();
    }

    public Document get(String url, Map<String, String> param) throws IOException {

        return Jsoup.connect(url).url(url).data(param).get();
    }

    public Document post(String url) throws IOException {

        return Jsoup.connect(url).url(url).post();
    }

    public Document post(String url, Map<String, String> param) throws IOException {

        return Jsoup.connect(url).url(url).data(param).post();
    }
}
