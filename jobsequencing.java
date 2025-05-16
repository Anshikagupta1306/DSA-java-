import java.util.*;
public class jobsequencing {
    static class job {
      int id,deadline,profit;
      public job(int id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
      }
    }
      public static void main(String[] args) {
        int jobsinfo[][]={{4,3},{1,10},{1,40},{1,30}};
        ArrayList<job>jobs=new ArrayList<>();
        for(int i=0;i<jobsinfo.length;i++){
            jobs.add(new job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
      }        
}
