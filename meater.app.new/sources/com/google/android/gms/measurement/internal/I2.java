package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2621x6;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class I2 implements InterfaceC2621x6 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f34875a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2 f34876b;

    I2(C2 c22, String str) {
        this.f34875a = str;
        this.f34876b = c22;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2621x6
    public final String c(String str) {
        Map map = (Map) this.f34876b.f34765d.get(this.f34875a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
