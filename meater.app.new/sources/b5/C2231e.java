package b5;

import L4.Z;
import android.content.Intent;
import android.os.Bundle;
import android.view.E;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.CloudAccountActivity;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: DynamicNewsCardFragment.kt */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\b*\u00012\b\u0007\u0018\u0000 62\u00020\u0001:\u000278B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0003R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00069"}, d2 = {"Lb5/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Loa/F;", "F2", "", "Lp4/j;", "offers", "D2", "(Ljava/util/List;)V", "K2", "M2", "I2", "O2", "", "H2", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "E2", "P2", "LL4/Z;", "G0", "LL4/Z;", "binding", "Lb5/v;", "H0", "Loa/i;", "C2", "()Lb5/v;", "viewModel", "Lb5/e$b;", "I0", "Lb5/e$b;", "getDynamicView", "()Lb5/e$b;", "setDynamicView", "(Lb5/e$b;)V", "dynamicView", "b5/e$d", "J0", "Lb5/e$d;", "itemListener", "K0", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2231e extends Fragment {

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: L0, reason: collision with root package name */
    public static final int f30525L0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private Z binding;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new g(this, null, new f(this), null, null));

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private b dynamicView = b.f30530B;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private final d itemListener = new d();

    /* compiled from: DynamicNewsCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb5/e$a;", "", "<init>", "()V", "Lb5/e;", "a", "()Lb5/e;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C2231e a() {
            C2231e c2231e = new C2231e();
            c2231e.k2(new Bundle());
            return c2231e;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DynamicNewsCardFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb5/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.e$b */
    public static final class b {

        /* renamed from: B, reason: collision with root package name */
        public static final b f30530B = new b("NOT_SIGNED_IN", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final b f30531C = new b("NOT_SIGNED_UP_NEWSLETTER", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final b f30532D = new b("OFFERS", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ b[] f30533E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f30534F;

        static {
            b[] bVarArrC = c();
            f30533E = bVarArrC;
            f30534F = C4929b.a(bVarArrC);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f30530B, f30531C, f30532D};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f30533E.clone();
        }
    }

    /* compiled from: DynamicNewsCardFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.e$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30535a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f30530B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f30531C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f30532D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30535a = iArr;
        }
    }

    /* compiled from: DynamicNewsCardFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"b5/e$d", "LZ4/a;", "", "offerId", "Loa/F;", "a", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.e$d */
    public static final class d implements Z4.a {
        d() {
        }

        @Override // Z4.a
        public void a(int offerId) {
            C2231e.this.C2().z(offerId);
        }
    }

    /* compiled from: DynamicNewsCardFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.e$e, reason: collision with other inner class name */
    static final class C0422e implements E, InterfaceC3857n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Ba.l f30537a;

        C0422e(Ba.l function) {
            C3862t.g(function, "function");
            this.f30537a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC3857n
        public final InterfaceC4160e<?> a() {
            return this.f30537a;
        }

        @Override // android.view.E
        public final /* synthetic */ void b(Object obj) {
            this.f30537a.invoke(obj);
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

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.e$f */
    public static final class f implements Ba.a<Fragment> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f30538B;

        public f(Fragment fragment) {
            this.f30538B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f30538B;
        }
    }

    /* compiled from: FragmentVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.e$g */
    public static final class g implements Ba.a<C2248v> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f30539B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f30540C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f30541D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f30542E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f30543F;

        public g(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f30539B = fragment;
            this.f30540C = aVar;
            this.f30541D = aVar2;
            this.f30542E = aVar3;
            this.f30543F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, b5.v] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2248v invoke() {
            Q1.a aVarM;
            Fragment fragment = this.f30539B;
            dd.a aVar = this.f30540C;
            Ba.a aVar2 = this.f30541D;
            Ba.a aVar3 = this.f30542E;
            Ba.a aVar4 = this.f30543F;
            b0 b0VarV = ((c0) aVar2.invoke()).v();
            if (aVar3 == null || (aVarM = (Q1.a) aVar3.invoke()) == null) {
                aVarM = fragment.m();
                C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
            }
            return ld.b.b(P.b(C2248v.class), b0VarV, (4 & 4) != 0 ? null : null, aVarM, (4 & 16) != 0 ? null : aVar, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2248v C2() {
        return (C2248v) this.viewModel.getValue();
    }

    private final void D2(List<OfferData> offers) {
        b bVar = !C2().l() ? b.f30530B : ((offers == null || !(offers.isEmpty() ^ true)) && !C2().m()) ? b.f30531C : b.f30532D;
        this.dynamicView = bVar;
        int i10 = c.f30535a[bVar.ordinal()];
        Z z10 = null;
        if (i10 == 1) {
            Z z11 = this.binding;
            if (z11 == null) {
                C3862t.u("binding");
                z11 = null;
            }
            MaterialCardView notLoggedInHolder = z11.f9788g;
            C3862t.f(notLoggedInHolder, "notLoggedInHolder");
            Q4.l.j(notLoggedInHolder);
            Z z12 = this.binding;
            if (z12 == null) {
                C3862t.u("binding");
            } else {
                z10 = z12;
            }
            ConstraintLayout offersHolder = z10.f9790i;
            C3862t.f(offersHolder, "offersHolder");
            Q4.l.g(offersHolder);
            K2();
        } else if (i10 == 2) {
            Z z13 = this.binding;
            if (z13 == null) {
                C3862t.u("binding");
                z13 = null;
            }
            MaterialCardView notLoggedInHolder2 = z13.f9788g;
            C3862t.f(notLoggedInHolder2, "notLoggedInHolder");
            Q4.l.j(notLoggedInHolder2);
            Z z14 = this.binding;
            if (z14 == null) {
                C3862t.u("binding");
                z14 = null;
            }
            AppCompatImageView foregroundImage = z14.f9785d;
            C3862t.f(foregroundImage, "foregroundImage");
            Q4.l.j(foregroundImage);
            Z z15 = this.binding;
            if (z15 == null) {
                C3862t.u("binding");
            } else {
                z10 = z15;
            }
            ConstraintLayout offersHolder2 = z10.f9790i;
            C3862t.f(offersHolder2, "offersHolder");
            Q4.l.g(offersHolder2);
            M2();
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Z z16 = this.binding;
            if (z16 == null) {
                C3862t.u("binding");
                z16 = null;
            }
            ConstraintLayout offersHolder3 = z16.f9790i;
            C3862t.f(offersHolder3, "offersHolder");
            Q4.l.j(offersHolder3);
            Z z17 = this.binding;
            if (z17 == null) {
                C3862t.u("binding");
            } else {
                z10 = z17;
            }
            MaterialCardView notLoggedInHolder3 = z10.f9788g;
            C3862t.f(notLoggedInHolder3, "notLoggedInHolder");
            Q4.l.g(notLoggedInHolder3);
        }
        if (this.dynamicView == b.f30532D) {
            if (offers == null || !(!offers.isEmpty())) {
                I2();
            } else {
                O2(offers);
            }
        }
    }

    private final void F2() {
        C2().p().h(F0(), new C0422e(new Ba.l() { // from class: b5.a
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return C2231e.G2(this.f30520B, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F G2(C2231e c2231e, List list) {
        c2231e.D2(list);
        return C4153F.f46609a;
    }

    private final boolean H2() {
        return u0().getBoolean(R.bool.is_tablet);
    }

    private final void I2() {
        Z z10 = this.binding;
        Z z11 = null;
        if (z10 == null) {
            C3862t.u("binding");
            z10 = null;
        }
        MaterialCardView notLoggedInHolder = z10.f9788g;
        C3862t.f(notLoggedInHolder, "notLoggedInHolder");
        Q4.l.j(notLoggedInHolder);
        Z z12 = this.binding;
        if (z12 == null) {
            C3862t.u("binding");
            z12 = null;
        }
        ConstraintLayout offersHolder = z12.f9790i;
        C3862t.f(offersHolder, "offersHolder");
        Q4.l.g(offersHolder);
        Z z13 = this.binding;
        if (z13 == null) {
            C3862t.u("binding");
            z13 = null;
        }
        z13.f9787f.setText(A0(R.string.news_message_pro_duo));
        Z z14 = this.binding;
        if (z14 == null) {
            C3862t.u("binding");
            z14 = null;
        }
        z14.f9784c.setText(A0(R.string.discover_more));
        Z z15 = this.binding;
        if (z15 == null) {
            C3862t.u("binding");
            z15 = null;
        }
        z15.f9783b.setImageResource(2131231494);
        Z z16 = this.binding;
        if (z16 == null) {
            C3862t.u("binding");
            z16 = null;
        }
        AppCompatImageView foregroundImage = z16.f9785d;
        C3862t.f(foregroundImage, "foregroundImage");
        Q4.l.j(foregroundImage);
        Z z17 = this.binding;
        if (z17 == null) {
            C3862t.u("binding");
        } else {
            z11 = z17;
        }
        z11.f9784c.setOnClickListener(new View.OnClickListener() { // from class: b5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2231e.J2(this.f30522B, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(C2231e c2231e, View view) {
        if (Ub.n.t(Locale.getDefault().getCountry(), "US", true)) {
            WebViewActivity.E2(c2231e.T(), null, "https://store-us.meater.com/products/meater-pro-duo?utm_source=app&utm_medium=spotlight&utm_campaign=pro-duo");
        } else {
            WebViewActivity.E2(c2231e.T(), null, "https://www.meater.com/shop/meater-pro-duo?utm_source=app&utm_medium=spotlight&utm_campaign=pro-duo");
        }
    }

    private final void K2() {
        Z z10 = this.binding;
        Z z11 = null;
        if (z10 == null) {
            C3862t.u("binding");
            z10 = null;
        }
        z10.f9787f.setText(A0(R.string.news_message_2));
        Z z12 = this.binding;
        if (z12 == null) {
            C3862t.u("binding");
            z12 = null;
        }
        z12.f9784c.setText(A0(R.string.log_in_text));
        Z z13 = this.binding;
        if (z13 == null) {
            C3862t.u("binding");
            z13 = null;
        }
        z13.f9783b.setImageResource(R.drawable.butcher_paper_not_logged_in);
        Z z14 = this.binding;
        if (z14 == null) {
            C3862t.u("binding");
        } else {
            z11 = z14;
        }
        z11.f9784c.setOnClickListener(new View.OnClickListener() { // from class: b5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2231e.L2(this.f30523B, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(C2231e c2231e, View view) {
        c2231e.t2(new Intent(c2231e.T(), (Class<?>) CloudAccountActivity.class));
    }

    private final void M2() {
        Z z10 = this.binding;
        Z z11 = null;
        if (z10 == null) {
            C3862t.u("binding");
            z10 = null;
        }
        z10.f9787f.setText(A0(R.string.news_message_3));
        Z z12 = this.binding;
        if (z12 == null) {
            C3862t.u("binding");
            z12 = null;
        }
        z12.f9784c.setText(A0(R.string.discover_more));
        Z z13 = this.binding;
        if (z13 == null) {
            C3862t.u("binding");
            z13 = null;
        }
        z13.f9783b.setImageResource(2131231494);
        Z z14 = this.binding;
        if (z14 == null) {
            C3862t.u("binding");
        } else {
            z11 = z14;
        }
        z11.f9784c.setOnClickListener(new View.OnClickListener() { // from class: b5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2231e.N2(this.f30521B, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(C2231e c2231e, View view) {
        WebViewActivity.E2(c2231e.T(), null, "https://www.meater.com");
    }

    private final void O2(List<OfferData> offers) {
        LinearLayoutManager linearLayoutManager = H2() ? new LinearLayoutManager(e2(), 0, false) : new LinearLayoutManager(e2());
        Z z10 = this.binding;
        Z z11 = null;
        if (z10 == null) {
            C3862t.u("binding");
            z10 = null;
        }
        z10.f9789h.setLayoutManager(linearLayoutManager);
        Y4.b bVar = new Y4.b(offers, this.itemListener);
        Z z12 = this.binding;
        if (z12 == null) {
            C3862t.u("binding");
        } else {
            z11 = z12;
        }
        z11.f9789h.setAdapter(bVar);
    }

    public final void E2() {
        Z z10 = this.binding;
        if (z10 != null) {
            if (z10 == null) {
                C3862t.u("binding");
                z10 = null;
            }
            ProgressBar loading = z10.f9786e;
            C3862t.f(loading, "loading");
            Q4.l.g(loading);
        }
    }

    public final void P2() {
        Z z10 = this.binding;
        if (z10 != null) {
            if (z10 == null) {
                C3862t.u("binding");
                z10 = null;
            }
            ProgressBar loading = z10.f9786e;
            C3862t.f(loading, "loading");
            Q4.l.j(loading);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        Z zC = Z.c(inflater, container, false);
        this.binding = zC;
        if (zC == null) {
            C3862t.u("binding");
            zC = null;
        }
        ConstraintLayout constraintLayoutB = zC.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        F2();
    }
}
