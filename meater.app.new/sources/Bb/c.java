package Bb;

import Hb.U;
import Ra.InterfaceC1688a;
import kotlin.jvm.internal.C3862t;

/* compiled from: ContextReceiver.kt */
/* loaded from: classes3.dex */
public final class c extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1688a f1958c;

    /* renamed from: d, reason: collision with root package name */
    private final qb.f f1959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC1688a declarationDescriptor, U receiverType, qb.f fVar, g gVar) {
        super(receiverType, gVar);
        C3862t.g(declarationDescriptor, "declarationDescriptor");
        C3862t.g(receiverType, "receiverType");
        this.f1958c = declarationDescriptor;
        this.f1959d = fVar;
    }

    @Override // Bb.f
    public qb.f b() {
        return this.f1959d;
    }

    public InterfaceC1688a e() {
        return this.f1958c;
    }

    public String toString() {
        return "Cxt { " + e() + " }";
    }
}
