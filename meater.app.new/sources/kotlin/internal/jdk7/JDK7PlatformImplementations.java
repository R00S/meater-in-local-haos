package kotlin.internal.jdk7;

import kotlin.Metadata;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: JDK7PlatformImplementations.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, m32267d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "exception", "getSuppressed", HttpUrl.FRAGMENT_ENCODE_SET, "sdkIsNullOrAtLeast", HttpUrl.FRAGMENT_ENCODE_SET, "version", HttpUrl.FRAGMENT_ENCODE_SET, "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.z.d.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* compiled from: JDK7PlatformImplementations.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m32267d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "sdkVersion", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/Integer;", "kotlin-stdlib-jdk7"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.z.d.a$a */
    private static final class a {

        /* renamed from: a */
        public static final a f41553a = new a();

        /* renamed from: b */
        public static final Integer f41554b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                if (num2.intValue() > 0) {
                    num = num2;
                }
            }
            f41554b = num;
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m39072c(int i2) {
        Integer num = a.f41554b;
        return num == null || num.intValue() >= i2;
    }

    @Override // kotlin.internal.PlatformImplementations
    /* renamed from: a */
    public void mo39063a(Throwable th, Throwable th2) {
        C9801m.m32346f(th, "cause");
        C9801m.m32346f(th2, "exception");
        if (m39072c(19)) {
            return;
        }
        super.mo39063a(th, th2);
    }
}
