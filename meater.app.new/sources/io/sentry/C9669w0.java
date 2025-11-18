package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* compiled from: CircularFifoQueue.java */
/* renamed from: io.sentry.w0 */
/* loaded from: classes2.dex */
final class C9669w0<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* renamed from: f */
    private transient E[] f36993f;

    /* renamed from: g */
    private transient int f36994g;

    /* renamed from: h */
    private transient int f36995h;

    /* renamed from: i */
    private transient boolean f36996i;

    /* renamed from: j */
    private final int f36997j;

    /* compiled from: CircularFifoQueue.java */
    /* renamed from: io.sentry.w0$a */
    class a implements Iterator<E> {

        /* renamed from: f */
        private int f36998f;

        /* renamed from: g */
        private int f36999g = -1;

        /* renamed from: h */
        private boolean f37000h;

        a() {
            this.f36998f = C9669w0.this.f36994g;
            this.f37000h = C9669w0.this.f36996i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37000h || this.f36998f != C9669w0.this.f36995h;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f37000h = false;
            int i2 = this.f36998f;
            this.f36999g = i2;
            this.f36998f = C9669w0.this.m31927t(i2);
            return (E) C9669w0.this.f36993f[this.f36999g];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i2 = this.f36999g;
            if (i2 == -1) {
                throw new IllegalStateException();
            }
            if (i2 == C9669w0.this.f36994g) {
                C9669w0.this.remove();
                this.f36999g = -1;
                return;
            }
            int iM31927t = this.f36999g + 1;
            if (C9669w0.this.f36994g >= this.f36999g || iM31927t >= C9669w0.this.f36995h) {
                while (iM31927t != C9669w0.this.f36995h) {
                    if (iM31927t >= C9669w0.this.f36997j) {
                        C9669w0.this.f36993f[iM31927t - 1] = C9669w0.this.f36993f[0];
                        iM31927t = 0;
                    } else {
                        C9669w0.this.f36993f[C9669w0.this.m31926s(iM31927t)] = C9669w0.this.f36993f[iM31927t];
                        iM31927t = C9669w0.this.m31927t(iM31927t);
                    }
                }
            } else {
                System.arraycopy(C9669w0.this.f36993f, iM31927t, C9669w0.this.f36993f, this.f36999g, C9669w0.this.f36995h - iM31927t);
            }
            this.f36999g = -1;
            C9669w0 c9669w0 = C9669w0.this;
            c9669w0.f36995h = c9669w0.m31926s(c9669w0.f36995h);
            C9669w0.this.f36993f[C9669w0.this.f36995h] = null;
            C9669w0.this.f36996i = false;
            this.f36998f = C9669w0.this.m31926s(this.f36998f);
        }
    }

    public C9669w0() {
        this(32);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f36993f = (E[]) new Object[this.f36997j];
        int i2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            ((E[]) this.f36993f)[i3] = objectInputStream.readObject();
        }
        this.f36994g = 0;
        boolean z = i2 == this.f36997j;
        this.f36996i = z;
        if (z) {
            this.f36995h = 0;
        } else {
            this.f36995h = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public int m31926s(int i2) {
        int i3 = i2 - 1;
        return i3 < 0 ? this.f36997j - 1 : i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public int m31927t(int i2) {
        int i3 = i2 + 1;
        if (i3 >= this.f36997j) {
            return 0;
        }
        return i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (m31928u()) {
            remove();
        }
        E[] eArr = this.f36993f;
        int i2 = this.f36995h;
        int i3 = i2 + 1;
        this.f36995h = i3;
        eArr[i2] = e2;
        if (i3 >= this.f36997j) {
            this.f36995h = 0;
        }
        if (this.f36995h == this.f36994g) {
            this.f36996i = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f36996i = false;
        this.f36994g = 0;
        this.f36995h = 0;
        Arrays.fill(this.f36993f, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        return add(e2);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f36993f[this.f36994g];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f36993f;
        int i2 = this.f36994g;
        E e2 = eArr[i2];
        if (e2 != null) {
            int i3 = i2 + 1;
            this.f36994g = i3;
            eArr[i2] = null;
            if (i3 >= this.f36997j) {
                this.f36994g = 0;
            }
            this.f36996i = false;
        }
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i2 = this.f36995h;
        int i3 = this.f36994g;
        if (i2 < i3) {
            return (this.f36997j - i3) + i2;
        }
        if (i2 != i3) {
            return i2 - i3;
        }
        if (this.f36996i) {
            return this.f36997j;
        }
        return 0;
    }

    /* renamed from: u */
    public boolean m31928u() {
        return size() == this.f36997j;
    }

    C9669w0(int i2) {
        this.f36994g = 0;
        this.f36995h = 0;
        this.f36996i = false;
        if (i2 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i2];
        this.f36993f = eArr;
        this.f36997j = eArr.length;
    }
}
