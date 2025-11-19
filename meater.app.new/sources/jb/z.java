package jb;

import Db.C1018y;
import Fb.InterfaceC1037s;
import Ra.i0;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinJvmBinarySourceElement.kt */
/* loaded from: classes3.dex */
public final class z implements InterfaceC1037s {

    /* renamed from: b, reason: collision with root package name */
    private final x f43686b;

    /* renamed from: c, reason: collision with root package name */
    private final C1018y<pb.e> f43687c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43688d;

    /* renamed from: e, reason: collision with root package name */
    private final Fb.r f43689e;

    public z(x binaryClass, C1018y<pb.e> c1018y, boolean z10, Fb.r abiStability) {
        C3862t.g(binaryClass, "binaryClass");
        C3862t.g(abiStability, "abiStability");
        this.f43686b = binaryClass;
        this.f43687c = c1018y;
        this.f43688d = z10;
        this.f43689e = abiStability;
    }

    @Override // Ra.h0
    public i0 a() {
        i0 NO_SOURCE_FILE = i0.f15159a;
        C3862t.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // Fb.InterfaceC1037s
    public String c() {
        return "Class '" + this.f43686b.c().a().b() + '\'';
    }

    public final x d() {
        return this.f43686b;
    }

    public String toString() {
        return z.class.getSimpleName() + ": " + this.f43686b;
    }
}
