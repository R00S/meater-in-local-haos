package com.flurry.sdk;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import p241e.p252d.p253a.EnumC8778d;

/* renamed from: com.flurry.sdk.s3 */
/* loaded from: classes2.dex */
public final class C6158s3 extends AbstractC6153r6 {

    /* renamed from: e */
    private static final AtomicInteger f16319e = new AtomicInteger(0);

    /* renamed from: com.flurry.sdk.s3$a */
    public enum a {
        RECOVERABLE_ERROR(1),
        CAUGHT_EXCEPTION(2),
        UNRECOVERABLE_CRASH(3);


        /* renamed from: j */
        public int f16324j;

        a(int i2) {
            this.f16324j = i2;
        }
    }

    /* renamed from: com.flurry.sdk.s3$b */
    public enum b {
        NO_LOG(0),
        ANDROID_LOG_ATTACHED(2),
        NATIVE_CRASH_ATTACHED(3);


        /* renamed from: j */
        public int f16329j;

        b(int i2) {
            this.f16329j = i2;
        }
    }

    private C6158s3(InterfaceC6169t6 interfaceC6169t6) {
        super(interfaceC6169t6);
    }

    /* renamed from: h */
    public static EnumC8778d m13302h(C6001b c6001b) {
        if (c6001b == null) {
            C6021d1.m13041n("StreamingErrorFrame", "Error is null, do not send the frame.");
            return EnumC8778d.kFlurryEventFailed;
        }
        EnumC6136p7 enumC6136p7 = EnumC6136p7.UNCAUGHT_EXCEPTION_ID;
        boolean zEquals = enumC6136p7.f16268i.equals(c6001b.f15668a);
        List<C6109m7> list = zEquals ? c6001b.f15675h : null;
        int iIncrementAndGet = f16319e.incrementAndGet();
        String str = c6001b.f15668a;
        long j2 = c6001b.f15669b;
        String str2 = c6001b.f15670c;
        String str3 = c6001b.f15671d;
        String strM13304j = m13304j(c6001b.f15672e);
        String str4 = c6001b.f15668a;
        C6158s3 c6158s3 = new C6158s3(new C6166t3(iIncrementAndGet, str, j2, str2, str3, strM13304j, c6001b.f15672e != null ? enumC6136p7.f16268i.equals(str4) ? a.UNRECOVERABLE_CRASH.f16324j : a.CAUGHT_EXCEPTION.f16324j : EnumC6136p7.NATIVE_CRASH.f16268i.equals(str4) ? a.UNRECOVERABLE_CRASH.f16324j : a.RECOVERABLE_ERROR.f16324j, c6001b.f15672e == null ? b.NO_LOG.f16329j : b.ANDROID_LOG_ATTACHED.f16329j, c6001b.f15673f, c6001b.f15674g, C6118n7.m13210c(), list, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        if (zEquals) {
            C6104m2.m13180a().f16133b.f16377a.m13385c(c6158s3);
        } else {
            C6104m2.m13180a().m13181b(c6158s3);
        }
        return EnumC8778d.kFlurryEventRecorded;
    }

    /* renamed from: i */
    public static C6158s3 m13303i(C6166t3 c6166t3) {
        return new C6158s3(c6166t3);
    }

    /* renamed from: j */
    private static String m13304j(Throwable th) {
        if (th == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append(stackTraceElement);
            sb.append(C6113n2.f16169a);
        }
        if (th.getCause() != null) {
            sb.append(C6113n2.f16169a);
            sb.append("Caused by: ");
            for (StackTraceElement stackTraceElement2 : th.getCause().getStackTrace()) {
                sb.append(stackTraceElement2);
                sb.append(C6113n2.f16169a);
            }
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static AtomicInteger m13305k() {
        return f16319e;
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: a */
    public final EnumC6161s6 mo12961a() {
        return EnumC6161s6.ANALYTICS_ERROR;
    }
}
