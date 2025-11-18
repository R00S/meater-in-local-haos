package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzahq implements zzaho<Object> {

    /* renamed from: a */
    private final Context f22035a;

    public zzahq(Context context) {
        this.f22035a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        if (zzk.zzme().m17002D(this.f22035a)) {
            String str2 = map.get("eventName");
            str = map.get("eventId");
            str2.hashCode();
            switch (str2) {
                case "_aa":
                    zzk.zzme().m17018y(this.f22035a, str);
                    break;
                case "_ac":
                    zzk.zzme().m17015u(this.f22035a, str);
                    break;
                case "_ai":
                    zzk.zzme().m17016v(this.f22035a, str);
                    break;
                default:
                    zzbad.m17351g("logScionEvent gmsg contained unsupported eventName");
                    break;
            }
        }
    }
}
