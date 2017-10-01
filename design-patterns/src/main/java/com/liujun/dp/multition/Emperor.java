package com.liujun.dp.multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * 皇帝
 * Created by liujun on 2017-5-9.
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList<String> emperorInfoList = new ArrayList<String>(maxNumOfEmperor);
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>(maxNumOfEmperor);

    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("第" + (i + 1) + "个皇帝"));
        }
    }

    private Emperor() {

    }

    private Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance () {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
