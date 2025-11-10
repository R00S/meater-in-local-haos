package com.apptionlabs.meater_app.qsg.ui.welcome;

import android.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.a0;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.k;
import androidx.media3.common.q;
import androidx.media3.exoplayer.g;
import b6.e4;
import bn.s;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.qsg.ui.welcome.QSGWelcomeFragment;
import com.google.android.material.button.MaterialButton;
import f8.l0;
import f8.z;
import ih.g;
import ih.t;
import j7.h;
import kotlin.Metadata;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: QSGWelcomeFragment.kt */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/welcome/QSGWelcomeFragment;", "Landroidx/fragment/app/Fragment;", "", "flagToInitializeWithSoftwareCodec", "Lih/u;", "O2", "com/apptionlabs/meater_app/qsg/ui/welcome/QSGWelcomeFragment$b", "V2", "()Lcom/apptionlabs/meater_app/qsg/ui/welcome/QSGWelcomeFragment$b;", "W2", "L2", "Y2", "M2", "Lbn/s;", "Lcom/apptionlabs/meater_app/cloud/responses/MeaterCloudAccountResponse;", "response", "X2", "Z2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "x1", "view", "z1", "v1", "q1", "Lj7/h;", "t0", "Lih/g;", "N2", "()Lj7/h;", "viewModel", "Lb6/e4;", "u0", "Lb6/e4;", "binding", "", "v0", "I", "device", "w0", "progress", "Landroidx/media3/exoplayer/g;", "x0", "Landroidx/media3/exoplayer/g;", "player", "Landroidx/media3/common/q$d;", "y0", "Landroidx/media3/common/q$d;", "playbackStateListener", "z0", "Z", "didRetryForExoPlayerError", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class QSGWelcomeFragment extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final g viewModel;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private e4 binding;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private int device;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private int progress;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private androidx.media3.exoplayer.g player;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private final q.d playbackStateListener;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private boolean didRetryForExoPlayerError;

    /* compiled from: QSGWelcomeFragment.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/welcome/QSGWelcomeFragment$a", "Lbn/d;", "Lcom/apptionlabs/meater_app/cloud/responses/MeaterCloudAccountResponse;", "Lbn/b;", "call", "Lbn/s;", "response", "Lih/u;", "onResponse", "", "t", "onFailure", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements bn.d<MeaterCloudAccountResponse> {
        a() {
        }

        public void onFailure(bn.b<MeaterCloudAccountResponse> bVar, Throwable th) {
            m.f(bVar, "call");
            m.f(th, "t");
            if (QSGWelcomeFragment.this.K0()) {
                e4 e4Var = QSGWelcomeFragment.this.binding;
                if (e4Var == null) {
                    m.t("binding");
                    e4Var = null;
                }
                e4Var.T.setText(QSGWelcomeFragment.this.A0(2132017988));
                QSGWelcomeFragment.this.Z2();
            }
        }

        public void onResponse(bn.b<MeaterCloudAccountResponse> bVar, s<MeaterCloudAccountResponse> sVar) {
            m.f(bVar, "call");
            m.f(sVar, "response");
            if (QSGWelcomeFragment.this.K0()) {
                boolean X2 = QSGWelcomeFragment.this.X2(sVar);
                e4 e4Var = null;
                if (!X2) {
                    e4 e4Var2 = QSGWelcomeFragment.this.binding;
                    if (e4Var2 == null) {
                        m.t("binding");
                    } else {
                        e4Var = e4Var2;
                    }
                    e4Var.T.setText(QSGWelcomeFragment.this.A0(2132017988));
                    QSGWelcomeFragment.this.Z2();
                    return;
                }
                e4 e4Var3 = QSGWelcomeFragment.this.binding;
                if (e4Var3 == null) {
                    m.t("binding");
                    e4Var3 = null;
                }
                ConstraintLayout constraintLayout = e4Var3.Q;
                m.e(constraintLayout, "QSGTextContainer");
                g6.d.j(constraintLayout);
                e4 e4Var4 = QSGWelcomeFragment.this.binding;
                if (e4Var4 == null) {
                    m.t("binding");
                } else {
                    e4Var = e4Var4;
                }
                ProgressBar progressBar = e4Var.W;
                m.e(progressBar, "loading");
                g6.d.i(progressBar);
            }
        }
    }

    /* compiled from: QSGWelcomeFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/welcome/QSGWelcomeFragment$b", "Landroidx/media3/common/q$d;", "", "playbackState", "Lih/u;", "K", "Landroidx/media3/common/PlaybackException;", "error", "i0", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b implements q.d {
        b() {
        }

        @Override // androidx.media3.common.q.d
        public void K(int i10) {
            androidx.media3.exoplayer.g gVar;
            if (i10 == 3 && (gVar = QSGWelcomeFragment.this.player) != null) {
                gVar.i();
            }
        }

        @Override // androidx.media3.common.q.d
        public void i0(PlaybackException playbackException) {
            m.f(playbackException, "error");
            super.i0(playbackException);
            if (playbackException.f3897q == 4001 && !QSGWelcomeFragment.this.didRetryForExoPlayerError) {
                QSGWelcomeFragment.this.didRetryForExoPlayerError = true;
                QSGWelcomeFragment.this.W2();
                QSGWelcomeFragment.this.O2(true);
            }
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<androidx.fragment.app.s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9874q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f9874q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.s a() {
            androidx.fragment.app.s c22 = this.f9874q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9875q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9876r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9877s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9878t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9875q = aVar;
            this.f9876r = aVar2;
            this.f9877s = aVar3;
            this.f9878t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9875q.a(), d0.b(h.class), this.f9876r, this.f9877s, (vh.a) null, this.f9878t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9879q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vh.a aVar) {
            super(0);
            this.f9879q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9879q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public QSGWelcomeFragment() {
        c cVar = new c(this);
        this.viewModel = s0.a(this, d0.b(h.class), new e(cVar), new d(cVar, null, null, bm.a.a(this)));
        this.device = -1;
        this.progress = -1;
        this.playbackStateListener = V2();
    }

    private final void L2() {
        int l10 = N2().l();
        int k10 = N2().k();
        if (k10 >= 0 && k10 < 401) {
            this.progress = k10;
        }
        if (500 <= l10 && l10 < 504) {
            this.device = l10;
        }
        if (this.device >= 500 && this.progress > 0) {
            t b10 = j7.g.b();
            m.e(b10, "actionToLoginScreen(...)");
            androidx.navigation.fragment.a.a(this).S(b10);
        }
    }

    private final void M2() {
        z.e(true, new a());
    }

    private final h N2() {
        return (h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(boolean z10) {
        androidx.media3.exoplayer.g f10;
        k d10 = k.d(Uri.parse("android.resource://" + c2().getPackageName() + "/2131951758"));
        m.e(d10, "fromUri(...)");
        if (z10) {
            f10 = new g.b(e2()).l(new h1.e(e2()).j(true)).f();
        } else {
            f10 = new g.b(e2()).f();
        }
        this.player = f10;
        if (f10 != null) {
            f10.Q(2);
        }
        androidx.media3.exoplayer.g gVar = this.player;
        if (gVar != null) {
            gVar.C(true);
        }
        androidx.media3.exoplayer.g gVar2 = this.player;
        if (gVar2 != null) {
            gVar2.U(this.playbackStateListener);
        }
        androidx.media3.exoplayer.g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.G(d10);
        }
        androidx.media3.exoplayer.g gVar4 = this.player;
        if (gVar4 != null) {
            gVar4.h();
        }
        androidx.media3.exoplayer.g gVar5 = this.player;
        if (gVar5 != null) {
            gVar5.C(true);
        }
        e4 e4Var = this.binding;
        e4 e4Var2 = null;
        if (e4Var == null) {
            m.t("binding");
            e4Var = null;
        }
        e4Var.f7725b0.setPlayer(this.player);
        e4 e4Var3 = this.binding;
        if (e4Var3 == null) {
            m.t("binding");
            e4Var3 = null;
        }
        e4Var3.f7725b0.setControllerAutoShow(false);
        e4 e4Var4 = this.binding;
        if (e4Var4 == null) {
            m.t("binding");
            e4Var4 = null;
        }
        e4Var4.f7725b0.w();
        e4 e4Var5 = this.binding;
        if (e4Var5 == null) {
            m.t("binding");
        } else {
            e4Var2 = e4Var5;
        }
        e4Var2.f7725b0.setUseController(false);
    }

    static /* synthetic */ void P2(QSGWelcomeFragment qSGWelcomeFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        qSGWelcomeFragment.O2(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(QSGWelcomeFragment qSGWelcomeFragment, String str) {
        m.f(qSGWelcomeFragment, "this$0");
        m.f(str, "text");
        e4 e4Var = qSGWelcomeFragment.binding;
        if (e4Var == null) {
            m.t("binding");
            e4Var = null;
        }
        e4Var.Z.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(QSGWelcomeFragment qSGWelcomeFragment, String str) {
        m.f(qSGWelcomeFragment, "this$0");
        m.f(str, "text");
        e4 e4Var = qSGWelcomeFragment.binding;
        if (e4Var == null) {
            m.t("binding");
            e4Var = null;
        }
        e4Var.S.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(QSGWelcomeFragment qSGWelcomeFragment, View view) {
        m.f(qSGWelcomeFragment, "this$0");
        ih.s C = androidx.navigation.fragment.a.a(qSGWelcomeFragment).C();
        if (C != null && C.getId() == 2131363114) {
            ih.o a10 = androidx.navigation.fragment.a.a(qSGWelcomeFragment);
            t b10 = j7.g.b();
            m.e(b10, "actionToLoginScreen(...)");
            a10.S(b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(View view, View view2) {
        m.f(view, "$view");
        ih.d0.c(view).N(2131361894);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(QSGWelcomeFragment qSGWelcomeFragment, View view) {
        m.f(qSGWelcomeFragment, "this$0");
        l0.H(qSGWelcomeFragment.Y(), i6.c.INSTANCE.a());
    }

    private final b V2() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        androidx.media3.exoplayer.g gVar = this.player;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X2(s<MeaterCloudAccountResponse> response) {
        MeaterCloudAccountResponse meaterCloudAccountResponse;
        if (response != null && response.f() && response.a() != null && (meaterCloudAccountResponse = (MeaterCloudAccountResponse) response.a()) != null && meaterCloudAccountResponse.available) {
            return true;
        }
        return false;
    }

    private final void Y2() {
        com.apptionlabs.meater_app.app.a.u().X();
        t a10 = j7.g.a();
        m.e(a10, "actionToChooseProductScreen(...)");
        androidx.navigation.fragment.a.a(this).S(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2() {
        e4 e4Var = this.binding;
        e4 e4Var2 = null;
        if (e4Var == null) {
            m.t("binding");
            e4Var = null;
        }
        ProgressBar progressBar = e4Var.W;
        m.e(progressBar, "loading");
        g6.d.i(progressBar);
        e4 e4Var3 = this.binding;
        if (e4Var3 == null) {
            m.t("binding");
            e4Var3 = null;
        }
        ConstraintLayout constraintLayout = e4Var3.Q;
        m.e(constraintLayout, "QSGTextContainer");
        g6.d.j(constraintLayout);
        e4 e4Var4 = this.binding;
        if (e4Var4 == null) {
            m.t("binding");
            e4Var4 = null;
        }
        LinearLayoutCompat linearLayoutCompat = e4Var4.U;
        m.e(linearLayoutCompat, "buttonHolder");
        g6.d.i(linearLayoutCompat);
        e4 e4Var5 = this.binding;
        if (e4Var5 == null) {
            m.t("binding");
            e4Var5 = null;
        }
        MaterialButton materialButton = e4Var5.T;
        m.e(materialButton, "btnSkip");
        g6.d.j(materialButton);
        e4 e4Var6 = this.binding;
        if (e4Var6 == null) {
            m.t("binding");
        } else {
            e4Var2 = e4Var6;
        }
        e4Var2.T.setOnClickListener(new View.OnClickListener() { // from class: j7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QSGWelcomeFragment.a3(QSGWelcomeFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(QSGWelcomeFragment qSGWelcomeFragment, View view) {
        m.f(qSGWelcomeFragment, "this$0");
        qSGWelcomeFragment.Y2();
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        ViewDataBinding h10 = androidx.databinding.g.h(inflater, 2131558540, container, false);
        m.e(h10, "inflate(...)");
        this.binding = (e4) h10;
        androidx.fragment.app.s c22 = c2();
        m.e(c22, "requireActivity(...)");
        e4 e4Var = null;
        if (c22 instanceof QSGActivity) {
            M2();
        } else {
            e4 e4Var2 = this.binding;
            if (e4Var2 == null) {
                m.t("binding");
                e4Var2 = null;
            }
            ConstraintLayout constraintLayout = e4Var2.Q;
            m.e(constraintLayout, "QSGTextContainer");
            g6.d.j(constraintLayout);
            e4 e4Var3 = this.binding;
            if (e4Var3 == null) {
                m.t("binding");
                e4Var3 = null;
            }
            ProgressBar progressBar = e4Var3.W;
            m.e(progressBar, "loading");
            g6.d.i(progressBar);
        }
        e4 e4Var4 = this.binding;
        if (e4Var4 == null) {
            m.t("binding");
        } else {
            e4Var = e4Var4;
        }
        View v10 = e4Var.v();
        m.e(v10, "getRoot(...)");
        return v10;
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        W2();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        P2(this, false, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        L2();
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) c2();
        m.c(cVar);
        androidx.appcompat.app.a x02 = cVar.x0();
        if (x02 != null) {
            x02.m();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(final View view, Bundle bundle) {
        m.f(view, "view");
        super.z1(view, bundle);
        e4 e4Var = this.binding;
        e4 e4Var2 = null;
        if (e4Var == null) {
            m.t("binding");
            e4Var = null;
        }
        e4Var.Z.setInAnimation(Y(), R.anim.fade_in);
        e4 e4Var3 = this.binding;
        if (e4Var3 == null) {
            m.t("binding");
            e4Var3 = null;
        }
        e4Var3.Z.setOutAnimation(Y(), R.anim.fade_out);
        e4 e4Var4 = this.binding;
        if (e4Var4 == null) {
            m.t("binding");
            e4Var4 = null;
        }
        e4Var4.S.setInAnimation(Y(), R.anim.fade_in);
        e4 e4Var5 = this.binding;
        if (e4Var5 == null) {
            m.t("binding");
            e4Var5 = null;
        }
        e4Var5.S.setOutAnimation(Y(), R.anim.fade_out);
        if (u0().getBoolean(2131034115)) {
            e4 e4Var6 = this.binding;
            if (e4Var6 == null) {
                m.t("binding");
                e4Var6 = null;
            }
            View view2 = e4Var6.f7727d0;
            m.e(view2, "viewStart");
            g6.d.j(view2);
            e4 e4Var7 = this.binding;
            if (e4Var7 == null) {
                m.t("binding");
                e4Var7 = null;
            }
            View view3 = e4Var7.f7726c0;
            m.e(view3, "viewEnd");
            g6.d.j(view3);
        }
        a0<? super String> a0Var = new a0() { // from class: j7.a
            @Override // android.view.a0
            public final void d(Object obj) {
                QSGWelcomeFragment.Q2(QSGWelcomeFragment.this, (String) obj);
            }
        };
        a0<? super String> a0Var2 = new a0() { // from class: j7.b
            @Override // android.view.a0
            public final void d(Object obj) {
                QSGWelcomeFragment.R2(QSGWelcomeFragment.this, (String) obj);
            }
        };
        N2().m().g(F0(), a0Var);
        N2().j().g(F0(), a0Var2);
        e4 e4Var8 = this.binding;
        if (e4Var8 == null) {
            m.t("binding");
            e4Var8 = null;
        }
        TextView textView = e4Var8.V;
        e4 e4Var9 = this.binding;
        if (e4Var9 == null) {
            m.t("binding");
            e4Var9 = null;
        }
        textView.setPaintFlags(e4Var9.V.getPaintFlags() | 8);
        e4 e4Var10 = this.binding;
        if (e4Var10 == null) {
            m.t("binding");
            e4Var10 = null;
        }
        e4Var10.X.setOnClickListener(new View.OnClickListener() { // from class: j7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                QSGWelcomeFragment.S2(QSGWelcomeFragment.this, view4);
            }
        });
        e4 e4Var11 = this.binding;
        if (e4Var11 == null) {
            m.t("binding");
            e4Var11 = null;
        }
        e4Var11.Y.setOnClickListener(new View.OnClickListener() { // from class: j7.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                QSGWelcomeFragment.T2(view, view4);
            }
        });
        e4 e4Var12 = this.binding;
        if (e4Var12 == null) {
            m.t("binding");
        } else {
            e4Var2 = e4Var12;
        }
        e4Var2.V.setOnClickListener(new View.OnClickListener() { // from class: j7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                QSGWelcomeFragment.U2(QSGWelcomeFragment.this, view4);
            }
        });
        N2().n();
    }
}
