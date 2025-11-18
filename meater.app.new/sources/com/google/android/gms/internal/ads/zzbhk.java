package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.C6298R;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbhk extends FrameLayout implements zzbgz {

    /* renamed from: f */
    private final zzbgz f23047f;

    /* renamed from: g */
    private final zzbcw f23048g;

    /* renamed from: h */
    private final AtomicBoolean f23049h;

    public zzbhk(zzbgz zzbgzVar) {
        super(zzbgzVar.getContext());
        this.f23049h = new AtomicBoolean();
        this.f23047f = zzbgzVar;
        this.f23048g = new zzbcw(zzbgzVar.mo14904d0(), this, this);
        addView(zzbgzVar.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: A */
    public final void mo14874A(zzbin zzbinVar) {
        this.f23047f.mo14874A(zzbinVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: B */
    public final void mo14875B(boolean z, int i2) {
        this.f23047f.mo14875B(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: C */
    public final void mo14876C() {
        this.f23047f.mo14876C();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: D */
    public final void mo14877D(zzadv zzadvVar) {
        this.f23047f.mo14877D(zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: E */
    public final boolean mo14878E() {
        return this.f23047f.mo14878E();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: G */
    public final void mo14879G(String str, String str2, String str3) {
        this.f23047f.mo14879G(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: H */
    public final void mo14880H(IObjectWrapper iObjectWrapper) {
        this.f23047f.mo14880H(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: I */
    public final void mo14881I() {
        this.f23047f.mo14881I();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: J */
    public final void mo14882J() {
        this.f23047f.mo14882J();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: K */
    public final void mo14883K(boolean z) {
        this.f23047f.mo14883K(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: L */
    public final void mo14884L(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.f23047f.mo14884L(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: M */
    public final void mo14885M() {
        this.f23047f.mo14885M();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: N */
    public final void mo14886N() {
        this.f23047f.mo14886N();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: O */
    public final void mo14887O() {
        this.f23047f.mo14887O();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: P */
    public final zzadg mo14888P() {
        return this.f23047f.mo14888P();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: Q */
    public final zzadx mo14889Q() {
        return this.f23047f.mo14889Q();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: R */
    public final void mo14890R(boolean z, long j2) {
        this.f23047f.mo14890R(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: S */
    public final void mo14891S(boolean z) {
        this.f23047f.mo14891S(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: U */
    public final int mo14892U() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: V */
    public final zzbft mo14893V(String str) {
        return this.f23047f.mo14893V(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: W */
    public final void mo14894W(Context context) {
        this.f23047f.mo14894W(context);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: Y */
    public final void mo14895Y(String str, JSONObject jSONObject) {
        this.f23047f.mo14895Y(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: Z */
    public final IObjectWrapper mo14896Z() {
        return this.f23047f.mo14896Z();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbhx
    /* renamed from: a */
    public final Activity mo14897a() {
        return this.f23047f.mo14897a();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: a0 */
    public final void mo14898a0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f23047f.mo14898a0(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf, com.google.android.gms.internal.ads.zzbig
    /* renamed from: b */
    public final zzbai mo14899b() {
        return this.f23047f.mo14899b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: b0 */
    public final void mo14900b0(int i2) {
        this.f23047f.mo14900b0(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: c */
    public final com.google.android.gms.ads.internal.zza mo14901c() {
        return this.f23047f.mo14901c();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: c0 */
    public final void mo14902c0() {
        this.f23047f.mo14902c0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbif
    /* renamed from: d */
    public final zzdh mo14903d() {
        return this.f23047f.mo14903d();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: d0 */
    public final Context mo14904d0() {
        return this.f23047f.mo14904d0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void destroy() {
        IObjectWrapper iObjectWrapperMo14896Z = mo14896Z();
        if (iObjectWrapperMo14896Z == null) {
            this.f23047f.destroy();
            return;
        }
        zzk.zzlv().m16874f(iObjectWrapperMo14896Z);
        zzaxi.f22654a.postDelayed(new RunnableC6482ab(this), ((Integer) zzyt.m20848e().m16421c(zzacu.f21767c4)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: e */
    public final void mo14905e(zzbhq zzbhqVar) {
        this.f23047f.mo14905e(zzbhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: e0 */
    public final void mo14906e0() {
        setBackgroundColor(0);
        this.f23047f.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: f */
    public final void mo14907f(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f23047f.mo14907f(str, zzahoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: f0 */
    public final int mo14908f0() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: g */
    public final void mo14909g(String str, zzbft zzbftVar) {
        this.f23047f.mo14909g(str, zzbftVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: g0 */
    public final void mo14910g0(boolean z, int i2, String str) {
        this.f23047f.mo14910g0(z, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbih
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final WebView getWebView() {
        return this.f23047f.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: h */
    public final zzbhq mo14911h() {
        return this.f23047f.mo14911h();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: h0 */
    public final void mo14912h0(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.f23047f.mo14912h0(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: i */
    public final void mo14913i(String str, zzaho<? super zzbgz> zzahoVar) {
        this.f23047f.mo14913i(str, zzahoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: i0 */
    public final zzbcw mo14914i0() {
        return this.f23048g;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: j */
    public final void mo14915j(String str, JSONObject jSONObject) {
        this.f23047f.mo14915j(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: j0 */
    public final void mo14916j0(boolean z) {
        this.f23047f.mo14916j0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: k */
    public final void mo14917k(String str) {
        this.f23047f.mo14917k(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: k0 */
    public final com.google.android.gms.ads.internal.overlay.zzd mo14918k0() {
        return this.f23047f.mo14918k0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: l */
    public final boolean mo14919l() {
        return this.f23047f.mo14919l();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: l0 */
    public final void mo14920l0() {
        TextView textView = new TextView(getContext());
        Resources resourcesM17050b = zzk.zzlk().m17050b();
        textView.setText(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16871s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void loadData(String str, String str2, String str3) {
        this.f23047f.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f23047f.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void loadUrl(String str) {
        this.f23047f.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbhy
    /* renamed from: m */
    public final boolean mo14921m() {
        return this.f23047f.mo14921m();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: m0 */
    public final void mo14922m0(boolean z) {
        this.f23047f.mo14922m0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbdf
    /* renamed from: n */
    public final zzadh mo14923n() {
        return this.f23047f.mo14923n();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: n0 */
    public final void mo14924n0() {
        this.f23048g.m17459a();
        this.f23047f.mo14924n0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz, com.google.android.gms.internal.ads.zzbie
    /* renamed from: o */
    public final zzbin mo14925o() {
        return this.f23047f.mo14925o();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void onPause() {
        this.f23048g.m17460b();
        this.f23047f.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void onResume() {
        this.f23047f.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: p */
    public final zzbii mo14926p() {
        return this.f23047f.mo14926p();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: p0 */
    public final boolean mo14927p0() {
        return this.f23049h.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: r */
    public final String mo14928r() {
        return this.f23047f.mo14928r();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final void mo14929r0(zzud zzudVar) {
        this.f23047f.mo14929r0(zzudVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: s */
    public final boolean mo14930s() {
        return this.f23047f.mo14930s();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: s0 */
    public final com.google.android.gms.ads.internal.overlay.zzd mo14931s0() {
        return this.f23047f.mo14931s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbgz
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23047f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbgz
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f23047f.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void setRequestedOrientation(int i2) {
        this.f23047f.setRequestedOrientation(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f23047f.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f23047f.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: t */
    public final void mo14932t(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        this.f23047f.mo14932t(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: t0 */
    public final boolean mo14933t0() {
        return this.f23047f.mo14933t0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: v */
    public final String mo14934v() {
        return this.f23047f.mo14934v();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    /* renamed from: v0 */
    public final void mo14935v0(boolean z) {
        this.f23047f.mo14935v0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: w */
    public final boolean mo14936w(boolean z, int i2) {
        if (!this.f23049h.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21719V0)).booleanValue()) {
            return false;
        }
        removeView(this.f23047f.getView());
        return this.f23047f.mo14936w(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    /* renamed from: w0 */
    public final void mo14937w0(boolean z, int i2, String str, String str2) {
        this.f23047f.mo14937w0(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: x */
    public final void mo14938x(boolean z) {
        this.f23047f.mo14938x(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: x0 */
    public final void mo14939x0(zzadx zzadxVar) {
        this.f23047f.mo14939x0(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: y */
    public final void mo14940y(String str, Map<String, ?> map) {
        this.f23047f.mo14940y(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    /* renamed from: z */
    public final WebViewClient mo14941z() {
        return this.f23047f.mo14941z();
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzlc() {
        this.f23047f.zzlc();
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzld() {
        this.f23047f.zzld();
    }
}
