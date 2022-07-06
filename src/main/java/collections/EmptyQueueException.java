package collections;

public class EmptyQueueException extends RuntimeException {
 public EmptyQueueException(){
     super("Queue is empty. Haven't got people to service. ");
 }
}
