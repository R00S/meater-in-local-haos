package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.EnumC5366b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.C5394k;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5379h;
import com.bumptech.glide.load.engine.p125c0.C5386a;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.load.p127m.C5440k;
import com.bumptech.glide.load.p129n.C5449a;
import com.bumptech.glide.load.p129n.C5450b;
import com.bumptech.glide.load.p129n.C5451c;
import com.bumptech.glide.load.p129n.C5452d;
import com.bumptech.glide.load.p129n.C5453e;
import com.bumptech.glide.load.p129n.C5454f;
import com.bumptech.glide.load.p129n.C5455g;
import com.bumptech.glide.load.p129n.C5459k;
import com.bumptech.glide.load.p129n.C5467s;
import com.bumptech.glide.load.p129n.C5468t;
import com.bumptech.glide.load.p129n.C5469u;
import com.bumptech.glide.load.p129n.C5470v;
import com.bumptech.glide.load.p129n.C5471w;
import com.bumptech.glide.load.p129n.C5472x;
import com.bumptech.glide.load.p129n.p130y.C5473a;
import com.bumptech.glide.load.p129n.p130y.C5474b;
import com.bumptech.glide.load.p129n.p130y.C5475c;
import com.bumptech.glide.load.p129n.p130y.C5476d;
import com.bumptech.glide.load.p129n.p130y.C5477e;
import com.bumptech.glide.load.p131o.p132c.C5480a;
import com.bumptech.glide.load.p131o.p132c.C5481b;
import com.bumptech.glide.load.p131o.p132c.C5482c;
import com.bumptech.glide.load.p131o.p132c.C5485f;
import com.bumptech.glide.load.p131o.p132c.C5489j;
import com.bumptech.glide.load.p131o.p132c.C5491l;
import com.bumptech.glide.load.p131o.p132c.C5494o;
import com.bumptech.glide.load.p131o.p132c.C5499t;
import com.bumptech.glide.load.p131o.p132c.C5501v;
import com.bumptech.glide.load.p131o.p132c.C5503x;
import com.bumptech.glide.load.p131o.p132c.C5504y;
import com.bumptech.glide.load.p131o.p133d.C5505a;
import com.bumptech.glide.load.p131o.p134e.C5511e;
import com.bumptech.glide.load.p131o.p134e.C5512f;
import com.bumptech.glide.load.p131o.p135f.C5513a;
import com.bumptech.glide.load.p131o.p136g.C5515a;
import com.bumptech.glide.load.p131o.p136g.C5517c;
import com.bumptech.glide.load.p131o.p136g.C5518d;
import com.bumptech.glide.load.p131o.p136g.C5522h;
import com.bumptech.glide.load.p131o.p136g.C5524j;
import com.bumptech.glide.load.p131o.p137h.C5525a;
import com.bumptech.glide.load.p131o.p137h.C5526b;
import com.bumptech.glide.load.p131o.p137h.C5527c;
import com.bumptech.glide.load.p131o.p137h.C5528d;
import com.bumptech.glide.p122l.InterfaceC5360a;
import com.bumptech.glide.p138m.C5543l;
import com.bumptech.glide.p138m.InterfaceC5535d;
import com.bumptech.glide.p139n.C5551d;
import com.bumptech.glide.p139n.InterfaceC5549b;
import com.bumptech.glide.p141p.C5565h;
import com.bumptech.glide.p141p.InterfaceC5564g;
import com.bumptech.glide.p141p.p142l.C5573e;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Glide.java */
/* renamed from: com.bumptech.glide.c */
/* loaded from: classes.dex */
public class ComponentCallbacks2C5349c implements ComponentCallbacks2 {

    /* renamed from: f */
    private static volatile ComponentCallbacks2C5349c f13041f;

    /* renamed from: g */
    private static volatile boolean f13042g;

    /* renamed from: h */
    private final C5394k f13043h;

    /* renamed from: i */
    private final InterfaceC5413e f13044i;

    /* renamed from: j */
    private final InterfaceC5379h f13045j;

    /* renamed from: k */
    private final C5386a f13046k;

    /* renamed from: l */
    private final C5351e f13047l;

    /* renamed from: m */
    private final Registry f13048m;

    /* renamed from: n */
    private final InterfaceC5410b f13049n;

    /* renamed from: o */
    private final C5543l f13050o;

    /* renamed from: p */
    private final InterfaceC5535d f13051p;

    /* renamed from: q */
    private final List<C5355i> f13052q = new ArrayList();

    /* renamed from: r */
    private EnumC5352f f13053r = EnumC5352f.NORMAL;

    ComponentCallbacks2C5349c(Context context, C5394k c5394k, InterfaceC5379h interfaceC5379h, InterfaceC5413e interfaceC5413e, InterfaceC5410b interfaceC5410b, C5543l c5543l, InterfaceC5535d interfaceC5535d, int i2, C5565h c5565h, Map<Class<?>, AbstractC5356j<?, ?>> map, List<InterfaceC5564g<Object>> list, boolean z) {
        this.f13043h = c5394k;
        this.f13044i = interfaceC5413e;
        this.f13049n = interfaceC5410b;
        this.f13045j = interfaceC5379h;
        this.f13050o = c5543l;
        this.f13051p = interfaceC5535d;
        this.f13046k = new C5386a(interfaceC5379h, interfaceC5413e, (EnumC5366b) c5565h.m10914r().m10449a(C5491l.f13738a));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f13048m = registry;
        registry.m9965o(new C5489j());
        if (Build.VERSION.SDK_INT >= 27) {
            registry.m9965o(new C5494o());
        }
        List<ImageHeaderParser> listM9957g = registry.m9957g();
        C5491l c5491l = new C5491l(listM9957g, resources.getDisplayMetrics(), interfaceC5413e, interfaceC5410b);
        C5515a c5515a = new C5515a(context, listM9957g, interfaceC5413e, interfaceC5410b);
        InterfaceC5427j<ParcelFileDescriptor, Bitmap> interfaceC5427jM10694g = C5504y.m10694g(interfaceC5413e);
        C5485f c5485f = new C5485f(c5491l);
        C5501v c5501v = new C5501v(c5491l, interfaceC5410b);
        C5511e c5511e = new C5511e(context);
        C5467s.c cVar = new C5467s.c(resources);
        C5467s.d dVar = new C5467s.d(resources);
        C5467s.b bVar = new C5467s.b(resources);
        C5467s.a aVar = new C5467s.a(resources);
        C5482c c5482c = new C5482c(interfaceC5410b);
        C5525a c5525a = new C5525a();
        C5528d c5528d = new C5528d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry registryM9966p = registry.m9952a(ByteBuffer.class, new C5451c()).m9952a(InputStream.class, new C5468t(interfaceC5410b)).m9956e("Bitmap", ByteBuffer.class, Bitmap.class, c5485f).m9956e("Bitmap", InputStream.class, Bitmap.class, c5501v).m9956e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC5427jM10694g).m9956e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C5504y.m10690c(interfaceC5413e)).m9955d(Bitmap.class, Bitmap.class, C5470v.a.m10586a()).m9956e("Bitmap", Bitmap.class, Bitmap.class, new C5503x()).m9953b(Bitmap.class, c5482c).m9956e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C5480a(resources, c5485f)).m9956e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C5480a(resources, c5501v)).m9956e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C5480a(resources, interfaceC5427jM10694g)).m9953b(BitmapDrawable.class, new C5481b(interfaceC5413e, c5482c)).m9956e("Gif", InputStream.class, C5517c.class, new C5524j(listM9957g, c5515a, interfaceC5410b)).m9956e("Gif", ByteBuffer.class, C5517c.class, c5515a).m9953b(C5517c.class, new C5518d()).m9955d(InterfaceC5360a.class, InterfaceC5360a.class, C5470v.a.m10586a()).m9956e("Bitmap", InterfaceC5360a.class, Bitmap.class, new C5522h(interfaceC5413e)).m9954c(Uri.class, Drawable.class, c5511e).m9954c(Uri.class, Bitmap.class, new C5499t(c5511e, interfaceC5413e)).m9966p(new C5505a.a()).m9955d(File.class, ByteBuffer.class, new C5452d.b()).m9955d(File.class, InputStream.class, new C5454f.e()).m9954c(File.class, File.class, new C5513a()).m9955d(File.class, ParcelFileDescriptor.class, new C5454f.b()).m9955d(File.class, File.class, C5470v.a.m10586a()).m9966p(new C5440k.a(interfaceC5410b));
        Class cls = Integer.TYPE;
        registryM9966p.m9955d(cls, InputStream.class, cVar).m9955d(cls, ParcelFileDescriptor.class, bVar).m9955d(Integer.class, InputStream.class, cVar).m9955d(Integer.class, ParcelFileDescriptor.class, bVar).m9955d(Integer.class, Uri.class, dVar).m9955d(cls, AssetFileDescriptor.class, aVar).m9955d(Integer.class, AssetFileDescriptor.class, aVar).m9955d(cls, Uri.class, dVar).m9955d(String.class, InputStream.class, new C5453e.c()).m9955d(Uri.class, InputStream.class, new C5453e.c()).m9955d(String.class, InputStream.class, new C5469u.c()).m9955d(String.class, ParcelFileDescriptor.class, new C5469u.b()).m9955d(String.class, AssetFileDescriptor.class, new C5469u.a()).m9955d(Uri.class, InputStream.class, new C5474b.a()).m9955d(Uri.class, InputStream.class, new C5449a.c(context.getAssets())).m9955d(Uri.class, ParcelFileDescriptor.class, new C5449a.b(context.getAssets())).m9955d(Uri.class, InputStream.class, new C5475c.a(context)).m9955d(Uri.class, InputStream.class, new C5476d.a(context)).m9955d(Uri.class, InputStream.class, new C5471w.d(contentResolver)).m9955d(Uri.class, ParcelFileDescriptor.class, new C5471w.b(contentResolver)).m9955d(Uri.class, AssetFileDescriptor.class, new C5471w.a(contentResolver)).m9955d(Uri.class, InputStream.class, new C5472x.a()).m9955d(URL.class, InputStream.class, new C5477e.a()).m9955d(Uri.class, File.class, new C5459k.a(context)).m9955d(C5455g.class, InputStream.class, new C5473a.a()).m9955d(byte[].class, ByteBuffer.class, new C5450b.a()).m9955d(byte[].class, InputStream.class, new C5450b.d()).m9955d(Uri.class, Uri.class, C5470v.a.m10586a()).m9955d(Drawable.class, Drawable.class, C5470v.a.m10586a()).m9954c(Drawable.class, Drawable.class, new C5512f()).m9967q(Bitmap.class, BitmapDrawable.class, new C5526b(resources)).m9967q(Bitmap.class, byte[].class, c5525a).m9967q(Drawable.class, byte[].class, new C5527c(interfaceC5413e, c5525a, c5528d)).m9967q(C5517c.class, byte[].class, c5528d);
        this.f13047l = new C5351e(context, interfaceC5410b, registry, new C5573e(), c5565h, map, list, c5394k, z, i2);
    }

    /* renamed from: a */
    private static void m9971a(Context context) {
        if (f13042g) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f13042g = true;
        m9975m(context);
        f13042g = false;
    }

    /* renamed from: c */
    public static ComponentCallbacks2C5349c m9972c(Context context) {
        if (f13041f == null) {
            synchronized (ComponentCallbacks2C5349c.class) {
                if (f13041f == null) {
                    m9971a(context);
                }
            }
        }
        return f13041f;
    }

    /* renamed from: d */
    private static AbstractC5347a m9973d() {
        try {
            return (AbstractC5347a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e2) {
            m9977q(e2);
            return null;
        } catch (InstantiationException e3) {
            m9977q(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            m9977q(e4);
            return null;
        } catch (InvocationTargetException e5) {
            m9977q(e5);
            return null;
        }
    }

    /* renamed from: l */
    private static C5543l m9974l(Context context) {
        C5596j.m11043e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m9972c(context).m9987k();
    }

    /* renamed from: m */
    private static void m9975m(Context context) {
        m9976n(context, new C5350d());
    }

    /* renamed from: n */
    private static void m9976n(Context context, C5350d c5350d) {
        Context applicationContext = context.getApplicationContext();
        AbstractC5347a abstractC5347aM9973d = m9973d();
        List<InterfaceC5549b> listEmptyList = Collections.emptyList();
        if (abstractC5347aM9973d == null || abstractC5347aM9973d.m10838c()) {
            listEmptyList = new C5551d(applicationContext).m10842a();
        }
        if (abstractC5347aM9973d != null && !abstractC5347aM9973d.m9969d().isEmpty()) {
            Set<Class<?>> setM9969d = abstractC5347aM9973d.m9969d();
            Iterator<InterfaceC5549b> it = listEmptyList.iterator();
            while (it.hasNext()) {
                InterfaceC5549b next = it.next();
                if (setM9969d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC5549b> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        c5350d.m9996e(abstractC5347aM9973d != null ? abstractC5347aM9973d.m9970e() : null);
        Iterator<InterfaceC5549b> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            it3.next().applyOptions(applicationContext, c5350d);
        }
        if (abstractC5347aM9973d != null) {
            abstractC5347aM9973d.m10837b(applicationContext, c5350d);
        }
        ComponentCallbacks2C5349c componentCallbacks2C5349cM9992a = c5350d.m9992a(applicationContext);
        Iterator<InterfaceC5549b> it4 = listEmptyList.iterator();
        while (it4.hasNext()) {
            it4.next().registerComponents(applicationContext, componentCallbacks2C5349cM9992a, componentCallbacks2C5349cM9992a.f13048m);
        }
        if (abstractC5347aM9973d != null) {
            abstractC5347aM9973d.m10839a(applicationContext, componentCallbacks2C5349cM9992a, componentCallbacks2C5349cM9992a.f13048m);
        }
        applicationContext.registerComponentCallbacks(componentCallbacks2C5349cM9992a);
        f13041f = componentCallbacks2C5349cM9992a;
    }

    /* renamed from: q */
    private static void m9977q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static C5355i m9978t(Context context) {
        return m9974l(context).m10810d(context);
    }

    /* renamed from: u */
    public static C5355i m9979u(Fragment fragment) {
        return m9974l(fragment.getActivity()).m10811e(fragment);
    }

    /* renamed from: b */
    public void m9980b() {
        C5597k.m11045b();
        this.f13045j.m10198b();
        this.f13044i.mo10386b();
        this.f13049n.mo10366b();
    }

    /* renamed from: e */
    public InterfaceC5410b m9981e() {
        return this.f13049n;
    }

    /* renamed from: f */
    public InterfaceC5413e m9982f() {
        return this.f13044i;
    }

    /* renamed from: g */
    InterfaceC5535d m9983g() {
        return this.f13051p;
    }

    /* renamed from: h */
    public Context m9984h() {
        return this.f13047l.getBaseContext();
    }

    /* renamed from: i */
    C5351e m9985i() {
        return this.f13047l;
    }

    /* renamed from: j */
    public Registry m9986j() {
        return this.f13048m;
    }

    /* renamed from: k */
    public C5543l m9987k() {
        return this.f13050o;
    }

    /* renamed from: o */
    void m9988o(C5355i c5355i) {
        synchronized (this.f13052q) {
            if (this.f13052q.contains(c5355i)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f13052q.add(c5355i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m9980b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        m9990r(i2);
    }

    /* renamed from: p */
    boolean m9989p(InterfaceC5577i<?> interfaceC5577i) {
        synchronized (this.f13052q) {
            Iterator<C5355i> it = this.f13052q.iterator();
            while (it.hasNext()) {
                if (it.next().m10047p(interfaceC5577i)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void m9990r(int i2) {
        C5597k.m11045b();
        this.f13045j.mo10190a(i2);
        this.f13044i.mo10385a(i2);
        this.f13049n.mo10365a(i2);
    }

    /* renamed from: s */
    void m9991s(C5355i c5355i) {
        synchronized (this.f13052q) {
            if (!this.f13052q.contains(c5355i)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f13052q.remove(c5355i);
        }
    }
}
