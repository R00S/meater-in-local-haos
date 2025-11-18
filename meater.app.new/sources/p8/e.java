package p8;

import java.io.Serializable;
import java.util.Arrays;
import l8.m;

/* compiled from: ImmutableIntArray.java */
/* loaded from: classes2.dex */
public final class e implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private static final e f47661E = new e(new int[0]);

    /* renamed from: B, reason: collision with root package name */
    private final int[] f47662B;

    /* renamed from: C, reason: collision with root package name */
    private final transient int f47663C;

    /* renamed from: D, reason: collision with root package name */
    private final int f47664D;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e a(int[] iArr) {
        return iArr.length == 0 ? f47661E : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public static e e() {
        return f47661E;
    }

    public int b(int i10) {
        m.j(i10, d());
        return this.f47662B[this.f47663C + i10];
    }

    public boolean c() {
        return this.f47664D == this.f47663C;
    }

    public int d() {
        return this.f47664D - this.f47663C;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (d() != eVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (b(i10) != eVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iH = 1;
        for (int i10 = this.f47663C; i10 < this.f47664D; i10++) {
            iH = (iH * 31) + f.h(this.f47662B[i10]);
        }
        return iH;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(d() * 5);
        sb2.append('[');
        sb2.append(this.f47662B[this.f47663C]);
        int i10 = this.f47663C;
        while (true) {
            i10++;
            if (i10 >= this.f47664D) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f47662B[i10]);
        }
    }

    private e(int[] iArr, int i10, int i11) {
        this.f47662B = iArr;
        this.f47663C = i10;
        this.f47664D = i11;
    }
}
