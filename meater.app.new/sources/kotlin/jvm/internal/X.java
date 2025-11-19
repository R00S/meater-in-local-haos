package kotlin.jvm.internal;

import kotlin.Metadata;

/* compiled from: TypeParameterReference.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/jvm/internal/X;", "LIa/r;", "B", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class X implements Ia.r {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: TypeParameterReference.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/jvm/internal/X$a;", "", "<init>", "()V", "LIa/r;", "typeParameter", "", "a", "(LIa/r;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.X$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: TypeParameterReference.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.jvm.internal.X$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0581a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43985a;

            static {
                int[] iArr = new int[Ia.t.values().length];
                try {
                    iArr[Ia.t.f6946B.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Ia.t.f6947C.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Ia.t.f6948D.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f43985a = iArr;
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final String a(Ia.r typeParameter) {
            C3862t.g(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0581a.f43985a[typeParameter.p().ordinal()];
            if (i10 == 2) {
                sb2.append("in ");
            } else if (i10 == 3) {
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            String string = sb2.toString();
            C3862t.f(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }
}
