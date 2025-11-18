package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: FlexibleTypeDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.s */
/* loaded from: classes3.dex */
public interface InterfaceC10309s {

    /* compiled from: FlexibleTypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.s$a */
    public static final class a implements InterfaceC10309s {

        /* renamed from: a */
        public static final a f39955a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10309s
        /* renamed from: a */
        public AbstractC10344e0 mo33979a(C10138q c10138q, String str, AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
            C9801m.m32346f(c10138q, "proto");
            C9801m.m32346f(str, "flexibleId");
            C9801m.m32346f(abstractC10368m0, "lowerBound");
            C9801m.m32346f(abstractC10368m02, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    /* renamed from: a */
    AbstractC10344e0 mo33979a(C10138q c10138q, String str, AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02);
}
