package org.example;

import org.example.game.Window;
import org.example.utils.HttpClientUtil;

public class Main {
    public static void main(String[] args) {
        HttpClientUtil.getVerifiedUserKey();
        new Window();
    }
}