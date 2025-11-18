package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import o1.k;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: k, reason: collision with root package name */
    private static final a f25257k = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class a {
        public Typeface a(Context context, k.b bVar) {
            return o1.k.a(context, null, new k.b[]{bVar});
        }

        public k.a b(Context context, o1.e eVar) {
            return o1.k.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontRequestEmojiCompatConfig.java */
    static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f25258a;

        /* renamed from: b, reason: collision with root package name */
        private final o1.e f25259b;

        /* renamed from: c, reason: collision with root package name */
        private final a f25260c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f25261d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f25262e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f25263f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f25264g;

        /* renamed from: h, reason: collision with root package name */
        f.i f25265h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f25266i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f25267j;

        b(Context context, o1.e eVar, a aVar) {
            r1.i.h(context, "Context cannot be null");
            r1.i.h(eVar, "FontRequest cannot be null");
            this.f25258a = context.getApplicationContext();
            this.f25259b = eVar;
            this.f25260c = aVar;
        }

        private void b() {
            synchronized (this.f25261d) {
                try {
                    this.f25265h = null;
                    ContentObserver contentObserver = this.f25266i;
                    if (contentObserver != null) {
                        this.f25260c.c(this.f25258a, contentObserver);
                        this.f25266i = null;
                    }
                    Handler handler = this.f25262e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f25267j);
                    }
                    this.f25262e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f25264g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f25263f = null;
                    this.f25264g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private k.b e() {
            try {
                k.a aVarB = this.f25260c.b(this.f25258a, this.f25259b);
                if (aVarB.e() == 0) {
                    k.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            r1.i.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f25261d) {
                this.f25265h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f25261d) {
                try {
                    if (this.f25265h == null) {
                        return;
                    }
                    try {
                        k.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f25261d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            n1.o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f25260c.a(this.f25258a, bVarE);
                            ByteBuffer byteBufferE = j1.p.e(this.f25258a, null, bVarE.d());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n nVarB = n.b(typefaceA, byteBufferE);
                            n1.o.b();
                            synchronized (this.f25261d) {
                                try {
                                    f.i iVar = this.f25265h;
                                    if (iVar != null) {
                                        iVar.b(nVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            n1.o.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f25261d) {
                            try {
                                f.i iVar2 = this.f25265h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f25261d) {
                try {
                    if (this.f25265h == null) {
                        return;
                    }
                    if (this.f25263f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = c.b("emojiCompat");
                        this.f25264g = threadPoolExecutorB;
                        this.f25263f = threadPoolExecutorB;
                    }
                    this.f25263f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25268B.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f25261d) {
                this.f25263f = executor;
            }
        }
    }

    public k(Context context, o1.e eVar) {
        super(new b(context, eVar, f25257k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
