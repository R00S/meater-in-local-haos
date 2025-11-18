package vb;

import Hb.U;
import Ra.H;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* renamed from: vb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4938b extends AbstractC4943g<List<? extends AbstractC4943g<?>>> {

    /* renamed from: b, reason: collision with root package name */
    private final Ba.l<H, U> f51596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4938b(List<? extends AbstractC4943g<?>> value, Ba.l<? super H, ? extends U> computeType) {
        super(value);
        C3862t.g(value, "value");
        C3862t.g(computeType, "computeType");
        this.f51596b = computeType;
    }

    @Override // vb.AbstractC4943g
    public U a(H module) {
        C3862t.g(module, "module");
        U uInvoke = this.f51596b.invoke(module);
        if (!Oa.j.c0(uInvoke) && !Oa.j.q0(uInvoke)) {
            Oa.j.D0(uInvoke);
        }
        return uInvoke;
    }
}
