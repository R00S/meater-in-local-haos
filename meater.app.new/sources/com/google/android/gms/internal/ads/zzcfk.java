package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcfk implements zzczz {

    /* renamed from: g */
    private final zzcfi f24222g;

    /* renamed from: h */
    private final Clock f24223h;

    /* renamed from: f */
    private final Map<zzczs, Long> f24221f = new HashMap();

    /* renamed from: i */
    private final Map<zzczs, C6785ii> f24224i = new HashMap();

    public zzcfk(zzcfi zzcfiVar, Set<C6785ii> set, Clock clock) {
        this.f24222g = zzcfiVar;
        for (C6785ii c6785ii : set) {
            this.f24224i.put(c6785ii.f19381c, c6785ii);
        }
        this.f24223h = clock;
    }

    /* renamed from: a */
    private final void m18732a(zzczs zzczsVar, boolean z) {
        zzczs zzczsVar2 = this.f24224i.get(zzczsVar).f19380b;
        String str = z ? "s." : "f.";
        if (this.f24221f.containsKey(zzczsVar2)) {
            long jMo14609b = this.f24223h.mo14609b() - this.f24221f.get(zzczsVar2).longValue();
            Map<String, String> mapM18730c = this.f24222g.m18730c();
            String strValueOf = String.valueOf(this.f24224i.get(zzczsVar).f19379a);
            String strConcat = strValueOf.length() != 0 ? "label.".concat(strValueOf) : new String("label.");
            String strValueOf2 = String.valueOf(Long.toString(jMo14609b));
            mapM18730c.put(strConcat, strValueOf2.length() != 0 ? str.concat(strValueOf2) : new String(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: b */
    public final void mo18713b(zzczs zzczsVar, String str, Throwable th) {
        if (this.f24221f.containsKey(zzczsVar)) {
            long jMo14609b = this.f24223h.mo14609b() - this.f24221f.get(zzczsVar).longValue();
            Map<String, String> mapM18730c = this.f24222g.m18730c();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jMo14609b));
            mapM18730c.put(strConcat, strValueOf2.length() != 0 ? "f.".concat(strValueOf2) : new String("f."));
        }
        if (this.f24224i.containsKey(zzczsVar)) {
            m18732a(zzczsVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: c */
    public final void mo18714c(zzczs zzczsVar, String str) {
        if (this.f24221f.containsKey(zzczsVar)) {
            long jMo14609b = this.f24223h.mo14609b() - this.f24221f.get(zzczsVar).longValue();
            Map<String, String> mapM18730c = this.f24222g.m18730c();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jMo14609b));
            mapM18730c.put(strConcat, strValueOf2.length() != 0 ? "s.".concat(strValueOf2) : new String("s."));
        }
        if (this.f24224i.containsKey(zzczsVar)) {
            m18732a(zzczsVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: d */
    public final void mo18715d(zzczs zzczsVar, String str) {
        this.f24221f.put(zzczsVar, Long.valueOf(this.f24223h.mo14609b()));
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: e */
    public final void mo18716e(zzczs zzczsVar, String str) {
    }
}
