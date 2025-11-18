package Ua;

import Ra.InterfaceC1700m;
import Ra.h0;
import vb.AbstractC4943g;

/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* loaded from: classes3.dex */
public abstract class Y extends X {

    /* renamed from: G, reason: collision with root package name */
    private final boolean f17787G;

    /* renamed from: H, reason: collision with root package name */
    protected Gb.j<AbstractC4943g<?>> f17788H;

    /* renamed from: I, reason: collision with root package name */
    protected Ba.a<Gb.j<AbstractC4943g<?>>> f17789I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC1700m interfaceC1700m, Sa.h hVar, qb.f fVar, Hb.U u10, boolean z10, h0 h0Var) {
        super(interfaceC1700m, hVar, fVar, u10, h0Var);
        if (interfaceC1700m == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (fVar == null) {
            H(2);
        }
        if (h0Var == null) {
            H(3);
        }
        this.f17787G = z10;
    }

    private static /* synthetic */ void H(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void L0(Gb.j<AbstractC4943g<?>> jVar, Ba.a<Gb.j<AbstractC4943g<?>>> aVar) {
        if (aVar == null) {
            H(5);
        }
        this.f17789I = aVar;
        if (jVar == null) {
            jVar = aVar.invoke();
        }
        this.f17788H = jVar;
    }

    public void M0(Ba.a<Gb.j<AbstractC4943g<?>>> aVar) {
        if (aVar == null) {
            H(4);
        }
        L0(null, aVar);
    }

    @Override // Ra.u0
    public AbstractC4943g<?> V() {
        Gb.j<AbstractC4943g<?>> jVar = this.f17788H;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }

    @Override // Ra.u0
    public boolean h0() {
        return this.f17787G;
    }
}
