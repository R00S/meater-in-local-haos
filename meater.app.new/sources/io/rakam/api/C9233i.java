package io.rakam.api;

import java.util.HashSet;
import java.util.Set;

/* compiled from: TrackingOptions.java */
/* renamed from: io.rakam.api.i */
/* loaded from: classes2.dex */
public class C9233i {

    /* renamed from: a */
    private static String[] f35725a = {"city", "country", "dma", "ip_address", "lat_lng", "region"};

    /* renamed from: b */
    Set<String> f35726b = new HashSet();

    /* renamed from: g */
    private boolean m29972g(String str) {
        return !this.f35726b.contains(str);
    }

    /* renamed from: a */
    boolean m29973a() {
        return m29972g("adid");
    }

    /* renamed from: b */
    boolean m29974b() {
        return m29972g("carrier");
    }

    /* renamed from: c */
    boolean m29975c() {
        return m29972g("country");
    }

    /* renamed from: d */
    boolean m29976d() {
        return m29972g("device_brand");
    }

    /* renamed from: e */
    boolean m29977e() {
        return m29972g("device_manufacturer");
    }

    /* renamed from: f */
    boolean m29978f() {
        return m29972g("device_model");
    }

    /* renamed from: h */
    boolean m29979h() {
        return m29972g("language");
    }

    /* renamed from: i */
    boolean m29980i() {
        return m29972g("lat_lng");
    }

    /* renamed from: j */
    boolean m29981j() {
        return m29972g("os_name");
    }

    /* renamed from: k */
    boolean m29982k() {
        return m29972g("os_version");
    }

    /* renamed from: l */
    boolean m29983l() {
        return m29972g("platform");
    }

    /* renamed from: m */
    boolean m29984m() {
        return m29972g("version_name");
    }
}
