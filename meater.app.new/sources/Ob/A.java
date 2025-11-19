package Ob;

import Ob.f;
import Ra.InterfaceC1712z;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class A implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f13518a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends A {

        /* renamed from: b, reason: collision with root package name */
        private final int f13519b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f13519b = i10;
        }

        @Override // Ob.f
        public boolean e(InterfaceC1712z functionDescriptor) {
            C3862t.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.k().size() >= this.f13519b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends A {

        /* renamed from: b, reason: collision with root package name */
        private final int f13520b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f13520b = i10;
        }

        @Override // Ob.f
        public boolean e(InterfaceC1712z functionDescriptor) {
            C3862t.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.k().size() == this.f13520b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends A {

        /* renamed from: b, reason: collision with root package name */
        public static final c f13521b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // Ob.f
        public boolean e(InterfaceC1712z functionDescriptor) {
            C3862t.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.k().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class d extends A {

        /* renamed from: b, reason: collision with root package name */
        public static final d f13522b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // Ob.f
        public boolean e(InterfaceC1712z functionDescriptor) {
            C3862t.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.k().size() == 1;
        }
    }

    public /* synthetic */ A(String str, C3854k c3854k) {
        this(str);
    }

    @Override // Ob.f
    public String c() {
        return this.f13518a;
    }

    @Override // Ob.f
    public String d(InterfaceC1712z interfaceC1712z) {
        return f.a.a(this, interfaceC1712z);
    }

    private A(String str) {
        this.f13518a = str;
    }
}
