import java.util.*;
public class stocksdaydiff {
static class stock{
    int maxprofit;
    int buyday;
    int sellday;
    public stock(int maxprofit,int buyday,int sellday){
        this.maxprofit=maxprofit;
        this.buyday=buyday;
        this.sellday=sellday;
    }
}
public static stock getprofit(int prices[],int fees){
    int n=prices.length;
    if(n==0){
        return new stock(0, -1, -1);
    }
    int hold=-prices[0];
    int cash=0;
    int bestbuyday=0;
    int bestsellday=0;
    int maxprofit=0;
    int buyday=0;
    for(int i=1;i<n;i++){
        if(cash - prices[i]>hold){
            hold=cash-prices[i];
            buyday=i;
        }
        if(hold+prices[i]-fees>cash){
            cash=hold+prices[i]-fees;
            bestbuyday=buyday;
            bestsellday=i;
            maxprofit=cash;
        }
    }
    return new stock(maxprofit, bestbuyday, bestsellday);
}
    public static void main(String[] args) {
        int prices[]={6,1,7,2,8,4};
        int fee=2;
        stock result=getprofit(prices, fee);
        System.out.print(result.maxprofit+" ");
        System.out.print(result.sellday-result.buyday);
    }
}
