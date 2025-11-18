package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: SynchronizedCollection.java */
/* renamed from: io.sentry.l5 */
/* loaded from: classes2.dex */
class C9507l5<E> implements Collection<E>, Serializable {

    /* renamed from: f */
    private final Collection<E> f36461f;

    /* renamed from: g */
    final Object f36462g;

    C9507l5(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f36461f = collection;
        this.f36462g = this;
    }

    @Override // java.util.Collection
    public boolean add(E e2) {
        boolean zAdd;
        synchronized (this.f36462g) {
            zAdd = mo31013c().add(e2);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.f36462g) {
            zAddAll = mo31013c().addAll(collection);
        }
        return zAddAll;
    }

    /* renamed from: c */
    protected Collection<E> mo31013c() {
        return this.f36461f;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f36462g) {
            mo31013c().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f36462g) {
            zContains = mo31013c().contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean zContainsAll;
        synchronized (this.f36462g) {
            zContainsAll = mo31013c().containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f36462g) {
            zIsEmpty = mo31013c().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return mo31013c().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f36462g) {
            zRemove = mo31013c().remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll;
        synchronized (this.f36462g) {
            zRemoveAll = mo31013c().removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll;
        synchronized (this.f36462g) {
            zRetainAll = mo31013c().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f36462g) {
            size = mo31013c().size();
        }
        return size;
    }

    public String toString() {
        String string;
        synchronized (this.f36462g) {
            string = mo31013c().toString();
        }
        return string;
    }
}
