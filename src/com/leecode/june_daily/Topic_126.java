package com.leecode.june_daily;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 给定两个单词（beginWord 和 endWord）和一个字典 wordList，找出所有从 beginWord 到 endWord 的最短转换序列。转换需遵循如下规则：
 *
 * 每次转换只能改变一个字母。
 * 转换过程中的中间单词必须是字典中的单词。
 *
 * 输入:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * 输出:
 * [
 *   ["hit","hot","dot","dog","cog"],
 *   ["hit","hot","lot","log","cog"]
 * ]
 */

/**
 * Date:2020/06/07
 */
public class Topic_126 {

    /**
     * 题解一
     * 使用递归算法，找出所有满足条件的序列
     * 最后再筛出最短的序列
     * 此方法答案正确，但是提交时有超时的情况
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        find(beginWord,endWord,wordList,new ArrayList<>(),result);
        int min=0;
        for (int i = 0; i < result.size(); i++) {
            if (i==0){
                min = result.get(0).size();
                continue;
            }
            min = min<result.get(i).size()?min:result.get(i).size();
        }
        Iterator<List<String>> iterator = result.iterator();
        while(iterator.hasNext()){
            List<String> list = iterator.next();
            if (list.size()>min){
                iterator.remove();
            }
        }
        return result;
    }

    public void find(String current,String endWord,List<String> wordList,List<String> temp,List<List<String>> result){
        if (current.equals(endWord)){
            temp.add(current);
            result.add(temp);

        } else {
            for (int i = 0;i<wordList.size();i++) {
                if (checkWord(current, wordList.get(i)) == 1&&!temp.contains(wordList.get(i))) {
                    temp.add(current);
                    List<String> list = new ArrayList<>();
                    list.addAll(temp);
                    find(wordList.get(i), endWord, wordList, list, result);
                    temp.remove(current);
                }
            }
        }
    }

    public int checkWord(String word1,String word2){
        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i)!=word2.charAt(i))
                count++;
        }
        return count;
    }


    public List<List<String>> findLadders2(String beginWord, String endWord, List<String> wordList) {

        return null;
    }
}
