package com.apptionlabs.meater_app.qsg.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.t0;
import android.view.v0;
import android.view.w0;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.fragment.app.s0;
import b6.s3;
import com.apptionlabs.meater_app.qsg.ui.info.ManualFragment;
import ih.g;
import ih.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import kotlin.Metadata;
import pk.j;
import rk.l0;
import rk.r;
import wh.d0;
import wh.m;
import wh.o;

/* compiled from: ManualFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/ManualFragment;", "Landroidx/fragment/app/Fragment;", "Lih/u;", "y2", "", "shouldSkipProgress", "F2", "", "url", "E2", "C2", "z2", "language", "A2", "G2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "view", "z1", "Lg7/l0;", "t0", "Lih/g;", "B2", "()Lg7/l0;", "viewModel", "Lb6/s3;", "u0", "Lb6/s3;", "binding", "v0", "Ljava/lang/String;", "webURL", "w0", "Z", "readingLocalSafetyInstructions", "", "x0", "[Ljava/lang/String;", "SUPPORTED_SAFETY_GUIDE_LANGUAGE", "<init>", "()V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ManualFragment extends Fragment {

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final g viewModel;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private s3 binding;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private String webURL;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private boolean readingLocalSafetyInstructions;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private final String[] SUPPORTED_SAFETY_GUIDE_LANGUAGE;

    /* compiled from: ManualFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/ManualFragment$a;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "", "shouldOverrideUrlLoading", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            m.f(view, "view");
            m.f(url, "url");
            view.loadUrl(url);
            return true;
        }
    }

    /* compiled from: ManualFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9803a;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19359s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.b.f19360t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.b.f19362v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.b.f19361u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9803a = iArr;
        }
    }

    /* compiled from: FragmentSharedVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/fragment/app/s;", "b", "()Landroidx/fragment/app/s;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c extends o implements vh.a<s> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f9804q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f9804q = fragment;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            s c22 = this.f9804q.c2();
            m.e(c22, "requireActivity()");
            return c22;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/q0;", "T", "Landroidx/lifecycle/t0$b;", "b", "()Landroidx/lifecycle/t0$b;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class d extends o implements vh.a<t0.b> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9805q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ tm.a f9806r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ vh.a f9807s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ vm.a f9808t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vh.a aVar, tm.a aVar2, vh.a aVar3, vm.a aVar4) {
            super(0);
            this.f9805q = aVar;
            this.f9806r = aVar2;
            this.f9807s = aVar3;
            this.f9808t = aVar4;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0.b a() {
            return jm.a.a((w0) this.f9805q.a(), d0.b(l0.class), this.f9806r, this.f9807s, (vh.a) null, this.f9808t);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/q0;", "VM", "Landroidx/lifecycle/v0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class e extends o implements vh.a<v0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ vh.a f9809q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vh.a aVar) {
            super(0);
            this.f9809q = aVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 a() {
            v0 y10 = ((w0) this.f9809q.a()).y();
            m.e(y10, "ownerProducer().viewModelStore");
            return y10;
        }
    }

    public ManualFragment() {
        c cVar = new c(this);
        this.viewModel = s0.a(this, d0.b(l0.class), new e(cVar), new d(cVar, null, null, bm.a.a(this)));
        this.SUPPORTED_SAFETY_GUIDE_LANGUAGE = new String[]{"en", "de"};
    }

    private final String A2(String language) {
        for (String str : this.SUPPORTED_SAFETY_GUIDE_LANGUAGE) {
            if (m.a(str, language)) {
                return language;
            }
        }
        return this.SUPPORTED_SAFETY_GUIDE_LANGUAGE[0];
    }

    private final l0 B2() {
        return (l0) this.viewModel.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String C2(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1503603903: goto L2c;
                case -1482038919: goto L20;
                case -602967718: goto L14;
                case 696923138: goto L8;
                default: goto L7;
            }
        L7:
            goto L34
        L8:
            java.lang.String r0 = "https://meater.com/new-safety-info/meater-plus2?download=false"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11
            goto L34
        L11:
            java.lang.String r2 = "safety-information-meater-plus2"
            goto L39
        L14:
            java.lang.String r0 = "https://meater.com/safety-info/meater-block?download=false"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d
            goto L34
        L1d:
            java.lang.String r2 = "safety-information-meater-block"
            goto L39
        L20:
            java.lang.String r0 = "https://meater.com/safety-info/meater-plus?download=false"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L29
            goto L34
        L29:
            java.lang.String r2 = "safety-information-meater-plus"
            goto L39
        L2c:
            java.lang.String r0 = "https://meater.com/safety-info/meater-se?download=false"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L37
        L34:
            java.lang.String r2 = "safety-information-meater"
            goto L39
        L37:
            java.lang.String r2 = "safety-information-meater-plus-se"
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.qsg.ui.info.ManualFragment.C2(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(ManualFragment manualFragment, View view) {
        m.f(manualFragment, "this$0");
        manualFragment.F2(true);
    }

    private final void E2(String str) {
        String str2;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        try {
            this.readingLocalSafetyInstructions = true;
            String C2 = C2(str);
            String t10 = com.apptionlabs.meater_app.app.a.t();
            m.e(t10, "getLocale(...)");
            if (t10.length() >= 2) {
                str2 = t10.substring(0, 2);
                m.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = "";
            }
            String str3 = ("file:///android_asset/" + A2(str2) + "/") + C2 + ".html";
            String[] strArr = (String[]) new j("#").d(str3, 0).toArray(new String[0]);
            if (strArr.length == 0) {
                return;
            }
            String C = pk.m.C(strArr[0], "file:///android_asset/", "", false, 4, (Object) null);
            int length = C.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (m.h(C.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            InputStream open = c2().getAssets().open(C.subSequence(i12, length + 1).toString());
            m.e(open, "open(...)");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            String str4 = new String(bArr, pk.d.b);
            int length2 = "4.3.1".length() - 1;
            int i13 = 0;
            boolean z13 = false;
            while (i13 <= length2) {
                if (!z13) {
                    i10 = i13;
                } else {
                    i10 = length2;
                }
                if (m.h("4.3.1".charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z13) {
                    if (!z10) {
                        z13 = true;
                    } else {
                        i13++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length2--;
                }
            }
            String C3 = pk.m.C(pk.m.C(str4, "{VERSION}", "4.3.1".subSequence(i13, length2 + 1).toString(), false, 4, (Object) null), "{YEAR}", String.valueOf(Calendar.getInstance().get(1)), false, 4, (Object) null);
            s3 s3Var = this.binding;
            if (s3Var == null) {
                m.t("binding");
                s3Var = null;
            }
            s3Var.S.loadDataWithBaseURL(str3, C3, "text/html", "UTF-8", null);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private final void F2(boolean z10) {
        w6.d s10 = B2().s();
        if (!z10) {
            w6.d dVar = w6.d.f19377w;
            if (s10.compareTo(dVar) <= 0) {
                B2().I(dVar);
                return;
            }
        }
        t a10 = r.a();
        m.e(a10, "actionToTemperatureSensorsInternalScreen(...)");
        androidx.navigation.fragment.a.a(this).S(a10);
    }

    private final String G2() {
        int i10 = b.f9803a[B2().t().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "https://meater.com/safety-info/meater-block?download=false";
                    }
                    return "https://meater.com/new-safety-info/meater-plus2?download=false";
                }
                return "https://meater.com/safety-info/meater-se?download=false";
            }
            return "https://meater.com/safety-info/meater-plus?download=false";
        }
        return "https://meater.com/safety-info/meater?download=false";
    }

    private final void y2() {
        F2(false);
    }

    private final String z2() {
        int i10 = b.f9803a[B2().t().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "lc_manual-block";
                    }
                    return "lc_manual-plus2";
                }
                return "lc_manual-se";
            }
            return "lc_manual-plus";
        }
        return "lc_manual-meater";
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        s3 s3Var = null;
        ViewDataBinding h10 = androidx.databinding.g.h(inflater, 2131558533, null, false);
        m.e(h10, "inflate(...)");
        this.binding = (s3) h10;
        if (B2().s() != w6.d.N) {
            y2();
        }
        s3 s3Var2 = this.binding;
        if (s3Var2 == null) {
            m.t("binding");
        } else {
            s3Var = s3Var2;
        }
        View v10 = s3Var.v();
        m.e(v10, "getRoot(...)");
        return v10;
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle bundle) {
        String str;
        m.f(view, "view");
        super.z1(view, bundle);
        s3 s3Var = this.binding;
        s3 s3Var2 = null;
        if (s3Var == null) {
            m.t("binding");
            s3Var = null;
        }
        s3Var.R.setOnClickListener(new View.OnClickListener() { // from class: g7.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ManualFragment.D2(ManualFragment.this, view2);
            }
        });
        this.webURL = G2();
        String h10 = f8.j.h(Y(), z2());
        s3 s3Var3 = this.binding;
        if (s3Var3 == null) {
            m.t("binding");
            s3Var3 = null;
        }
        s3Var3.S.setWebViewClient(new a());
        if (h10 != null) {
            s3 s3Var4 = this.binding;
            if (s3Var4 == null) {
                m.t("binding");
                s3Var4 = null;
            }
            WebView webView = s3Var4.S;
            String str2 = this.webURL;
            if (str2 == null) {
                m.t("webURL");
                str = null;
            } else {
                str = str2;
            }
            webView.loadDataWithBaseURL(str, h10, "text/html", "UTF-8", null);
        } else {
            String str3 = this.webURL;
            if (str3 == null) {
                m.t("webURL");
                str3 = null;
            }
            E2(str3);
        }
        s3 s3Var5 = this.binding;
        if (s3Var5 == null) {
            m.t("binding");
        } else {
            s3Var2 = s3Var5;
        }
        WebSettings settings = s3Var2.S.getSettings();
        m.e(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
    }
}
