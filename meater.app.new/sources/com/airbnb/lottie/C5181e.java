package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import android.util.Log;
import cm.aptoide.p092pt.utils.MultiDexHelper;
import com.airbnb.lottie.p112s.C5235g;
import com.airbnb.lottie.p116t.C5278c;
import com.airbnb.lottie.p117u.C5308t;
import com.airbnb.lottie.p118v.C5320f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: LottieCompositionFactory.java */
/* renamed from: com.airbnb.lottie.e */
/* loaded from: classes.dex */
public class C5181e {

    /* renamed from: a */
    private static final Map<String, C5188l<C5180d>> f12344a = new HashMap();

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$a */
    static class a implements InterfaceC5184h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f12345a;

        a(String str) {
            this.f12345a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC5184h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9387a(Throwable th) {
            C5181e.f12344a.remove(this.f12345a);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$b */
    static class b implements Callable<C5187k<C5180d>> {

        /* renamed from: f */
        final /* synthetic */ Context f12346f;

        /* renamed from: g */
        final /* synthetic */ String f12347g;

        b(Context context, String str) {
            this.f12346f = context;
            this.f12347g = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5187k<C5180d> call() {
            return C5181e.m9415e(this.f12346f, this.f12347g);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$c */
    static class c implements Callable<C5187k<C5180d>> {

        /* renamed from: f */
        final /* synthetic */ Context f12348f;

        /* renamed from: g */
        final /* synthetic */ int f12349g;

        c(Context context, int i2) {
            this.f12348f = context;
            this.f12349g = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5187k<C5180d> call() {
            return C5181e.m9421k(this.f12348f, this.f12349g);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$d */
    static class d implements Callable<C5187k<C5180d>> {

        /* renamed from: f */
        final /* synthetic */ JsonReader f12350f;

        /* renamed from: g */
        final /* synthetic */ String f12351g;

        d(JsonReader jsonReader, String str) {
            this.f12350f = jsonReader;
            this.f12351g = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5187k<C5180d> call() {
            return C5181e.m9419i(this.f12350f, this.f12351g);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$e */
    static class e implements Callable<C5187k<C5180d>> {

        /* renamed from: f */
        final /* synthetic */ C5180d f12352f;

        e(C5180d c5180d) {
            this.f12352f = c5180d;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5187k<C5180d> call() {
            Log.d("Gabe", "call\treturning from cache");
            return new C5187k<>(this.f12352f);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$f */
    static class f implements InterfaceC5184h<C5180d> {

        /* renamed from: a */
        final /* synthetic */ String f12353a;

        f(String str) {
            this.f12353a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC5184h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9387a(C5180d c5180d) {
            if (this.f12353a != null) {
                C5235g.m9612b().m9614c(this.f12353a, c5180d);
            }
            C5181e.f12344a.remove(this.f12353a);
        }
    }

    /* renamed from: b */
    private static C5188l<C5180d> m9412b(String str, Callable<C5187k<C5180d>> callable) {
        C5180d c5180dM9613a = C5235g.m9612b().m9613a(str);
        if (c5180dM9613a != null) {
            return new C5188l<>(new e(c5180dM9613a));
        }
        Map<String, C5188l<C5180d>> map = f12344a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        C5188l<C5180d> c5188l = new C5188l<>(callable);
        c5188l.m9503h(new f(str));
        c5188l.m9502g(new a(str));
        map.put(str, c5188l);
        return c5188l;
    }

    /* renamed from: c */
    private static C5183g m9413c(C5180d c5180d, String str) {
        for (C5183g c5183g : c5180d.m9403i().values()) {
            if (c5183g.m9483b().equals(str)) {
                return c5183g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C5188l<C5180d> m9414d(Context context, String str) {
        return m9412b(str, new b(context.getApplicationContext(), str));
    }

    /* renamed from: e */
    public static C5187k<C5180d> m9415e(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            return str.endsWith(MultiDexHelper.EXTRACTED_SUFFIX) ? m9423m(new ZipInputStream(context.getAssets().open(str)), str2) : m9416f(context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new C5187k<>((Throwable) e2);
        }
    }

    /* renamed from: f */
    public static C5187k<C5180d> m9416f(InputStream inputStream, String str) {
        return m9417g(inputStream, str, true);
    }

    /* renamed from: g */
    private static C5187k<C5180d> m9417g(InputStream inputStream, String str, boolean z) throws IOException {
        try {
            return m9419i(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C5320f.m9885c(inputStream);
            }
        }
    }

    /* renamed from: h */
    public static C5188l<C5180d> m9418h(JsonReader jsonReader, String str) {
        return m9412b(str, new d(jsonReader, str));
    }

    /* renamed from: i */
    public static C5187k<C5180d> m9419i(JsonReader jsonReader, String str) {
        try {
            C5180d c5180dM9830a = C5308t.m9830a(jsonReader);
            C5235g.m9612b().m9614c(str, c5180dM9830a);
            return new C5187k<>(c5180dM9830a);
        } catch (Exception e2) {
            return new C5187k<>((Throwable) e2);
        }
    }

    /* renamed from: j */
    public static C5188l<C5180d> m9420j(Context context, int i2) {
        return m9412b(m9425o(i2), new c(context.getApplicationContext(), i2));
    }

    /* renamed from: k */
    public static C5187k<C5180d> m9421k(Context context, int i2) {
        try {
            return m9416f(context.getResources().openRawResource(i2), m9425o(i2));
        } catch (Resources.NotFoundException e2) {
            return new C5187k<>((Throwable) e2);
        }
    }

    /* renamed from: l */
    public static C5188l<C5180d> m9422l(Context context, String str) {
        return C5278c.m9768b(context, str);
    }

    /* renamed from: m */
    public static C5187k<C5180d> m9423m(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return m9424n(zipInputStream, str);
        } finally {
            C5320f.m9885c(zipInputStream);
        }
    }

    /* renamed from: n */
    private static C5187k<C5180d> m9424n(ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C5180d c5180dM9488b = null;
            while (nextEntry != null) {
                if (nextEntry.getName().contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c5180dM9488b = m9417g(zipInputStream, str, false).m9488b();
                } else if (nextEntry.getName().contains(".png")) {
                    map.put(nextEntry.getName().split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c5180dM9488b == null) {
                return new C5187k<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                C5183g c5183gM9413c = m9413c(c5180dM9488b, (String) entry.getKey());
                if (c5183gM9413c != null) {
                    c5183gM9413c.m9485d((Bitmap) entry.getValue());
                }
            }
            for (Map.Entry<String, C5183g> entry2 : c5180dM9488b.m9403i().entrySet()) {
                if (entry2.getValue().m9482a() == null) {
                    return new C5187k<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().m9483b()));
                }
            }
            C5235g.m9612b().m9614c(str, c5180dM9488b);
            return new C5187k<>(c5180dM9488b);
        } catch (IOException e2) {
            return new C5187k<>((Throwable) e2);
        }
    }

    /* renamed from: o */
    private static String m9425o(int i2) {
        return "rawRes_" + i2;
    }
}
