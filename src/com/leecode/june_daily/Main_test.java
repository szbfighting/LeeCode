package com.leecode.june_daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_test {

    public static void main(String[] args) {
        //test_topic_128();
        //test_Topic_126();
        //test_topic_990();
        //System.out.println(new Interview_46().translateNum(12));
        //System.out.println(new Topic_9().isPalindrome(1221));
        //test_topic_739();
        //test_topic_1300();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        right.left = new TreeNode(4);
        right.right = new TreeNode(5);
        root.left = left;
        root.right = right;
        String s = new Topic_297().serialize(root);
        System.out.println(s);
        TreeNode node = new Topic_297().deserialize(s);
        System.out.println(new Topic_297().serialize(node));
    }

    private static void test_topic_1300() {
        int[] arr = {1547,83230,57084,93444,70879
        };
        System.out.println(new Topic_1300().findBestValue(arr,71237));
    }

    private static void test_topic_739() {
        int[] T= {73,74,75,71,69,72,76,73};
        T = new Topic_739().dailyTemperatures(T);
        for (int i = 0; i < T.length; i++) {
            System.out.println(T[i]);
        }
    }

    private static void test_topic_990() {
        String[] test = {
                "a==b",
                "b!=c",
                "c==a"
        };
        System.out.println(new Topic_990().equationsPossible(test));
    }

    private static void test_Topic_126() {
        String beginWord = "hit",endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        List<List<String>> lists = new Topic_126().findLadders(beginWord,endWord,wordList);
        for (int i = 0; i < lists.size(); i++) {
            List<String> list = lists.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }

    private static void test_topic_128() {
        int[] nums = {100,4,200,5,3,2,1};
        int i = new Topic_128().longestConsecutive2(nums);
        System.out.println("maxlength = "+i);
    }
}
