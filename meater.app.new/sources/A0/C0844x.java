package A0;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;

/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0016J-\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u0006,"}, d2 = {"LA0/x;", "", "", "initialCapacity", "<init>", "(I)V", "start", "end", "elSize", "Loa/F;", "i", "(III)V", "e", "(III)I", "j", "k", "(II)V", "a", "b", "", "(II)Z", "index", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "h", "(IIII)V", "x", "y", "size", "g", "f", "()I", "d", "()Z", "()V", "", "[I", "stack", "I", "lastIndex", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0844x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] stack;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastIndex;

    public C0844x(int i10) {
        this.stack = new int[i10];
    }

    private final boolean a(int a10, int b10) {
        int[] iArr = this.stack;
        int i10 = iArr[a10];
        int i11 = iArr[b10];
        if (i10 >= i11) {
            return i10 == i11 && iArr[a10 + 1] <= iArr[b10 + 1];
        }
        return true;
    }

    private final int e(int start, int end, int elSize) {
        int i10 = start - elSize;
        while (start < end) {
            if (a(start, end)) {
                i10 += elSize;
                k(i10, start);
            }
            start += elSize;
        }
        int i11 = i10 + elSize;
        k(i11, end);
        return i11;
    }

    private final void i(int start, int end, int elSize) {
        if (start < end) {
            int iE = e(start, end, elSize);
            i(start, iE - elSize, elSize);
            i(iE + elSize, end, elSize);
        }
    }

    private final void k(int i10, int j10) {
        int[] iArr = this.stack;
        Y.i(iArr, i10, j10);
        Y.i(iArr, i10 + 1, j10 + 1);
        Y.i(iArr, i10 + 2, j10 + 2);
    }

    public final int b(int index) {
        return this.stack[index];
    }

    /* renamed from: c, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean d() {
        return this.lastIndex != 0;
    }

    public final int f() {
        int[] iArr = this.stack;
        int i10 = this.lastIndex - 1;
        this.lastIndex = i10;
        return iArr[i10];
    }

    public final void g(int x10, int y10, int size) {
        int i10 = this.lastIndex;
        int i11 = i10 + 3;
        int[] iArr = this.stack;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i10] = x10 + size;
        iArr2[i10 + 1] = y10 + size;
        iArr2[i10 + 2] = size;
        this.lastIndex = i11;
    }

    public final void h(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i10 = this.lastIndex;
        int i11 = i10 + 4;
        int[] iArr = this.stack;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i10] = oldStart;
        iArr2[i10 + 1] = oldEnd;
        iArr2[i10 + 2] = newStart;
        iArr2[i10 + 3] = newEnd;
        this.lastIndex = i11;
    }

    public final void j() {
        int i10 = this.lastIndex;
        if (!(i10 % 3 == 0)) {
            C5047a.b("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }
}
