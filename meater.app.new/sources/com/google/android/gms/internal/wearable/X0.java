package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class X0 extends E implements RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final Object[] f34539E;

    /* renamed from: F, reason: collision with root package name */
    private static final X0 f34540F;

    /* renamed from: C, reason: collision with root package name */
    private Object[] f34541C;

    /* renamed from: D, reason: collision with root package name */
    private int f34542D;

    static {
        Object[] objArr = new Object[0];
        f34539E = objArr;
        f34540F = new X0(objArr, 0, false);
    }

    X0() {
        this(f34539E, 0, true);
    }

    public static X0 f() {
        return f34540F;
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34542D;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f34542D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2687q0
    public final /* bridge */ /* synthetic */ InterfaceC2687q0 C(int i10) {
        if (i10 >= this.f34542D) {
            return new X0(i10 == 0 ? f34539E : Arrays.copyOf(this.f34541C, i10), this.f34542D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f34542D)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f34541C;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[i(length)];
            System.arraycopy(this.f34541C, 0, objArr2, 0, i10);
            System.arraycopy(this.f34541C, i10, objArr2, i12, this.f34542D - i10);
            this.f34541C = objArr2;
        }
        this.f34541C[i10] = obj;
        this.f34542D++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        r(i10);
        return this.f34541C[i10];
    }

    final void h(int i10) {
        int length = this.f34541C.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f34541C = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = i(length);
        }
        this.f34541C = Arrays.copyOf(this.f34541C, length);
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        r(i10);
        Object[] objArr = this.f34541C;
        Object obj = objArr[i10];
        if (i10 < this.f34542D - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f34542D--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        r(i10);
        Object[] objArr = this.f34541C;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34542D;
    }

    private X0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f34541C = objArr;
        this.f34542D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f34542D;
        int length = this.f34541C.length;
        if (i10 == length) {
            this.f34541C = Arrays.copyOf(this.f34541C, i(length));
        }
        Object[] objArr = this.f34541C;
        int i11 = this.f34542D;
        this.f34542D = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
