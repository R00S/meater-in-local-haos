package m8;

import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
/* renamed from: m8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3987b<T> extends j0<T> {

    /* renamed from: B, reason: collision with root package name */
    private a f45275B = a.NOT_READY;

    /* renamed from: C, reason: collision with root package name */
    private T f45276C;

    /* compiled from: AbstractIterator.java */
    /* renamed from: m8.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC3987b() {
    }

    private boolean e() {
        this.f45275B = a.FAILED;
        this.f45276C = b();
        if (this.f45275B == a.DONE) {
            return false;
        }
        this.f45275B = a.READY;
        return true;
    }

    protected abstract T b();

    protected final T d() {
        this.f45275B = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l8.m.q(this.f45275B != a.FAILED);
        int iOrdinal = this.f45275B.ordinal();
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
        this.f45275B = a.NOT_READY;
        T t10 = (T) S.a(this.f45276C);
        this.f45276C = null;
        return t10;
    }
}
