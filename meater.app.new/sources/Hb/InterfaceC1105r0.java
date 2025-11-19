package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: TypeAliasExpansionReportStrategy.kt */
/* renamed from: Hb.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1105r0 {

    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    /* renamed from: Hb.r0$a */
    public static final class a implements InterfaceC1105r0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5787a = new a();

        private a() {
        }

        @Override // Hb.InterfaceC1105r0
        public void a(Ra.l0 typeAlias) {
            C3862t.g(typeAlias, "typeAlias");
        }

        @Override // Hb.InterfaceC1105r0
        public void b(J0 substitutor, U unsubstitutedArgument, U argument, Ra.m0 typeParameter) {
            C3862t.g(substitutor, "substitutor");
            C3862t.g(unsubstitutedArgument, "unsubstitutedArgument");
            C3862t.g(argument, "argument");
            C3862t.g(typeParameter, "typeParameter");
        }

        @Override // Hb.InterfaceC1105r0
        public void c(Sa.c annotation) {
            C3862t.g(annotation, "annotation");
        }

        @Override // Hb.InterfaceC1105r0
        public void d(Ra.l0 typeAlias, Ra.m0 m0Var, U substitutedArgument) {
            C3862t.g(typeAlias, "typeAlias");
            C3862t.g(substitutedArgument, "substitutedArgument");
        }
    }

    void a(Ra.l0 l0Var);

    void b(J0 j02, U u10, U u11, Ra.m0 m0Var);

    void c(Sa.c cVar);

    void d(Ra.l0 l0Var, Ra.m0 m0Var, U u10);
}
