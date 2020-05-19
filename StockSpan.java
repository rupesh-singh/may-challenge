class StockSpanner {
    List<Integer> StockPrices;
    public StockSpanner() {
        StockPrices = new ArrayList<Integer>();
    }
    
    public int next(int price) {
        int count=0;
        StockPrices.add(price);
        for(int i=StockPrices.size()-1;i>=0;i--){
            if(StockPrices.get(i)<=price)
                count++;
            else if(StockPrices.get(i)>price)
                break;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */