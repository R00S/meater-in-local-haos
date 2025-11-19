package R7;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d.C2998b;
import java.util.Objects;

/* compiled from: MaterialBackOrchestrator.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final d f15067a = a();

    /* renamed from: b, reason: collision with root package name */
    private final R7.b f15068b;

    /* renamed from: c, reason: collision with root package name */
    private final View f15069c;

    /* compiled from: MaterialBackOrchestrator.java */
    private static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private OnBackInvokedCallback f15070a;

        private b() {
        }

        @Override // R7.c.d
        public void a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f15070a);
            this.f15070a = null;
        }

        @Override // R7.c.d
        public void b(R7.b bVar, View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f15070a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f15070a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        OnBackInvokedCallback c(final R7.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: R7.e
                public final void onBackInvoked() {
                    bVar.b();
                }
            };
        }

        boolean d() {
            return this.f15070a != null;
        }
    }

    /* compiled from: MaterialBackOrchestrator.java */
    /* renamed from: R7.c$c, reason: collision with other inner class name */
    private static class C0219c extends b {

        /* compiled from: MaterialBackOrchestrator.java */
        /* renamed from: R7.c$c$a */
        class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R7.b f15071a;

            a(R7.b bVar) {
                this.f15071a = bVar;
            }

            public void onBackCancelled() {
                if (C0219c.this.d()) {
                    this.f15071a.d();
                }
            }

            public void onBackInvoked() {
                this.f15071a.b();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0219c.this.d()) {
                    this.f15071a.a(new C2998b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0219c.this.d()) {
                    this.f15071a.c(new C2998b(backEvent));
                }
            }
        }

        private C0219c() {
            super();
        }

        @Override // R7.c.b
        OnBackInvokedCallback c(R7.b bVar) {
            return new a(bVar);
        }
    }

    /* compiled from: MaterialBackOrchestrator.java */
    private interface d {
        void a(View view);

        void b(R7.b bVar, View view, boolean z10);
    }

    public c(R7.b bVar, View view) {
        this.f15068b = bVar;
        this.f15069c = view;
    }

    private static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0219c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    private void c(boolean z10) {
        d dVar = this.f15067a;
        if (dVar != null) {
            dVar.b(this.f15068b, this.f15069c, z10);
        }
    }

    public void b() {
        c(false);
    }

    public void d() {
        d dVar = this.f15067a;
        if (dVar != null) {
            dVar.a(this.f15069c);
        }
    }
}
