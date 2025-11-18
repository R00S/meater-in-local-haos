package com.facebook.internal;

import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;

/* compiled from: InternalSettings.kt */
/* renamed from: com.facebook.internal.h0 */
/* loaded from: classes2.dex */
public final class C5680h0 {

    /* renamed from: a */
    public static final C5680h0 f14422a = new C5680h0();

    /* renamed from: b */
    private static volatile String f14423b;

    private C5680h0() {
    }

    /* renamed from: a */
    public static final String m11441a() {
        return f14423b;
    }

    /* renamed from: b */
    public static final boolean m11442b() {
        String str = f14423b;
        return C9801m.m32341a(str != null ? Boolean.valueOf(C10546u.m37511E(str, "Unity.", false, 2, null)) : null, Boolean.TRUE);
    }
}
