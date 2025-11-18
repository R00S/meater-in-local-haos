package jb;

import Ra.h0;
import Ra.i0;
import eb.C3268D;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes3.dex */
public final class y implements h0 {

    /* renamed from: b, reason: collision with root package name */
    private final C3268D f43685b;

    public y(C3268D packageFragment) {
        C3862t.g(packageFragment, "packageFragment");
        this.f43685b = packageFragment;
    }

    @Override // Ra.h0
    public i0 a() {
        i0 NO_SOURCE_FILE = i0.f15159a;
        C3862t.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f43685b + ": " + this.f43685b.P0().keySet();
    }
}
