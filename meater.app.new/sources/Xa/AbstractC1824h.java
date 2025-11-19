package Xa;

import hb.InterfaceC3509b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: Xa.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1824h implements InterfaceC3509b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18963b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final qb.f f18964a;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    /* renamed from: Xa.h$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final AbstractC1824h a(Object value, qb.f fVar) {
            C3862t.g(value, "value");
            return C1822f.l(value.getClass()) ? new v(fVar, (Enum) value) : value instanceof Annotation ? new i(fVar, (Annotation) value) : value instanceof Object[] ? new l(fVar, (Object[]) value) : value instanceof Class ? new r(fVar, (Class) value) : new x(fVar, value);
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC1824h(qb.f fVar, C3854k c3854k) {
        this(fVar);
    }

    @Override // hb.InterfaceC3509b
    public qb.f getName() {
        return this.f18964a;
    }

    private AbstractC1824h(qb.f fVar) {
        this.f18964a = fVar;
    }
}
