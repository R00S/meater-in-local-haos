package bb;

import Hb.U;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.m0;
import Ra.t0;
import hb.InterfaceC3525r;
import java.util.Collections;
import java.util.List;

/* compiled from: SignaturePropagator.java */
/* loaded from: classes3.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f30733a = new a();

    /* compiled from: SignaturePropagator.java */
    static class a implements o {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // bb.o
        public void a(InterfaceC1689b interfaceC1689b, List<String> list) {
            if (interfaceC1689b == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // bb.o
        public b b(InterfaceC3525r interfaceC3525r, InterfaceC1692e interfaceC1692e, U u10, U u11, List<t0> list, List<m0> list2) {
            if (interfaceC3525r == null) {
                c(0);
            }
            if (interfaceC1692e == null) {
                c(1);
            }
            if (u10 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(u10, u11, list, list2, Collections.emptyList(), false);
        }
    }

    /* compiled from: SignaturePropagator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final U f30734a;

        /* renamed from: b, reason: collision with root package name */
        private final U f30735b;

        /* renamed from: c, reason: collision with root package name */
        private final List<t0> f30736c;

        /* renamed from: d, reason: collision with root package name */
        private final List<m0> f30737d;

        /* renamed from: e, reason: collision with root package name */
        private final List<String> f30738e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f30739f;

        public b(U u10, U u11, List<t0> list, List<m0> list2, List<String> list3, boolean z10) {
            if (u10 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f30734a = u10;
            this.f30735b = u11;
            this.f30736c = list;
            this.f30737d = list2;
            this.f30738e = list3;
            this.f30739f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List<String> b() {
            List<String> list = this.f30738e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public U c() {
            return this.f30735b;
        }

        public U d() {
            U u10 = this.f30734a;
            if (u10 == null) {
                a(4);
            }
            return u10;
        }

        public List<m0> e() {
            List<m0> list = this.f30737d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List<t0> f() {
            List<t0> list = this.f30736c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f30739f;
        }
    }

    void a(InterfaceC1689b interfaceC1689b, List<String> list);

    b b(InterfaceC3525r interfaceC3525r, InterfaceC1692e interfaceC1692e, U u10, U u11, List<t0> list, List<m0> list2);
}
