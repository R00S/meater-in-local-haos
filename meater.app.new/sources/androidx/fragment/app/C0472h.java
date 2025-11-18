package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.InterfaceC0501a0;
import p024c.p052i.p059j.C0959i;

/* compiled from: FragmentController.java */
/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public class C0472h {

    /* renamed from: a */
    private final AbstractC0474j<?> f3285a;

    private C0472h(AbstractC0474j<?> abstractC0474j) {
        this.f3285a = abstractC0474j;
    }

    /* renamed from: b */
    public static C0472h m3626b(AbstractC0474j<?> abstractC0474j) {
        return new C0472h((AbstractC0474j) C0959i.m6066d(abstractC0474j, "callbacks == null"));
    }

    /* renamed from: a */
    public void m3627a(Fragment fragment) {
        AbstractC0474j<?> abstractC0474j = this.f3285a;
        abstractC0474j.f3291j.m3489k(abstractC0474j, abstractC0474j, fragment);
    }

    /* renamed from: c */
    public void m3628c() {
        this.f3285a.f3291j.m3516z();
    }

    /* renamed from: d */
    public void m3629d(Configuration configuration) {
        this.f3285a.f3291j.m3429B(configuration);
    }

    /* renamed from: e */
    public boolean m3630e(MenuItem menuItem) {
        return this.f3285a.f3291j.m3431C(menuItem);
    }

    /* renamed from: f */
    public void m3631f() {
        this.f3285a.f3291j.m3432D();
    }

    /* renamed from: g */
    public boolean m3632g(Menu menu, MenuInflater menuInflater) {
        return this.f3285a.f3291j.m3434E(menu, menuInflater);
    }

    /* renamed from: h */
    public void m3633h() {
        this.f3285a.f3291j.m3436F();
    }

    /* renamed from: i */
    public void m3634i() {
        this.f3285a.f3291j.m3440H();
    }

    /* renamed from: j */
    public void m3635j(boolean z) {
        this.f3285a.f3291j.m3441I(z);
    }

    /* renamed from: k */
    public boolean m3636k(MenuItem menuItem) {
        return this.f3285a.f3291j.m3444K(menuItem);
    }

    /* renamed from: l */
    public void m3637l(Menu menu) {
        this.f3285a.f3291j.m3446L(menu);
    }

    /* renamed from: m */
    public void m3638m() {
        this.f3285a.f3291j.m3449N();
    }

    /* renamed from: n */
    public void m3639n(boolean z) {
        this.f3285a.f3291j.m3451O(z);
    }

    /* renamed from: o */
    public boolean m3640o(Menu menu) {
        return this.f3285a.f3291j.m3453P(menu);
    }

    /* renamed from: p */
    public void m3641p() {
        this.f3285a.f3291j.m3456R();
    }

    /* renamed from: q */
    public void m3642q() {
        this.f3285a.f3291j.m3458S();
    }

    /* renamed from: r */
    public void m3643r() {
        this.f3285a.f3291j.m3461U();
    }

    /* renamed from: s */
    public boolean m3644s() {
        return this.f3285a.f3291j.m3472b0(true);
    }

    /* renamed from: t */
    public FragmentManager m3645t() {
        return this.f3285a.f3291j;
    }

    /* renamed from: u */
    public void m3646u() {
        this.f3285a.f3291j.m3464V0();
    }

    /* renamed from: v */
    public View m3647v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3285a.f3291j.m3513x0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m3648w(Parcelable parcelable) {
        AbstractC0474j<?> abstractC0474j = this.f3285a;
        if (!(abstractC0474j instanceof InterfaceC0501a0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC0474j.f3291j.m3491k1(parcelable);
    }

    /* renamed from: x */
    public Parcelable m3649x() {
        return this.f3285a.f3291j.m3494m1();
    }
}
