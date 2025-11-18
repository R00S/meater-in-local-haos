package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10035l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10040q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: JavaResolverCache.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.g */
/* loaded from: classes2.dex */
public interface InterfaceC9969g {

    /* renamed from: a */
    public static final InterfaceC9969g f37920a = new a();

    /* compiled from: JavaResolverCache.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.g$a */
    static class a implements InterfaceC9969g {
        a() {
        }

        /* renamed from: f */
        private static /* synthetic */ void m33183f(int i2) {
            Object[] objArr = new Object[3];
            switch (i2) {
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
            switch (i2) {
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

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g
        /* renamed from: a */
        public InterfaceC10585e mo33178a(C10160c c10160c) {
            if (c10160c != null) {
                return null;
            }
            m33183f(0);
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g
        /* renamed from: b */
        public void mo33179b(InterfaceC10035l interfaceC10035l, InterfaceC10606l interfaceC10606l) {
            if (interfaceC10035l == null) {
                m33183f(3);
            }
            if (interfaceC10606l == null) {
                m33183f(4);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g
        /* renamed from: c */
        public void mo33180c(InterfaceC10030g interfaceC10030g, InterfaceC10585e interfaceC10585e) {
            if (interfaceC10030g == null) {
                m33183f(7);
            }
            if (interfaceC10585e == null) {
                m33183f(8);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g
        /* renamed from: d */
        public void mo33181d(InterfaceC10037n interfaceC10037n, InterfaceC10729t0 interfaceC10729t0) {
            if (interfaceC10037n == null) {
                m33183f(5);
            }
            if (interfaceC10729t0 == null) {
                m33183f(6);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g
        /* renamed from: e */
        public void mo33182e(InterfaceC10040q interfaceC10040q, InterfaceC10739y0 interfaceC10739y0) {
            if (interfaceC10040q == null) {
                m33183f(1);
            }
            if (interfaceC10739y0 == null) {
                m33183f(2);
            }
        }
    }

    /* renamed from: a */
    InterfaceC10585e mo33178a(C10160c c10160c);

    /* renamed from: b */
    void mo33179b(InterfaceC10035l interfaceC10035l, InterfaceC10606l interfaceC10606l);

    /* renamed from: c */
    void mo33180c(InterfaceC10030g interfaceC10030g, InterfaceC10585e interfaceC10585e);

    /* renamed from: d */
    void mo33181d(InterfaceC10037n interfaceC10037n, InterfaceC10729t0 interfaceC10729t0);

    /* renamed from: e */
    void mo33182e(InterfaceC10040q interfaceC10040q, InterfaceC10739y0 interfaceC10739y0);
}
