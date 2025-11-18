package bb;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1699l;
import Ra.Z;
import Ra.g0;
import hb.InterfaceC3514g;
import hb.InterfaceC3519l;
import hb.InterfaceC3521n;
import hb.InterfaceC3524q;

/* compiled from: JavaResolverCache.java */
/* renamed from: bb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2284j {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2284j f30726a = new a();

    /* compiled from: JavaResolverCache.java */
    /* renamed from: bb.j$a */
    static class a implements InterfaceC2284j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // bb.InterfaceC2284j
        public InterfaceC1692e a(qb.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // bb.InterfaceC2284j
        public void b(InterfaceC3521n interfaceC3521n, Z z10) {
            if (interfaceC3521n == null) {
                f(5);
            }
            if (z10 == null) {
                f(6);
            }
        }

        @Override // bb.InterfaceC2284j
        public void c(InterfaceC3524q interfaceC3524q, g0 g0Var) {
            if (interfaceC3524q == null) {
                f(1);
            }
            if (g0Var == null) {
                f(2);
            }
        }

        @Override // bb.InterfaceC2284j
        public void d(InterfaceC3514g interfaceC3514g, InterfaceC1692e interfaceC1692e) {
            if (interfaceC3514g == null) {
                f(7);
            }
            if (interfaceC1692e == null) {
                f(8);
            }
        }

        @Override // bb.InterfaceC2284j
        public void e(InterfaceC3519l interfaceC3519l, InterfaceC1699l interfaceC1699l) {
            if (interfaceC3519l == null) {
                f(3);
            }
            if (interfaceC1699l == null) {
                f(4);
            }
        }
    }

    InterfaceC1692e a(qb.c cVar);

    void b(InterfaceC3521n interfaceC3521n, Z z10);

    void c(InterfaceC3524q interfaceC3524q, g0 g0Var);

    void d(InterfaceC3514g interfaceC3514g, InterfaceC1692e interfaceC1692e);

    void e(InterfaceC3519l interfaceC3519l, InterfaceC1699l interfaceC1699l);
}
