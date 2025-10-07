class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] car = new double[position.length][2];
        for(int i=0;i<position.length;i++){
            car[i][0] = position[i];
            car[i][1] = (double)(target-position[i])/speed[i];
        }
        Arrays.sort(car, (a,b)-> Double.compare(b[0],a[0]));

        Stack<Double> carFleet = new Stack<>();
        for(int k=0;k<position.length;k++){
            if(carFleet.isEmpty() || car[k][1]>carFleet.peek()){
                carFleet.push(car[k][1]);
            }
        }
        return carFleet.size();
    }
}