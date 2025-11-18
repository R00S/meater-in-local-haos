package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10471g {

    /* renamed from: a */
    private final boolean f40406a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.g$a */
    public static final class a extends AbstractC10471g {

        /* renamed from: b */
        public static final a f40407b = new a();

        private a() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.g$b */
    public static final class b extends AbstractC10471g {

        /* renamed from: b */
        private final String f40408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            C9801m.m32346f(str, "error");
            this.f40408b = str;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.g$c */
    public static final class c extends AbstractC10471g {

        /* renamed from: b */
        public static final c f40409b = new c();

        private c() {
            super(true, null);
        }
    }

    private AbstractC10471g(boolean z) {
        this.f40406a = z;
    }

    public /* synthetic */ AbstractC10471g(boolean z, C9789g c9789g) {
        this(z);
    }

    /* renamed from: a */
    public final boolean m37197a() {
        return this.f40406a;
    }
}
