package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* renamed from: com.google.android.gms.internal.common.d */
/* loaded from: classes.dex */
final class C7452d extends zzag {

    /* renamed from: h */
    static final zzag f27601h = new C7452d(new Object[0], 0);

    /* renamed from: i */
    final transient Object[] f27602i;

    /* renamed from: j */
    private final transient int f27603j;

    C7452d(Object[] objArr, int i2) {
        this.f27602i = objArr;
        this.f27603j = i2;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    /* renamed from: c */
    final int mo20908c(Object[] objArr, int i2) {
        System.arraycopy(this.f27602i, 0, objArr, 0, this.f27603j);
        return this.f27603j;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: f */
    final int mo20903f() {
        return this.f27603j;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: g */
    final int mo20904g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzs.m20930a(i2, this.f27603j, "index");
        Object obj = this.f27602i[i2];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: n */
    final boolean mo20905n() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: o */
    final Object[] mo20906o() {
        return this.f27602i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27603j;
    }
}
