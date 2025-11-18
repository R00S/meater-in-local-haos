package com.facebook.internal;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C9801m;
import org.json.JSONObject;

/* compiled from: ProfileInformationCache.kt */
/* renamed from: com.facebook.internal.m0 */
/* loaded from: classes2.dex */
public final class C5690m0 {

    /* renamed from: a */
    public static final C5690m0 f14461a = new C5690m0();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, JSONObject> f14462b = new ConcurrentHashMap<>();

    private C5690m0() {
    }

    /* renamed from: a */
    public static final JSONObject m11508a(String str) {
        C9801m.m32346f(str, "accessToken");
        return f14462b.get(str);
    }

    /* renamed from: b */
    public static final void m11509b(String str, JSONObject jSONObject) {
        C9801m.m32346f(str, RoomNotification.KEY);
        C9801m.m32346f(jSONObject, "value");
        f14462b.put(str, jSONObject);
    }
}
