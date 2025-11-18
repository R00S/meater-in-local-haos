package com.bumptech.glide.load.engine.p126z;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.k */
/* loaded from: classes.dex */
public class C5419k implements InterfaceC5413e {

    /* renamed from: a */
    private static final Bitmap.Config f13532a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final InterfaceC5420l f13533b;

    /* renamed from: c */
    private final Set<Bitmap.Config> f13534c;

    /* renamed from: d */
    private final long f13535d;

    /* renamed from: e */
    private final a f13536e;

    /* renamed from: f */
    private long f13537f;

    /* renamed from: g */
    private long f13538g;

    /* renamed from: h */
    private int f13539h;

    /* renamed from: i */
    private int f13540i;

    /* renamed from: j */
    private int f13541j;

    /* renamed from: k */
    private int f13542k;

    /* compiled from: LruBitmapPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.k$a */
    private interface a {
        /* renamed from: a */
        void mo10430a(Bitmap bitmap);

        /* renamed from: b */
        void mo10431b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.k$b */
    private static final class b implements a {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.p126z.C5419k.a
        /* renamed from: a */
        public void mo10430a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.p126z.C5419k.a
        /* renamed from: b */
        public void mo10431b(Bitmap bitmap) {
        }
    }

    C5419k(long j2, InterfaceC5420l interfaceC5420l, Set<Bitmap.Config> set) {
        this.f13535d = j2;
        this.f13537f = j2;
        this.f13533b = interfaceC5420l;
        this.f13534c = set;
        this.f13536e = new b();
    }

    @TargetApi(26)
    /* renamed from: f */
    private static void m10418f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    private static Bitmap m10419g(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = f13532a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    /* renamed from: h */
    private void m10420h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m10421i();
        }
    }

    /* renamed from: i */
    private void m10421i() {
        Log.v("LruBitmapPool", "Hits=" + this.f13539h + ", misses=" + this.f13540i + ", puts=" + this.f13541j + ", evictions=" + this.f13542k + ", currentSize=" + this.f13538g + ", maxSize=" + this.f13537f + "\nStrategy=" + this.f13533b);
    }

    /* renamed from: j */
    private void m10422j() {
        m10428q(this.f13537f);
    }

    @TargetApi(26)
    /* renamed from: k */
    private static Set<Bitmap.Config> m10423k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            hashSet.add(null);
        }
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static InterfaceC5420l m10424l() {
        return Build.VERSION.SDK_INT >= 19 ? new C5422n() : new C5411c();
    }

    /* renamed from: m */
    private synchronized Bitmap m10425m(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapMo10375d;
        m10418f(config);
        bitmapMo10375d = this.f13533b.mo10375d(i2, i3, config != null ? config : f13532a);
        if (bitmapMo10375d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f13533b.mo10373b(i2, i3, config));
            }
            this.f13540i++;
        } else {
            this.f13539h++;
            this.f13538g -= this.f13533b.mo10376e(bitmapMo10375d);
            this.f13536e.mo10430a(bitmapMo10375d);
            m10427p(bitmapMo10375d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f13533b.mo10373b(i2, i3, config));
        }
        m10420h();
        return bitmapMo10375d;
    }

    @TargetApi(19)
    /* renamed from: o */
    private static void m10426o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: p */
    private static void m10427p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m10426o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m10428q(long j2) {
        while (this.f13538g > j2) {
            Bitmap bitmapMo10372a = this.f13533b.mo10372a();
            if (bitmapMo10372a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m10421i();
                }
                this.f13538g = 0L;
                return;
            }
            this.f13536e.mo10430a(bitmapMo10372a);
            this.f13538g -= this.f13533b.mo10376e(bitmapMo10372a);
            this.f13542k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f13533b.mo10377f(bitmapMo10372a));
            }
            m10420h();
            bitmapMo10372a.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo10385a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40) {
            mo10386b();
        } else if (i2 >= 20 || i2 == 15) {
            m10428q(m10429n() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: b */
    public void mo10386b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m10428q(0L);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: c */
    public synchronized void mo10387c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f13533b.mo10376e(bitmap) <= this.f13537f && this.f13534c.contains(bitmap.getConfig())) {
                int iMo10376e = this.f13533b.mo10376e(bitmap);
                this.f13533b.mo10374c(bitmap);
                this.f13536e.mo10431b(bitmap);
                this.f13541j++;
                this.f13538g += iMo10376e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f13533b.mo10377f(bitmap));
                }
                m10420h();
                m10422j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f13533b.mo10377f(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f13534c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: d */
    public Bitmap mo10388d(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapM10425m = m10425m(i2, i3, config);
        if (bitmapM10425m == null) {
            return m10419g(i2, i3, config);
        }
        bitmapM10425m.eraseColor(0);
        return bitmapM10425m;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: e */
    public Bitmap mo10389e(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapM10425m = m10425m(i2, i3, config);
        return bitmapM10425m == null ? m10419g(i2, i3, config) : bitmapM10425m;
    }

    /* renamed from: n */
    public long m10429n() {
        return this.f13537f;
    }

    public C5419k(long j2) {
        this(j2, m10424l(), m10423k());
    }
}
