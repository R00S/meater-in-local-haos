package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class I3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33782a;

    public I3(L3 l32) {
        l8.m.m(l32, "BuildInfo must be non-null");
        this.f33782a = !l32.a();
    }

    public final boolean a(String str) {
        l8.m.m(str, "flagName must not be null");
        if (this.f33782a) {
            return K3.f33802a.get().d(str);
        }
        return true;
    }
}
