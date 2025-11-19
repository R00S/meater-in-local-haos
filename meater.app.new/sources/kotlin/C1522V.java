package kotlin;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Stack.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\rR\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"LO/V;", "", "<init>", "()V", "", "value", "Loa/F;", "j", "(I)V", "i", "()I", "default", "h", "(I)I", "e", "g", "index", "f", "", "d", "()Z", "a", "c", "", "[I", "slots", "b", "I", "tos", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1522V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] slots = new int[10];

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int tos;

    public final void a() {
        this.tos = 0;
    }

    /* renamed from: b, reason: from getter */
    public final int getTos() {
        return this.tos;
    }

    public final int c(int value) {
        int i10 = this.tos;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.slots[i11] == value) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.tos == 0;
    }

    public final int e() {
        return this.slots[this.tos - 1];
    }

    public final int f(int index) {
        return this.slots[index];
    }

    public final int g() {
        return this.slots[this.tos - 2];
    }

    public final int h(int i10) {
        return this.tos > 0 ? e() : i10;
    }

    public final int i() {
        int[] iArr = this.slots;
        int i10 = this.tos - 1;
        this.tos = i10;
        return iArr[i10];
    }

    public final void j(int value) {
        int i10 = this.tos;
        int[] iArr = this.slots;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.slots = iArrCopyOf;
        }
        int[] iArr2 = this.slots;
        int i11 = this.tos;
        this.tos = i11 + 1;
        iArr2[i11] = value;
    }
}
