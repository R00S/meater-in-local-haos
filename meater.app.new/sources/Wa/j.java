package Wa;

import Db.InterfaceC1016w;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: RuntimeErrorReporter.kt */
/* loaded from: classes3.dex */
public final class j implements InterfaceC1016w {

    /* renamed from: b, reason: collision with root package name */
    public static final j f18488b = new j();

    private j() {
    }

    @Override // Db.InterfaceC1016w
    public void a(InterfaceC1692e descriptor, List<String> unresolvedSuperClasses) {
        C3862t.g(descriptor, "descriptor");
        C3862t.g(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    @Override // Db.InterfaceC1016w
    public void b(InterfaceC1689b descriptor) {
        C3862t.g(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }
}
