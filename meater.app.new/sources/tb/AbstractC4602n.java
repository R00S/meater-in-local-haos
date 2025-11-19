package tb;

import Ra.InterfaceC1689b;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;

/* compiled from: OverridingStrategy.kt */
/* renamed from: tb.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4602n {
    public abstract void a(InterfaceC1689b interfaceC1689b);

    public abstract void b(InterfaceC1689b interfaceC1689b, InterfaceC1689b interfaceC1689b2);

    public abstract void c(InterfaceC1689b interfaceC1689b, InterfaceC1689b interfaceC1689b2);

    public void d(InterfaceC1689b member, Collection<? extends InterfaceC1689b> overridden) {
        C3862t.g(member, "member");
        C3862t.g(overridden, "overridden");
        member.w0(overridden);
    }
}
