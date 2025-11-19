package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2887z5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35785a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f35786b;

    /* renamed from: c, reason: collision with root package name */
    private final v7.X f35787c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.A2 f35788d;

    C2887z5(String str, v7.X x10) {
        this(str, Collections.emptyMap(), x10, null);
    }

    public final v7.X a() {
        return this.f35787c;
    }

    public final com.google.android.gms.internal.measurement.A2 b() {
        return this.f35788d;
    }

    public final String c() {
        return this.f35785a;
    }

    public final Map<String, String> d() {
        Map<String, String> map = this.f35786b;
        return map == null ? Collections.emptyMap() : map;
    }

    C2887z5(String str, Map<String, String> map, v7.X x10) {
        this(str, map, x10, null);
    }

    C2887z5(String str, Map<String, String> map, v7.X x10, com.google.android.gms.internal.measurement.A2 a22) {
        this.f35785a = str;
        this.f35786b = map;
        this.f35787c = x10;
        this.f35788d = a22;
    }
}
