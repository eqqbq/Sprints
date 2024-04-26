package Sprint3.Tasca_S3_02_Nivell1;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void listObserver();
    void notifyObservers();
}
