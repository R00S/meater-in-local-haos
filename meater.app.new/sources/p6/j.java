package p6;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes2.dex */
public class j implements InterfaceC4239d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f47631k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final k f47632a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f47633b;

    /* renamed from: c, reason: collision with root package name */
    private final long f47634c;

    /* renamed from: d, reason: collision with root package name */
    private final a f47635d;

    /* renamed from: e, reason: collision with root package name */
    private long f47636e;

    /* renamed from: f, reason: collision with root package name */
    private long f47637f;

    /* renamed from: g, reason: collision with root package name */
    private int f47638g;

    /* renamed from: h, reason: collision with root package name */
    private int f47639h;

    /* renamed from: i, reason: collision with root package name */
    private int f47640i;

    /* renamed from: j, reason: collision with root package name */
    private int f47641j;

    /* compiled from: LruBitmapPool.java */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    j(long j10, k kVar, Set<Bitmap.Config> set) {
        this.f47634c = j10;
        this.f47636e = j10;
        this.f47632a = kVar;
        this.f47633b = set;
        this.f47635d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f47631k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f47638g + ", misses=" + this.f47639h + ", puts=" + this.f47640i + ", evictions=" + this.f47641j + ", currentSize=" + this.f47637f + ", maxSize=" + this.f47636e + "\nStrategy=" + this.f47632a);
    }

    private void j() {
        q(this.f47636e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f47632a.d(i10, i11, config != null ? config : f47631k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f47632a.a(i10, i11, config));
                }
                this.f47639h++;
            } else {
                this.f47638g++;
                this.f47637f -= this.f47632a.b(bitmapD);
                this.f47635d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f47632a.a(i10, i11, config));
            }
            h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapD;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f47637f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f47632a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f47637f = 0L;
                    return;
                }
                this.f47635d.a(bitmapRemoveLast);
                this.f47637f -= this.f47632a.b(bitmapRemoveLast);
                this.f47641j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f47632a.e(bitmapRemoveLast));
                }
                h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p6.InterfaceC4239d
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // p6.InterfaceC4239d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // p6.InterfaceC4239d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f47632a.b(bitmap) <= this.f47636e && this.f47633b.contains(bitmap.getConfig())) {
                int iB = this.f47632a.b(bitmap);
                this.f47632a.c(bitmap);
                this.f47635d.b(bitmap);
                this.f47640i++;
                this.f47637f += iB;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f47632a.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f47632a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f47633b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p6.InterfaceC4239d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // p6.InterfaceC4239d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        return bitmapM == null ? g(i10, i11, config) : bitmapM;
    }

    public long n() {
        return this.f47636e;
    }

    public j(long j10) {
        this(j10, l(), k());
    }

    /* compiled from: LruBitmapPool.java */
    private static final class b implements a {
        b() {
        }

        @Override // p6.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // p6.j.a
        public void b(Bitmap bitmap) {
        }
    }
}
