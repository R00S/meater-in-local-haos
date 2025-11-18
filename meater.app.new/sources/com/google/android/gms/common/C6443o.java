package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.o */
/* loaded from: classes2.dex */
final class C6443o {

    /* renamed from: a */
    private String f17891a = null;

    /* renamed from: b */
    private long f17892b = -1;

    /* renamed from: c */
    private zzag f17893c = zzag.m20916t();

    /* renamed from: d */
    private zzag f17894d = zzag.m20916t();

    C6443o() {
    }

    /* renamed from: a */
    final C6443o m14539a(long j2) {
        this.f17892b = j2;
        return this;
    }

    /* renamed from: b */
    final C6443o m14540b(List list) {
        Preconditions.m14372k(list);
        this.f17894d = zzag.m20915s(list);
        return this;
    }

    /* renamed from: c */
    final C6443o m14541c(List list) {
        Preconditions.m14372k(list);
        this.f17893c = zzag.m20915s(list);
        return this;
    }

    /* renamed from: d */
    final C6443o m14542d(String str) {
        this.f17891a = str;
        return this;
    }

    /* renamed from: e */
    final C6350a m14543e() {
        if (this.f17891a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f17892b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f17893c.isEmpty() && this.f17894d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new C6350a(this.f17891a, this.f17892b, this.f17893c, this.f17894d, null);
    }
}
