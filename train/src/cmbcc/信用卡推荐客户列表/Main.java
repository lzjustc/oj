package src.cmbcc.信用卡推荐客户列表;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                int m = scanner.nextInt();
                int n = scanner.nextInt();
                String[][] arg = new String[m][n+1];
                char[][] chars = new char[m][n+1];
                for(int i=0;i<m;i++){
                    arg[i] = scanner.nextLine().split(" ");
                }
//                solution(chars,m,n);

            }
            scanner.close();
        }
    private static void solution(char [] [] chars,int m, int n){
        char[] name = new char[m];
        for(int i=0;i<m;i++){
            name[i] = chars[i][0];
        }
        HashMap<Character,TreeNode> hashMap = new HashMap<>();
        for(char[] item : chars){
            char node = item[0];
            TreeNode tn;
            if(! hashMap.containsKey(node)){
                hashMap.put(node,new TreeNode(node));
            }
            TreeNode head = hashMap.get(node);
            for(int i=1;i<item.length;i++){
                if(item[i] == '*'){
                    break;
                }
                if(! hashMap.containsKey(item[i])){
                    tn = new TreeNode(item[i]);
                    hashMap.put(item[i],tn);
                }
                head.sons.add(hashMap.get(item[i]));
            }
        }
        StringBuffer sb = new StringBuffer();
        for(TreeNode tn : hashMap.values()){
            if(tn.sons.size() >= n){
                sb.append(tn.name);
                sb.append(" ");
            }
        }
        if(sb.length() == 0)
            System.out.println("None");
        else
            System.out.println(sb.toString().trim());

    }
    static class TreeNode{
        char name;
        HashSet<TreeNode> sons;

        public TreeNode(char name) {
            this.name = name;
            sons = new HashSet<>();
        }
    }
}
