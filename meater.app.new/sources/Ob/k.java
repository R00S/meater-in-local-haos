package Ob;

import Ob.f;
import Ra.InterfaceC1712z;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class k implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f13545a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13546b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // Ob.f
        public boolean e(InterfaceC1712z functionDescriptor) {
            C3862t.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.d0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final b f13547b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // Ob.f
        public boolean e(InterfaceC1712z functionDescriptor) {
            C3862t.g(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.d0() == null && functionDescriptor.j0() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, C3854k c3854k) {
        this(str);
    }

    @Override // Ob.f
    public String c() {
        return this.f13545a;
    }

    @Override // Ob.f
    public String d(InterfaceC1712z interfaceC1712z) {
        return f.a.a(this, interfaceC1712z);
    }

    private k(String str) {
        this.f13545a = str;
    }
}
