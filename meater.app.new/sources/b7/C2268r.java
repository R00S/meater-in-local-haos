package b7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2268r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30668a;

    /* renamed from: b, reason: collision with root package name */
    private int f30669b;

    /* renamed from: c, reason: collision with root package name */
    private int f30670c = 0;

    public C2268r(Context context) {
        this.f30668a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoE;
        if (this.f30669b == 0) {
            try {
                packageInfoE = l7.c.a(this.f30668a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                this.f30669b = packageInfoE.versionCode;
            }
        }
        return this.f30669b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x0075), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f30670c     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            android.content.Context r0 = r5.f30668a     // Catch: java.lang.Throwable -> L26
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L26
            l7.b r0 = l7.c.a(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r0 = r0.b(r2, r3)     // Catch: java.lang.Throwable -> L26
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L28
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r3
        L26:
            r0 = move-exception
            goto L79
        L28:
            boolean r0 = com.google.android.gms.common.util.l.e()     // Catch: java.lang.Throwable -> L26
            r2 = 1
            if (r0 != 0) goto L48
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L26
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L48
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L48
            goto L62
        L48:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L26
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L26
            r1 = 2
            if (r0 == 0) goto L66
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L66
            r2 = r1
        L62:
            r5.f30670c = r2     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r2
        L66:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.google.android.gms.common.util.l.e()     // Catch: java.lang.Throwable -> L26
            if (r2 == r0) goto L74
            goto L75
        L74:
            r2 = r1
        L75:
            r5.f30670c = r2     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r2
        L79:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C2268r.b():int");
    }
}
