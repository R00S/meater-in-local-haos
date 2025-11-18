package d8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import e8.C3236A;
import e8.C3237B;
import e8.C3240c;
import e8.C3251n;
import e8.C3253p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3077u {

    /* renamed from: e, reason: collision with root package name */
    private static final C3253p f39782e = new C3253p("AppUpdateService");

    /* renamed from: f, reason: collision with root package name */
    private static final Intent f39783f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    C3236A f39784a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39785b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f39786c;

    /* renamed from: d, reason: collision with root package name */
    private final C3079w f39787d;

    C3077u(Context context, C3079w c3079w) {
        this.f39785b = context.getPackageName();
        this.f39786c = context;
        this.f39787d = c3079w;
        if (C3240c.a(context)) {
            this.f39784a = new C3236A(C3237B.a(context), f39782e, "AppUpdateService", f39783f, C3073q.f39773a, null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(C3077u c3077u, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(g());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(c3077u.f39786c.getPackageManager().getPackageInfo(c3077u.f39786c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f39782e.a("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ C3057a d(C3077u c3077u, Bundle bundle, String str) {
        int i10 = bundle.getInt("version.code", -1);
        int i11 = bundle.getInt("update.availability");
        int i12 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i13 = bundle.getInt("in.app.update.priority", 0);
        long j10 = bundle.getLong("bytes.downloaded");
        long j11 = bundle.getLong("total.bytes.to.download");
        long j12 = bundle.getLong("additional.size.required");
        long jA = c3077u.f39787d.a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return C3057a.e(str, i10, i11, i12, numValueOf, i13, j10, j11, j12, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Bundle g() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapA = C3251n.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
        if (mapA.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static AbstractC5208j h() {
        f39782e.a("onError(%d)", -9);
        return C5211m.d(new InstallException(-9));
    }

    private static HashSet i(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final AbstractC5208j c(String str) {
        if (this.f39784a == null) {
            return h();
        }
        f39782e.c("requestUpdateInfo(%s)", str);
        C5209k c5209k = new C5209k();
        this.f39784a.s(new C3074r(this, c5209k, str, c5209k), c5209k);
        return c5209k.a();
    }
}
