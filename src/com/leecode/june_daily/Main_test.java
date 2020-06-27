package com.leecode.june_daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.leecode.june_daily.Topic_297.TreeNode;

public class Main_test {

    public static void main(String[] args) {
        //test_topic_128();
        //test_Topic_126();
        //test_topic_990();
        //System.out.println(new Interview_46().translateNum(12));
        //System.out.println(new Topic_9().isPalindrome(1221));
        //test_topic_739();
        //test_topic_1300();
        //tes_topic_297();
        //System.out.println(new Topic_1014().maxScoreSightseeingPair(new int[]{8,1,5,2,6}));
        //test_topic_124();
        //test_interview_16_18();
        //test_topic_67();
        //test_topic_139();
        int[] nums = {7,8,9,11,12};
        System.out.println(new Topic_41().firstMissingPositive(nums));


    }

    private static void test_topic_139() {
        String s = "bb";
        List<String> word = new ArrayList<>();
        word.add("a");
        word.add("b");
        word.add("bbb");
        word.add("bbbb");
        System.out.println(new Topic_139().wordBreak(s,word));
    }

    private static void test_topic_67() {
        String a = "1";
        String b = "1";
        System.out.println(new Topic_67().addBinary(a,b));
    }

    private static void test_interview_16_18() {
        String pattren = "abb",value = "dogcatcatdog";
        System.out.println(new Interview_16_18().patternMatching(pattren,value));
    }

    private static void test_topic_124() {
        Topic_124.TreeNode root = new Topic_124.TreeNode(5);
        root.left = new Topic_124.TreeNode(9);
        Topic_124.TreeNode a = new Topic_124.TreeNode(10);
        a.left = new Topic_124.TreeNode(15);
        a.right = new Topic_124.TreeNode(7);
        root.right = a;
        System.out.println(new Topic_124().maxPathSum(root));
    }

    private static void tes_topic_297() {
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
