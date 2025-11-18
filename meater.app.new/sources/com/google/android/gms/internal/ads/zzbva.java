package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzbva extends zzbts<zzue> implements zzue {

    /* renamed from: g */
    private Map<View, zzua> f23595g;

    /* renamed from: h */
    private final Context f23596h;

    /* renamed from: i */
    private final zzcxm f23597i;

    public zzbva(Context context, Set<zzbuz<zzue>> set, zzcxm zzcxmVar) {
        super(set);
        this.f23595g = new WeakHashMap(1);
        this.f23596h = context;
        this.f23597i = zzcxmVar;
    }

    /* renamed from: Y */
    public final synchronized void m18388Y(View view) {
        zzua zzuaVar = this.f23595g.get(view);
        if (zzuaVar == null) {
            zzuaVar = new zzua(this.f23596h, view);
            zzuaVar.m20602d(this);
            this.f23595g.put(view, zzuaVar);
        }
        zzcxm zzcxmVar = this.f23597i;
        if (zzcxmVar != null && zzcxmVar.f25241N) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21696R1)).booleanValue()) {
                zzuaVar.m20604j(((Long) zzyt.m20848e().m16421c(zzacu.f21690Q1)).longValue());
                return;
            }
        }
        zzuaVar.m20605m();
    }

    /* renamed from: f0 */
    public final synchronized void m18389f0(View view) {
        if (this.f23595g.containsKey(view)) {
            this.f23595g.get(view).m20603e(this);
            this.f23595g.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final synchronized void mo14929r0(final zzud zzudVar) {
        m18330T(new zzbtu(zzudVar) { // from class: com.google.android.gms.internal.ads.af

            /* renamed from: a */
            private final zzud f18159a;

            {
                this.f18159a = zzudVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            /* renamed from: a */
            public final void mo14761a(Object obj) {
                ((zzue) obj).mo14929r0(this.f18159a);
            }
        });
    }
}
