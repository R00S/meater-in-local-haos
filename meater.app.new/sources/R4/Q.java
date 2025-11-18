package R4;

import L4.C1371d0;
import R4.Y0;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.BlockAnimationActivity;
import com.apptionlabs.meater_app.activities.MEATERHelpActivity;
import com.apptionlabs.meater_app.activities.VersionActivity;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Help;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSummaryActivity;
import j1.C3719d;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s1.C4469y0;
import x4.b;

/* compiled from: HelpFragment.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001UB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u001f\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020\f`\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0005J+\u0010%\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0005J3\u00108\u001a\u00020\b2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\b\u00106\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b8\u00109J!\u0010:\u001a\u00020\b2\u0006\u00104\u001a\u0002032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0011¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0011¢\u0006\u0004\b>\u0010=R\u0016\u0010A\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010L\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010S\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006V"}, d2 = {"LR4/Q;", "Landroidx/fragment/app/Fragment;", "LR4/Y0$b;", "LT4/n;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "P2", "(Landroid/view/View;)V", "C2", "", "fileName", "H2", "(Ljava/lang/String;)V", "url", "", "safetyRequest", "O2", "(Ljava/lang/String;Z)V", "G2", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "A2", "()Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/data/Help;", "item", "Q2", "(Lcom/apptionlabs/meater_app/data/Help;)V", "I2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "LR4/Y0;", "fragment", "A", "(LR4/Y0;Ljava/lang/String;)V", "K2", "F", "", "position", "videoNumber", "videoID", "title", "d", "(IILjava/lang/String;Ljava/lang/String;)V", "i", "(ILcom/apptionlabs/meater_app/data/Help;)V", "L2", "()Z", "N2", "G0", "Z", "isRootView", "LL4/d0;", "H0", "LL4/d0;", "B2", "()LL4/d0;", "M2", "(LL4/d0;)V", "binding", "I0", "I", "backStackEntry", "J0", "LR4/Y0;", "getWebFragment", "()LR4/Y0;", "setWebFragment", "(LR4/Y0;)V", "webFragment", "K0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Q extends Fragment implements Y0.b, T4.n {

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: L0, reason: collision with root package name */
    public static final int f14857L0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private boolean isRootView = true;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    public C1371d0 binding;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private int backStackEntry;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private Y0 webFragment;

    /* compiled from: HelpFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"LR4/Q$a;", "", "<init>", "()V", "LR4/Q;", "a", "()LR4/Q;", "", "LOCAL_URL_PATH", "Ljava/lang/String;", "FILE_EXTENSION", "TAG", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.Q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Q a() {
            return new Q();
        }

        private Companion() {
        }
    }

    private final ArrayList<String> A2() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = x4.g.t().z().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private final void C2() {
        if (T() instanceof MainActivity) {
            s1.X.B0(B2().b(), new s1.I() { // from class: R4.N
                @Override // s1.I
                public final C4469y0 a(View view, C4469y0 c4469y0) {
                    return Q.D2(view, c4469y0);
                }
            });
        }
        if (!P5.Q.H()) {
            B2().f9969g.setVisibility(0);
            B2().f9971i.setOnClickListener(new View.OnClickListener() { // from class: R4.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Q.E2(this.f14852B, view);
                }
            });
            B2().f9965c.setOnClickListener(new View.OnClickListener() { // from class: R4.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Q.F2(this.f14854B, view);
                }
            });
        }
        ListView helpList = B2().f9968f;
        C3862t.f(helpList, "helpList");
        w4.t tVar = new w4.t(c2(), P5.r.d(e2(), "MeaterHelp.json"));
        tVar.h(this);
        helpList.setAdapter((ListAdapter) tVar);
        Object systemService = c2().getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        helpList.addFooterView(((LayoutInflater) systemService).inflate(R.layout.empty_footer, (ViewGroup) null, false));
        TextView version = B2().f9973k;
        C3862t.f(version, "version");
        version.setText("v4.6.3 (" + (Config.INSTANCE.getInstance().DEBUG_UI_ENABLED ? "-release/4.6.3 4071910c1" : " 4071910c1") + ") – built Tue 14 Oct 25");
        B2().f9978p.getLayoutParams().height = (int) (com.apptionlabs.meater_app.views.X.f32799i / ((float) 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4469y0 D2(View root, C4469y0 insets) {
        C3862t.g(root, "root");
        C3862t.g(insets, "insets");
        C3719d c3719dF = insets.f(C4469y0.l.h() | C4469y0.l.b());
        C3862t.f(c3719dF, "getInsets(...)");
        root.setPadding(c3719dF.f43450a, c3719dF.f43451b, c3719dF.f43452c, 0);
        return C4469y0.f49201b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(Q q10, View view) {
        q10.O2(S4.a.f15457E, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(Q q10, View view) {
        q10.B2().f9969g.setVisibility(8);
    }

    private final void G2() {
        if (T() instanceof MainActivity) {
            androidx.fragment.app.o oVarT = T();
            C3862t.e(oVarT, "null cannot be cast to non-null type com.apptionlabs.meater_app.MainActivity");
            ((MainActivity) oVarT).i3();
        } else {
            androidx.fragment.app.o oVarT2 = T();
            C3862t.e(oVarT2, "null cannot be cast to non-null type com.apptionlabs.meater_app.activities.MEATERHelpActivity");
            ((MEATERHelpActivity) oVarT2).i2();
        }
    }

    private final void H2(String fileName) {
        Bundle bundle = new Bundle();
        this.webFragment = new Y0();
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        bundle.putString("url", "file:///android_asset/" + fileName + ".html");
        Y0 y02 = this.webFragment;
        C3862t.d(y02);
        y02.k2(bundle);
        Y0 y03 = this.webFragment;
        C3862t.d(y03);
        cR.b(R.id.webFragmentContainer, y03);
        int i10 = this.backStackEntry;
        this.backStackEntry = i10 + 1;
        cR.h(String.valueOf(i10));
        cR.j();
        B2().f9975m.setVisibility(0);
    }

    private final void I2() {
        this.isRootView = true;
        B2().f9970h.setVisibility(0);
        B2().f9975m.setVisibility(8);
        B2().f9974l.setVisibility(0);
        G2();
    }

    public static final Q J2() {
        return INSTANCE.a();
    }

    private final void O2(String url, boolean safetyRequest) {
        Intent intent = new Intent(e2(), (Class<?>) WebViewActivity.class);
        intent.putExtra("url", url);
        intent.putExtra(safetyRequest ? "SAFETY_INSTRUCTION" : "URL_ONLY", true);
        t2(intent);
    }

    private final void P2(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C3862t.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams).f23965T = u0().getConfiguration().orientation == 2 ? (int) u0().getDimension(R.dimen.max_screen_width) : P5.Q.g(x4.g.h().getResources().getDisplayMetrics().widthPixels);
    }

    private final void Q2(Help item) {
        if (item == null || item.getUrlIcon() == null) {
            return;
        }
        if (Ub.n.t(item.getUrlIcon(), "FacebookLogo", true)) {
            x4.b.j(b.EnumC0768b.f52641H1.title, b.a.f52605C.title, b.c.f52755G.title, null, 8, null);
            return;
        }
        if (Ub.n.t(item.getUrlIcon(), "InstagramLogo", true)) {
            x4.b.j(b.EnumC0768b.f52647J1.title, b.a.f52605C.title, b.c.f52755G.title, null, 8, null);
        } else if (Ub.n.t(item.getUrlIcon(), "YouTubeLogo", true)) {
            x4.b.j(b.EnumC0768b.f52644I1.title, b.a.f52605C.title, b.c.f52755G.title, null, 8, null);
        } else if (Ub.n.t(item.getUrlIcon(), "TwitterLogo", true)) {
            x4.b.j(b.EnumC0768b.f52656M1.title, b.a.f52605C.title, b.c.f52755G.title, null, 8, null);
        }
    }

    @Override // R4.Y0.b
    public void A(Y0 fragment, String url) {
        C3862t.g(fragment, "fragment");
        C3862t.g(url, "url");
        if (C3862t.b(url, "file:///android_asset/MEATERShowSupport")) {
            P5.Q.G(e2(), "https://support.meater.com");
            return;
        }
        if (!Ub.n.G(url, "file://", false, 2, null)) {
            P5.Q.G(e2(), url);
            return;
        }
        Bundle bundle = new Bundle();
        Y0 y02 = new Y0();
        bundle.putString("url", url);
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        y02.k2(bundle);
        cR.b(R.id.webFragmentContainer, y02);
        int i10 = this.backStackEntry;
        this.backStackEntry = i10 + 1;
        cR.h(String.valueOf(i10));
        cR.j();
    }

    public final C1371d0 B2() {
        C1371d0 c1371d0 = this.binding;
        if (c1371d0 != null) {
            return c1371d0;
        }
        C3862t.u("binding");
        return null;
    }

    @Override // R4.Y0.b
    public void F() {
        B2().f9974l.setVisibility(8);
    }

    public void K2() {
        int iV0 = Y().v0();
        for (int i10 = 0; i10 < iV0; i10++) {
            if (this.webFragment != null) {
                Y().m1();
            }
        }
        L2();
    }

    public final boolean L2() {
        Y0 y02 = this.webFragment;
        if (y02 != null) {
            C3862t.d(y02);
            y02.y2();
            Y().j1();
        }
        int iV0 = Y().v0();
        int i10 = this.webFragment != null ? 1 : 0;
        if (iV0 == 0) {
            i10 = 0;
        }
        if (i10 == 0) {
            if (iV0 <= i10) {
                I2();
                return false;
            }
        } else if (iV0 == i10) {
            I2();
        }
        return true;
    }

    public final void M2(C1371d0 c1371d0) {
        C3862t.g(c1371d0, "<set-?>");
        this.binding = c1371d0;
    }

    public final boolean N2() {
        return !this.isRootView;
    }

    @Override // T4.n
    public void d(int position, int videoNumber, String videoID, String title) {
        P5.Q.G(e2(), "https://youtu.be/" + videoID);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        M2(C1371d0.c(inflater, container, false));
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) T();
        if (cVar != null) {
            cVar.R0(B2().f9972j);
        }
        ConstraintLayout constraintLayoutB = B2().b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // T4.n
    public void i(int position, Help item) {
        this.isRootView = false;
        if (item == null) {
            return;
        }
        String title = item.getTitle();
        String content = item.getContent();
        if (content != null && Ub.n.t(content, "safety-compliance-probe", true)) {
            O2("https://www.meater.com/safety-info/meater?download=false", true);
            return;
        }
        if (content != null && Ub.n.t(content, "safety-compliance-plus", true)) {
            O2("https://www.meater.com/safety-info/meater-plus?download=false", true);
            return;
        }
        if (content != null && Ub.n.t(content, "safety-compliance-plus2", true)) {
            O2("https://www.meater.com/safety-info/meater-plus2?download=false", true);
            return;
        }
        if (content != null && Ub.n.t(content, "safety-compliance-plus-pro", true)) {
            O2("https://www.meater.com/safety-info/meater-plus2?download=false", true);
            return;
        }
        if (content != null && Ub.n.t(content, "safety-compliance-block", true)) {
            O2("https://www.meater.com/safety-info/meater-block?download=false", true);
            return;
        }
        if (content != null && Ub.n.t(content, "safety-compliance-plus-se", true)) {
            O2("https://www.meater.com/safety-info/meater-se?download=false", true);
            return;
        }
        if (content != null && Ub.n.t(content, "safety-compliance-proxl", true)) {
            O2("https://www.meater.com/safety-info/meater-proxl?download=false", true);
            return;
        }
        if (content != null && Ub.n.t(content, "safety-compliance-produo", true)) {
            O2("https://www.meater.com/safety-info/meater-produo?download=false", true);
            return;
        }
        if (title != null && Ub.n.t(title, "Troubleshooting Information", true)) {
            t2(new Intent(e2(), (Class<?>) VersionActivity.class));
        }
        if (title != null && Ub.n.t(title, "Getting Started With MEATER", true)) {
            Intent intent = new Intent(e2(), (Class<?>) VideoTutorialSummaryActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_WATCH_VIDEOS, A2());
            t2(intent);
        } else if (title != null && Ub.n.t(title, "Using MEATER Block in Standalone Mode", true)) {
            t2(new Intent(e2(), (Class<?>) BlockAnimationActivity.class));
        } else if (title != null && Ub.n.t(title, "Release Notes", true)) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https");
            builder.authority("www.meater.com/changelog");
            builder.appendQueryParameter("app_version", "4.6.3");
            builder.appendQueryParameter("platform", "android");
            try {
                URL url = new URL(URLDecoder.decode(builder.build().toString(), "UTF-8"));
                P5.Q.G(e2(), url.toString());
                Log.d("URL_APP_CHANGELOG", "utl " + url);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
                C4153F c4153f = C4153F.f46609a;
            } catch (MalformedURLException e11) {
                e11.printStackTrace();
                C4153F c4153f2 = C4153F.f46609a;
            }
        } else if (content != null && Ub.n.G(content, "http", false, 2, null)) {
            Q2(item);
            P5.Q.G(e2(), content);
        } else if (content != null && Ub.n.t(content, "get-in-touch", true)) {
            P5.Q.G(e2(), "https://support.meater.com/contact-us");
        } else if (content != null) {
            H2(content);
        }
        G2();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        RelativeLayout helpFragment = B2().f9967e;
        C3862t.f(helpFragment, "helpFragment");
        P2(helpFragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        C2();
    }
}
