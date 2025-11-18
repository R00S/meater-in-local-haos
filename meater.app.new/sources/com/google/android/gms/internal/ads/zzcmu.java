package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcmu {

    /* renamed from: a */
    private final Clock f24742a;

    /* renamed from: b */
    private final List<String> f24743b = Collections.synchronizedList(new ArrayList());

    public zzcmu(Clock clock) {
        this.f24742a = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m18883d(String str, int i2, long j2) {
        List<String> list = this.f24743b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(j2);
        list.add(sb.toString());
    }

    /* renamed from: b */
    public final <T> zzbbh<T> m18884b(zzcxm zzcxmVar, zzbbh<T> zzbbhVar) {
        long jMo14609b = this.f24742a.mo14609b();
        String str = zzcxmVar.f25262t;
        if (str != null) {
            zzbar.m17369f(zzbbhVar, new C6973nl(this, str, jMo14609b), zzbbm.f22758b);
        }
        return zzbbhVar;
    }

    /* renamed from: e */
    public final String m18885e() {
        return TextUtils.join("_", this.f24743b);
    }
}
