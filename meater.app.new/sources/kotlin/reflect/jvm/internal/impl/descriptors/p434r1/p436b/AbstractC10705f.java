package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.f */
/* loaded from: classes2.dex */
public abstract class AbstractC10705f implements InterfaceC10021b {

    /* renamed from: a */
    public static final a f41185a = new a(null);

    /* renamed from: b */
    private final C10163f f41186b;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10705f m38080a(Object obj, C10163f c10163f) {
            C9801m.m32346f(obj, "value");
            return C10703d.m38075g(obj.getClass()) ? new C10716q(c10163f, (Enum) obj) : obj instanceof Annotation ? new C10706g(c10163f, (Annotation) obj) : obj instanceof Object[] ? new C10709j(c10163f, (Object[]) obj) : obj instanceof Class ? new C10712m(c10163f, (Class) obj) : new C10718s(c10163f, obj);
        }
    }

    private AbstractC10705f(C10163f c10163f) {
        this.f41186b = c10163f;
    }

    public /* synthetic */ AbstractC10705f(C10163f c10163f, C9789g c9789g) {
        this(c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b
    public C10163f getName() {
        return this.f41186b;
    }
}
