package uncategorized.starter.huisu;

public class P51 {
    int max = -1;
    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        int length = cookbooks.length;
        boolean[] exists = new boolean[cookbooks.length];
        dfs(materials,cookbooks,attribute,limit,0,0,exists);
        return max;
    }
    void dfs(int[] materials, int[][] cookbooks, int[][] attribute, int limit, int bao, int mei, boolean[] exists){
        if(bao <= 0){
            max = Math.max(max,mei);
        }
        boolean can = true;
        for (int i = 0; i < cookbooks.length; i++) {
            if(exists[i]){
                continue;
            }
            int[] need = cookbooks[i];
            for(int j = 0; j < need.length; j++){
                if(materials[j] < need[j]){
                    can = false;
                    break;
                }
            }

            if(can){
                exists[i] = true;
                for (int j = 0; j < need.length; j++) {
                    materials[j] -= need[j];
                }
                dfs(materials, cookbooks, attribute, limit, bao + attribute[i][1], mei + attribute[i][0], exists);
                for (int j = 0; j < need.length; j++) {
                    materials[j] += need[j];
                }
                exists[i] = false;
            }
            }
        }
    }

