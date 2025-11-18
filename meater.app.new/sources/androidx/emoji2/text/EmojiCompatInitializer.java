package androidx.emoji2.text;

import android.content.Context;
import android.view.AbstractC2106m;
import android.view.InterfaceC2097e;
import android.view.InterfaceC2114v;
import android.view.ProcessLifecycleInitializer;
import androidx.emoji2.text.f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import x3.InterfaceC5053a;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC5053a<Boolean> {

    class a implements InterfaceC2097e {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC2106m f25189B;

        a(AbstractC2106m abstractC2106m) {
            this.f25189B = abstractC2106m;
        }

        @Override // android.view.InterfaceC2097e
        public void d(InterfaceC2114v interfaceC2114v) {
            EmojiCompatInitializer.this.e();
            this.f25189B.d(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f25191a;

        class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f25192a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f25193b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f25192a = iVar;
                this.f25193b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                try {
                    this.f25192a.a(th);
                } finally {
                    this.f25193b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f25192a.b(nVar);
                } finally {
                    this.f25193b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f25191a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25233B.d(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k kVarA = androidx.emoji2.text.d.a(this.f25191a);
                if (kVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                kVarA.c(threadPoolExecutor);
                kVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                n1.o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.i()) {
                    f.c().l();
                }
            } finally {
                n1.o.b();
            }
        }
    }

    @Override // x3.InterfaceC5053a
    public List<Class<? extends InterfaceC5053a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // x3.InterfaceC5053a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        f.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        AbstractC2106m lifecycle = ((InterfaceC2114v) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new d(), 500L);
    }
}
