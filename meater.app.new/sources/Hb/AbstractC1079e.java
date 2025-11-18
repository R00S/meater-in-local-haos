package Hb;

import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: StubTypes.kt */
/* renamed from: Hb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1079e extends AbstractC1082f0 {

    /* renamed from: F, reason: collision with root package name */
    public static final a f5731F = new a(null);

    /* renamed from: C, reason: collision with root package name */
    private final Ib.r f5732C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f5733D;

    /* renamed from: E, reason: collision with root package name */
    private final Ab.k f5734E;

    /* compiled from: StubTypes.kt */
    /* renamed from: Hb.e$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    public AbstractC1079e(Ib.r originalTypeVariable, boolean z10) {
        C3862t.g(originalTypeVariable, "originalTypeVariable");
        this.f5732C = originalTypeVariable;
        this.f5733D = z10;
        this.f5734E = Jb.l.b(Jb.h.f7684G, originalTypeVariable.toString());
    }

    @Override // Hb.U
    public List<E0> M0() {
        return kotlin.collections.r.m();
    }

    @Override // Hb.U
    public u0 N0() {
        return u0.f5791C.j();
    }

    @Override // Hb.U
    public boolean P0() {
        return this.f5733D;
    }

    @Override // Hb.P0
    /* renamed from: V0 */
    public AbstractC1082f0 S0(boolean z10) {
        return z10 == P0() ? this : Y0(z10);
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return this;
    }

    public final Ib.r X0() {
        return this.f5732C;
    }

    public abstract AbstractC1079e Y0(boolean z10);

    @Override // Hb.P0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC1079e Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Hb.U
    public Ab.k s() {
        return this.f5734E;
    }
}
