package io.sentry.android.core;

import android.os.Build;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: BuildInfoProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.s0 */
/* loaded from: classes2.dex */
public final class C9344s0 {

    /* renamed from: a */
    final InterfaceC9670w1 f36100a;

    public C9344s0(InterfaceC9670w1 interfaceC9670w1) {
        this.f36100a = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "The ILogger object is required.");
    }

    /* renamed from: a */
    public String m30403a() {
        return Build.TAGS;
    }

    /* renamed from: b */
    public String m30404b() {
        return Build.MANUFACTURER;
    }

    /* renamed from: c */
    public String m30405c() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public int m30406d() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: e */
    public String m30407e() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean m30408f() {
        /*
            r4 = this;
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "generic"
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L99
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L14
            java.lang.String r2 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L99
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L93
        L14:
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L99
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L93
            java.lang.String r1 = "unknown"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L93
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "goldfish"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L93
            java.lang.String r2 = "ranchu"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L93
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L99
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L93
            java.lang.String r2 = "Emulator"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L93
            java.lang.String r2 = "Android SDK built for x86"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L93
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "Genymotion"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L93
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "sdk_google"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L93
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L93
            java.lang.String r0 = "sdk"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L93
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L93
            java.lang.String r0 = "vbox86p"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L93
            java.lang.String r0 = "emulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L93
            java.lang.String r0 = "simulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = 0
            goto L94
        L93:
            r0 = 1
        L94:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L99
            return r0
        L99:
            r0 = move-exception
            io.sentry.w1 r1 = r4.f36100a
            io.sentry.s4 r2 = io.sentry.EnumC9587s4.ERROR
            java.lang.String r3 = "Error checking whether application is running in an emulator."
            r1.mo30213b(r2, r3, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C9344s0.m30408f():java.lang.Boolean");
    }
}
