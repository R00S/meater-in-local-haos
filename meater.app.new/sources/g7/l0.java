package g7;

import android.content.ComponentName;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f42066f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f42067a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42068b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f42069c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42070d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f42071e;

    public l0(String str, String str2, int i10, boolean z10) {
        C3445p.e(str);
        this.f42067a = str;
        C3445p.e(str2);
        this.f42068b = str2;
        this.f42069c = null;
        this.f42070d = 4225;
        this.f42071e = z10;
    }

    public final ComponentName a() {
        return this.f42069c;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent b(android.content.Context r6) throws com.google.android.gms.common.internal.zzaj, android.os.RemoteException {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.f42067a
            if (r1 == 0) goto Lb1
            boolean r1 = r5.f42071e
            r2 = 0
            if (r1 == 0) goto La1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.f42067a
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            android.net.Uri r3 = g7.l0.f42066f     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r3)     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            if (r6 == 0) goto L3a
            java.lang.String r3 = "serviceIntentCall"
            android.os.Bundle r1 = r6.call(r3, r2, r1)     // Catch: java.lang.Throwable -> L31
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            goto L50
        L2d:
            r6 = move-exception
            goto L43
        L2f:
            r6 = move-exception
            goto L43
        L31:
            r1 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            throw r1     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
        L36:
            r6 = move-exception
            goto L42
        L38:
            r6 = move-exception
            goto L42
        L3a:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            java.lang.String r1 = "Failed to acquire ContentProviderClient"
            r6.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            throw r6     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
        L42:
            r1 = r2
        L43:
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r3.concat(r6)
            android.util.Log.w(r0, r6)
        L50:
            if (r1 == 0) goto L90
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 != 0) goto L90
            java.lang.String r6 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            if (r6 != 0) goto L68
            goto L90
        L68:
            java.lang.String r1 = r5.f42067a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " but has possible resolution"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r0, r1)
            com.google.android.gms.common.internal.zzaj r0 = new com.google.android.gms.common.internal.zzaj
            c7.b r1 = new c7.b
            r2 = 25
            r1.<init>(r2, r6)
            r0.<init>(r1)
            throw r0
        L90:
            if (r2 != 0) goto La1
            java.lang.String r6 = r5.f42067a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        La1:
            if (r2 != 0) goto Lbc
            java.lang.String r6 = r5.f42067a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r5.f42068b
            android.content.Intent r6 = r0.setPackage(r6)
            return r6
        Lb1:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.f42069c
            android.content.Intent r2 = r6.setComponent(r0)
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.l0.b(android.content.Context):android.content.Intent");
    }

    public final String c() {
        return this.f42068b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return C3443n.a(this.f42067a, l0Var.f42067a) && C3443n.a(this.f42068b, l0Var.f42068b) && C3443n.a(this.f42069c, l0Var.f42069c) && this.f42071e == l0Var.f42071e;
    }

    public final int hashCode() {
        return C3443n.b(this.f42067a, this.f42068b, this.f42069c, 4225, Boolean.valueOf(this.f42071e));
    }

    public final String toString() {
        String str = this.f42067a;
        if (str != null) {
            return str;
        }
        C3445p.k(this.f42069c);
        return this.f42069c.flattenToString();
    }
}
