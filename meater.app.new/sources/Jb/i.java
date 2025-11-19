package Jb;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.u0;
import Hb.y0;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;

/* compiled from: ErrorType.kt */
/* loaded from: classes3.dex */
public final class i extends AbstractC1082f0 {

    /* renamed from: C, reason: collision with root package name */
    private final y0 f7693C;

    /* renamed from: D, reason: collision with root package name */
    private final Ab.k f7694D;

    /* renamed from: E, reason: collision with root package name */
    private final k f7695E;

    /* renamed from: F, reason: collision with root package name */
    private final List<E0> f7696F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f7697G;

    /* renamed from: H, reason: collision with root package name */
    private final String[] f7698H;

    /* renamed from: I, reason: collision with root package name */
    private final String f7699I;

    public /* synthetic */ i(y0 y0Var, Ab.k kVar, k kVar2, List list, boolean z10, String[] strArr, int i10, C3854k c3854k) {
        this(y0Var, kVar, kVar2, (i10 & 8) != 0 ? r.m() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // Hb.U
    public List<E0> M0() {
        return this.f7696F;
    }

    @Override // Hb.U
    public u0 N0() {
        return u0.f5791C.j();
    }

    @Override // Hb.U
    public y0 O0() {
        return this.f7693C;
    }

    @Override // Hb.U
    public boolean P0() {
        return this.f7697G;
    }

    @Override // Hb.P0
    /* renamed from: V0 */
    public AbstractC1082f0 S0(boolean z10) {
        y0 y0VarO0 = O0();
        Ab.k kVarS = s();
        k kVar = this.f7695E;
        List<E0> listM0 = M0();
        String[] strArr = this.f7698H;
        return new i(y0VarO0, kVarS, kVar, listM0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return this;
    }

    public final String X0() {
        return this.f7699I;
    }

    public final k Y0() {
        return this.f7695E;
    }

    @Override // Hb.P0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public i Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final i a1(List<? extends E0> newArguments) {
        C3862t.g(newArguments, "newArguments");
        y0 y0VarO0 = O0();
        Ab.k kVarS = s();
        k kVar = this.f7695E;
        boolean zP0 = P0();
        String[] strArr = this.f7698H;
        return new i(y0VarO0, kVarS, kVar, newArguments, zP0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // Hb.U
    public Ab.k s() {
        return this.f7694D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(y0 constructor, Ab.k memberScope, k kind, List<? extends E0> arguments, boolean z10, String... formatParams) {
        C3862t.g(constructor, "constructor");
        C3862t.g(memberScope, "memberScope");
        C3862t.g(kind, "kind");
        C3862t.g(arguments, "arguments");
        C3862t.g(formatParams, "formatParams");
        this.f7693C = constructor;
        this.f7694D = memberScope;
        this.f7695E = kind;
        this.f7696F = arguments;
        this.f7697G = z10;
        this.f7698H = formatParams;
        V v10 = V.f43983a;
        String strJ = kind.j();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strJ, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C3862t.f(str, "format(...)");
        this.f7699I = str;
    }
}
