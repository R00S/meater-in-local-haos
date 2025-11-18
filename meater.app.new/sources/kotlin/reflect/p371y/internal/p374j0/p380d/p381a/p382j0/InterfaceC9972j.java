package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: SignaturePropagator.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.j */
/* loaded from: classes2.dex */
public interface InterfaceC9972j {

    /* renamed from: a */
    public static final InterfaceC9972j f37927a = new a();

    /* compiled from: SignaturePropagator.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.j$a */
    static class a implements InterfaceC9972j {
        a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m33188c(int i2) {
            Object[] objArr = new Object[3];
            switch (i2) {
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
            if (i2 == 5 || i2 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9972j
        /* renamed from: a */
        public b mo33186a(InterfaceC10041r interfaceC10041r, InterfaceC10585e interfaceC10585e, AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, List<InterfaceC10599i1> list, List<InterfaceC10587e1> list2) {
            if (interfaceC10041r == null) {
                m33188c(0);
            }
            if (interfaceC10585e == null) {
                m33188c(1);
            }
            if (abstractC10344e0 == null) {
                m33188c(2);
            }
            if (list == null) {
                m33188c(3);
            }
            if (list2 == null) {
                m33188c(4);
            }
            return new b(abstractC10344e0, abstractC10344e02, list, list2, Collections.emptyList(), false);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9972j
        /* renamed from: b */
        public void mo33187b(InterfaceC10576b interfaceC10576b, List<String> list) {
            if (interfaceC10576b == null) {
                m33188c(5);
            }
            if (list == null) {
                m33188c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    /* compiled from: SignaturePropagator.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.j$b */
    public static class b {

        /* renamed from: a */
        private final AbstractC10344e0 f37928a;

        /* renamed from: b */
        private final AbstractC10344e0 f37929b;

        /* renamed from: c */
        private final List<InterfaceC10599i1> f37930c;

        /* renamed from: d */
        private final List<InterfaceC10587e1> f37931d;

        /* renamed from: e */
        private final List<String> f37932e;

        /* renamed from: f */
        private final boolean f37933f;

        public b(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, List<InterfaceC10599i1> list, List<InterfaceC10587e1> list2, List<String> list3, boolean z) {
            if (abstractC10344e0 == null) {
                m33189a(0);
            }
            if (list == null) {
                m33189a(1);
            }
            if (list2 == null) {
                m33189a(2);
            }
            if (list3 == null) {
                m33189a(3);
            }
            this.f37928a = abstractC10344e0;
            this.f37929b = abstractC10344e02;
            this.f37930c = list;
            this.f37931d = list2;
            this.f37932e = list3;
            this.f37933f = z;
        }

        /* renamed from: a */
        private static /* synthetic */ void m33189a(int i2) {
            String str = (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3];
            switch (i2) {
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
            if (i2 == 4) {
                objArr[1] = "getReturnType";
            } else if (i2 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i2 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i2 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* renamed from: b */
        public List<String> m33190b() {
            List<String> list = this.f37932e;
            if (list == null) {
                m33189a(7);
            }
            return list;
        }

        /* renamed from: c */
        public AbstractC10344e0 m33191c() {
            return this.f37929b;
        }

        /* renamed from: d */
        public AbstractC10344e0 m33192d() {
            AbstractC10344e0 abstractC10344e0 = this.f37928a;
            if (abstractC10344e0 == null) {
                m33189a(4);
            }
            return abstractC10344e0;
        }

        /* renamed from: e */
        public List<InterfaceC10587e1> m33193e() {
            List<InterfaceC10587e1> list = this.f37931d;
            if (list == null) {
                m33189a(6);
            }
            return list;
        }

        /* renamed from: f */
        public List<InterfaceC10599i1> m33194f() {
            List<InterfaceC10599i1> list = this.f37930c;
            if (list == null) {
                m33189a(5);
            }
            return list;
        }

        /* renamed from: g */
        public boolean m33195g() {
            return this.f37933f;
        }
    }

    /* renamed from: a */
    b mo33186a(InterfaceC10041r interfaceC10041r, InterfaceC10585e interfaceC10585e, AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, List<InterfaceC10599i1> list, List<InterfaceC10587e1> list2);

    /* renamed from: b */
    void mo33187b(InterfaceC10576b interfaceC10576b, List<String> list);
}
