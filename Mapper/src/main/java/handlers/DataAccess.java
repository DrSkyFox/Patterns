package handlers;

public interface DataAccess<T> {
    T get(Long id);
    T getAll();
    void delete(Long id);
    void save(T t);
}
