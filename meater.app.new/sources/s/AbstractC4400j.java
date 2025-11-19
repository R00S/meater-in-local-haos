package s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import t.C4535d;

/* compiled from: IndexBasedArrayIterator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ls/j;", "T", "", "", "startingSize", "<init>", "(I)V", "index", "b", "(I)Ljava/lang/Object;", "Loa/F;", "d", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "()V", "B", "I", "size", "C", "D", "Z", "canRemove", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4400j<T> implements Iterator<T>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean canRemove;

    public AbstractC4400j(int i10) {
        this.size = i10;
    }

    protected abstract T b(int index);

    protected abstract void d(int index);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tB = b(this.index);
        this.index++;
        this.canRemove = true;
        return tB;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            C4535d.b("Call next() before removing an element.");
        }
        int i10 = this.index - 1;
        this.index = i10;
        d(i10);
        this.size--;
        this.canRemove = false;
    }
}
