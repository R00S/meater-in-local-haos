package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C2084e;
import androidx.fragment.app.K;
import androidx.fragment.app.p;
import d.C2998b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;
import oa.C4170o;
import s.C4391a;
import s1.C4424b0;
import s1.X;

/* compiled from: DefaultSpecialEffectsController.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\b%&'#()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006,"}, d2 = {"Landroidx/fragment/app/e;", "Landroidx/fragment/app/K;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/K$d;", "operations", "Loa/F;", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/e$b;", "animationInfos", "F", "Landroidx/fragment/app/e$h;", "transitionInfos", "", "isPop", "firstOut", "lastIn", "H", "(Ljava/util/List;ZLandroidx/fragment/app/K$d;Landroidx/fragment/app/K$d;)V", "Ls/a;", "", "Landroid/view/View;", "", "names", "J", "(Ls/a;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", "d", "(Ljava/util/List;Z)V", "a", "b", "c", "e", "f", "g", "h", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2084e extends K {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/e$a;", "Landroidx/fragment/app/K$b;", "Landroidx/fragment/app/e$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/e$b;)V", "Landroid/view/ViewGroup;", "container", "Loa/F;", "d", "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/e$b;", "h", "()Landroidx/fragment/app/e$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$a */
    static final class a extends K.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animationInfo;

        /* compiled from: DefaultSpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/e$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Loa/F;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.e$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0359a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K.d f25619a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f25620b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f25621c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f25622d;

            AnimationAnimationListenerC0359a(K.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f25619a = dVar;
                this.f25620b = viewGroup;
                this.f25621c = view;
                this.f25622d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup container, View view, a this$0) {
                C3862t.g(container, "$container");
                C3862t.g(this$0, "this$0");
                container.endViewTransition(view);
                this$0.getAnimationInfo().getOperation().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C3862t.g(animation, "animation");
                final ViewGroup viewGroup = this.f25620b;
                final View view = this.f25621c;
                final a aVar = this.f25622d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2084e.a.AnimationAnimationListenerC0359a.b(viewGroup, view, aVar);
                    }
                });
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f25619a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                C3862t.g(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                C3862t.g(animation, "animation");
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f25619a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            C3862t.g(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @Override // androidx.fragment.app.K.b
        public void c(ViewGroup container) {
            C3862t.g(container, "container");
            K.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().f25489l0;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().e(this);
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.K.b
        public void d(ViewGroup container) throws Resources.NotFoundException {
            C3862t.g(container, "container");
            if (this.animationInfo.b()) {
                this.animationInfo.getOperation().e(this);
                return;
            }
            Context context = container.getContext();
            K.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().f25489l0;
            b bVar = this.animationInfo;
            C3862t.f(context, "context");
            p.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f25708a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != K.d.b.REMOVED) {
                view.startAnimation(animation);
                this.animationInfo.getOperation().e(this);
                return;
            }
            container.startViewTransition(view);
            p.b bVar2 = new p.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0359a(operation, container, view, this));
            view.startAnimation(bVar2);
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }

        /* renamed from: h, reason: from getter */
        public final b getAnimationInfo() {
            return this.animationInfo;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/e$b;", "Landroidx/fragment/app/e$f;", "Landroidx/fragment/app/K$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/K$d;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/p$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/p$a;", "b", "Z", "isAnimLoaded", "d", "Landroidx/fragment/app/p$a;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$b */
    private static final class b extends f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isAnimLoaded;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private p.a animation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K.d operation, boolean z10) {
            super(operation);
            C3862t.g(operation, "operation");
            this.isPop = z10;
        }

        public final p.a c(Context context) throws Resources.NotFoundException {
            C3862t.g(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            p.a aVarB = p.b(context, getOperation().getFragment(), getOperation().getFinalState() == K.d.b.VISIBLE, this.isPop);
            this.animation = aVarB;
            this.isAnimLoaded = true;
            return aVarB;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/e$c;", "Landroidx/fragment/app/K$b;", "Landroidx/fragment/app/e$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/e$b;)V", "Landroid/view/ViewGroup;", "container", "Loa/F;", "f", "(Landroid/view/ViewGroup;)V", "Ld/b;", "backEvent", "e", "(Ld/b;Landroid/view/ViewGroup;)V", "d", "c", "Landroidx/fragment/app/e$b;", "h", "()Landroidx/fragment/app/e$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "b", "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$c */
    private static final class c extends K.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animatorInfo;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private AnimatorSet animator;

        /* compiled from: DefaultSpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/e$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "Loa/F;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.e$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f25628a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f25629b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f25630c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ K.d f25631d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f25632e;

            a(ViewGroup viewGroup, View view, boolean z10, K.d dVar, c cVar) {
                this.f25628a = viewGroup;
                this.f25629b = view;
                this.f25630c = z10;
                this.f25631d = dVar;
                this.f25632e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                C3862t.g(anim, "anim");
                this.f25628a.endViewTransition(this.f25629b);
                if (this.f25630c) {
                    K.d.b finalState = this.f25631d.getFinalState();
                    View viewToAnimate = this.f25629b;
                    C3862t.f(viewToAnimate, "viewToAnimate");
                    finalState.j(viewToAnimate, this.f25628a);
                }
                this.f25632e.getAnimatorInfo().getOperation().e(this.f25632e);
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f25631d + " has ended.");
                }
            }
        }

        public c(b animatorInfo) {
            C3862t.g(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Override // androidx.fragment.app.K.b
        /* renamed from: b */
        public boolean getIsSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.K.b
        public void c(ViewGroup container) {
            C3862t.g(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            K.d operation = this.animatorInfo.getOperation();
            if (operation.getIsSeeking()) {
                C0360e.f25634a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (v.Q0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.getIsSeeking() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.K.b
        public void d(ViewGroup container) {
            C3862t.g(container, "container");
            K.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            animatorSet.start();
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.K.b
        public void e(C2998b backEvent, ViewGroup container) {
            C3862t.g(backEvent, "backEvent");
            C3862t.g(container, "container");
            K.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().f25466O) {
                return;
            }
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long jA = d.f25633a.a(animatorSet);
            long progress = (long) (backEvent.getProgress() * jA);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == jA) {
                progress = jA - 1;
            }
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            C0360e.f25634a.b(animatorSet, progress);
        }

        @Override // androidx.fragment.app.K.b
        public void f(ViewGroup container) throws Resources.NotFoundException {
            C3862t.g(container, "container");
            if (this.animatorInfo.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.animatorInfo;
            C3862t.f(context, "context");
            p.a aVarC = bVar.c(context);
            this.animator = aVarC != null ? aVarC.f25709b : null;
            K.d operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            boolean z10 = operation.getFinalState() == K.d.b.GONE;
            View view = fragment.f25489l0;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.addListener(new a(container, view, z10, operation, this));
            }
            AnimatorSet animatorSet2 = this.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        /* renamed from: h, reason: from getter */
        public final b getAnimatorInfo() {
            return this.animatorInfo;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/e$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f25633a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            C3862t.g(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/e$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "Loa/F;", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    public static final class C0360e {

        /* renamed from: a, reason: collision with root package name */
        public static final C0360e f25634a = new C0360e();

        private C0360e() {
        }

        public final void a(AnimatorSet animatorSet) {
            C3862t.g(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long time) {
            C3862t.g(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/e$f;", "", "Landroidx/fragment/app/K$d;", "operation", "<init>", "(Landroidx/fragment/app/K$d;)V", "a", "Landroidx/fragment/app/K$d;", "()Landroidx/fragment/app/K$d;", "", "b", "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final K.d operation;

        public f(K.d operation) {
            C3862t.g(operation, "operation");
            this.operation = operation;
        }

        /* renamed from: a, reason: from getter */
        public final K.d getOperation() {
            return this.operation;
        }

        public final boolean b() {
            K.d.b bVar;
            View view = this.operation.getFragment().f25489l0;
            K.d.b bVarA = view != null ? K.d.b.INSTANCE.a(view) : null;
            K.d.b finalState = this.operation.getFinalState();
            return bVarA == finalState || !(bVarA == (bVar = K.d.b.VISIBLE) || finalState == bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010TR\u0011\u0010e\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bd\u0010T¨\u0006f"}, d2 = {"Landroidx/fragment/app/e$g;", "Landroidx/fragment/app/K$b;", "", "Landroidx/fragment/app/e$h;", "transitionInfos", "Landroidx/fragment/app/K$d;", "firstOut", "lastIn", "Landroidx/fragment/app/F;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Ls/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/K$d;Landroidx/fragment/app/K$d;Landroidx/fragment/app/F;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Ls/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Ls/a;Ls/a;Z)V", "Landroid/view/ViewGroup;", "container", "Loa/o;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/K$d;Landroidx/fragment/app/K$d;)Loa/o;", "enteringViews", "Lkotlin/Function0;", "Loa/F;", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;LBa/a;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "Ld/b;", "backEvent", "e", "(Ld/b;Landroid/view/ViewGroup;)V", "d", "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/K$d;", "t", "()Landroidx/fragment/app/K$d;", "u", "g", "Landroidx/fragment/app/F;", "v", "()Landroidx/fragment/app/F;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "i", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "Ls/a;", "getSharedElementNameMapping", "()Ls/a;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "Ln1/e;", "q", "Ln1/e;", "getTransitionSignal", "()Ln1/e;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "b", "isSeekingSupported", "x", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$g */
    static final class g extends K.b {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<h> transitionInfos;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final K.d firstOut;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final K.d lastIn;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final F transitionImpl;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementFirstOutViews;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementLastInViews;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final C4391a<String, String> sharedElementNameMapping;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> enteringNames;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> exitingNames;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final C4391a<String, View> firstOutViews;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final C4391a<String, View> lastInViews;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final n1.e transitionSignal;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Object controller;

        /* compiled from: DefaultSpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.fragment.app.e$g$a */
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ ViewGroup f25652C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Object f25653D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f25652C = viewGroup;
                this.f25653D = obj;
            }

            public final void a() {
                g.this.getTransitionImpl().e(this.f25652C, this.f25653D);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: DefaultSpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.fragment.app.e$g$b */
        static final class b extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ ViewGroup f25655C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Object f25656D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ O<Ba.a<C4153F>> f25657E;

            /* compiled from: DefaultSpecialEffectsController.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "c", "()V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.fragment.app.e$g$b$a */
            static final class a extends AbstractC3864v implements Ba.a<C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ g f25658B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ Object f25659C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ ViewGroup f25660D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f25658B = gVar;
                    this.f25659C = obj;
                    this.f25660D = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void d(g this$0, ViewGroup container) {
                    C3862t.g(this$0, "this$0");
                    C3862t.g(container, "$container");
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        K.d operation = ((h) it.next()).getOperation();
                        View viewE0 = operation.getFragment().E0();
                        if (viewE0 != null) {
                            operation.getFinalState().j(viewE0, container);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void i(g this$0) {
                    C3862t.g(this$0, "this$0");
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).getOperation().e(this$0);
                    }
                }

                public final void c() {
                    List<h> listW = this.f25658B.w();
                    if (!(listW instanceof Collection) || !listW.isEmpty()) {
                        Iterator<T> it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).getOperation().getIsSeeking()) {
                                if (v.Q0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                n1.e eVar = new n1.e();
                                F transitionImpl = this.f25658B.getTransitionImpl();
                                Fragment fragment = this.f25658B.w().get(0).getOperation().getFragment();
                                Object obj = this.f25659C;
                                final g gVar = this.f25658B;
                                transitionImpl.w(fragment, obj, eVar, new Runnable() { // from class: androidx.fragment.app.m
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C2084e.g.b.a.i(gVar);
                                    }
                                });
                                eVar.a();
                                return;
                            }
                        }
                    }
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    F transitionImpl2 = this.f25658B.getTransitionImpl();
                    Object controller = this.f25658B.getController();
                    C3862t.d(controller);
                    final g gVar2 = this.f25658B;
                    final ViewGroup viewGroup = this.f25660D;
                    transitionImpl2.d(controller, new Runnable() { // from class: androidx.fragment.app.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2084e.g.b.a.d(gVar2, viewGroup);
                        }
                    });
                }

                @Override // Ba.a
                public /* bridge */ /* synthetic */ C4153F invoke() {
                    c();
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, O<Ba.a<C4153F>> o10) {
                super(0);
                this.f25655C = viewGroup;
                this.f25656D = obj;
                this.f25657E = o10;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.e$g$b$a] */
            public final void a() {
                g gVar = g.this;
                gVar.C(gVar.getTransitionImpl().j(this.f25655C, this.f25656D));
                boolean z10 = g.this.getController() != null;
                Object obj = this.f25656D;
                ViewGroup viewGroup = this.f25655C;
                if (!z10) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.f25657E.f43978B = new a(g.this, obj, viewGroup);
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.getFirstOut() + " to " + g.this.getLastIn());
                }
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        public g(List<h> transitionInfos, K.d dVar, K.d dVar2, F transitionImpl, Object obj, ArrayList<View> sharedElementFirstOutViews, ArrayList<View> sharedElementLastInViews, C4391a<String, String> sharedElementNameMapping, ArrayList<String> enteringNames, ArrayList<String> exitingNames, C4391a<String, View> firstOutViews, C4391a<String, View> lastInViews, boolean z10) {
            C3862t.g(transitionInfos, "transitionInfos");
            C3862t.g(transitionImpl, "transitionImpl");
            C3862t.g(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            C3862t.g(sharedElementLastInViews, "sharedElementLastInViews");
            C3862t.g(sharedElementNameMapping, "sharedElementNameMapping");
            C3862t.g(enteringNames, "enteringNames");
            C3862t.g(exitingNames, "exitingNames");
            C3862t.g(firstOutViews, "firstOutViews");
            C3862t.g(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = dVar;
            this.lastIn = dVar2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z10;
            this.transitionSignal = new n1.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(K.d operation, g this$0) {
            C3862t.g(operation, "$operation");
            C3862t.g(this$0, "this$0");
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        private final void B(ArrayList<View> enteringViews, ViewGroup container, Ba.a<C4153F> executeTransition) {
            D.e(enteringViews, 4);
            ArrayList<String> arrayListQ = this.transitionImpl.q(this.sharedElementLastInViews);
            if (v.Q0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it = this.sharedElementFirstOutViews.iterator();
                while (it.hasNext()) {
                    View sharedElementFirstOutViews = it.next();
                    C3862t.f(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + X.H(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it2 = this.sharedElementLastInViews.iterator();
                while (it2.hasNext()) {
                    View sharedElementLastInViews = it2.next();
                    C3862t.f(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + X.H(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.y(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListQ, this.sharedElementNameMapping);
            D.e(enteringViews, 0);
            this.transitionImpl.A(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        private final void n(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (C4424b0.a(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    C3862t.f(child, "child");
                    n(transitioningViews, child);
                }
            }
        }

        private final C4170o<ArrayList<View>, Object> o(ViewGroup container, K.d lastIn, final K.d firstOut) {
            final K.d dVar = lastIn;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.transitionInfos.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && firstOut != null && dVar != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    D.a(lastIn.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    s1.L.a(container, new Runnable() { // from class: androidx.fragment.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2084e.g.p(dVar, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        C3862t.f(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.v(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        C3862t.f(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final F f10 = this.transitionImpl;
                            s1.L.a(container, new Runnable() { // from class: androidx.fragment.app.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2084e.g.q(f10, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.transitionImpl.z(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    F f11 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    f11.s(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.transitionInfos.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                K.d operation = next.getOperation();
                Iterator<h> it3 = it2;
                Object objH = this.transitionImpl.h(next.getTransition());
                if (objH != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Object obj2 = objP2;
                    View view4 = operation.getFragment().f25489l0;
                    Object obj3 = objP;
                    C3862t.f(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation == firstOut || operation == dVar)) {
                        if (operation == firstOut) {
                            arrayList2.removeAll(kotlin.collections.r.b1(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(kotlin.collections.r.b1(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.a(objH, view);
                    } else {
                        this.transitionImpl.b(objH, arrayList2);
                        this.transitionImpl.s(objH, objH, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == K.d.b.GONE) {
                            operation.q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().f25489l0);
                            this.transitionImpl.r(objH, operation.getFragment().f25489l0, arrayList3);
                            s1.L.a(container, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2084e.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == K.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z10) {
                            this.transitionImpl.u(objH, rect);
                        }
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator<View> it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                View transitioningViews = it4.next();
                                C3862t.f(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews);
                            }
                        }
                    } else {
                        this.transitionImpl.v(objH, view2);
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator<View> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                View transitioningViews2 = it5.next();
                                C3862t.f(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        objP = this.transitionImpl.p(obj3, objH, null);
                        dVar = lastIn;
                        it2 = it3;
                        objP2 = obj2;
                    } else {
                        objP = obj3;
                        objP2 = this.transitionImpl.p(obj2, objH, null);
                        dVar = lastIn;
                        it2 = it3;
                    }
                } else {
                    dVar = lastIn;
                    it2 = it3;
                }
            }
            Object objO = this.transitionImpl.o(objP, objP2, this.sharedElementTransition);
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO);
            }
            return new C4170o<>(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(K.d dVar, K.d dVar2, g this$0) {
            C3862t.g(this$0, "this$0");
            D.a(dVar.getFragment(), dVar2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(F impl, View view, Rect lastInEpicenterRect) {
            C3862t.g(impl, "$impl");
            C3862t.g(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList transitioningViews) {
            C3862t.g(transitioningViews, "$transitioningViews");
            D.e(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(K.d operation, g this$0) {
            C3862t.g(operation, "$operation");
            C3862t.g(this$0, "this$0");
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(O seekCancelLambda) {
            C3862t.g(seekCancelLambda, "$seekCancelLambda");
            Ba.a aVar = (Ba.a) seekCancelLambda.f43978B;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void C(Object obj) {
            this.controller = obj;
        }

        @Override // androidx.fragment.app.K.b
        /* renamed from: b */
        public boolean getIsSeekingSupported() {
            Object obj;
            if (this.transitionImpl.m()) {
                List<h> list = this.transitionInfos;
                if ((list instanceof Collection) && list.isEmpty()) {
                    obj = this.sharedElementTransition;
                    if (obj != null) {
                    }
                    return true;
                }
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.getTransition() == null || !this.transitionImpl.n(hVar.getTransition())) {
                        break;
                    }
                }
                obj = this.sharedElementTransition;
                if (obj != null || this.transitionImpl.n(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.fragment.app.K.b
        public void c(ViewGroup container) {
            C3862t.g(container, "container");
            this.transitionSignal.a();
        }

        @Override // androidx.fragment.app.K.b
        public void d(ViewGroup container) {
            C3862t.g(container, "container");
            if (!container.isLaidOut()) {
                for (h hVar : this.transitionInfos) {
                    K.d operation = hVar.getOperation();
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                    }
                    hVar.getOperation().e(this);
                }
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                F f10 = this.transitionImpl;
                C3862t.d(obj);
                f10.c(obj);
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            C4170o<ArrayList<View>, Object> c4170oO = o(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayListA = c4170oO.a();
            Object objB = c4170oO.b();
            List<h> list = this.transitionInfos;
            ArrayList<K.d> arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).getOperation());
            }
            for (final K.d dVar : arrayList) {
                this.transitionImpl.w(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2084e.g.y(dVar, this);
                    }
                });
            }
            B(arrayListA, container, new a(container, objB));
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.K.b
        public void e(C2998b backEvent, ViewGroup container) {
            C3862t.g(backEvent, "backEvent");
            C3862t.g(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.t(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.K.b
        public void f(ViewGroup container) {
            C3862t.g(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    K.d operation = ((h) it.next()).getOperation();
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (x() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && x()) {
                final O o10 = new O();
                C4170o<ArrayList<View>, Object> c4170oO = o(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListA = c4170oO.a();
                Object objB = c4170oO.b();
                List<h> list = this.transitionInfos;
                ArrayList<K.d> arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).getOperation());
                }
                for (final K.d dVar : arrayList) {
                    this.transitionImpl.x(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2084e.g.z(o10);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2084e.g.A(dVar, this);
                        }
                    });
                }
                B(arrayListA, container, new b(container, objB, o10));
            }
        }

        /* renamed from: s, reason: from getter */
        public final Object getController() {
            return this.controller;
        }

        /* renamed from: t, reason: from getter */
        public final K.d getFirstOut() {
            return this.firstOut;
        }

        /* renamed from: u, reason: from getter */
        public final K.d getLastIn() {
            return this.lastIn;
        }

        /* renamed from: v, reason: from getter */
        public final F getTransitionImpl() {
            return this.transitionImpl;
        }

        public final List<h> w() {
            return this.transitionInfos;
        }

        public final boolean x() {
            List<h> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).getOperation().getFragment().f25466O) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/e$h;", "Landroidx/fragment/app/e$f;", "Landroidx/fragment/app/K$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/K$d;ZZ)V", "", "transition", "Landroidx/fragment/app/F;", "d", "(Ljava/lang/Object;)Landroidx/fragment/app/F;", "g", "()Z", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Landroidx/fragment/app/F;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.e$h */
    private static final class h extends f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object transition;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isOverlapAllowed;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(K.d operation, boolean z10, boolean z11) {
            Object objV0;
            super(operation);
            C3862t.g(operation, "operation");
            K.d.b finalState = operation.getFinalState();
            K.d.b bVar = K.d.b.VISIBLE;
            if (finalState == bVar) {
                Fragment fragment = operation.getFragment();
                objV0 = z10 ? fragment.t0() : fragment.b0();
            } else {
                Fragment fragment2 = operation.getFragment();
                objV0 = z10 ? fragment2.v0() : fragment2.e0();
            }
            this.transition = objV0;
            this.isOverlapAllowed = operation.getFinalState() == bVar ? z10 ? operation.getFragment().V() : operation.getFragment().U() : true;
            this.sharedElementTransition = z11 ? z10 ? operation.getFragment().x0() : operation.getFragment().w0() : null;
        }

        private final F d(Object transition) {
            if (transition == null) {
                return null;
            }
            F f10 = D.PLATFORM_IMPL;
            if (f10 != null && f10.g(transition)) {
                return f10;
            }
            F f11 = D.SUPPORT_IMPL;
            if (f11 != null && f11.g(transition)) {
                return f11;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final F c() {
            F fD = d(this.transition);
            F fD2 = d(this.sharedElementTransition);
            if (fD == null || fD2 == null || fD == fD2) {
                return fD == null ? fD2 : fD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        /* renamed from: e, reason: from getter */
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        /* renamed from: f, reason: from getter */
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean g() {
            return this.sharedElementTransition != null;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.fragment.app.e$i */
    static final class i extends AbstractC3864v implements Ba.l<Map.Entry<String, View>, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Collection<String> f25664B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection) {
            super(1);
            this.f25664B = collection;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry<String, View> entry) {
            C3862t.g(entry, "entry");
            return Boolean.valueOf(kotlin.collections.r.a0(this.f25664B, X.H(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2084e(ViewGroup container) {
        super(container);
        C3862t.g(container, "container");
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void F(List<b> animationInfos) throws Resources.NotFoundException {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(arrayList2, ((b) it.next()).getOperation().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z10 = false;
        for (b bVar : animationInfos) {
            Context context = getContainer().getContext();
            K.d operation = bVar.getOperation();
            C3862t.f(context, "context");
            p.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f25709b == null) {
                    arrayList.add(bVar);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.f().isEmpty()) {
                        if (operation.getFinalState() == K.d.b.GONE) {
                            operation.q(false);
                        }
                        operation.b(new c(bVar));
                        z10 = true;
                    } else if (v.Q0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            K.d operation2 = bVar2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z10) {
                    operation2.b(new a(bVar2));
                } else if (v.Q0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (v.Q0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(C2084e this$0, K.d operation) {
        C3862t.g(this$0, "this$0");
        C3862t.g(operation, "$operation");
        this$0.c(operation);
    }

    private final void H(List<h> transitionInfos, boolean isPop, K.d firstOut, K.d lastIn) {
        Object obj;
        F f10;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Object obj2;
        String strB;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : transitionInfos) {
            if (!((h) obj3).b()) {
                arrayList4.add(obj3);
            }
        }
        ArrayList<h> arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (((h) obj4).c() != null) {
                arrayList5.add(obj4);
            }
        }
        F f11 = null;
        for (h hVar : arrayList5) {
            F fC = hVar.c();
            if (f11 != null && fC != f11) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.getOperation().getFragment() + " returned Transition " + hVar.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            f11 = fC;
        }
        if (f11 == null) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        C4391a c4391a = new C4391a();
        ArrayList<String> arrayList8 = new ArrayList<>();
        ArrayList<String> arrayList9 = new ArrayList<>();
        C4391a<String, View> c4391a2 = new C4391a<>();
        C4391a<String, View> c4391a3 = new C4391a<>();
        Iterator it2 = arrayList5.iterator();
        ArrayList<String> arrayListZ0 = arrayList8;
        ArrayList<String> arrayListY0 = arrayList9;
        loop3: while (true) {
            obj = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (!hVar2.g() || firstOut == null || lastIn == null) {
                    f10 = f11;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    it = it2;
                    arrayList3 = arrayList5;
                } else {
                    Object objB = f11.B(f11.h(hVar2.getSharedElementTransition()));
                    arrayListY0 = lastIn.getFragment().y0();
                    C3862t.f(arrayListY0, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> arrayListY02 = firstOut.getFragment().y0();
                    C3862t.f(arrayListY02, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> arrayListZ02 = firstOut.getFragment().z0();
                    C3862t.f(arrayListZ02, "firstOut.fragment.sharedElementTargetNames");
                    int size = arrayListZ02.size();
                    f10 = f11;
                    it = it2;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        int iIndexOf = arrayListY0.indexOf(arrayListZ02.get(i10));
                        if (iIndexOf != -1) {
                            arrayListY0.set(iIndexOf, arrayListY02.get(i10));
                        }
                        i10++;
                        size = i11;
                    }
                    arrayListZ0 = lastIn.getFragment().z0();
                    C3862t.f(arrayListZ0, "lastIn.fragment.sharedElementTargetNames");
                    C4170o c4170oA = !isPop ? oa.v.a(firstOut.getFragment().f0(), lastIn.getFragment().c0()) : oa.v.a(firstOut.getFragment().c0(), lastIn.getFragment().f0());
                    f1.y yVar = (f1.y) c4170oA.a();
                    f1.y yVar2 = (f1.y) c4170oA.b();
                    int size2 = arrayListY0.size();
                    int i12 = 0;
                    arrayList3 = arrayList5;
                    while (true) {
                        arrayList2 = arrayList7;
                        if (i12 >= size2) {
                            break;
                        }
                        int i13 = size2;
                        String str = arrayListY0.get(i12);
                        C3862t.f(str, "exitingNames[i]");
                        String str2 = arrayListZ0.get(i12);
                        C3862t.f(str2, "enteringNames[i]");
                        c4391a.put(str, str2);
                        i12++;
                        arrayList7 = arrayList2;
                        size2 = i13;
                    }
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        Iterator<String> it3 = arrayListZ0.iterator();
                        while (true) {
                            arrayList = arrayList6;
                            if (!it3.hasNext()) {
                                break;
                            }
                            Iterator<String> it4 = it3;
                            Log.v("FragmentManager", "Name: " + it3.next());
                            objB = objB;
                            arrayList6 = arrayList;
                            it3 = it4;
                        }
                        obj2 = objB;
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator<String> it5 = arrayListY0.iterator(); it5.hasNext(); it5 = it5) {
                            Log.v("FragmentManager", "Name: " + it5.next());
                        }
                    } else {
                        obj2 = objB;
                        arrayList = arrayList6;
                    }
                    View view = firstOut.getFragment().f25489l0;
                    C3862t.f(view, "firstOut.fragment.mView");
                    I(c4391a2, view);
                    c4391a2.p(arrayListY0);
                    if (yVar != null) {
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "Executing exit callback for operation " + firstOut);
                        }
                        yVar.a(arrayListY0, c4391a2);
                        int size3 = arrayListY0.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i14 = size3 - 1;
                                String str3 = arrayListY0.get(size3);
                                C3862t.f(str3, "exitingNames[i]");
                                String str4 = str3;
                                View view2 = c4391a2.get(str4);
                                if (view2 == null) {
                                    c4391a.remove(str4);
                                } else if (!C3862t.b(str4, X.H(view2))) {
                                    c4391a.put(X.H(view2), (String) c4391a.remove(str4));
                                }
                                if (i14 < 0) {
                                    break;
                                } else {
                                    size3 = i14;
                                }
                            }
                        }
                    } else {
                        c4391a.p(c4391a2.keySet());
                    }
                    View view3 = lastIn.getFragment().f25489l0;
                    C3862t.f(view3, "lastIn.fragment.mView");
                    I(c4391a3, view3);
                    c4391a3.p(arrayListZ0);
                    c4391a3.p(c4391a.values());
                    if (yVar2 != null) {
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "Executing enter callback for operation " + lastIn);
                        }
                        yVar2.a(arrayListZ0, c4391a3);
                        int size4 = arrayListZ0.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i15 = size4 - 1;
                                String str5 = arrayListZ0.get(size4);
                                C3862t.f(str5, "enteringNames[i]");
                                String str6 = str5;
                                View view4 = c4391a3.get(str6);
                                if (view4 == null) {
                                    String strB2 = D.b(c4391a, str6);
                                    if (strB2 != null) {
                                        c4391a.remove(strB2);
                                    }
                                } else if (!C3862t.b(str6, X.H(view4)) && (strB = D.b(c4391a, str6)) != null) {
                                    c4391a.put(strB, X.H(view4));
                                }
                                if (i15 < 0) {
                                    break;
                                } else {
                                    size4 = i15;
                                }
                            }
                        }
                    } else {
                        D.d(c4391a, c4391a3);
                    }
                    Collection<String> collectionKeySet = c4391a.keySet();
                    C3862t.f(collectionKeySet, "sharedElementNameMapping.keys");
                    J(c4391a2, collectionKeySet);
                    Collection<String> collectionValues = c4391a.values();
                    C3862t.f(collectionValues, "sharedElementNameMapping.values");
                    J(c4391a3, collectionValues);
                    if (c4391a.isEmpty()) {
                        break;
                    } else {
                        obj = obj2;
                    }
                }
                arrayList5 = arrayList3;
                it2 = it;
                f11 = f10;
                arrayList7 = arrayList2;
                arrayList6 = arrayList;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj2 + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList.clear();
            arrayList2.clear();
            arrayList5 = arrayList3;
            it2 = it;
            f11 = f10;
            arrayList7 = arrayList2;
            arrayList6 = arrayList;
        }
        F f12 = f11;
        ArrayList arrayList10 = arrayList6;
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList5;
        if (obj == null) {
            if (arrayList12.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList12.iterator();
            while (it6.hasNext()) {
                if (((h) it6.next()).getTransition() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList12, firstOut, lastIn, f12, obj, arrayList10, arrayList11, c4391a, arrayListZ0, arrayListY0, c4391a2, c4391a3, isPop);
        Iterator it7 = arrayList12.iterator();
        while (it7.hasNext()) {
            ((h) it7.next()).getOperation().b(gVar);
        }
    }

    private final void I(Map<String, View> namedViews, View view) {
        String strH = X.H(view);
        if (strH != null) {
            namedViews.put(strH, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    C3862t.f(child, "child");
                    I(namedViews, child);
                }
            }
        }
    }

    private final void J(C4391a<String, View> c4391a, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = c4391a.entrySet();
        C3862t.f(entries, "entries");
        kotlin.collections.r.N(entries, new i(collection));
    }

    private final void K(List<? extends K.d> operations) {
        Fragment fragment = ((K.d) kotlin.collections.r.u0(operations)).getFragment();
        for (K.d dVar : operations) {
            dVar.getFragment().f25492o0.f25522c = fragment.f25492o0.f25522c;
            dVar.getFragment().f25492o0.f25523d = fragment.f25492o0.f25523d;
            dVar.getFragment().f25492o0.f25524e = fragment.f25492o0.f25524e;
            dVar.getFragment().f25492o0.f25525f = fragment.f25492o0.f25525f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    @Override // androidx.fragment.app.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.util.List<? extends androidx.fragment.app.K.d> r9, boolean r10) throws android.content.res.Resources.NotFoundException {
        /*
            r8 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.C3862t.g(r9, r0)
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.K$d r4 = (androidx.fragment.app.K.d) r4
            androidx.fragment.app.K$d$b$a r5 = androidx.fragment.app.K.d.b.INSTANCE
            androidx.fragment.app.Fragment r6 = r4.getFragment()
            android.view.View r6 = r6.f25489l0
            kotlin.jvm.internal.C3862t.f(r6, r3)
            androidx.fragment.app.K$d$b r5 = r5.a(r6)
            androidx.fragment.app.K$d$b r6 = androidx.fragment.app.K.d.b.VISIBLE
            if (r5 != r6) goto Lc
            androidx.fragment.app.K$d$b r4 = r4.getFinalState()
            if (r4 == r6) goto Lc
            goto L37
        L36:
            r1 = r2
        L37:
            androidx.fragment.app.K$d r1 = (androidx.fragment.app.K.d) r1
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L41:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.K$d r5 = (androidx.fragment.app.K.d) r5
            androidx.fragment.app.K$d$b$a r6 = androidx.fragment.app.K.d.b.INSTANCE
            androidx.fragment.app.Fragment r7 = r5.getFragment()
            android.view.View r7 = r7.f25489l0
            kotlin.jvm.internal.C3862t.f(r7, r3)
            androidx.fragment.app.K$d$b r6 = r6.a(r7)
            androidx.fragment.app.K$d$b r7 = androidx.fragment.app.K.d.b.VISIBLE
            if (r6 == r7) goto L41
            androidx.fragment.app.K$d$b r5 = r5.getFinalState()
            if (r5 != r7) goto L41
            r2 = r4
        L68:
            androidx.fragment.app.K$d r2 = (androidx.fragment.app.K.d) r2
            r0 = 2
            boolean r0 = androidx.fragment.app.v.Q0(r0)
            if (r0 == 0) goto L8f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Executing operations from "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r0)
        L8f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.K(r9)
            java.util.Iterator r9 = r9.iterator()
        La0:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Ld0
            java.lang.Object r4 = r9.next()
            androidx.fragment.app.K$d r4 = (androidx.fragment.app.K.d) r4
            androidx.fragment.app.e$b r5 = new androidx.fragment.app.e$b
            r5.<init>(r4, r10)
            r0.add(r5)
            androidx.fragment.app.e$h r5 = new androidx.fragment.app.e$h
            r6 = 0
            r7 = 1
            if (r10 == 0) goto Lbe
            if (r4 != r1) goto Lc1
        Lbc:
            r6 = r7
            goto Lc1
        Lbe:
            if (r4 != r2) goto Lc1
            goto Lbc
        Lc1:
            r5.<init>(r4, r10, r6)
            r3.add(r5)
            J1.a r5 = new J1.a
            r5.<init>()
            r4.a(r5)
            goto La0
        Ld0:
            r8.H(r3, r10, r1, r2)
            r8.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2084e.d(java.util.List, boolean):void");
    }
}
