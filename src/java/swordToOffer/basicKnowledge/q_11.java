package swordToOffer.basicKnowledge;


// 旋转数组的最小数字
public class q_11 {
    public static void main(String[] args) {

    }

    // 给定数组范围
    // TODO bad solution
    private int Min(int[] numbers, int length) {
        if(numbers == null && length <= 0 && length > numbers.length)
            throw new IllegalArgumentException("args illegal");

        int index1 = 0;
        int index2 = length - 1;
        int indexMid = index1;

        while (numbers[index1] >= numbers[index2])
        {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }

            indexMid = index1 + ((index2 - index1) >> 2);
            if (numbers[indexMid] >= numbers[index1])
                index1 = indexMid;

            else if (numbers[indexMid] <= numbers[index2])
                index2 = indexMid;
        }

        return numbers[indexMid];
    }
}
