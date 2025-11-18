package sb;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.N;
import Ra.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;

/* compiled from: ClassifierNamePolicy.kt */
/* renamed from: sb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4523b {

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: sb.b$a */
    public static final class a implements InterfaceC4523b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49575a = new a();

        private a() {
        }

        @Override // sb.InterfaceC4523b
        public String a(InterfaceC1695h classifier, n renderer) {
            C3862t.g(classifier, "classifier");
            C3862t.g(renderer, "renderer");
            if (classifier instanceof m0) {
                qb.f name = ((m0) classifier).getName();
                C3862t.f(name, "getName(...)");
                return renderer.T(name, false);
            }
            qb.d dVarM = C4597i.m(classifier);
            C3862t.f(dVarM, "getFqName(...)");
            return renderer.S(dVarM);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: sb.b$b, reason: collision with other inner class name */
    public static final class C0700b implements InterfaceC4523b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0700b f49576a = new C0700b();

        private C0700b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [Ra.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [Ra.J, Ra.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [Ra.m] */
        @Override // sb.InterfaceC4523b
        public String a(InterfaceC1695h classifier, n renderer) {
            C3862t.g(classifier, "classifier");
            C3862t.g(renderer, "renderer");
            if (classifier instanceof m0) {
                qb.f name = ((m0) classifier).getName();
                C3862t.f(name, "getName(...)");
                return renderer.T(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.c();
            } while (classifier instanceof InterfaceC1692e);
            return G.c(kotlin.collections.r.T(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: sb.b$c */
    public static final class c implements InterfaceC4523b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f49577a = new c();

        private c() {
        }

        private final String b(InterfaceC1695h interfaceC1695h) {
            qb.f name = interfaceC1695h.getName();
            C3862t.f(name, "getName(...)");
            String strB = G.b(name);
            if (interfaceC1695h instanceof m0) {
                return strB;
            }
            InterfaceC1700m interfaceC1700mC = interfaceC1695h.c();
            C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
            String strC = c(interfaceC1700mC);
            if (strC == null || C3862t.b(strC, "")) {
                return strB;
            }
            return strC + '.' + strB;
        }

        private final String c(InterfaceC1700m interfaceC1700m) {
            if (interfaceC1700m instanceof InterfaceC1692e) {
                return b((InterfaceC1695h) interfaceC1700m);
            }
            if (!(interfaceC1700m instanceof N)) {
                return null;
            }
            qb.d dVarJ = ((N) interfaceC1700m).f().j();
            C3862t.f(dVarJ, "toUnsafe(...)");
            return G.a(dVarJ);
        }

        @Override // sb.InterfaceC4523b
        public String a(InterfaceC1695h classifier, n renderer) {
            C3862t.g(classifier, "classifier");
            C3862t.g(renderer, "renderer");
            return b(classifier);
        }
    }

    String a(InterfaceC1695h interfaceC1695h, n nVar);
}
