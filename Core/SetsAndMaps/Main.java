package Core.SetsAndMaps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>(List.of(2, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> stringList = new ArrayList<>(List.of("good", "false", "false", "not", "asd", "asd", "asd"));
        taskFirst(numbersList);
        taskSecond(numbersList);
        taskThird(stringList);
        taskFourth(stringList);

    }
    public static void taskFirst(List<Integer> numbersList){
        String result = "";
        for (Integer integer : numbersList) {
            if (integer % 2 != 0) {
                result = result + integer + " ";
            }
        }
        System.out.println(result);
    }

    public static void taskSecond(List<Integer> numbersList){
        Set<Integer> result = new HashSet<>();
        for (Integer integer : numbersList) {
            if (integer % 2 == 0) {
                result.add(integer);
            }
        }
        System.out.println(result);
    }

    public static void taskThird(List<String> stringList){
        Set<String> result = new HashSet<>(stringList);
        System.out.println(result);
    }

    public static void taskFourth(List<String> stringList){
        Map<String,Integer> result = new HashMap<>();

        for (String string : stringList) {
            if (result.containsKey(string)) {
                result.put(string, result.get(string) + 1);
            }
            result.putIfAbsent(string, 1);
        }

        Integer cnt = countValueNotOne(result.values());
        System.out.println(cnt);
    }

    private static Integer countValueNotOne(Collection<Integer> values){
        int cnt = 0;
        for (Integer value : values) {
            if (value > 1) {
                cnt += value;
            }
        }
        return cnt;
    }
}
