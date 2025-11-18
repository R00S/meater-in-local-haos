package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.C6246e;
import com.google.auto.value.AutoValue;

/* compiled from: ClientInfo.java */
@AutoValue
/* renamed from: com.google.android.datatransport.cct.f.k */
/* loaded from: classes2.dex */
public abstract class AbstractC6252k {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.f.k$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC6252k mo13454a();

        /* renamed from: b */
        public abstract a mo13455b(AbstractC6242a abstractC6242a);

        /* renamed from: c */
        public abstract a mo13456c(b bVar);
    }

    /* compiled from: ClientInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.k$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: i */
        private final int f16703i;

        b(int i2) {
            this.f16703i = i2;
        }
    }

    /* renamed from: a */
    public static a m13495a() {
        return new C6246e.b();
    }

    /* renamed from: b */
    public abstract AbstractC6242a mo13452b();

    /* renamed from: c */
    public abstract b mo13453c();
}
