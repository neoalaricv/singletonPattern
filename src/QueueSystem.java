public class QueueSystem {
    private static QueueSystem instance;
    private int queueNumber;

    private QueueSystem() {
        queueNumber = 0;
    }

    public static QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        return ++queueNumber;
    }

    public synchronized void resetQueueNumber(int number) {
        queueNumber = number;
    }
}