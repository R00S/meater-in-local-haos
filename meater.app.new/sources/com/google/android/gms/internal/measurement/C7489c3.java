package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c3 */
/* loaded from: classes2.dex */
final class C7489c3 implements InterfaceC7477a3 {
    C7489c3() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    /* renamed from: b */
    public final Map<?, ?> mo20971b(Object obj) {
        return (zzgi) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    /* renamed from: c */
    public final Map<?, ?> mo20972c(Object obj) {
        return (zzgi) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    /* renamed from: d */
    public final Object mo20973d(Object obj) {
        return zzgi.m22319d().m22322f();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    /* renamed from: e */
    public final Object mo20974e(Object obj) {
        ((zzgi) obj).m22323h();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    /* renamed from: f */
    public final boolean mo20975f(Object obj) {
        return !((zzgi) obj).m22324i();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    /* renamed from: g */
    public final Object mo20976g(Object obj, Object obj2) {
        zzgi zzgiVarM22322f = (zzgi) obj;
        zzgi zzgiVar = (zzgi) obj2;
        if (!zzgiVar.isEmpty()) {
            if (!zzgiVarM22322f.m22324i()) {
                zzgiVarM22322f = zzgiVarM22322f.m22322f();
            }
            zzgiVarM22322f.m22321e(zzgiVar);
        }
        return zzgiVarM22322f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    /* renamed from: h */
    public final int mo20977h(int i2, Object obj, Object obj2) {
        zzgi zzgiVar = (zzgi) obj;
        if (zzgiVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgiVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7477a3
    public final C7626z2<?, ?> zzf(Object obj) {
        throw new NoSuchMethodError();
    }
}
