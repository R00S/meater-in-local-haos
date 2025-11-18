package v0;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u0.C4659y;

/* compiled from: PointerIdArray.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\fJ\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\fJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\fR$\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lv0/b;", "", "<init>", "()V", "", "index", "Lu0/y;", "e", "(I)J", "pointerId", "", "i", "(J)Z", "", "pointerIdValue", "h", "j", "(I)Z", "g", "()Z", "value", "a", "b", "Loa/F;", "k", "(IJ)V", "c", "d", "<set-?>", "I", "f", "()I", "size", "", "[J", "internalArray", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4790b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long[] internalArray = new long[2];

    public final boolean a(long value) {
        if (d(value)) {
            return false;
        }
        k(this.size, value);
        return true;
    }

    public final boolean b(long pointerId) {
        return a(pointerId);
    }

    public final void c() {
        this.size = 0;
    }

    public final boolean d(long pointerIdValue) {
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.internalArray[i11] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    public final long e(int index) {
        return C4659y.b(this.internalArray[index]);
    }

    /* renamed from: f, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean g() {
        return this.size == 0;
    }

    public final boolean h(long pointerIdValue) {
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (pointerIdValue == e(i11)) {
                j(i11);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long pointerId) {
        return h(pointerId);
    }

    public final boolean j(int index) {
        int i10 = this.size;
        if (index >= i10) {
            return false;
        }
        int i11 = i10 - 1;
        while (index < i11) {
            long[] jArr = this.internalArray;
            int i12 = index + 1;
            jArr[index] = jArr[i12];
            index = i12;
        }
        this.size--;
        return true;
    }

    public final void k(int index, long value) {
        long[] jArr = this.internalArray;
        if (index >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(index + 1, jArr.length * 2));
            C3862t.f(jArrCopyOf, "copyOf(this, newSize)");
            this.internalArray = jArrCopyOf;
        }
        this.internalArray[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }
}
