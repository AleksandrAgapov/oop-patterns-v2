package patterns.behavioral.pubsub.task.pubsub;

public interface Publisher {
    void notifySubscribers(Video video,String masseg);

    void addSubscriber(Listener listener);

    void removeSubscriber(Listener listener);

}
