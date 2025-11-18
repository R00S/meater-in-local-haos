package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzadi {

    /* renamed from: a */
    @VisibleForTesting
    boolean f21931a;

    /* renamed from: b */
    private final List<zzadg> f21932b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f21933c;

    /* renamed from: d */
    private final Object f21934d;

    /* renamed from: e */
    private zzadi f21935e;

    public zzadi(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f21933c = linkedHashMap;
        this.f21934d = new Object();
        this.f21931a = true;
        linkedHashMap.put("action", str);
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: a */
    public final boolean m16448a(zzadg zzadgVar, long j2, String... strArr) {
        synchronized (this.f21934d) {
            for (String str : strArr) {
                this.f21932b.add(new zzadg(j2, str, zzadgVar));
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m16449b(zzadi zzadiVar) {
        synchronized (this.f21934d) {
            this.f21935e = zzadiVar;
        }
    }

    /* renamed from: c */
    public final zzadg m16450c(long j2) {
        if (this.f21931a) {
            return new zzadg(j2, null, null);
        }
        return null;
    }

    /* renamed from: d */
    public final void m16451d(String str, String str2) {
        zzacy zzacyVarM17055l;
        if (!this.f21931a || TextUtils.isEmpty(str2) || (zzacyVarM17055l = zzk.zzlk().m17055l()) == null) {
            return;
        }
        synchronized (this.f21934d) {
            zzadc zzadcVarM16438e = zzacyVarM17055l.m16438e(str);
            Map<String, String> map = this.f21933c;
            map.put(str, zzadcVarM16438e.mo15917a(map.get(str), str2));
        }
    }

    /* renamed from: e */
    public final String m16452e() {
        String string;
        StringBuilder sb = new StringBuilder();
        synchronized (this.f21934d) {
            for (zzadg zzadgVar : this.f21932b) {
                long jM16442a = zzadgVar.m16442a();
                String strM16443b = zzadgVar.m16443b();
                zzadg zzadgVarM16444c = zzadgVar.m16444c();
                if (zzadgVarM16444c != null && jM16442a > 0) {
                    long jM16442a2 = jM16442a - zzadgVarM16444c.m16442a();
                    sb.append(strM16443b);
                    sb.append('.');
                    sb.append(jM16442a2);
                    sb.append(',');
                }
            }
            this.f21932b.clear();
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            string = sb.toString();
        }
        return string;
    }

    @VisibleForTesting
    /* renamed from: f */
    final Map<String, String> m16453f() {
        zzadi zzadiVar;
        synchronized (this.f21934d) {
            zzacy zzacyVarM17055l = zzk.zzlk().m17055l();
            if (zzacyVarM17055l != null && (zzadiVar = this.f21935e) != null) {
                return zzacyVarM17055l.m16435a(this.f21933c, zzadiVar.m16453f());
            }
            return this.f21933c;
        }
    }
}
