package m8;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: ForwardingCollection.java */
/* loaded from: classes2.dex */
public abstract class r<E> extends AbstractC4004t implements Collection<E> {
    protected r() {
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        return h().add(e10);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return h().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        h().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return h().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return h().containsAll(collection);
    }

    protected abstract Collection<E> h();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return h().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return h().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return h().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return h().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return h().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return h().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return h().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) h().toArray(tArr);
    }
}
