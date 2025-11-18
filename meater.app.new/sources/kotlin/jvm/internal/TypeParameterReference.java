package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import okhttp3.HttpUrl;

/* compiled from: TypeParameterReference.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, m32267d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "container", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, "variance", "Lkotlin/reflect/KVariance;", "isReified", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "bounds", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KType;", "()Z", "getName", "()Ljava/lang/String;", "upperBounds", "getUpperBounds$annotations", "()V", "getUpperBounds", "()Ljava/util/List;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "setUpperBounds", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.a0.d.m0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class TypeParameterReference implements KTypeParameter {

    /* renamed from: f */
    public static final a f37187f = new a(null);

    /* compiled from: TypeParameterReference.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "typeParameter", "Lkotlin/reflect/KTypeParameter;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.a0.d.m0$a */
    public static final class a {

        /* compiled from: TypeParameterReference.kt */
        @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.a0.d.m0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11535a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f37188a;

            static {
                int[] iArr = new int[KVariance.values().length];
                iArr[KVariance.INVARIANT.ordinal()] = 1;
                iArr[KVariance.IN.ordinal()] = 2;
                iArr[KVariance.OUT.ordinal()] = 3;
                f37188a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final String m32364a(KTypeParameter kTypeParameter) {
            C9801m.m32346f(kTypeParameter, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i2 = C11535a.f37188a[kTypeParameter.mo32439n().ordinal()];
            if (i2 == 2) {
                sb.append("in ");
            } else if (i2 == 3) {
                sb.append("out ");
            }
            sb.append(kTypeParameter.getName());
            String string = sb.toString();
            C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }
}
