public class Main {
    public static void main(String[] args) {
        QueueSystem queueSystem = QueueSystem.getInstance();

        System.out.println("Current queue number: " + queueSystem.getNextQueueNumber());
        System.out.println("Resetting queue number to 100...");

        queueSystem.resetQueueNumber(100);

        System.out.println("Current queue number after reset: " + queueSystem.getNextQueueNumber());
    }
}