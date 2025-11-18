package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10087b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.text.C10546u;

/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f */
/* loaded from: classes2.dex */
public final class C10689f implements InterfaceC10101q {

    /* renamed from: a */
    public static final a f41143a = new a(null);

    /* renamed from: b */
    private final Class<?> f41144b;

    /* renamed from: c */
    private final C10086a f41145c;

    /* compiled from: ReflectKotlinClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10689f m38026a(Class<?> cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C9801m.m32346f(cls, "klass");
            C10087b c10087b = new C10087b();
            C10686c.f41141a.m38022b(cls, c10087b);
            C10086a c10086aM33935m = c10087b.m33935m();
            C9789g c9789g = null;
            if (c10086aM33935m == null) {
                return null;
            }
            return new C10689f(cls, c10086aM33935m, c9789g);
        }
    }

    private C10689f(Class<?> cls, C10086a c10086a) {
        this.f41144b = cls;
        this.f41145c = c10086a;
    }

    public /* synthetic */ C10689f(Class cls, C10086a c10086a, C9789g c9789g) {
        this(cls, c10086a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q
    /* renamed from: a */
    public C10086a mo34025a() {
        return this.f41145c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q
    /* renamed from: b */
    public void mo34026b(InterfaceC10101q.c cVar, byte[] bArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(cVar, "visitor");
        C10686c.f41141a.m38022b(this.f41144b, cVar);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q
    /* renamed from: c */
    public void mo34027c(InterfaceC10101q.d dVar, byte[] bArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(dVar, "visitor");
        C10686c.f41141a.m38023i(this.f41144b, dVar);
    }

    /* renamed from: d */
    public final Class<?> m38025d() {
        return this.f41144b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q
    /* renamed from: e */
    public C10159b mo34028e() {
        return C10703d.m38069a(this.f41144b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10689f) && C9801m.m32341a(this.f41144b, ((C10689f) obj).f41144b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q
    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.f41144b.getName();
        C9801m.m32345e(name, "klass.name");
        sb.append(C10546u.m37524z(name, '.', '/', false, 4, null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f41144b.hashCode();
    }

    public String toString() {
        return C10689f.class.getName() + ": " + this.f41144b;
    }
}
