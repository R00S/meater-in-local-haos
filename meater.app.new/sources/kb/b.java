package kb;

import Ra.h0;
import ab.C1928I;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb.x;
import kb.C3816a;
import pb.C4255a;
import qb.f;
import vb.C4942f;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes3.dex */
public class b implements x.c {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f43856j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<qb.b, C3816a.EnumC0573a> f43857k;

    /* renamed from: a, reason: collision with root package name */
    private int[] f43858a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f43859b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f43860c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f43861d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f43862e = null;

    /* renamed from: f, reason: collision with root package name */
    private String[] f43863f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f43864g = null;

    /* renamed from: h, reason: collision with root package name */
    private C3816a.EnumC0573a f43865h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f43866i = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kb.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0575b implements x.b {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f43867a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // jb.x.b
        public void a() {
            g((String[]) this.f43867a.toArray(new String[0]));
        }

        @Override // jb.x.b
        public void b(qb.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // jb.x.b
        public void c(Object obj) {
            if (obj instanceof String) {
                this.f43867a.add((String) obj);
            }
        }

        @Override // jb.x.b
        public x.a d(qb.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // jb.x.b
        public void e(C4942f c4942f) {
            if (c4942f == null) {
                f(2);
            }
        }

        protected abstract void g(String[] strArr);
    }

    static {
        try {
            f43856j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f43856j = false;
        }
        HashMap map = new HashMap();
        f43857k = map;
        map.put(qb.b.k(new qb.c("kotlin.jvm.internal.KotlinClass")), C3816a.EnumC0573a.f43848F);
        map.put(qb.b.k(new qb.c("kotlin.jvm.internal.KotlinFileFacade")), C3816a.EnumC0573a.f43849G);
        map.put(qb.b.k(new qb.c("kotlin.jvm.internal.KotlinMultifileClass")), C3816a.EnumC0573a.f43851I);
        map.put(qb.b.k(new qb.c("kotlin.jvm.internal.KotlinMultifileClassPart")), C3816a.EnumC0573a.f43852J);
        map.put(qb.b.k(new qb.c("kotlin.jvm.internal.KotlinSyntheticClass")), C3816a.EnumC0573a.f43850H);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        C3816a.EnumC0573a enumC0573a = this.f43865h;
        return enumC0573a == C3816a.EnumC0573a.f43848F || enumC0573a == C3816a.EnumC0573a.f43849G || enumC0573a == C3816a.EnumC0573a.f43852J;
    }

    @Override // jb.x.c
    public x.a c(qb.b bVar, h0 h0Var) {
        C3816a.EnumC0573a enumC0573a;
        if (bVar == null) {
            d(0);
        }
        if (h0Var == null) {
            d(1);
        }
        qb.c cVarA = bVar.a();
        if (cVarA.equals(C1928I.f20139a)) {
            return new c();
        }
        if (cVarA.equals(C1928I.f20158t)) {
            return new d();
        }
        if (f43856j || this.f43865h != null || (enumC0573a = f43857k.get(bVar)) == null) {
            return null;
        }
        this.f43865h = enumC0573a;
        return new e();
    }

    public C3816a m(pb.e eVar) {
        if (this.f43865h == null || this.f43858a == null) {
            return null;
        }
        pb.e eVar2 = new pb.e(this.f43858a, (this.f43860c & 8) != 0);
        if (!eVar2.h(eVar)) {
            this.f43864g = this.f43862e;
            this.f43862e = null;
        } else if (o() && this.f43862e == null) {
            return null;
        }
        String[] strArr = this.f43866i;
        return new C3816a(this.f43865h, eVar2, this.f43862e, this.f43864g, this.f43863f, this.f43859b, this.f43860c, this.f43861d, strArr != null ? C4255a.e(strArr) : null);
    }

    public C3816a n() {
        return m(pb.e.f47733i);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class c implements x.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        class a extends AbstractC0575b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kb.b.AbstractC0575b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f43862e = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kb.b$c$b, reason: collision with other inner class name */
        class C0576b extends AbstractC0575b {
            C0576b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kb.b.AbstractC0575b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f43863f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0576b();
        }

        @Override // jb.x.a
        public void b(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strJ = fVar.j();
            if ("k".equals(strJ)) {
                if (obj instanceof Integer) {
                    b.this.f43865h = C3816a.EnumC0573a.n(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strJ)) {
                if (obj instanceof int[]) {
                    b.this.f43858a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strJ)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f43859b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strJ)) {
                if (obj instanceof Integer) {
                    b.this.f43860c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strJ) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f43861d = str2;
            }
        }

        @Override // jb.x.a
        public void c(f fVar, qb.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // jb.x.a
        public x.a d(f fVar, qb.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // jb.x.a
        public x.b e(f fVar) {
            String strJ = fVar != null ? fVar.j() : null;
            if ("d1".equals(strJ)) {
                return h();
            }
            if ("d2".equals(strJ)) {
                return i();
            }
            return null;
        }

        @Override // jb.x.a
        public void f(f fVar, C4942f c4942f) {
            if (c4942f == null) {
                g(0);
            }
        }

        @Override // jb.x.a
        public void a() {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class d implements x.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        class a extends AbstractC0575b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kb.b.AbstractC0575b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f43866i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        @Override // jb.x.a
        public void c(f fVar, qb.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // jb.x.a
        public x.a d(f fVar, qb.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // jb.x.a
        public x.b e(f fVar) {
            if ("b".equals(fVar != null ? fVar.j() : null)) {
                return h();
            }
            return null;
        }

        @Override // jb.x.a
        public void f(f fVar, C4942f c4942f) {
            if (c4942f == null) {
                g(0);
            }
        }

        @Override // jb.x.a
        public void a() {
        }

        @Override // jb.x.a
        public void b(f fVar, Object obj) {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class e implements x.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        class a extends AbstractC0575b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kb.b.AbstractC0575b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f43862e = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kb.b$e$b, reason: collision with other inner class name */
        class C0577b extends AbstractC0575b {
            C0577b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kb.b.AbstractC0575b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f43863f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0577b();
        }

        @Override // jb.x.a
        public void b(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strJ = fVar.j();
            if ("version".equals(strJ)) {
                if (obj instanceof int[]) {
                    b.this.f43858a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strJ)) {
                b.this.f43859b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // jb.x.a
        public void c(f fVar, qb.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // jb.x.a
        public x.a d(f fVar, qb.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // jb.x.a
        public x.b e(f fVar) {
            String strJ = fVar != null ? fVar.j() : null;
            if ("data".equals(strJ) || "filePartClassNames".equals(strJ)) {
                return h();
            }
            if ("strings".equals(strJ)) {
                return i();
            }
            return null;
        }

        @Override // jb.x.a
        public void f(f fVar, C4942f c4942f) {
            if (c4942f == null) {
                g(0);
            }
        }

        @Override // jb.x.a
        public void a() {
        }
    }

    @Override // jb.x.c
    public void a() {
    }
}
