package Ha;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.J;

/* compiled from: ProgressionIterators.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"LHa/e;", "Lkotlin/collections/J;", "", "first", "last", "step", "<init>", "(III)V", "", "hasNext", "()Z", "b", "()I", "B", "I", "getStep", "C", "finalElement", "D", "Z", "E", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends J {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int finalElement;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int next;

    public e(int i10, int i11, int i12) {
        this.step = i12;
        this.finalElement = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.hasNext = z10;
        this.next = z10 ? i10 : i11;
    }

    @Override // kotlin.collections.J
    public int b() {
        int i10 = this.next;
        if (i10 != this.finalElement) {
            this.next = this.step + i10;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }
}
