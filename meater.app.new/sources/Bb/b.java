package Bb;

import Hb.U;
import Ra.InterfaceC1692e;
import kotlin.jvm.internal.C3862t;

/* compiled from: ContextClassReceiver.kt */
/* loaded from: classes3.dex */
public final class b extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1692e f1956c;

    /* renamed from: d, reason: collision with root package name */
    private final qb.f f1957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC1692e classDescriptor, U receiverType, qb.f fVar, g gVar) {
        super(receiverType, gVar);
        C3862t.g(classDescriptor, "classDescriptor");
        C3862t.g(receiverType, "receiverType");
        this.f1956c = classDescriptor;
        this.f1957d = fVar;
    }

    @Override // Bb.f
    public qb.f b() {
        return this.f1957d;
    }

    public String toString() {
        return a() + ": Ctx { " + this.f1956c + " }";
    }
}
