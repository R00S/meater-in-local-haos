package com.google.firebase.installations.p198r;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.p198r.C8398b;

/* compiled from: TokenResult.java */
@AutoValue
/* renamed from: com.google.firebase.installations.r.f */
/* loaded from: classes2.dex */
public abstract class AbstractC8402f {

    /* compiled from: TokenResult.java */
    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.r.f$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC8402f mo26354a();

        /* renamed from: b */
        public abstract a mo26355b(b bVar);

        /* renamed from: c */
        public abstract a mo26356c(String str);

        /* renamed from: d */
        public abstract a mo26357d(long j2);
    }

    /* compiled from: TokenResult.java */
    /* renamed from: com.google.firebase.installations.r.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static a m26384a() {
        return new C8398b.b().mo26357d(0L);
    }

    /* renamed from: b */
    public abstract b mo26351b();

    /* renamed from: c */
    public abstract String mo26352c();

    /* renamed from: d */
    public abstract long mo26353d();
}
