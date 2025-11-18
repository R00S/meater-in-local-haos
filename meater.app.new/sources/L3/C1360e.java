package L3;

import android.content.Context;
import java.io.File;

/* compiled from: L.java */
/* renamed from: L3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1360e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9146a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9147b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f9148c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f9149d = true;

    /* renamed from: e, reason: collision with root package name */
    private static EnumC1356a f9150e = EnumC1356a.AUTOMATIC;

    /* renamed from: f, reason: collision with root package name */
    private static U3.f f9151f;

    /* renamed from: g, reason: collision with root package name */
    private static U3.e f9152g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile U3.h f9153h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile U3.g f9154i;

    /* renamed from: j, reason: collision with root package name */
    private static ThreadLocal<X3.f> f9155j;

    public static void b(String str) {
        if (f9147b) {
            f().a(str);
        }
    }

    public static float c(String str) {
        if (f9147b) {
            return f().b(str);
        }
        return 0.0f;
    }

    public static EnumC1356a d() {
        return f9150e;
    }

    public static boolean e() {
        return f9149d;
    }

    private static X3.f f() {
        X3.f fVar = f9155j.get();
        if (fVar != null) {
            return fVar;
        }
        X3.f fVar2 = new X3.f();
        f9155j.set(fVar2);
        return fVar2;
    }

    public static boolean g() {
        return f9147b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File h(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static U3.g i(Context context) {
        if (!f9148c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        U3.g gVar = f9154i;
        if (gVar == null) {
            synchronized (U3.g.class) {
                try {
                    gVar = f9154i;
                    if (gVar == null) {
                        U3.e eVar = f9152g;
                        if (eVar == null) {
                            eVar = new U3.e() { // from class: L3.d
                                @Override // U3.e
                                public final File a() {
                                    return C1360e.h(applicationContext);
                                }
                            };
                        }
                        gVar = new U3.g(eVar);
                        f9154i = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    public static U3.h j(Context context) {
        U3.h hVar = f9153h;
        if (hVar == null) {
            synchronized (U3.h.class) {
                try {
                    hVar = f9153h;
                    if (hVar == null) {
                        U3.g gVarI = i(context);
                        U3.f bVar = f9151f;
                        if (bVar == null) {
                            bVar = new U3.b();
                        }
                        hVar = new U3.h(gVarI, bVar);
                        f9153h = hVar;
                    }
                } finally {
                }
            }
        }
        return hVar;
    }
}
