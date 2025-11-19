package b5;

import L4.C1379h0;
import P5.Q;
import a5.VideoData;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.E;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.data.JuicyVideoList;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.google.android.material.button.MaterialButton;
import com.google.gson.Gson;
import j1.C3719d;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3857n;
import kotlin.jvm.internal.P;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4160e;
import oa.InterfaceC4164i;
import p4.OfferData;
import s1.C4469y0;
import s1.I;
import s1.X;

/* compiled from: NewsFragment.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lb5/t;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "a3", "(Landroid/view/View;)V", "f3", "N2", "e3", "d3", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "v1", "Lcom/apptionlabs/meater_app/data/JuicyVideoList;", "G0", "Lcom/apptionlabs/meater_app/data/JuicyVideoList;", "juicyVideoList", "LL4/h0;", "H0", "LL4/h0;", "binding", "Lb5/v;", "I0", "Loa/i;", "M2", "()Lb5/v;", "viewModel", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "J0", "L2", "()Lcom/apptionlabs/meater_app/data/NetworkConstant;", "networkConstant", "Landroid/widget/FrameLayout;", "K0", "Landroid/widget/FrameLayout;", "frameLayout", "L0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b5.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2246t extends Fragment {

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: M0, reason: collision with root package name */
    public static final int f30558M0 = 8;

    /* renamed from: N0, reason: collision with root package name */
    public static String f30559N0 = "News_Fragment";

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private JuicyVideoList juicyVideoList;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private C1379h0 binding;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new e(this, null, new d(this), null, null));

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i networkConstant = C4165j.b(EnumC4168m.f46626B, new c(this, null, null));

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* compiled from: NewsFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb5/t$a;", "", "<init>", "()V", "", "webUrl", "Lb5/t;", "a", "(Ljava/lang/String;)Lb5/t;", "TAG", "Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.t$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C2246t a(String webUrl) {
            C3862t.g(webUrl, "webUrl");
            C2246t c2246t = new C2246t();
            Bundle bundle = new Bundle();
            bundle.putString("url", webUrl);
            c2246t.k2(bundle);
            return c2246t;
        }

        private Companion() {
        }
    }

    /* compiled from: NewsFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.t$b */
    static final class b implements E, InterfaceC3857n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Ba.l f30565a;

        b(Ba.l function) {
            C3862t.g(function, "function");
            this.f30565a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC3857n
        public final InterfaceC4160e<?> a() {
            return this.f30565a;
        }

        @Override // android.view.E
        public final /* synthetic */ void b(Object obj) {
            this.f30565a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof E) && (obj instanceof InterfaceC3857n)) {
                return C3862t.b(a(), ((InterfaceC3857n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* compiled from: ComponentCallbackExt.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.t$c */
    public static final class c implements Ba.a<NetworkConstant> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f30566B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f30567C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f30568D;

        public c(ComponentCallbacks componentCallbacks, dd.a aVar, Ba.a aVar2) {
            this.f30566B = componentCallbacks;
            this.f30567C = aVar;
            this.f30568D = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.apptionlabs.meater_app.data.NetworkConstant, java.lang.Object] */
        @Override // Ba.a
        public final NetworkConstant invoke() {
            ComponentCallbacks componentCallbacks = this.f30566B;
            return Nc.a.a(componentCallbacks).c(P.b(NetworkConstant.class), this.f30567C, this.f30568D);
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.t$d */
    public static final class d implements Ba.a<Fragment> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f30569B;

        public d(Fragment fragment) {
            this.f30569B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f30569B;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.t$e */
    public static final class e implements Ba.a<C2248v> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f30570B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f30571C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f30572D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f30573E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f30574F;

        public e(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f30570B = fragment;
            this.f30571C = aVar;
            this.f30572D = aVar2;
            this.f30573E = aVar3;
            this.f30574F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, b5.v] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2248v invoke() {
            Q1.a aVarM;
            Fragment fragment = this.f30570B;
            dd.a aVar = this.f30571C;
            Ba.a aVar2 = this.f30572D;
            Ba.a aVar3 = this.f30573E;
            Ba.a aVar4 = this.f30574F;
            b0 b0VarV = ((c0) aVar2.invoke()).v();
            if (aVar3 == null || (aVarM = (Q1.a) aVar3.invoke()) == null) {
                aVarM = fragment.m();
                C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
            }
            return ld.b.b(P.b(C2248v.class), b0VarV, (4 & 4) != 0 ? null : null, aVarM, (4 & 16) != 0 ? null : aVar, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar4);
        }
    }

    private final NetworkConstant L2() {
        return (NetworkConstant) this.networkConstant.getValue();
    }

    private final C2248v M2() {
        return (C2248v) this.viewModel.getValue();
    }

    private final void N2() {
        M2().s().h(c2(), new b(new Ba.l() { // from class: b5.l
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return C2246t.S2(this.f30549B, (JuicyVideoList) obj);
            }
        }));
        M2().p().h(c2(), new b(new Ba.l() { // from class: b5.o
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return C2246t.T2(this.f30552B, (List) obj);
            }
        }));
        C1379h0 c1379h0 = this.binding;
        C1379h0 c1379h02 = null;
        if (c1379h0 == null) {
            C3862t.u("binding");
            c1379h0 = null;
        }
        c1379h0.f10115c.setOnClickListener(new View.OnClickListener() { // from class: b5.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.U2(this.f30553B, view);
            }
        });
        C1379h0 c1379h03 = this.binding;
        if (c1379h03 == null) {
            C3862t.u("binding");
            c1379h03 = null;
        }
        c1379h03.f10123k.setOnClickListener(new View.OnClickListener() { // from class: b5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.V2(this.f30554B, view);
            }
        });
        C1379h0 c1379h04 = this.binding;
        if (c1379h04 == null) {
            C3862t.u("binding");
            c1379h04 = null;
        }
        c1379h04.f10122j.setOnClickListener(new View.OnClickListener() { // from class: b5.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.W2(this.f30555B, view);
            }
        });
        C1379h0 c1379h05 = this.binding;
        if (c1379h05 == null) {
            C3862t.u("binding");
            c1379h05 = null;
        }
        c1379h05.f10125m.setOnClickListener(new View.OnClickListener() { // from class: b5.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.X2(this.f30556B, view);
            }
        });
        C1379h0 c1379h06 = this.binding;
        if (c1379h06 == null) {
            C3862t.u("binding");
            c1379h06 = null;
        }
        c1379h06.f10121i.setOnClickListener(new View.OnClickListener() { // from class: b5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.Y2(this.f30544B, view);
            }
        });
        C1379h0 c1379h07 = this.binding;
        if (c1379h07 == null) {
            C3862t.u("binding");
            c1379h07 = null;
        }
        c1379h07.f10127o.setOnClickListener(new View.OnClickListener() { // from class: b5.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.Z2(this.f30545B, view);
            }
        });
        C1379h0 c1379h08 = this.binding;
        if (c1379h08 == null) {
            C3862t.u("binding");
            c1379h08 = null;
        }
        c1379h08.f10132t.setOnClickListener(new View.OnClickListener() { // from class: b5.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.O2(this.f30546B, view);
            }
        });
        C1379h0 c1379h09 = this.binding;
        if (c1379h09 == null) {
            C3862t.u("binding");
            c1379h09 = null;
        }
        c1379h09.f10124l.setOnClickListener(new View.OnClickListener() { // from class: b5.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.P2(this.f30547B, view);
            }
        });
        C1379h0 c1379h010 = this.binding;
        if (c1379h010 == null) {
            C3862t.u("binding");
            c1379h010 = null;
        }
        c1379h010.f10117e.setOnClickListener(new View.OnClickListener() { // from class: b5.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.Q2(this.f30550B, view);
            }
        });
        C1379h0 c1379h011 = this.binding;
        if (c1379h011 == null) {
            C3862t.u("binding");
        } else {
            c1379h02 = c1379h011;
        }
        c1379h02.f10129q.setOnClickListener(new View.OnClickListener() { // from class: b5.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2246t.R2(this.f30551B, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(C2246t c2246t, View view) {
        Q.G(c2246t.e2(), c2246t.L2().getNetworkConstant().n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(C2246t c2246t, View view) {
        Q.G(c2246t.e2(), c2246t.L2().getNetworkConstant().j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(C2246t c2246t, View view) {
        Q.G(c2246t.e2(), c2246t.L2().getNetworkConstant().k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(C2246t c2246t, View view) {
        Q.G(c2246t.e2(), c2246t.L2().getNetworkConstant().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F S2(C2246t c2246t, JuicyVideoList juicyVideoList) {
        c2246t.juicyVideoList = juicyVideoList;
        c2246t.e3();
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F T2(C2246t c2246t, List list) {
        c2246t.f3();
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(C2246t c2246t, View view) {
        Q.G(c2246t.e2(), "https://www.meater.com/blog/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(C2246t c2246t, View view) {
        androidx.fragment.app.o oVarT = c2246t.T();
        String strH = c2246t.L2().getNetworkConstant().h();
        Boolean bool = Boolean.TRUE;
        WebViewActivity.F2(oVarT, null, strH, null, bool, bool, new Gson().t(c2246t.M2().x()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(C2246t c2246t, View view) {
        androidx.fragment.app.o oVarT = c2246t.T();
        String strO = c2246t.L2().getNetworkConstant().o();
        Boolean bool = Boolean.TRUE;
        WebViewActivity.F2(oVarT, null, strO, null, bool, bool, new Gson().t(c2246t.M2().x()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(C2246t c2246t, View view) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("www.meater.com/changelog");
        builder.appendQueryParameter("app_version", "4.6.3");
        builder.appendQueryParameter("platform", "android");
        try {
            Q.G(c2246t.e2(), new URL(URLDecoder.decode(builder.build().toString(), "UTF-8")).toString());
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(C2246t c2246t, View view) {
        Q.G(c2246t.e2(), c2246t.L2().getNetworkConstant().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(C2246t c2246t, View view) {
        Q.G(c2246t.e2(), c2246t.L2().getNetworkConstant().a());
    }

    private final void a3(View view) {
        C1379h0 c1379h0 = this.binding;
        FrameLayout frameLayout = null;
        if (c1379h0 == null) {
            C3862t.u("binding");
            c1379h0 = null;
        }
        X.B0(c1379h0.b(), new I() { // from class: b5.f
            @Override // s1.I
            public final C4469y0 a(View view2, C4469y0 c4469y0) {
                return C2246t.b3(view2, c4469y0);
            }
        });
        this.juicyVideoList = M2().r();
        final C2231e c2231eA = C2231e.INSTANCE.a();
        C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        C1379h0 c1379h02 = this.binding;
        if (c1379h02 == null) {
            C3862t.u("binding");
            c1379h02 = null;
        }
        cR.t(c1379h02.f10116d.getId(), c2231eA);
        cR.j();
        E<? super Boolean> e10 = new E() { // from class: b5.k
            @Override // android.view.E
            public final void b(Object obj) {
                C2246t.c3(c2231eA, ((Boolean) obj).booleanValue());
            }
        };
        e3();
        N2();
        d3();
        f3();
        M2().t().h(F0(), e10);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            C3862t.u("frameLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4469y0 b3(View root, C4469y0 insets) {
        C3862t.g(root, "root");
        C3862t.g(insets, "insets");
        C3719d c3719dF = insets.f(C4469y0.l.h() | C4469y0.l.b());
        C3862t.f(c3719dF, "getInsets(...)");
        root.setPadding(c3719dF.f43450a, c3719dF.f43451b, c3719dF.f43452c, 0);
        return C4469y0.f49201b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(C2231e c2231e, boolean z10) {
        if (z10) {
            c2231e.P2();
        } else {
            c2231e.E2();
        }
    }

    private final void d3() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<OfferData> listO = M2().o();
        if (listO != null) {
            Iterator<OfferData> it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getId()));
            }
        }
        M2().y(arrayList);
    }

    private final void e3() {
        JuicyVideoList juicyVideoList = this.juicyVideoList;
        if (juicyVideoList != null) {
            C1379h0 c1379h0 = this.binding;
            if (c1379h0 == null) {
                C3862t.u("binding");
                c1379h0 = null;
            }
            if (c1379h0.f10131s.getChildCount() > 0) {
                return;
            }
            Iterator<VideoData> it = juicyVideoList.parentList.iterator();
            C3862t.f(it, "iterator(...)");
            int i10 = 1000;
            while (it.hasNext()) {
                VideoData next = it.next();
                if (!next.b().isEmpty()) {
                    C2247u c2247uA = C2247u.INSTANCE.a();
                    c2247uA.y2(next.getTitle(), next.b());
                    FrameLayout frameLayout = new FrameLayout(e2());
                    int i11 = i10 + 1;
                    frameLayout.setId(i10);
                    frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    C1379h0 c1379h02 = this.binding;
                    if (c1379h02 == null) {
                        C3862t.u("binding");
                        c1379h02 = null;
                    }
                    c1379h02.f10131s.addView(frameLayout);
                    C cR = Y().r();
                    C3862t.f(cR, "beginTransaction(...)");
                    cR.u(frameLayout.getId(), c2247uA, next.getTitle());
                    cR.j();
                    i10 = i11;
                }
            }
        }
    }

    private final void f3() {
        C1379h0 c1379h0 = null;
        if (M2().m()) {
            C1379h0 c1379h02 = this.binding;
            if (c1379h02 == null) {
                C3862t.u("binding");
                c1379h02 = null;
            }
            MaterialButton newsLetterSignupButton = c1379h02.f10123k;
            C3862t.f(newsLetterSignupButton, "newsLetterSignupButton");
            Q4.l.g(newsLetterSignupButton);
            C1379h0 c1379h03 = this.binding;
            if (c1379h03 == null) {
                C3862t.u("binding");
            } else {
                c1379h0 = c1379h03;
            }
            MaterialButton manageEmailPreference = c1379h0.f10122j;
            C3862t.f(manageEmailPreference, "manageEmailPreference");
            Q4.l.j(manageEmailPreference);
            return;
        }
        C1379h0 c1379h04 = this.binding;
        if (c1379h04 == null) {
            C3862t.u("binding");
            c1379h04 = null;
        }
        MaterialButton newsLetterSignupButton2 = c1379h04.f10123k;
        C3862t.f(newsLetterSignupButton2, "newsLetterSignupButton");
        Q4.l.j(newsLetterSignupButton2);
        C1379h0 c1379h05 = this.binding;
        if (c1379h05 == null) {
            C3862t.u("binding");
        } else {
            c1379h0 = c1379h05;
        }
        MaterialButton manageEmailPreference2 = c1379h0.f10122j;
        C3862t.f(manageEmailPreference2, "manageEmailPreference");
        Q4.l.g(manageEmailPreference2);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        C1379h0 c1379h0C = C1379h0.c(inflater, frameLayout, false);
        this.binding = c1379h0C;
        if (c1379h0C == null) {
            C3862t.u("binding");
            c1379h0C = null;
        }
        ConstraintLayout constraintLayoutB = c1379h0C.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        a3(constraintLayoutB);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        C3862t.u("frameLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FrameLayout frameLayout = this.frameLayout;
        C1379h0 c1379h0 = null;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        C1379h0 c1379h0C = C1379h0.c((LayoutInflater) systemService, null, false);
        this.binding = c1379h0C;
        if (c1379h0C == null) {
            C3862t.u("binding");
        } else {
            c1379h0 = c1379h0C;
        }
        ConstraintLayout constraintLayoutB = c1379h0.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        a3(constraintLayoutB);
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        M2().A();
    }
}
