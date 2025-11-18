package L3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, com.airbnb.lottie.o<i>> f9193a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<B> f9194b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f9195c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9196d = {31, -117, 8};

    private static z<i> A(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        i iVarA;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            iVarA = null;
        } else {
            try {
                iVarA = Q3.g.b().a(str);
            } catch (IOException e10) {
                return new z<>((Throwable) e10);
            }
        }
        if (iVarA != null) {
            return new z<>(iVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i iVarB = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                iVarB = r(W3.c.n(Cc.o.d(Cc.o.k(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = zipInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    X3.d.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    X3.d.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVarB == null) {
            return new z<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            u uVarI = i(iVarB, (String) entry.getKey());
            if (uVarI != null) {
                uVarI.g(X3.j.l((Bitmap) entry.getValue(), uVarI.f(), uVarI.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (Q3.c cVar : iVarB.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                X3.d.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, u>> it = iVarB.j().entrySet().iterator();
            while (it.hasNext()) {
                u value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strC = value.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        value.g(X3.j.l(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), value.f(), value.d()));
                    } catch (IllegalArgumentException e11) {
                        X3.d.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            Q3.g.b().c(str, iVarB);
        }
        return new z<>(iVarB);
    }

    private static Boolean B(Cc.g gVar) {
        return L(gVar, f9196d);
    }

    private static boolean C(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean D(Cc.g gVar) {
        return L(gVar, f9195c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(String str, AtomicBoolean atomicBoolean, i iVar) {
        Map<String, com.airbnb.lottie.o<i>> map = f9193a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, com.airbnb.lottie.o<i>> map = f9193a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z J(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z K(Context context, String str, String str2) {
        z<i> zVarC = C1360e.j(context).c(context, str, str2);
        if (str2 != null && zVarC.b() != null) {
            Q3.g.b().c(str2, zVarC.b());
        }
        return zVarC;
    }

    private static Boolean L(Cc.g gVar, byte[] bArr) {
        try {
            Cc.g gVarO1 = gVar.o1();
            for (byte b10 : bArr) {
                if (gVarO1.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            gVarO1.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            X3.d.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void M(boolean z10) {
        ArrayList arrayList = new ArrayList(f9194b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((B) arrayList.get(i10)).a(z10);
        }
    }

    private static String N(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(C(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    private static com.airbnb.lottie.o<i> h(final String str, Callable<z<i>> callable, Runnable runnable) {
        i iVarA = str == null ? null : Q3.g.b().a(str);
        com.airbnb.lottie.o<i> oVar = iVarA != null ? new com.airbnb.lottie.o<>(iVarA) : null;
        if (str != null) {
            Map<String, com.airbnb.lottie.o<i>> map = f9193a;
            if (map.containsKey(str)) {
                oVar = map.get(str);
            }
        }
        if (oVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return oVar;
        }
        com.airbnb.lottie.o<i> oVar2 = new com.airbnb.lottie.o<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            oVar2.d(new v() { // from class: L3.n
                @Override // L3.v
                public final void onResult(Object obj) {
                    q.E(str, atomicBoolean, (i) obj);
                }
            });
            oVar2.c(new v() { // from class: L3.o
                @Override // L3.v
                public final void onResult(Object obj) {
                    q.F(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, com.airbnb.lottie.o<i>> map2 = f9193a;
                map2.put(str, oVar2);
                if (map2.size() == 1) {
                    M(false);
                }
            }
        }
        return oVar2;
    }

    private static u i(i iVar, String str) {
        for (u uVar : iVar.j().values()) {
            if (uVar.c().equals(str)) {
                return uVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.o<i> j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static com.airbnb.lottie.o<i> k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: L3.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.m(applicationContext, str, str2);
            }
        }, null);
    }

    public static z<i> l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static z<i> m(Context context, String str, String str2) {
        i iVarA = str2 == null ? null : Q3.g.b().a(str2);
        if (iVarA != null) {
            return new z<>(iVarA);
        }
        try {
            Cc.g gVarD = Cc.o.d(Cc.o.k(context.getAssets().open(str)));
            return D(gVarD).booleanValue() ? y(context, new ZipInputStream(gVarD.A1()), str2) : B(gVarD).booleanValue() ? o(new GZIPInputStream(gVarD.A1()), str2) : o(gVarD.A1(), str2);
        } catch (IOException e10) {
            return new z<>((Throwable) e10);
        }
    }

    public static com.airbnb.lottie.o<i> n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: L3.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.o(inputStream, str);
            }
        }, new Runnable() { // from class: L3.l
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                X3.j.c(inputStream);
            }
        });
    }

    public static z<i> o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    public static z<i> p(InputStream inputStream, String str, boolean z10) {
        return q(W3.c.n(Cc.o.d(Cc.o.k(inputStream))), str, z10);
    }

    public static z<i> q(W3.c cVar, String str, boolean z10) {
        return r(cVar, str, z10);
    }

    private static z<i> r(W3.c cVar, String str, boolean z10) throws IOException {
        i iVarA;
        try {
            if (str == null) {
                iVarA = null;
            } else {
                try {
                    iVarA = Q3.g.b().a(str);
                } catch (Exception e10) {
                    z<i> zVar = new z<>(e10);
                    if (z10) {
                        X3.j.c(cVar);
                    }
                    return zVar;
                }
            }
            if (iVarA != null) {
                z<i> zVar2 = new z<>(iVarA);
                if (z10) {
                    X3.j.c(cVar);
                }
                return zVar2;
            }
            i iVarA2 = V3.w.a(cVar);
            if (str != null) {
                Q3.g.b().c(str, iVarA2);
            }
            z<i> zVar3 = new z<>(iVarA2);
            if (z10) {
                X3.j.c(cVar);
            }
            return zVar3;
        } catch (Throwable th) {
            if (z10) {
                X3.j.c(cVar);
            }
            throw th;
        }
    }

    public static com.airbnb.lottie.o<i> s(Context context, int i10) {
        return t(context, i10, N(context, i10));
    }

    public static com.airbnb.lottie.o<i> t(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: L3.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.J(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    public static z<i> u(Context context, int i10) {
        return v(context, i10, N(context, i10));
    }

    public static z<i> v(Context context, int i10, String str) {
        i iVarA = str == null ? null : Q3.g.b().a(str);
        if (iVarA != null) {
            return new z<>(iVarA);
        }
        try {
            Cc.g gVarD = Cc.o.d(Cc.o.k(context.getResources().openRawResource(i10)));
            if (D(gVarD).booleanValue()) {
                return y(context, new ZipInputStream(gVarD.A1()), str);
            }
            if (!B(gVarD).booleanValue()) {
                return o(gVarD.A1(), str);
            }
            try {
                return o(new GZIPInputStream(gVarD.A1()), str);
            } catch (IOException e10) {
                return new z<>((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new z<>((Throwable) e11);
        }
    }

    public static com.airbnb.lottie.o<i> w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.o<i> x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: L3.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.K(context, str, str2);
            }
        }, null);
    }

    public static z<i> y(Context context, ZipInputStream zipInputStream, String str) {
        return z(context, zipInputStream, str, true);
    }

    public static z<i> z(Context context, ZipInputStream zipInputStream, String str, boolean z10) throws IOException {
        try {
            return A(context, zipInputStream, str);
        } finally {
            if (z10) {
                X3.j.c(zipInputStream);
            }
        }
    }
}
