package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.C4392b;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f25199o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f25200p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static volatile f f25201q;

    /* renamed from: b, reason: collision with root package name */
    private final Set<AbstractC0355f> f25203b;

    /* renamed from: e, reason: collision with root package name */
    private final b f25206e;

    /* renamed from: f, reason: collision with root package name */
    final h f25207f;

    /* renamed from: g, reason: collision with root package name */
    private final j f25208g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f25209h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f25210i;

    /* renamed from: j, reason: collision with root package name */
    final int[] f25211j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f25212k;

    /* renamed from: l, reason: collision with root package name */
    private final int f25213l;

    /* renamed from: m, reason: collision with root package name */
    private final int f25214m;

    /* renamed from: n, reason: collision with root package name */
    private final e f25215n;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f25202a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f25204c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f25205d = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f25216b;

        /* renamed from: c, reason: collision with root package name */
        private volatile n f25217c;

        /* compiled from: EmojiCompat.java */
        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C0354a extends i {
            C0354a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                a.this.f25219a.n(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        void a() {
            try {
                this.f25219a.f25207f.a(new C0354a());
            } catch (Throwable th) {
                this.f25219a.n(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f25216b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f25217c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f25219a.f25209h);
        }

        void d(n nVar) {
            if (nVar == null) {
                this.f25219a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f25217c = nVar;
            n nVar2 = this.f25217c;
            j jVar = this.f25219a.f25208g;
            e eVar = this.f25219a.f25215n;
            f fVar = this.f25219a;
            this.f25216b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f25210i, fVar.f25211j, androidx.emoji2.text.h.a());
            this.f25219a.o();
        }
    }

    /* compiled from: EmojiCompat.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final f f25219a;

        b(f fVar) {
            this.f25219a = fVar;
        }

        void a() {
            throw null;
        }

        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final h f25220a;

        /* renamed from: b, reason: collision with root package name */
        j f25221b;

        /* renamed from: c, reason: collision with root package name */
        boolean f25222c;

        /* renamed from: d, reason: collision with root package name */
        boolean f25223d;

        /* renamed from: e, reason: collision with root package name */
        int[] f25224e;

        /* renamed from: f, reason: collision with root package name */
        Set<AbstractC0355f> f25225f;

        /* renamed from: g, reason: collision with root package name */
        boolean f25226g;

        /* renamed from: h, reason: collision with root package name */
        int f25227h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f25228i = 0;

        /* renamed from: j, reason: collision with root package name */
        e f25229j = new androidx.emoji2.text.e();

        protected c(h hVar) {
            r1.i.h(hVar, "metadataLoader cannot be null.");
            this.f25220a = hVar;
        }

        protected final h a() {
            return this.f25220a;
        }

        public c b(int i10) {
            this.f25228i = i10;
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    /* compiled from: EmojiCompat.java */
    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* compiled from: EmojiCompat.java */
    private static class g implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final List<AbstractC0355f> f25230B;

        /* renamed from: C, reason: collision with root package name */
        private final Throwable f25231C;

        /* renamed from: D, reason: collision with root package name */
        private final int f25232D;

        g(AbstractC0355f abstractC0355f, int i10) {
            this(Arrays.asList((AbstractC0355f) r1.i.h(abstractC0355f, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f25230B.size();
            int i10 = 0;
            if (this.f25232D != 1) {
                while (i10 < size) {
                    this.f25230B.get(i10).a(this.f25231C);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f25230B.get(i10).b();
                    i10++;
                }
            }
        }

        g(Collection<AbstractC0355f> collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection<AbstractC0355f> collection, int i10, Throwable th) {
            r1.i.h(collection, "initCallbacks cannot be null");
            this.f25230B = new ArrayList(collection);
            this.f25232D = i10;
            this.f25231C = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    public interface h {
        void a(i iVar);
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* compiled from: EmojiCompat.java */
    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f25209h = cVar.f25222c;
        this.f25210i = cVar.f25223d;
        this.f25211j = cVar.f25224e;
        this.f25212k = cVar.f25226g;
        this.f25213l = cVar.f25227h;
        this.f25207f = cVar.f25220a;
        this.f25214m = cVar.f25228i;
        this.f25215n = cVar.f25229j;
        C4392b c4392b = new C4392b();
        this.f25203b = c4392b;
        j jVar = cVar.f25221b;
        this.f25208g = jVar == null ? new d() : jVar;
        Set<AbstractC0355f> set = cVar.f25225f;
        if (set != null && !set.isEmpty()) {
            c4392b.addAll(cVar.f25225f);
        }
        this.f25206e = new a(this);
        m();
    }

    public static f c() {
        f fVar;
        synchronized (f25199o) {
            fVar = f25201q;
            r1.i.i(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.c(editable, i10, keyEvent);
    }

    public static f h(c cVar) {
        f fVar = f25201q;
        if (fVar == null) {
            synchronized (f25199o) {
                try {
                    fVar = f25201q;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f25201q = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }

    public static boolean i() {
        return f25201q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f25202a.writeLock().lock();
        try {
            if (this.f25214m == 0) {
                this.f25204c = 0;
            }
            this.f25202a.writeLock().unlock();
            if (e() == 0) {
                this.f25206e.a();
            }
        } catch (Throwable th) {
            this.f25202a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f25213l;
    }

    public int e() {
        this.f25202a.readLock().lock();
        try {
            return this.f25204c;
        } finally {
            this.f25202a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f25212k;
    }

    public void l() {
        r1.i.i(this.f25214m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f25202a.writeLock().lock();
        try {
            if (this.f25204c == 0) {
                return;
            }
            this.f25204c = 0;
            this.f25202a.writeLock().unlock();
            this.f25206e.a();
        } finally {
            this.f25202a.writeLock().unlock();
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f25202a.writeLock().lock();
        try {
            this.f25204c = 2;
            arrayList.addAll(this.f25203b);
            this.f25203b.clear();
            this.f25202a.writeLock().unlock();
            this.f25205d.post(new g(arrayList, this.f25204c, th));
        } catch (Throwable th2) {
            this.f25202a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f25202a.writeLock().lock();
        try {
            this.f25204c = 1;
            arrayList.addAll(this.f25203b);
            this.f25203b.clear();
            this.f25202a.writeLock().unlock();
            this.f25205d.post(new g(arrayList, this.f25204c));
        } catch (Throwable th) {
            this.f25202a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        r1.i.i(k(), "Not initialized yet");
        r1.i.e(i10, "start cannot be negative");
        r1.i.e(i11, "end cannot be negative");
        r1.i.e(i12, "maxEmojiCount cannot be negative");
        r1.i.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        r1.i.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        r1.i.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f25209h : false;
        } else {
            z10 = true;
        }
        return this.f25206e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(AbstractC0355f abstractC0355f) {
        r1.i.h(abstractC0355f, "initCallback cannot be null");
        this.f25202a.writeLock().lock();
        try {
            if (this.f25204c == 1 || this.f25204c == 2) {
                this.f25205d.post(new g(abstractC0355f, this.f25204c));
            } else {
                this.f25203b.add(abstractC0355f);
            }
            this.f25202a.writeLock().unlock();
        } catch (Throwable th) {
            this.f25202a.writeLock().unlock();
            throw th;
        }
    }

    public void u(AbstractC0355f abstractC0355f) {
        r1.i.h(abstractC0355f, "initCallback cannot be null");
        this.f25202a.writeLock().lock();
        try {
            this.f25203b.remove(abstractC0355f);
        } finally {
            this.f25202a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f25206e.c(editorInfo);
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0355f {
        public void b() {
        }

        public void a(Throwable th) {
        }
    }
}
