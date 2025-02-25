package Exercicios;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        for (int i=0;i<this.birdsPerDay.length;i++){
            this.birdsPerDay[i]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int v:this.birdsPerDay){
            if (v==0){
                return true;
            }
        } return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int length;
        if (numberOfDays <= this.birdsPerDay.length){
            length = numberOfDays;
        } else {
            length = this.birdsPerDay.length;
        }
        for (int i=0;i<length;i++){
            sum += this.birdsPerDay[i];
        } return sum;
    }



    public int getBusyDays() {
        int tot = 0;
        for(int v:this.birdsPerDay){
            if(v>=5){
                tot++;
            }
        } return tot;
    }
}
