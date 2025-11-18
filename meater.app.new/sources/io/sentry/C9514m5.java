package io.sentry;

import java.util.Queue;

/* compiled from: SynchronizedQueue.java */
/* renamed from: io.sentry.m5 */
/* loaded from: classes2.dex */
final class C9514m5<E> extends C9507l5<E> implements Queue<E> {
    private C9514m5(Queue<E> queue) {
        super(queue);
    }

    /* renamed from: g */
    static <E> C9514m5<E> m31068g(Queue<E> queue) {
        return new C9514m5<>(queue);
    }

    @Override // java.util.Queue
    public E element() {
        E eElement;
        synchronized (this.f36462g) {
            eElement = mo31013c().element();
        }
        return eElement;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f36462g) {
            zEquals = mo31013c().equals(obj);
        }
        return zEquals;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.C9507l5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Queue<E> mo31013c() {
        return (Queue) super.mo31013c();
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f36462g) {
            iHashCode = mo31013c().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        boolean zOffer;
        synchronized (this.f36462g) {
            zOffer = mo31013c().offer(e2);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public E peek() {
        E ePeek;
        synchronized (this.f36462g) {
            ePeek = mo31013c().peek();
        }
        return ePeek;
    }

    @Override // java.util.Queue
    public E poll() {
        E ePoll;
        synchronized (this.f36462g) {
            ePoll = mo31013c().poll();
        }
        return ePoll;
    }

    @Override // java.util.Queue
    public E remove() {
        E eRemove;
        synchronized (this.f36462g) {
            eRemove = mo31013c().remove();
        }
        return eRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f36462g) {
            array = mo31013c().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f36462g) {
            tArr2 = (T[]) mo31013c().toArray(tArr);
        }
        return tArr2;
    }
}
