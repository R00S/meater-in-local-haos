package Wa;

import Ra.i0;
import Xa.u;
import gb.InterfaceC3458a;
import gb.InterfaceC3459b;
import hb.InterfaceC3519l;
import kotlin.jvm.internal.C3862t;

/* compiled from: RuntimeSourceElementFactory.kt */
/* loaded from: classes3.dex */
public final class l implements InterfaceC3459b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f18492a = new l();

    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class a implements InterfaceC3458a {

        /* renamed from: b, reason: collision with root package name */
        private final u f18493b;

        public a(u javaElement) {
            C3862t.g(javaElement, "javaElement");
            this.f18493b = javaElement;
        }

        @Override // Ra.h0
        public i0 a() {
            i0 NO_SOURCE_FILE = i0.f15159a;
            C3862t.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // gb.InterfaceC3458a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public u b() {
            return this.f18493b;
        }

        public String toString() {
            return a.class.getName() + ": " + b();
        }
    }

    private l() {
    }

    @Override // gb.InterfaceC3459b
    public InterfaceC3458a a(InterfaceC3519l javaElement) {
        C3862t.g(javaElement, "javaElement");
        return new a((u) javaElement);
    }
}
