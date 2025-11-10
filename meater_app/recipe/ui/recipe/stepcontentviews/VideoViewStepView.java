package com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.k;
import androidx.media3.common.q;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.y;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import h1.e;
import i5.OverlayText;
import i5.StepContent;
import i5.StepContentMeta;
import ih.o;
import ih.u;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nh.d;
import rk.C0538f;
import rk.C0547o;
import rk.C0580a;
import rk.d2;
import rk.j0;
import rk.l0;
import rk.l1;
import rk.s1;
import rk.y0;
import vh.p;
import wh.m;

/* compiled from: VideoViewStepView.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0018\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J \u0010\u0010\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0003J&\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0006R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010.R\u0016\u0010\u000b\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u0018\u0010\u0012\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006L"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/VideoViewStepView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Li5/y;", "content", "Ly7/a;", "cacheManager", "Lih/u;", "W", "X", "", "Li5/j;", "overlayText", "L", "overlayTextList", "", "progressValue", "O", "Landroidx/media3/common/q;", "player", "Luk/b;", "Q", "Landroidx/media3/exoplayer/g$b;", "playerBuilder", "Landroid/content/Context;", "context", "V", "", "preferExtensionRenderer", "Lh1/u;", "M", "", "stepNumber", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "R", "P", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "progress", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "tipIngredient", "Lcom/airbnb/lottie/LottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "proTip", "Landroidx/media3/ui/PlayerView;", "Landroidx/media3/ui/PlayerView;", "playerView", "Lcom/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/TextStepView;", "S", "Lcom/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/TextStepView;", "Lrk/s1;", "T", "Lrk/s1;", "progressJob", "Lr7/f;", "U", "Lr7/f;", "ingredientTipDialog", "Lr7/o;", "Lr7/o;", "proTipDialog", "Landroidx/media3/exoplayer/g;", "Landroidx/media3/exoplayer/g;", "Landroidx/appcompat/widget/AppCompatButton;", "a0", "Landroidx/appcompat/widget/AppCompatButton;", "retryButton", "Landroid/widget/ProgressBar;", "b0", "Landroid/widget/ProgressBar;", "loading", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class VideoViewStepView extends ConstraintLayout {

    /* renamed from: O, reason: from kotlin metadata */
    private LinearProgressIndicator progress;

    /* renamed from: P, reason: from kotlin metadata */
    private AppCompatImageView tipIngredient;

    /* renamed from: Q, reason: from kotlin metadata */
    private LottieAnimationView proTip;

    /* renamed from: R, reason: from kotlin metadata */
    private PlayerView playerView;

    /* renamed from: S, reason: from kotlin metadata */
    private TextStepView overlayText;

    /* renamed from: T, reason: from kotlin metadata */
    private s1 progressJob;

    /* renamed from: U, reason: from kotlin metadata */
    private C0538f ingredientTipDialog;

    /* renamed from: V, reason: from kotlin metadata */
    private C0547o proTipDialog;

    /* renamed from: W, reason: from kotlin metadata */
    private g player;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private AppCompatButton retryButton;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private ProgressBar loading;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoViewStepView.kt */
    @f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView$addProgressJob$1", f = "VideoViewStepView.kt", l = {198}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a extends l implements p<j0, d<? super u>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f9984q;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ List<OverlayText> f9986s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoViewStepView.kt */
        @f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView$addProgressJob$1$1", f = "VideoViewStepView.kt", l = {201}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView$a$a, reason: collision with other inner class name */
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static final class C0141a extends l implements p<j0, d<? super u>, Object> {

            /* renamed from: q, reason: collision with root package name */
            int f9987q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ VideoViewStepView f9988r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ List<OverlayText> f9989s;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: VideoViewStepView.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lih/u;", "a", "(JLnh/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView$a$a$a, reason: collision with other inner class name */
            /* loaded from: /tmp/meat/meat/classes.dex */
            public static final class C0142a<T> implements uk.c {

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ q f9990q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ VideoViewStepView f9991r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ List<OverlayText> f9992s;

                C0142a(q qVar, VideoViewStepView videoViewStepView, List<OverlayText> list) {
                    this.f9990q = qVar;
                    this.f9991r = videoViewStepView;
                    this.f9992s = list;
                }

                public final Object a(long j10, d<? super u> dVar) {
                    this.f9991r.progress.setProgress((int) ((100 * j10) / this.f9990q.X()), true);
                    this.f9991r.O(this.f9992s, j10);
                    return u.a;
                }

                public /* bridge */ /* synthetic */ Object f(Object obj, d dVar) {
                    return a(((Number) obj).longValue(), dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0141a(VideoViewStepView videoViewStepView, List<OverlayText> list, d<? super C0141a> dVar) {
                super(2, dVar);
                this.f9988r = videoViewStepView;
                this.f9989s = list;
            }

            public final d<u> create(Object obj, d<?> dVar) {
                return new C0141a(this.f9988r, this.f9989s, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = oh.b.c();
                int i10 = this.f9987q;
                if (i10 != 0) {
                    if (i10 == 1) {
                        o.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    o.b(obj);
                    PlayerView playerView = this.f9988r.playerView;
                    m.c(playerView);
                    q player = playerView.getPlayer();
                    if (player != null) {
                        uk.b Q = this.f9988r.Q(player);
                        C0142a c0142a = new C0142a(player, this.f9988r, this.f9989s);
                        this.f9987q = 1;
                        if (Q.a(c0142a, this) == c10) {
                            return c10;
                        }
                    }
                }
                return u.a;
            }

            public final Object invoke(j0 j0Var, d<? super u> dVar) {
                return create(j0Var, dVar).invokeSuspend(u.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<OverlayText> list, d<? super a> dVar) {
            super(2, dVar);
            this.f9986s = list;
        }

        public final d<u> create(Object obj, d<?> dVar) {
            return new a(this.f9986s, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = oh.b.c();
            int i10 = this.f9984q;
            if (i10 != 0) {
                if (i10 == 1) {
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                o.b(obj);
                d2 c11 = y0.c();
                C0141a c0141a = new C0141a(VideoViewStepView.this, this.f9986s, null);
                this.f9984q = 1;
                if (rk.g.g(c11, c0141a, this) == c10) {
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
    /* compiled from: VideoViewStepView.kt */
    @f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView$pollCurrentDuration$1", f = "VideoViewStepView.kt", l = {232, 233}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Luk/c;", "", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends l implements p<uk.c<? super Long>, d<? super u>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f9993q;

        /* renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f9994r;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ q f9996t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, d<? super b> dVar) {
            super(2, dVar);
            this.f9996t = qVar;
        }

        public final d<u> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f9996t, dVar);
            bVar.f9994r = obj;
            return bVar;
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(uk.c<? super Long> cVar, d<? super u> dVar) {
            return create(cVar, dVar).invokeSuspend(u.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0058 -> B:7:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = oh.b.c()
                int r1 = r6.f9993q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r6.f9994r
                uk.c r1 = (uk.c) r1
                ih.o.b(r7)
                r7 = r1
                goto L30
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f9994r
                uk.c r1 = (uk.c) r1
                ih.o.b(r7)
                r7 = r1
                r1 = r6
                goto L4e
            L29:
                ih.o.b(r7)
                java.lang.Object r7 = r6.f9994r
                uk.c r7 = (uk.c) r7
            L30:
                r1 = r6
            L31:
                com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView r4 = com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView.this
                rk.s1 r4 = com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView.I(r4)
                if (r4 == 0) goto L5b
                androidx.media3.common.q r4 = r1.f9996t
                long r4 = r4.i0()
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.c(r4)
                r1.f9994r = r7
                r1.f9993q = r3
                java.lang.Object r4 = r7.f(r4, r1)
                if (r4 != r0) goto L4e
                return r0
            L4e:
                r1.f9994r = r7
                r1.f9993q = r2
                r4 = 200(0xc8, double:9.9E-322)
                java.lang.Object r4 = rk.t0.a(r4, r1)
                if (r4 != r0) goto L31
                return r0
            L5b:
                ih.u r7 = ih.u.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VideoViewStepView.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"com/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/VideoViewStepView$c", "Landroidx/media3/common/q$d;", "Landroidx/media3/common/PlaybackException;", "error", "Lih/u;", "i0", "", "isPlaying", "q0", "", "playbackState", "K", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c implements q.d {
        c() {
        }

        @Override // androidx.media3.common.q.d
        public void K(int i10) {
            if (i10 == 3) {
                g6.d.g(VideoViewStepView.this.loading);
                g6.d.g(VideoViewStepView.this.retryButton);
            }
        }

        @Override // androidx.media3.common.q.d
        public void i0(PlaybackException playbackException) {
            m.f(playbackException, "error");
            super.i0(playbackException);
            k6.b.t("(VideoViewStepView) Player has issue playing " + playbackException.f3897q + " : " + playbackException.getMessage(), new Object[0]);
            g6.d.g(VideoViewStepView.this.loading);
            g6.d.j(VideoViewStepView.this.retryButton);
        }

        @Override // androidx.media3.common.q.d
        public void q0(boolean z10) {
            super.q0(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewStepView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        View.inflate(context, 2131558691, this);
        this.playerView = (PlayerView) findViewById(2131363064);
        View findViewById = findViewById(2131363497);
        m.e(findViewById, "findViewById(...)");
        this.tipIngredient = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(2131363087);
        m.e(findViewById2, "findViewById(...)");
        this.proTip = (LottieAnimationView) findViewById2;
        LinearProgressIndicator findViewById3 = findViewById(2131363635);
        m.e(findViewById3, "findViewById(...)");
        this.progress = findViewById3;
        View findViewById4 = findViewById(2131363634);
        m.e(findViewById4, "findViewById(...)");
        this.overlayText = (TextStepView) findViewById4;
        View findViewById5 = findViewById(2131363181);
        m.e(findViewById5, "findViewById(...)");
        this.retryButton = (AppCompatButton) findViewById5;
        View findViewById6 = findViewById(2131362782);
        m.e(findViewById6, "findViewById(...)");
        this.loading = (ProgressBar) findViewById6;
    }

    private final void L(List<OverlayText> list) {
        s1 s1Var = this.progressJob;
        if (s1Var != null) {
            m.c(s1Var);
            s1.a.a(s1Var, (CancellationException) null, 1, (Object) null);
            this.progressJob = null;
        }
        this.progressJob = rk.g.d(l1.q, (nh.g) null, (l0) null, new a(list, null), 3, (Object) null);
    }

    private final h1.u M(Context context, boolean preferExtensionRenderer) {
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

    static /* synthetic */ h1.u N(VideoViewStepView videoViewStepView, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return videoViewStepView.M(context, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(List<OverlayText> list, long j10) {
        if (list != null && (!list.isEmpty())) {
            for (OverlayText overlayText : list) {
                long startTime = overlayText.getStartTime() * 1000;
                if (j10 <= overlayText.getEndTime() * 1000 && startTime <= j10) {
                    if (this.overlayText.getVisibility() == 8) {
                        g6.d.c(this.overlayText, overlayText.getText());
                        g6.d.k(this.overlayText);
                    }
                } else if (this.overlayText.getVisibility() == 0) {
                    g6.d.h(this.overlayText);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uk.b<Long> Q(q player) {
        return uk.d.g(uk.d.m(new b(player, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.m] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void S(StepContent stepContent, VideoViewStepView videoViewStepView, FragmentManager fragmentManager, View view) {
        List<String> d10;
        m.f(stepContent, "$content");
        m.f(videoViewStepView, "this$0");
        m.f(fragmentManager, "$fragmentManager");
        StepContentMeta meta = stepContent.getMeta();
        if (meta != null && (d10 = meta.d()) != null) {
            C0538f a10 = C0538f.INSTANCE.a(d10);
            videoViewStepView.ingredientTipDialog = a10;
            ?? r02 = a10;
            if (a10 == null) {
                m.t("ingredientTipDialog");
                r02 = 0;
            }
            r02.N2(fragmentManager, "dialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.m] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void T(StepContent stepContent, VideoViewStepView videoViewStepView, FragmentManager fragmentManager, View view) {
        String proTip;
        m.f(stepContent, "$content");
        m.f(videoViewStepView, "this$0");
        m.f(fragmentManager, "$fragmentManager");
        StepContentMeta meta = stepContent.getMeta();
        if (meta != null && (proTip = meta.getProTip()) != null) {
            C0547o a10 = C0547o.INSTANCE.a(proTip);
            videoViewStepView.proTipDialog = a10;
            ?? r02 = a10;
            if (a10 == null) {
                m.t("proTipDialog");
                r02 = 0;
            }
            r02.N2(fragmentManager, "dialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(VideoViewStepView videoViewStepView, StepContent stepContent, C0580a c0580a, View view) {
        m.f(videoViewStepView, "this$0");
        m.f(stepContent, "$content");
        m.f(c0580a, "$cacheManager");
        videoViewStepView.W(stepContent, c0580a);
        m.c(view);
        g6.d.g(view);
        videoViewStepView.loading.setProgressTintList(ColorStateList.valueOf(videoViewStepView.getContext().getColor(2131100400)));
        g6.d.j(videoViewStepView.loading);
    }

    private final void V(g.b bVar, Context context) {
        bVar.l(N(this, context, false, 2, null));
    }

    private final void W(StepContent stepContent, C0580a c0580a) {
        StepContentMeta meta = stepContent.getMeta();
        if (meta != null) {
            L(meta.e());
            if (meta.getVideo() != null) {
                X(stepContent, c0580a);
            }
        }
    }

    private final void X(StepContent stepContent, C0580a c0580a) {
        String str;
        g gVar = this.player;
        q qVar = null;
        if (gVar != null) {
            if (gVar != null) {
                gVar.a();
            }
            this.player = null;
        }
        g.b bVar = new g.b(getContext());
        Context context = getContext();
        m.e(context, "getContext(...)");
        V(bVar, context);
        g f10 = bVar.f();
        this.player = f10;
        if (f10 != null) {
            f10.Q(2);
        }
        g gVar2 = this.player;
        if (gVar2 != null) {
            gVar2.C(true);
        }
        StepContentMeta meta = stepContent.getMeta();
        if (meta != null) {
            str = meta.getVideo();
        } else {
            str = null;
        }
        m.c(str);
        k d10 = k.d(Uri.parse(str));
        m.e(d10, "fromUri(...)");
        y a10 = new y.b(c0580a.getCacheDataSourceFactory()).a(d10);
        m.e(a10, "createMediaSource(...)");
        g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.c(a10);
        }
        g gVar4 = this.player;
        if (gVar4 != null) {
            gVar4.h();
        }
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setPlayer(this.player);
        }
        PlayerView playerView2 = this.playerView;
        if (playerView2 != null) {
            playerView2.setControllerAutoShow(false);
        }
        PlayerView playerView3 = this.playerView;
        if (playerView3 != null) {
            playerView3.w();
        }
        PlayerView playerView4 = this.playerView;
        if (playerView4 != null) {
            playerView4.setUseController(false);
        }
        PlayerView playerView5 = this.playerView;
        if (playerView5 != null) {
            qVar = playerView5.getPlayer();
        }
        m.c(qVar);
        qVar.U(new c());
    }

    public final void P() {
        s1 s1Var = this.progressJob;
        if (s1Var != null) {
            s1.a.a(s1Var, (CancellationException) null, 1, (Object) null);
        }
        this.progressJob = null;
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.B();
        }
        g gVar = this.player;
        if (gVar != null) {
            gVar.C(false);
        }
        g gVar2 = this.player;
        if (gVar2 != null) {
            gVar2.stop();
        }
        g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.player = null;
        System.gc();
    }

    public final void R(int i10, final StepContent stepContent, final FragmentManager fragmentManager, final C0580a c0580a) {
        String proTip;
        List<String> d10;
        m.f(stepContent, "content");
        m.f(fragmentManager, "fragmentManager");
        m.f(c0580a, "cacheManager");
        StepContentMeta meta = stepContent.getMeta();
        if (meta != null && (d10 = meta.d()) != null && (!d10.isEmpty())) {
            this.tipIngredient.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            g6.d.j(this.tipIngredient);
        }
        StepContentMeta meta2 = stepContent.getMeta();
        if (meta2 != null && (proTip = meta2.getProTip()) != null && proTip.length() > 0) {
            this.proTip.setAnimation(2131951675);
            g6.d.j(this.proTip);
        }
        this.tipIngredient.setOnClickListener(new View.OnClickListener() { // from class: s7.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoViewStepView.S(StepContent.this, this, fragmentManager, view);
            }
        });
        this.proTip.setOnClickListener(new View.OnClickListener() { // from class: s7.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoViewStepView.T(StepContent.this, this, fragmentManager, view);
            }
        });
        W(stepContent, c0580a);
        this.retryButton.setOnClickListener(new View.OnClickListener() { // from class: s7.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoViewStepView.U(VideoViewStepView.this, stepContent, c0580a, view);
            }
        });
    }
}
