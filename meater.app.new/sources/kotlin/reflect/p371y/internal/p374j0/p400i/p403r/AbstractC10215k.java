package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.C10775u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10424h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.k */
/* loaded from: classes3.dex */
public abstract class AbstractC10215k extends AbstractC10211g<C10775u> {

    /* renamed from: b */
    public static final a f39565b = new a(null);

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10215k m36032a(String str) {
            C9801m.m32346f(str, "message");
            return new b(str);
        }
    }

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.k$b */
    public static final class b extends AbstractC10215k {

        /* renamed from: c */
        private final String f39566c;

        public b(String str) {
            C9801m.m32346f(str, "message");
            this.f39566c = str;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C10424h mo36013a(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "module");
            return C10427k.m37053d(EnumC10426j.f40326m0, this.f39566c);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
        public String toString() {
            return this.f39566c;
        }
    }

    public AbstractC10215k() {
        super(C10775u.f41439a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C10775u mo36023b() {
        throw new UnsupportedOperationException();
    }
}
