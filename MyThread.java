class SleepDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Thread is sleeping");
            Thread.sleep(2000);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}