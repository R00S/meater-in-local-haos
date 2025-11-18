package kotlin.internal.jdk8;

import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import okhttp3.HttpUrl;

/* compiled from: JDK8PlatformImplementations.kt */
@Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, m32267d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "sdkIsNullOrAtLeast", HttpUrl.FRAGMENT_ENCODE_SET, "version", HttpUrl.FRAGMENT_ENCODE_SET, "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.z.e.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    /* compiled from: JDK8PlatformImplementations.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m32267d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "sdkVersion", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.z.e.a$a */
    private static final class a {

        /* renamed from: a */
        public static final a f41555a = new a();

        /* renamed from: b */
        public static final Integer f41556b;

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
            f41556b = num;
        }

        private a() {
        }
    }

    /* renamed from: c */
    private final boolean m39073c(int i2) {
        Integer num = a.f41556b;
        return num == null || num.intValue() >= i2;
    }

    @Override // kotlin.internal.PlatformImplementations
    /* renamed from: b */
    public Random mo39064b() {
        return m39073c(24) ? new PlatformThreadLocalRandom() : super.mo39064b();
    }
}
