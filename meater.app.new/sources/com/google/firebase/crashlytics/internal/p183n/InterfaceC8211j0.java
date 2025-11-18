package com.google.firebase.crashlytics.internal.p183n;

import com.google.auto.value.AutoValue;

/* compiled from: InstallIdProvider.java */
/* renamed from: com.google.firebase.crashlytics.h.n.j0 */
/* loaded from: classes2.dex */
public interface InterfaceC8211j0 {

    /* compiled from: InstallIdProvider.java */
    @AutoValue
    /* renamed from: com.google.firebase.crashlytics.h.n.j0$a */
    public static abstract class a {
        /* renamed from: a */
        static a m25268a(String str, String str2) {
            return new C8218n(str, str2);
        }

        /* renamed from: b */
        public static a m25269b(String str) {
            return m25268a(str, null);
        }

        /* renamed from: c */
        public abstract String mo25270c();

        /* renamed from: d */
        public abstract String mo25271d();
    }

    /* renamed from: a */
    a mo25261a();
}
