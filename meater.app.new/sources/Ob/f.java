package Ob;

import Ra.InterfaceC1712z;
import kotlin.jvm.internal.C3862t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public interface f {

    /* compiled from: modifierChecks.kt */
    public static final class a {
        public static String a(f fVar, InterfaceC1712z functionDescriptor) {
            C3862t.g(functionDescriptor, "functionDescriptor");
            if (fVar.e(functionDescriptor)) {
                return null;
            }
            return fVar.c();
        }
    }

    String c();

    String d(InterfaceC1712z interfaceC1712z);

    boolean e(InterfaceC1712z interfaceC1712z);
}
