package programmers._old;


import java.util.HashSet;
import java.util.Set;

/*
* https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
* 두 개 뽑아서 더하기
* @level : 1
* @desc  : 정수 배열 numbers가 주어집니다.
*          numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
*          더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아
*          return 하도록 solution 함수를 완성해주세요.
* @constraints :
* - numbers의 길이는 2 이상 100 이하입니다.
* - numbers의 모든 수는 0 이상 100 이하입니다.
* */
public class SumTwoNumber {

    public int[] solution(int[] numbers) {
        Set<Integer> answerSet = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1 ; j < numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }

        return answerSet.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }
}