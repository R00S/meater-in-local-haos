package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import okhttp3.HttpUrl;

/* compiled from: PlatformImplementations.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, m32267d2 = {"Lkotlin/internal/PlatformImplementations;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "addSuppressed", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getSuppressed", HttpUrl.FRAGMENT_ENCODE_SET, "ReflectThrowable", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.z.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class PlatformImplementations {

    /* compiled from: PlatformImplementations.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m32267d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.z.a$a */
    private static final class a {

        /* renamed from: a */
        public static final a f41549a = new a();

        /* renamed from: b */
        public static final Method f41550b;

        /* renamed from: c */
        public static final Method f41551c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        static {
            /*
                kotlin.z.a$a r0 = new kotlin.z.a$a
                r0.<init>()
                kotlin.internal.PlatformImplementations.a.f41549a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C9801m.m32345e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C9801m.m32341a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C9801m.m32345e(r7, r8)
                java.lang.Object r7 = kotlin.collections.C10795j.m38662O(r7)
                boolean r7 = kotlin.jvm.internal.C9801m.m32341a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                kotlin.internal.PlatformImplementations.a.f41550b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C9801m.m32341a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                kotlin.internal.PlatformImplementations.a.f41551c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementations.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: a */
    public void mo39063a(Throwable th, Throwable th2) {
        C9801m.m32346f(th, "cause");
        C9801m.m32346f(th2, "exception");
        Method method = a.f41550b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public Random mo39064b() {
        return new FallbackThreadLocalRandom();
    }
}
