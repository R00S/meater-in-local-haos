package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;

/* compiled from: InstallationTokenResult.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class f {

    /* compiled from: InstallationTokenResult.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(long j10);
    }

    public static a a() {
        return new a.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}
