package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: AbstractIterator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/collections/b;", "T", "", "<init>", "()V", "", "h", "()Z", "hasNext", "next", "()Ljava/lang/Object;", "Loa/F;", "b", "value", "g", "(Ljava/lang/Object;)V", "d", "", "B", "I", "state", "C", "Ljava/lang/Object;", "nextValue", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3821b<T> implements Iterator<T>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private T nextValue;

    private final boolean h() {
        this.state = 3;
        b();
        return this.state == 1;
    }

    protected abstract void b();

    protected final void d() {
        this.state = 2;
    }

    protected final void g(T value) {
        this.nextValue = value;
        this.state = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.state;
        if (i10 == 0) {
            return h();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.state;
        if (i10 == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i10 == 2 || !h()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        return this.nextValue;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
