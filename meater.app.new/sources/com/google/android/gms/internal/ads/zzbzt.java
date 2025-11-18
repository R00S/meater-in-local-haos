package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbzt {

    /* renamed from: a */
    private final Context f23912a;

    /* renamed from: b */
    private final zzcdn f23913b;

    /* renamed from: c */
    private final zzccj f23914c;

    /* renamed from: d */
    private final zzbmy f23915d;

    /* renamed from: e */
    private final zzbzb f23916e;

    public zzbzt(Context context, zzcdn zzcdnVar, zzccj zzccjVar, zzbmy zzbmyVar, zzbzb zzbzbVar) {
        this.f23912a = context;
        this.f23913b = zzcdnVar;
        this.f23914c = zzccjVar;
        this.f23915d = zzbmyVar;
        this.f23916e = zzbzbVar;
    }

    /* renamed from: a */
    final /* synthetic */ void m18606a(zzbgz zzbgzVar, Map map) {
        zzbgzVar.getView().setVisibility(8);
        this.f23915d.m17910r(false);
    }

    /* renamed from: b */
    final /* synthetic */ void m18607b(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, (String) map.get(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID));
        this.f23914c.m18666e("sendMessageToNativeJs", map2);
    }

    /* renamed from: c */
    public final View m18608c() throws zzbhj {
        zzbgz zzbgzVarM18682b = this.f23913b.m18682b(zzyd.m20822Y(this.f23912a));
        zzbgzVarM18682b.getView().setVisibility(8);
        zzbgzVarM18682b.mo14907f("/sendMessageToSdk", new zzaho(this) { // from class: com.google.android.gms.internal.ads.dg

            /* renamed from: a */
            private final zzbzt f18688a;

            {
                this.f18688a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, Map map) {
                this.f18688a.m18611f((zzbgz) obj, map);
            }
        });
        zzbgzVarM18682b.mo14907f("/adMuted", new zzaho(this) { // from class: com.google.android.gms.internal.ads.eg

            /* renamed from: a */
            private final zzbzt f18817a;

            {
                this.f18817a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, Map map) {
                this.f18817a.m18610e((zzbgz) obj, map);
            }
        });
        this.f23914c.m18667f(new WeakReference(zzbgzVarM18682b), "/loadHtml", new zzaho(this) { // from class: com.google.android.gms.internal.ads.fg

            /* renamed from: a */
            private final zzbzt f18892a;

            {
                this.f18892a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, final Map map) {
                final zzbzt zzbztVar = this.f18892a;
                zzbgz zzbgzVar = (zzbgz) obj;
                zzbgzVar.mo14926p().mo17687i(new zzbij(zzbztVar, map) { // from class: com.google.android.gms.internal.ads.ig

                    /* renamed from: a */
                    private final zzbzt f19376a;

                    /* renamed from: b */
                    private final Map f19377b;

                    {
                        this.f19376a = zzbztVar;
                        this.f19377b = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbij
                    public final void zzae(boolean z) {
                        this.f19376a.m18607b(this.f19377b, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzbgzVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzbgzVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f23914c.m18667f(new WeakReference(zzbgzVarM18682b), "/showOverlay", new zzaho(this) { // from class: com.google.android.gms.internal.ads.gg

            /* renamed from: a */
            private final zzbzt f18977a;

            {
                this.f18977a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, Map map) {
                this.f18977a.m18609d((zzbgz) obj, map);
            }
        });
        this.f23914c.m18667f(new WeakReference(zzbgzVarM18682b), "/hideOverlay", new zzaho(this) { // from class: com.google.android.gms.internal.ads.hg

            /* renamed from: a */
            private final zzbzt f19230a;

            {
                this.f19230a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, Map map) {
                this.f19230a.m18606a((zzbgz) obj, map);
            }
        });
        return zzbgzVarM18682b.getView();
    }

    /* renamed from: d */
    final /* synthetic */ void m18609d(zzbgz zzbgzVar, Map map) {
        zzbgzVar.getView().setVisibility(0);
        this.f23915d.m17910r(true);
    }

    /* renamed from: e */
    final /* synthetic */ void m18610e(zzbgz zzbgzVar, Map map) {
        this.f23916e.mo18472n();
    }

    /* renamed from: f */
    final /* synthetic */ void m18611f(zzbgz zzbgzVar, Map map) {
        this.f23914c.m18666e("sendMessageToNativeJs", map);
    }
}
