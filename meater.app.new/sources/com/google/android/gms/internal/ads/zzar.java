package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzar {

    /* renamed from: a */
    private final int f22291a;

    /* renamed from: b */
    private final List<zzl> f22292b;

    /* renamed from: c */
    private final int f22293c;

    /* renamed from: d */
    private final InputStream f22294d;

    public zzar(int i2, List<zzl> list) {
        this(i2, list, -1, null);
    }

    /* renamed from: a */
    public final InputStream m16887a() {
        return this.f22294d;
    }

    /* renamed from: b */
    public final int m16888b() {
        return this.f22293c;
    }

    /* renamed from: c */
    public final int m16889c() {
        return this.f22291a;
    }

    /* renamed from: d */
    public final List<zzl> m16890d() {
        return Collections.unmodifiableList(this.f22292b);
    }

    public zzar(int i2, List<zzl> list, int i3, InputStream inputStream) {
        this.f22291a = i2;
        this.f22292b = list;
        this.f22293c = i3;
        this.f22294d = inputStream;
    }
}
