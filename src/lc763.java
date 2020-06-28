import java.util.ArrayList;
import java.util.List;

public class lc763 {
    public static void main(String[] args){
        partitionLabels("ababcbacadefegdehijhklij");
    }

    public static List<Integer> partitionLabels(String S) {
        int[] lastPosition = new int[26];
        int n = S.length();
        for(int i=0;i<n;i++){
            lastPosition[S.charAt(i) - 'a'] = i;
        }
        List<Integer> resultList = new ArrayList<>();
        int maxLength = 0;
        int maxPosition = 0;
        for(int i = 0; i<n;i++){
            maxLength = Math.max(maxLength,lastPosition[S.charAt(i) - 'a']);
            if(i == maxLength){
                resultList.add(i - maxPosition + 1);
                maxPosition = i + 1;
            }
        }
        return resultList;
    }
}
