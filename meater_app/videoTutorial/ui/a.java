package com.apptionlabs.meater_app.videoTutorial.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.media3.common.k;
import androidx.media3.common.q;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.y;
import androidx.media3.ui.PlayerView;
import com.apptionlabs.meater_app.videoTutorial.ui.a;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import g8.BasicTutorial;
import h1.e;
import ih.o;
import ih.u;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nh.d;
import rk.C0580a;
import rk.d2;
import rk.j0;
import rk.l0;
import rk.l1;
import rk.s1;
import rk.y0;
import vh.p;
import wh.m;

/* compiled from: VideoPlayerDialog.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001MB!\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\b\u00104\u001a\u0004\u0018\u00010/¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0003J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0019\u00104\u001a\u0004\u0018\u00010/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u0010\u0012\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/apptionlabs/meater_app/videoTutorial/ui/a;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/View;", "view", "Lih/u;", "c3", "b3", "Landroidx/media3/exoplayer/g$b;", "playerBuilder", "Landroid/content/Context;", "context", "g3", "", "preferExtensionRenderer", "Lh1/u;", "Z2", "Y2", "Landroidx/media3/common/q;", "player", "Luk/b;", "", "f3", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "z1", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "E2", "y1", "v1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lg8/a;", "K0", "Lg8/a;", "basicTutorial", "Ly7/a;", "L0", "Ly7/a;", "cacheManager", "Lcom/apptionlabs/meater_app/videoTutorial/ui/a$a;", "M0", "Lcom/apptionlabs/meater_app/videoTutorial/ui/a$a;", "getListener", "()Lcom/apptionlabs/meater_app/videoTutorial/ui/a$a;", "listener", "Landroidx/media3/exoplayer/g;", "N0", "Landroidx/media3/exoplayer/g;", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "O0", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "progress", "Landroidx/media3/ui/PlayerView;", "P0", "Landroidx/media3/ui/PlayerView;", "playerView", "", "Q0", "Ljava/lang/String;", "path", "Lrk/s1;", "R0", "Lrk/s1;", "job", "S0", "Z", "isVideoWatched", "<init>", "(Lg8/a;Ly7/a;Lcom/apptionlabs/meater_app/videoTutorial/ui/a$a;)V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: K0, reason: from kotlin metadata */
    private final BasicTutorial basicTutorial;

    /* renamed from: L0, reason: from kotlin metadata */
    private final C0580a cacheManager;

    /* renamed from: M0, reason: from kotlin metadata */
    private final InterfaceC0149a listener;

    /* renamed from: N0, reason: from kotlin metadata */
    private g player;

    /* renamed from: O0, reason: from kotlin metadata */
    private LinearProgressIndicator progress;

    /* renamed from: P0, reason: from kotlin metadata */
    private PlayerView playerView;

    /* renamed from: Q0, reason: from kotlin metadata */
    private String path;

    /* renamed from: R0, reason: from kotlin metadata */
    private s1 job;

    /* renamed from: S0, reason: from kotlin metadata */
    private boolean isVideoWatched;

    /* compiled from: VideoPlayerDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/apptionlabs/meater_app/videoTutorial/ui/a$a;", "", "Lih/u;", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.videoTutorial.ui.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface InterfaceC0149a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoPlayerDialog.kt */
    @f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoPlayerDialog$addProgressJob$1", f = "VideoPlayerDialog.kt", l = {150}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends l implements p<j0, d<? super u>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f10176q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoPlayerDialog.kt */
        @f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoPlayerDialog$addProgressJob$1$1", f = "VideoPlayerDialog.kt", l = {151}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.apptionlabs.meater_app.videoTutorial.ui.a$b$a, reason: collision with other inner class name */
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static final class C0150a extends l implements p<j0, d<? super u>, Object> {

            /* renamed from: q, reason: collision with root package name */
            int f10178q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f10179r;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: VideoPlayerDialog.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lih/u;", "a", "(ILnh/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.apptionlabs.meater_app.videoTutorial.ui.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: /tmp/meat/meat/classes.dex */
            public static final class C0151a<T> implements uk.c {

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ a f10180q;

                C0151a(a aVar) {
                    this.f10180q = aVar;
                }

                public final Object a(int i10, d<? super u> dVar) {
                    Boolean bool;
                    Button button;
                    Button button2;
                    LinearProgressIndicator linearProgressIndicator = this.f10180q.progress;
                    if (linearProgressIndicator != null) {
                        linearProgressIndicator.setProgress(i10, true);
                    }
                    if (i10 > 95) {
                        View E0 = this.f10180q.E0();
                        if (E0 != null && (button2 = (Button) E0.findViewById(2131362085)) != null) {
                            bool = kotlin.coroutines.jvm.internal.b.a(button2.isEnabled());
                        } else {
                            bool = null;
                        }
                        m.c(bool);
                        if (!bool.booleanValue()) {
                            View E02 = this.f10180q.E0();
                            if (E02 != null && (button = (Button) E02.findViewById(2131362085)) != null) {
                                g6.d.b(button);
                            }
                            this.f10180q.isVideoWatched = true;
                        }
                    }
                    return u.a;
                }

                public /* bridge */ /* synthetic */ Object f(Object obj, d dVar) {
                    return a(((Number) obj).intValue(), dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0150a(a aVar, d<? super C0150a> dVar) {
                super(2, dVar);
                this.f10179r = aVar;
            }

            public final d<u> create(Object obj, d<?> dVar) {
                return new C0150a(this.f10179r, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = oh.b.c();
                int i10 = this.f10178q;
                if (i10 != 0) {
                    if (i10 == 1) {
                        o.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    o.b(obj);
                    a aVar = this.f10179r;
                    g gVar = aVar.player;
                    if (gVar == null) {
                        m.t("player");
                        gVar = null;
                    }
                    uk.b f32 = aVar.f3(gVar);
                    C0151a c0151a = new C0151a(this.f10179r);
                    this.f10178q = 1;
                    if (f32.a(c0151a, this) == c10) {
                        return c10;
                    }
                }
                return u.a;
            }

            public final Object invoke(j0 j0Var, d<? super u> dVar) {
                return create(j0Var, dVar).invokeSuspend(u.a);
            }
        }

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        public final d<u> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = oh.b.c();
            int i10 = this.f10176q;
            if (i10 != 0) {
                if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                o.b(obj);
                d2 c11 = y0.c();
                C0150a c0150a = new C0150a(a.this, null);
                this.f10176q = 1;
                if (rk.g.g(c11, c0150a, this) == c10) {
                    return c10;
                }
            }
            return u.a;
        }

        public final Object invoke(j0 j0Var, d<? super u> dVar) {
            return create(j0Var, dVar).invokeSuspend(u.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoPlayerDialog.kt */
    @f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoPlayerDialog$pollCurrentDuration$1", f = "VideoPlayerDialog.kt", l = {165, 166}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Luk/c;", "", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends l implements p<uk.c<? super Integer>, d<? super u>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f10181q;

        /* renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f10182r;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ q f10184t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q qVar, d<? super c> dVar) {
            super(2, dVar);
            this.f10184t = qVar;
        }

        public final d<u> create(Object obj, d<?> dVar) {
            c cVar = new c(this.f10184t, dVar);
            cVar.f10182r = obj;
            return cVar;
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(uk.c<? super Integer> cVar, d<? super u> dVar) {
            return create(cVar, dVar).invokeSuspend(u.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:7:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = oh.b.c()
                int r1 = r8.f10181q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r8.f10182r
                uk.c r1 = (uk.c) r1
                ih.o.b(r9)
                r9 = r1
                goto L30
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f10182r
                uk.c r1 = (uk.c) r1
                ih.o.b(r9)
                r9 = r1
                r1 = r8
                goto L60
            L29:
                ih.o.b(r9)
                java.lang.Object r9 = r8.f10182r
                uk.c r9 = (uk.c) r9
            L30:
                r1 = r8
            L31:
                com.apptionlabs.meater_app.videoTutorial.ui.a r4 = com.apptionlabs.meater_app.videoTutorial.ui.a.this
                android.app.Dialog r4 = r4.D2()
                if (r4 == 0) goto L6d
                boolean r4 = r4.isShowing()
                if (r4 != r3) goto L6d
                androidx.media3.common.q r4 = r1.f10184t
                long r4 = r4.i0()
                r6 = 100
                long r6 = (long) r6
                long r4 = r4 * r6
                androidx.media3.common.q r6 = r1.f10184t
                long r6 = r6.X()
                long r4 = r4 / r6
                int r4 = (int) r4
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.b(r4)
                r1.f10182r = r9
                r1.f10181q = r3
                java.lang.Object r4 = r9.f(r4, r1)
                if (r4 != r0) goto L60
                return r0
            L60:
                r1.f10182r = r9
                r1.f10181q = r2
                r4 = 300(0x12c, double:1.48E-321)
                java.lang.Object r4 = rk.t0.a(r4, r1)
                if (r4 != r0) goto L31
                return r0
            L6d:
                ih.u r9 = ih.u.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.videoTutorial.ui.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(BasicTutorial basicTutorial, C0580a c0580a, InterfaceC0149a interfaceC0149a) {
        m.f(basicTutorial, "basicTutorial");
        m.f(c0580a, "cacheManager");
        this.basicTutorial = basicTutorial;
        this.cacheManager = c0580a;
        this.listener = interfaceC0149a;
    }

    private final void Y2() {
        if (this.job != null) {
            return;
        }
        this.job = rk.g.d(l1.q, (nh.g) null, (l0) null, new b(null), 3, (Object) null);
    }

    private final h1.u Z2(Context context, boolean preferExtensionRenderer) {
        int i10;
        if (preferExtensionRenderer) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        e j10 = new e(context.getApplicationContext()).k(i10).j(true);
        m.e(j10, "setEnableDecoderFallback(...)");
        return j10;
    }

    static /* synthetic */ h1.u a3(a aVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return aVar.Z2(context, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b3() {
        g.b bVar = new g.b(e2());
        Context e22 = e2();
        m.e(e22, "requireContext(...)");
        g3(bVar, e22);
        g f10 = bVar.f();
        m.e(f10, "build(...)");
        this.player = f10;
        PlayerView playerView = null;
        if (f10 == null) {
            m.t("player");
            f10 = null;
        }
        f10.Q(2);
        g gVar = this.player;
        if (gVar == null) {
            m.t("player");
            gVar = null;
        }
        gVar.C(true);
        String str = this.path;
        if (str == null) {
            m.t("path");
            str = null;
        }
        k e10 = k.e(str);
        m.e(e10, "fromUri(...)");
        y a10 = new y.b(this.cacheManager.getCacheDataSourceFactory()).a(e10);
        m.e(a10, "createMediaSource(...)");
        g gVar2 = this.player;
        if (gVar2 == null) {
            m.t("player");
            gVar2 = null;
        }
        gVar2.c(a10);
        g gVar3 = this.player;
        if (gVar3 == null) {
            m.t("player");
            gVar3 = null;
        }
        gVar3.h();
        PlayerView playerView2 = this.playerView;
        if (playerView2 == null) {
            m.t("playerView");
            playerView2 = null;
        }
        g gVar4 = this.player;
        if (gVar4 == null) {
            m.t("player");
            gVar4 = null;
        }
        playerView2.setPlayer(gVar4);
        PlayerView playerView3 = this.playerView;
        if (playerView3 == null) {
            m.t("playerView");
            playerView3 = null;
        }
        playerView3.setControllerAutoShow(false);
        PlayerView playerView4 = this.playerView;
        if (playerView4 == null) {
            m.t("playerView");
            playerView4 = null;
        }
        playerView4.w();
        PlayerView playerView5 = this.playerView;
        if (playerView5 == null) {
            m.t("playerView");
        } else {
            playerView = playerView5;
        }
        playerView.setUseController(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c3(View view) {
        TextView textView = (TextView) view.findViewById(f.f.L);
        TextView textView2 = (TextView) view.findViewById(2131363369);
        View findViewById = view.findViewById(2131363064);
        m.e(findViewById, "findViewById(...)");
        this.playerView = (PlayerView) findViewById;
        this.progress = view.findViewById(2131363096);
        textView.setText(A0(this.basicTutorial.getTitleRes()));
        textView2.setText(A0(this.basicTutorial.getBody()));
        if (this.basicTutorial.getIsWatched()) {
            View findViewById2 = view.findViewById(2131362085);
            m.e(findViewById2, "findViewById(...)");
            g6.d.b(findViewById2);
            this.isVideoWatched = true;
        }
        ((Button) view.findViewById(2131362085)).setOnClickListener(new View.OnClickListener() { // from class: h8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.d3(a.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(a aVar, View view) {
        m.f(aVar, "this$0");
        InterfaceC0149a interfaceC0149a = aVar.listener;
        if (interfaceC0149a != null) {
            interfaceC0149a.b();
        }
        aVar.A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(DialogInterface dialogInterface) {
        m.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        View findViewById = aVar.findViewById(2131362313);
        if (findViewById != null) {
            aVar.r().R0(findViewById.getHeight());
            findViewById.getParent().getParent().requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uk.b<Integer> f3(q player) {
        return uk.d.g(uk.d.m(new c(player, null)));
    }

    private final void g3(g.b bVar, Context context) {
        bVar.l(a3(this, context, false, 2, null));
    }

    public int E2() {
        return 2132083564;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String str;
        m.f(inflater, "inflater");
        View inflate = inflater.inflate(2131558720, container, false);
        m.e(inflate, "inflate(...)");
        K2(true);
        if (u6.a.f()) {
            str = "android.resource://" + e2().getPackageName() + "/" + this.basicTutorial.getDestinationF();
        } else {
            str = "android.resource://" + e2().getPackageName() + "/" + this.basicTutorial.getDestinationC();
        }
        this.path = str;
        c3(inflate);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        InterfaceC0149a interfaceC0149a;
        m.f(configuration, "newConfig");
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        Dialog D2 = D2();
        if (D2 != null && D2.isShowing() && (interfaceC0149a = this.listener) != null) {
            interfaceC0149a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        InterfaceC0149a interfaceC0149a;
        m.f(dialogInterface, "dialog");
        super/*androidx.fragment.app.m*/.onDismiss(dialogInterface);
        g gVar = this.player;
        if (gVar == null) {
            m.t("player");
            gVar = null;
        }
        gVar.a();
        if (this.isVideoWatched && (interfaceC0149a = this.listener) != null) {
            interfaceC0149a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v1() {
        super/*androidx.fragment.app.Fragment*/.v1();
        b3();
        Y2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y1() {
        super/*androidx.fragment.app.m*/.y1();
        s1 s1Var = this.job;
        g gVar = null;
        if (s1Var != null) {
            s1.a.a(s1Var, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            m.t("playerView");
            playerView = null;
        }
        playerView.B();
        g gVar2 = this.player;
        if (gVar2 == null) {
            m.t("player");
            gVar2 = null;
        }
        gVar2.C(false);
        g gVar3 = this.player;
        if (gVar3 == null) {
            m.t("player");
            gVar3 = null;
        }
        gVar3.stop();
        g gVar4 = this.player;
        if (gVar4 == null) {
            m.t("player");
        } else {
            gVar = gVar4;
        }
        gVar.a();
        System.gc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void z1(View view, Bundle bundle) {
        m.f(view, "view");
        super/*androidx.fragment.app.Fragment*/.z1(view, bundle);
        Dialog D2 = D2();
        if (D2 != null) {
            D2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: h8.a
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    a.e3(dialogInterface);
                }
            });
        }
    }
}
