package l8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
/* renamed from: l8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3909b<T> implements Iterator<T> {

    /* renamed from: B, reason: collision with root package name */
    private a f44423B = a.NOT_READY;

    /* renamed from: C, reason: collision with root package name */
    private T f44424C;

    /* compiled from: AbstractIterator.java */
    /* renamed from: l8.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC3909b() {
    }

    private boolean e() {
        this.f44423B = a.FAILED;
        this.f44424C = b();
        if (this.f44423B == a.DONE) {
            return false;
        }
        this.f44423B = a.READY;
        return true;
    }

    protected abstract T b();

    protected final T d() {
        this.f44423B = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m.q(this.f44423B != a.FAILED);
        int iOrdinal = this.f44423B.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return e();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f44423B = a.NOT_READY;
        T t10 = (T) C3917j.a(this.f44424C);
        this.f44424C = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
