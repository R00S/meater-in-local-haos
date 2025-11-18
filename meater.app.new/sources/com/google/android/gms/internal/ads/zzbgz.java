package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;

@VisibleForTesting
@zzard
/* loaded from: classes2.dex */
public interface zzbgz extends zzj, zzaji, zzakg, zzbdf, zzbhx, zzbhy, zzbic, zzbif, zzbig, zzbih, zzue {
    /* renamed from: A */
    void mo14874A(zzbin zzbinVar);

    /* renamed from: C */
    void mo14876C();

    /* renamed from: D */
    void mo14877D(zzadv zzadvVar);

    /* renamed from: E */
    boolean mo14878E();

    /* renamed from: G */
    void mo14879G(String str, String str2, String str3);

    /* renamed from: H */
    void mo14880H(IObjectWrapper iObjectWrapper);

    /* renamed from: I */
    void mo14881I();

    /* renamed from: J */
    void mo14882J();

    /* renamed from: K */
    void mo14883K(boolean z);

    /* renamed from: O */
    void mo14887O();

    /* renamed from: Q */
    zzadx mo14889Q();

    /* renamed from: S */
    void mo14891S(boolean z);

    /* renamed from: W */
    void mo14894W(Context context);

    /* renamed from: Z */
    IObjectWrapper mo14896Z();

    /* renamed from: a */
    Activity mo14897a();

    /* renamed from: a0 */
    void mo14898a0(com.google.android.gms.ads.internal.overlay.zzd zzdVar);

    /* renamed from: b */
    zzbai mo14899b();

    /* renamed from: b0 */
    void mo14900b0(int i2);

    /* renamed from: c */
    com.google.android.gms.ads.internal.zza mo14901c();

    /* renamed from: c0 */
    void mo14902c0();

    /* renamed from: d */
    zzdh mo14903d();

    /* renamed from: d0 */
    Context mo14904d0();

    void destroy();

    /* renamed from: e */
    void mo14905e(zzbhq zzbhqVar);

    /* renamed from: e0 */
    void mo14906e0();

    /* renamed from: f */
    void mo14907f(String str, zzaho<? super zzbgz> zzahoVar);

    /* renamed from: g */
    void mo14909g(String str, zzbft zzbftVar);

    @Override // com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbhx
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: h */
    zzbhq mo14911h();

    /* renamed from: h0 */
    void mo14912h0(com.google.android.gms.ads.internal.overlay.zzd zzdVar);

    /* renamed from: i */
    void mo14913i(String str, zzaho<? super zzbgz> zzahoVar);

    /* renamed from: j0 */
    void mo14916j0(boolean z);

    /* renamed from: k0 */
    com.google.android.gms.ads.internal.overlay.zzd mo14918k0();

    /* renamed from: l */
    boolean mo14919l();

    /* renamed from: l0 */
    void mo14920l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    boolean mo14921m();

    /* renamed from: m0 */
    void mo14922m0(boolean z);

    void measure(int i2, int i3);

    /* renamed from: n */
    zzadh mo14923n();

    /* renamed from: n0 */
    void mo14924n0();

    /* renamed from: o */
    zzbin mo14925o();

    void onPause();

    void onResume();

    /* renamed from: p */
    zzbii mo14926p();

    /* renamed from: p0 */
    boolean mo14927p0();

    /* renamed from: s */
    boolean mo14930s();

    /* renamed from: s0 */
    com.google.android.gms.ads.internal.overlay.zzd mo14931s0();

    @Override // com.google.android.gms.internal.ads.zzbdf
    void setBackgroundColor(int i2);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i2);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: t */
    void mo14932t(String str, Predicate<zzaho<? super zzbgz>> predicate);

    /* renamed from: t0 */
    boolean mo14933t0();

    /* renamed from: v */
    String mo14934v();

    /* renamed from: w */
    boolean mo14936w(boolean z, int i2);

    /* renamed from: x */
    void mo14938x(boolean z);

    /* renamed from: x0 */
    void mo14939x0(zzadx zzadxVar);

    /* renamed from: z */
    WebViewClient mo14941z();
}
