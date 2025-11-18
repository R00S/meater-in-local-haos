package com.google.android.gms.internal.common;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.internal.common.c */
/* loaded from: classes2.dex */
final class C7451c extends zzag {

    /* renamed from: h */
    final transient int f27598h;

    /* renamed from: i */
    final transient int f27599i;

    /* renamed from: j */
    final /* synthetic */ zzag f27600j;

    C7451c(zzag zzagVar, int i2, int i3) {
        this.f27600j = zzagVar;
        this.f27598h = i2;
        this.f27599i = i3;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: f */
    final int mo20903f() {
        return this.f27600j.mo20904g() + this.f27598h + this.f27599i;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: g */
    final int mo20904g() {
        return this.f27600j.mo20904g() + this.f27598h;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzs.m20930a(i2, this.f27599i, "index");
        return this.f27600j.get(i2 + this.f27598h);
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: n */
    final boolean mo20905n() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: o */
    final Object[] mo20906o() {
        return this.f27600j.mo20906o();
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* renamed from: q */
    public final zzag subList(int i2, int i3) {
        zzs.m20932c(i2, i3, this.f27599i);
        zzag zzagVar = this.f27600j;
        int i4 = this.f27598h;
        return zzagVar.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27599i;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
