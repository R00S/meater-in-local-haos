package B7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import c7.C2335d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.wearable.C2693t;
import com.google.android.gms.internal.wearable.InterfaceC2686q;
import g7.AbstractC3433d;
import g7.AbstractC3437h;
import g7.C3434e;
import g7.C3445p;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class K1 extends AbstractC3437h {

    /* renamed from: j0, reason: collision with root package name */
    private final ExecutorService f1736j0;

    /* renamed from: k0, reason: collision with root package name */
    private final P0 f1737k0;

    /* renamed from: l0, reason: collision with root package name */
    private final P0 f1738l0;

    /* renamed from: m0, reason: collision with root package name */
    private final P0 f1739m0;

    /* renamed from: n0, reason: collision with root package name */
    private final P0 f1740n0;

    /* renamed from: o0, reason: collision with root package name */
    private final P0 f1741o0;

    /* renamed from: p0, reason: collision with root package name */
    private final P0 f1742p0;

    /* renamed from: q0, reason: collision with root package name */
    private final P0 f1743q0;

    /* renamed from: r0, reason: collision with root package name */
    private final P0 f1744r0;

    /* renamed from: s0, reason: collision with root package name */
    private final P0 f1745s0;

    /* renamed from: t0, reason: collision with root package name */
    private final P0 f1746t0;

    /* renamed from: u0, reason: collision with root package name */
    private final M1 f1747u0;

    /* renamed from: v0, reason: collision with root package name */
    private final InterfaceC2686q f1748v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(final Context context, Looper looper, c.a aVar, c.b bVar, C3434e c3434e) {
        super(context, looper, 14, c3434e, aVar, bVar);
        com.google.android.gms.internal.wearable.K1.a();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        M1 m1A = M1.a(context);
        this.f1737k0 = new P0();
        this.f1738l0 = new P0();
        this.f1739m0 = new P0();
        this.f1740n0 = new P0();
        this.f1741o0 = new P0();
        this.f1742p0 = new P0();
        this.f1743q0 = new P0();
        this.f1744r0 = new P0();
        this.f1745s0 = new P0();
        this.f1746t0 = new P0();
        new P0();
        new P0();
        this.f1736j0 = (ExecutorService) C3445p.k(executorServiceUnconfigurableExecutorService);
        this.f1747u0 = m1A;
        this.f1748v0 = C2693t.a(new InterfaceC2686q() { // from class: B7.I1
            @Override // com.google.android.gms.internal.wearable.InterfaceC2686q
            public final Object a() {
                File file = new File(com.google.android.gms.internal.wearable.B1.a(com.google.android.gms.internal.wearable.A1.a(), new File(com.google.android.gms.internal.wearable.B1.a(com.google.android.gms.internal.wearable.A1.a(), context.getFilesDir(), "wearos_assets")), "streamtmp"));
                file.mkdirs();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        file2.delete();
                    }
                }
                return file;
            }
        });
    }

    @Override // g7.AbstractC3433d
    protected final String E() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // g7.AbstractC3433d
    protected final String F() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // g7.AbstractC3433d
    protected final String G() {
        return this.f1747u0.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // g7.AbstractC3433d
    protected final void N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.f1737k0.a(iBinder);
            this.f1738l0.a(iBinder);
            this.f1739m0.a(iBinder);
            this.f1741o0.a(iBinder);
            this.f1742p0.a(iBinder);
            this.f1743q0.a(iBinder);
            this.f1744r0.a(iBinder);
            this.f1745s0.a(iBinder);
            this.f1746t0.a(iBinder);
            this.f1740n0.a(iBinder);
            i10 = 0;
        }
        super.N(i10, iBinder, bundle, i11);
    }

    @Override // g7.AbstractC3433d
    public final boolean S() {
        return true;
    }

    @Override // g7.AbstractC3433d, com.google.android.gms.common.api.a.f
    public final void a(AbstractC3433d.c cVar) {
        if (!i()) {
            try {
                Bundle bundle = y().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i10 = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i10 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i10);
                    Context contextY = y();
                    Context contextY2 = y();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (contextY2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    R(cVar, 6, PendingIntent.getActivity(contextY, 0, intent, com.google.android.gms.internal.wearable.G1.f34490a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                R(cVar, 16, null);
                return;
            }
        }
        super.a(cVar);
    }

    @Override // g7.AbstractC3433d, com.google.android.gms.common.api.a.f
    public final boolean i() {
        return !this.f1747u0.b();
    }

    @Override // g7.AbstractC3433d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 8600000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0(e7.InterfaceC3214d r17, A7.C0865t r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.K1.l0(e7.d, A7.t):void");
    }

    @Override // g7.AbstractC3433d
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof N0 ? (N0) iInterfaceQueryLocalInterface : new N0(iBinder);
    }

    @Override // g7.AbstractC3433d
    public final C2335d[] v() {
        return A7.N.f964D;
    }
}
