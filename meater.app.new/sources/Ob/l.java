package Ob;

import Ra.InterfaceC1700m;
import kotlin.jvm.internal.C3862t;

/* compiled from: ModuleVisibilityHelper.kt */
/* loaded from: classes3.dex */
public interface l {

    /* compiled from: ModuleVisibilityHelper.kt */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13548a = new a();

        private a() {
        }

        @Override // Ob.l
        public boolean a(InterfaceC1700m what, InterfaceC1700m from) {
            C3862t.g(what, "what");
            C3862t.g(from, "from");
            return true;
        }
    }

    boolean a(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2);
}
