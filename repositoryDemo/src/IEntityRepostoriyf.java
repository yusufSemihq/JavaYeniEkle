public interface IEntityRepostoriyf<C extends IEntity> {

    void add(Object entity);

    void delete(Object entity);

    void update(Object entity);
}
