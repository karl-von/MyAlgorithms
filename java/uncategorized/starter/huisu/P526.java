package uncategorized.starter.huisu;

import java.util.ArrayList;
import java.util.List;

public class P526 {
    List<String> list = new ArrayList<>();
    int result = 0;
    public int countArrangement(int n) {
        boolean[] b = new boolean[n+1];
        dfs(n,1,b);
        return result;
    }
    private void dfs(int n, int index, boolean[] b){
        if(index > n){
            result++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if((b[i]) || (index % i==0 || i % index == 0)){
                continue;
            }
            b[i]=true;
            dfs(n,index,b);
            b[i]=false;
        }
    }
}
