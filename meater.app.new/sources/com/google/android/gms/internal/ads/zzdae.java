package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdae {

    /* renamed from: a */
    private final Executor f25421a;

    /* renamed from: b */
    private final zzbah f25422b;

    /* renamed from: c */
    private final zzcmu f25423c;

    /* renamed from: d */
    private final String f25424d;

    /* renamed from: e */
    private final String f25425e;

    /* renamed from: f */
    private final String f25426f;

    /* renamed from: g */
    private final Context f25427g;

    /* renamed from: h */
    private final Clock f25428h;

    public zzdae(Executor executor, zzbah zzbahVar, zzcmu zzcmuVar, zzbai zzbaiVar, String str, String str2, Context context, Clock clock) {
        this.f25421a = executor;
        this.f25422b = zzbahVar;
        this.f25423c = zzcmuVar;
        this.f25424d = zzbaiVar.f22750f;
        this.f25425e = str;
        this.f25426f = str2;
        this.f25427g = context;
        this.f25428h = clock;
    }

    /* renamed from: d */
    private static String m19130d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: f */
    private static String m19131f(String str) {
        return (TextUtils.isEmpty(str) || !zzazx.m17324a()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: a */
    public final void m19132a(zzcxu zzcxuVar, zzcxm zzcxmVar, List<String> list) {
        m19134c(zzcxuVar, zzcxmVar, false, list);
    }

    /* renamed from: b */
    public final void m19133b(zzcxu zzcxuVar, zzcxm zzcxmVar, List<String> list, zzasr zzasrVar) {
        long jMo14608a = this.f25428h.mo14608a();
        try {
            String type = zzasrVar.getType();
            String string = Integer.toString(zzasrVar.getAmount());
            ArrayList arrayList = new ArrayList();
            String strM19131f = m19131f(zzcxuVar.f25288a.f25282a.f25299j);
            String strM19131f2 = m19131f(zzcxuVar.f25288a.f25282a.f25300k);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzavx.m17021c(m19130d(m19130d(m19130d(m19130d(m19130d(m19130d(it.next(), "@gw_rwd_userid@", Uri.encode(strM19131f)), "@gw_rwd_custom_data@", Uri.encode(strM19131f2)), "@gw_tmstmp@", Long.toString(jMo14608a)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f25424d), this.f25427g, zzcxmVar.f25240M));
            }
            m19137h(arrayList);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public final void m19134c(zzcxu zzcxuVar, zzcxm zzcxmVar, boolean z, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str = z ? "1" : "0";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strM19130d = m19130d(m19130d(m19130d(it.next(), "@gw_adlocid@", zzcxuVar.f25288a.f25282a.f25295f), "@gw_adnetrefresh@", str), "@gw_sdkver@", this.f25424d);
            if (zzcxmVar != null) {
                strM19130d = zzavx.m17021c(m19130d(m19130d(m19130d(strM19130d, "@gw_qdata@", zzcxmVar.f25264v), "@gw_adnetid@", zzcxmVar.f25263u), "@gw_allocid@", zzcxmVar.f25262t), this.f25427g, zzcxmVar.f25240M);
            }
            arrayList.add(m19130d(m19130d(m19130d(strM19130d, "@gw_adnetstatus@", this.f25423c.m18885e()), "@gw_seqnum@", this.f25425e), "@gw_sessid@", this.f25426f));
        }
        m19137h(arrayList);
    }

    /* renamed from: e */
    public final void m19135e(final String str) {
        this.f25421a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.qq

            /* renamed from: f */
            private final zzdae f20404f;

            /* renamed from: g */
            private final String f20405g;

            {
                this.f20404f = this;
                this.f20405g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20404f.m19136g(this.f20405g);
            }
        });
    }

    /* renamed from: g */
    final /* synthetic */ void m19136g(String str) {
        this.f25422b.mo15137a(str);
    }

    /* renamed from: h */
    public final void m19137h(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m19135e(it.next());
        }
    }
}
