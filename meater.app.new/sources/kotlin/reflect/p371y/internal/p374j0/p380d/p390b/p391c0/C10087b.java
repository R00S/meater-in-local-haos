package kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9945a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10113a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10117e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10210f;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* renamed from: kotlin.f0.y.e.j0.d.b.c0.b */
/* loaded from: classes3.dex */
public class C10087b implements InterfaceC10101q.c {

    /* renamed from: a */
    private static final boolean f38421a = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: b */
    private static final Map<C10159b, C10086a.a> f38422b;

    /* renamed from: c */
    private int[] f38423c = null;

    /* renamed from: d */
    private String f38424d = null;

    /* renamed from: e */
    private int f38425e = 0;

    /* renamed from: f */
    private String f38426f = null;

    /* renamed from: g */
    private String[] f38427g = null;

    /* renamed from: h */
    private String[] f38428h = null;

    /* renamed from: i */
    private String[] f38429i = null;

    /* renamed from: j */
    private C10086a.a f38430j = null;

    /* renamed from: k */
    private String[] f38431k = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$b */
    private static abstract class b implements InterfaceC10101q.b {

        /* renamed from: a */
        private final List<String> f38432a = new ArrayList();

        /* renamed from: f */
        private static /* synthetic */ void m33936f(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i2 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i2 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i2 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i2 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
        /* renamed from: a */
        public void mo33905a() {
            mo33937g((String[]) this.f38432a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
        /* renamed from: b */
        public void mo33906b(Object obj) {
            if (obj instanceof String) {
                this.f38432a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
        /* renamed from: c */
        public void mo33907c(C10159b c10159b, C10163f c10163f) {
            if (c10159b == null) {
                m33936f(0);
            }
            if (c10163f == null) {
                m33936f(1);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
        /* renamed from: d */
        public InterfaceC10101q.a mo33908d(C10159b c10159b) {
            if (c10159b != null) {
                return null;
            }
            m33936f(3);
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.b
        /* renamed from: e */
        public void mo33909e(C10210f c10210f) {
            if (c10210f == null) {
                m33936f(2);
            }
        }

        /* renamed from: g */
        protected abstract void mo33937g(String[] strArr);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$c */
    private class c implements InterfaceC10101q.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$c$a */
        class a extends b {
            a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m33941f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10087b.b
            /* renamed from: g */
            protected void mo33937g(String[] strArr) {
                if (strArr == null) {
                    m33941f(0);
                }
                C10087b.this.f38427g = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$c$b */
        class b extends b {
            b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m33942f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10087b.b
            /* renamed from: g */
            protected void mo33937g(String[] strArr) {
                if (strArr == null) {
                    m33942f(0);
                }
                C10087b.this.f38428h = strArr;
            }
        }

        private c() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m33938g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumClassId";
            } else if (i2 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i2 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "visitEnum";
            } else if (i2 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC10101q.b m33939h() {
            return new a();
        }

        /* renamed from: i */
        private InterfaceC10101q.b m33940i() {
            return new b();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: a */
        public void mo33903a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: b */
        public void mo33896b(C10163f c10163f, C10210f c10210f) {
            if (c10210f == null) {
                m33938g(0);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: c */
        public void mo33897c(C10163f c10163f, Object obj) {
            if (c10163f == null) {
                return;
            }
            String strM35455k = c10163f.m35455k();
            if ("k".equals(strM35455k)) {
                if (obj instanceof Integer) {
                    C10087b.this.f38430j = C10086a.a.m33923q(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strM35455k)) {
                if (obj instanceof int[]) {
                    C10087b.this.f38423c = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strM35455k)) {
                if (obj instanceof String) {
                    C10087b.this.f38424d = (String) obj;
                    return;
                }
                return;
            }
            if ("xi".equals(strM35455k)) {
                if (obj instanceof Integer) {
                    C10087b.this.f38425e = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strM35455k) && (obj instanceof String)) {
                C10087b.this.f38426f = (String) obj;
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: d */
        public void mo33898d(C10163f c10163f, C10159b c10159b, C10163f c10163f2) {
            if (c10159b == null) {
                m33938g(1);
            }
            if (c10163f2 == null) {
                m33938g(2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: e */
        public InterfaceC10101q.a mo33899e(C10163f c10163f, C10159b c10159b) {
            if (c10159b != null) {
                return null;
            }
            m33938g(3);
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: f */
        public InterfaceC10101q.b mo33900f(C10163f c10163f) {
            String strM35455k = c10163f != null ? c10163f.m35455k() : null;
            if ("d1".equals(strM35455k)) {
                return m33939h();
            }
            if ("d2".equals(strM35455k)) {
                return m33940i();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$d */
    private class d implements InterfaceC10101q.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$d$a */
        class a extends b {
            a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m33945f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10087b.b
            /* renamed from: g */
            protected void mo33937g(String[] strArr) {
                if (strArr == null) {
                    m33945f(0);
                }
                C10087b.this.f38431k = strArr;
            }
        }

        private d() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m33943g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumClassId";
            } else if (i2 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i2 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "visitEnum";
            } else if (i2 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC10101q.b m33944h() {
            return new a();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: a */
        public void mo33903a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: b */
        public void mo33896b(C10163f c10163f, C10210f c10210f) {
            if (c10210f == null) {
                m33943g(0);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: c */
        public void mo33897c(C10163f c10163f, Object obj) {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: d */
        public void mo33898d(C10163f c10163f, C10159b c10159b, C10163f c10163f2) {
            if (c10159b == null) {
                m33943g(1);
            }
            if (c10163f2 == null) {
                m33943g(2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: e */
        public InterfaceC10101q.a mo33899e(C10163f c10163f, C10159b c10159b) {
            if (c10159b != null) {
                return null;
            }
            m33943g(3);
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: f */
        public InterfaceC10101q.b mo33900f(C10163f c10163f) {
            if ("b".equals(c10163f != null ? c10163f.m35455k() : null)) {
                return m33944h();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$e */
    private class e implements InterfaceC10101q.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$e$a */
        class a extends b {
            a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m33949f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10087b.b
            /* renamed from: g */
            protected void mo33937g(String[] strArr) {
                if (strArr == null) {
                    m33949f(0);
                }
                C10087b.this.f38427g = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c0.b$e$b */
        class b extends b {
            b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m33950f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10087b.b
            /* renamed from: g */
            protected void mo33937g(String[] strArr) {
                if (strArr == null) {
                    m33950f(0);
                }
                C10087b.this.f38428h = strArr;
            }
        }

        private e() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m33946g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumClassId";
            } else if (i2 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i2 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "visitEnum";
            } else if (i2 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC10101q.b m33947h() {
            return new a();
        }

        /* renamed from: i */
        private InterfaceC10101q.b m33948i() {
            return new b();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: a */
        public void mo33903a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: b */
        public void mo33896b(C10163f c10163f, C10210f c10210f) {
            if (c10210f == null) {
                m33946g(0);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: c */
        public void mo33897c(C10163f c10163f, Object obj) {
            if (c10163f == null) {
                return;
            }
            String strM35455k = c10163f.m35455k();
            if ("version".equals(strM35455k)) {
                if (obj instanceof int[]) {
                    C10087b.this.f38423c = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strM35455k)) {
                C10087b.this.f38424d = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: d */
        public void mo33898d(C10163f c10163f, C10159b c10159b, C10163f c10163f2) {
            if (c10159b == null) {
                m33946g(1);
            }
            if (c10163f2 == null) {
                m33946g(2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: e */
        public InterfaceC10101q.a mo33899e(C10163f c10163f, C10159b c10159b) {
            if (c10159b != null) {
                return null;
            }
            m33946g(3);
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.a
        /* renamed from: f */
        public InterfaceC10101q.b mo33900f(C10163f c10163f) {
            String strM35455k = c10163f != null ? c10163f.m35455k() : null;
            if ("data".equals(strM35455k) || "filePartClassNames".equals(strM35455k)) {
                return m33947h();
            }
            if ("strings".equals(strM35455k)) {
                return m33948i();
            }
            return null;
        }
    }

    static {
        HashMap map = new HashMap();
        f38422b = map;
        map.put(C10159b.m35408m(new C10160c("kotlin.jvm.internal.KotlinClass")), C10086a.a.CLASS);
        map.put(C10159b.m35408m(new C10160c("kotlin.jvm.internal.KotlinFileFacade")), C10086a.a.FILE_FACADE);
        map.put(C10159b.m35408m(new C10160c("kotlin.jvm.internal.KotlinMultifileClass")), C10086a.a.MULTIFILE_CLASS);
        map.put(C10159b.m35408m(new C10160c("kotlin.jvm.internal.KotlinMultifileClassPart")), C10086a.a.MULTIFILE_CLASS_PART);
        map.put(C10159b.m35408m(new C10160c("kotlin.jvm.internal.KotlinSyntheticClass")), C10086a.a.SYNTHETIC_CLASS);
    }

    /* renamed from: d */
    private static /* synthetic */ void m33925d(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: n */
    private boolean m33934n() {
        C10086a.a aVar = this.f38430j;
        return aVar == C10086a.a.CLASS || aVar == C10086a.a.FILE_FACADE || aVar == C10086a.a.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
    /* renamed from: a */
    public void mo32695a() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
    /* renamed from: b */
    public InterfaceC10101q.a mo32696b(C10159b c10159b, InterfaceC10741z0 interfaceC10741z0) {
        C10086a.a aVar;
        if (c10159b == null) {
            m33925d(0);
        }
        if (interfaceC10741z0 == null) {
            m33925d(1);
        }
        C10160c c10160cM35409b = c10159b.m35409b();
        if (c10160cM35409b.equals(C9945a0.f37786a)) {
            return new c();
        }
        if (c10160cM35409b.equals(C9945a0.f37804s)) {
            return new d();
        }
        if (f38421a || this.f38430j != null || (aVar = f38422b.get(c10159b)) == null) {
            return null;
        }
        this.f38430j = aVar;
        return new e();
    }

    /* renamed from: m */
    public C10086a m33935m() {
        if (this.f38430j == null || this.f38423c == null) {
            return null;
        }
        C10117e c10117e = new C10117e(this.f38423c, (this.f38425e & 8) != 0);
        if (!c10117e.m34252h()) {
            this.f38429i = this.f38427g;
            this.f38427g = null;
        } else if (m33934n() && this.f38427g == null) {
            return null;
        }
        String[] strArr = this.f38431k;
        return new C10086a(this.f38430j, c10117e, this.f38427g, this.f38429i, this.f38428h, this.f38424d, this.f38425e, this.f38426f, strArr != null ? C10113a.m34242e(strArr) : null);
    }
}
