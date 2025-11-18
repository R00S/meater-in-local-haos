package kotlin;

import Ba.l;
import Q.b;
import kotlin.InterfaceC0966d;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: IntervalList.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u000b0\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\tR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u0011\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001d\u0010\"R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006%"}, d2 = {"LC/G;", "T", "LC/d;", "<init>", "()V", "", "itemIndex", "LC/d$a;", "f", "(I)LC/d$a;", "index", "Loa/F;", "d", "(I)V", "", "e", "(LC/d$a;I)Z", "size", "value", "c", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "b", "(IILBa/l;)V", "get", "LQ/b;", "a", "LQ/b;", "intervals", "<set-?>", "I", "()I", "LC/d$a;", "lastInterval", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G<T> implements InterfaceC0966d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<InterfaceC0966d.a<T>> intervals = new b<>(new InterfaceC0966d.a[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC0966d.a<? extends T> lastInterval;

    private final void d(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + getSize());
        }
    }

    private final boolean e(InterfaceC0966d.a<? extends T> aVar, int i10) {
        return i10 < aVar.getStartIndex() + aVar.getSize() && aVar.getStartIndex() <= i10;
    }

    private final InterfaceC0966d.a<T> f(int itemIndex) {
        InterfaceC0966d.a<? extends T> aVar = this.lastInterval;
        if (aVar != null && e(aVar, itemIndex)) {
            return aVar;
        }
        b<InterfaceC0966d.a<T>> bVar = this.intervals;
        InterfaceC0966d.a aVar2 = (InterfaceC0966d.a<? extends T>) bVar.t()[e.b(bVar, itemIndex)];
        this.lastInterval = aVar2;
        return aVar2;
    }

    @Override // kotlin.InterfaceC0966d
    /* renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.InterfaceC0966d
    public void b(int fromIndex, int toIndex, l<? super InterfaceC0966d.a<? extends T>, C4153F> block) {
        d(fromIndex);
        d(toIndex);
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException(("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + ')').toString());
        }
        int iB = e.b(this.intervals, fromIndex);
        int startIndex = this.intervals.t()[iB].getStartIndex();
        while (startIndex <= toIndex) {
            InterfaceC0966d.a<T> aVar = this.intervals.t()[iB];
            block.invoke(aVar);
            startIndex += aVar.getSize();
            iB++;
        }
    }

    public final void c(int size, T value) {
        if (size < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + size).toString());
        }
        if (size == 0) {
            return;
        }
        InterfaceC0966d.a<T> aVar = new InterfaceC0966d.a<>(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.c(aVar);
    }

    @Override // kotlin.InterfaceC0966d
    public InterfaceC0966d.a<T> get(int index) {
        d(index);
        return f(index);
    }
}
