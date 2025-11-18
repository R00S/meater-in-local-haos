package o5;

import L4.V;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.b0;
import android.view.c0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import d.ActivityC3006j;
import g1.C3377a;
import g5.EnumC3427c;
import java.util.Arrays;
import java.util.Locale;
import kotlin.InterfaceC3415u;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import q5.C4295d;
import q5.C4302k;
import q5.O;
import x4.g;

/* compiled from: BaseInfoFragment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000eH&¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u000eH&¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0003J\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010#J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lo5/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Loa/F;", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "z2", "J2", "I2", "H2", "N2", "O2", "G2", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "D2", "()Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "Lg5/c;", "C2", "()Lg5/c;", "K2", "", "stringId", "", "A2", "(I)Ljava/lang/String;", "M2", "", "shouldSkipProgress", "y2", "(Z)V", "LL4/V;", "G0", "LL4/V;", "B2", "()LL4/V;", "F2", "(LL4/V;)V", "binding", "Lq5/O;", "H0", "Loa/i;", "E2", "()Lq5/O;", "viewModel", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4134b extends Fragment {

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    protected V binding;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i viewModel = C4165j.b(EnumC4168m.f46628D, new c(this, null, new C0635b(this), null, null));

    /* compiled from: BaseInfoFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o5.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46559a;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            try {
                iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MEATERDeviceType.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MEATERDeviceType.PLUS_SE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f46559a = iArr;
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o5.b$b, reason: collision with other inner class name */
    public static final class C0635b implements Ba.a<o> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f46560B;

        public C0635b(Fragment fragment) {
            this.f46560B = fragment;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return this.f46560B.c2();
        }
    }

    /* compiled from: FragmentActivityVM.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o5.b$c */
    public static final class c implements Ba.a<O> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Fragment f46561B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f46562C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f46563D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a f46564E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a f46565F;

        public c(Fragment fragment, dd.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
            this.f46561B = fragment;
            this.f46562C = aVar;
            this.f46563D = aVar2;
            this.f46564E = aVar3;
            this.f46565F = aVar4;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, q5.O] */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            Q1.a aVarM;
            Q1.a aVar;
            Q1.a aVar2;
            Fragment fragment = this.f46561B;
            dd.a aVar3 = this.f46562C;
            Ba.a aVar4 = this.f46563D;
            Ba.a aVar5 = this.f46564E;
            Ba.a aVar6 = this.f46565F;
            c0 c0Var = (c0) aVar4.invoke();
            b0 b0VarV = c0Var.v();
            if (aVar5 == null || (aVar2 = (Q1.a) aVar5.invoke()) == null) {
                ActivityC3006j activityC3006j = c0Var instanceof ActivityC3006j ? (ActivityC3006j) c0Var : null;
                if (activityC3006j != null) {
                    aVarM = activityC3006j.m();
                } else {
                    aVarM = fragment.m();
                    C3862t.f(aVarM, "<get-defaultViewModelCreationExtras>(...)");
                }
                aVar = aVarM;
            } else {
                aVar = aVar2;
            }
            return ld.b.b(P.b(O.class), b0VarV, (4 & 4) != 0 ? null : null, aVar, (4 & 16) != 0 ? null : aVar3, Nc.a.a(fragment), (4 & 64) != 0 ? null : aVar6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2() {
        MeaterLinkService.h();
    }

    public final String A2(int stringId) {
        switch (a.f46559a[D2().ordinal()]) {
            case 1:
                kotlin.jvm.internal.V v10 = kotlin.jvm.internal.V.f43983a;
                Locale locale = Locale.US;
                String strA0 = A0(stringId);
                C3862t.f(strA0, "getString(...)");
                String str = String.format(locale, strA0, Arrays.copyOf(new Object[]{A0(R.string.meater_label)}, 1));
                C3862t.f(str, "format(...)");
                return str;
            case 2:
                kotlin.jvm.internal.V v11 = kotlin.jvm.internal.V.f43983a;
                Locale locale2 = Locale.US;
                String strA02 = A0(stringId);
                C3862t.f(strA02, "getString(...)");
                String str2 = String.format(locale2, strA02, Arrays.copyOf(new Object[]{A0(R.string.meater_plus)}, 1));
                C3862t.f(str2, "format(...)");
                return str2;
            case 3:
                kotlin.jvm.internal.V v12 = kotlin.jvm.internal.V.f43983a;
                Locale locale3 = Locale.US;
                String strA03 = A0(stringId);
                C3862t.f(strA03, "getString(...)");
                String str3 = String.format(locale3, strA03, Arrays.copyOf(new Object[]{A0(R.string.plus_g2_name)}, 1));
                C3862t.f(str3, "format(...)");
                return str3;
            case 4:
                kotlin.jvm.internal.V v13 = kotlin.jvm.internal.V.f43983a;
                Locale locale4 = Locale.US;
                String strA04 = A0(stringId);
                C3862t.f(strA04, "getString(...)");
                String str4 = String.format(locale4, strA04, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_label)}, 1));
                C3862t.f(str4, "format(...)");
                return str4;
            case 5:
                kotlin.jvm.internal.V v14 = kotlin.jvm.internal.V.f43983a;
                Locale locale5 = Locale.US;
                String strA05 = A0(stringId);
                C3862t.f(strA05, "getString(...)");
                String str5 = String.format(locale5, strA05, Arrays.copyOf(new Object[]{A0(R.string.meater_plus_se_name)}, 1));
                C3862t.f(str5, "format(...)");
                return str5;
            case 6:
                kotlin.jvm.internal.V v15 = kotlin.jvm.internal.V.f43983a;
                Locale locale6 = Locale.US;
                String strA06 = A0(stringId);
                C3862t.f(strA06, "getString(...)");
                String str6 = String.format(locale6, strA06, Arrays.copyOf(new Object[]{A0(R.string.meater_block_label)}, 1));
                C3862t.f(str6, "format(...)");
                return str6;
            case 7:
                kotlin.jvm.internal.V v16 = kotlin.jvm.internal.V.f43983a;
                Locale locale7 = Locale.US;
                String strA07 = A0(stringId);
                C3862t.f(strA07, "getString(...)");
                String str7 = String.format(locale7, strA07, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_xl_label)}, 1));
                C3862t.f(str7, "format(...)");
                return str7;
            case 8:
                kotlin.jvm.internal.V v17 = kotlin.jvm.internal.V.f43983a;
                Locale locale8 = Locale.US;
                String strA08 = A0(stringId);
                C3862t.f(strA08, "getString(...)");
                String str8 = String.format(locale8, strA08, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_duo)}, 1));
                C3862t.f(str8, "format(...)");
                return str8;
            default:
                kotlin.jvm.internal.V v18 = kotlin.jvm.internal.V.f43983a;
                Locale locale9 = Locale.US;
                String strA09 = A0(stringId);
                C3862t.f(strA09, "getString(...)");
                String str9 = String.format(locale9, strA09, Arrays.copyOf(new Object[]{A0(R.string.meater_block_label)}, 1));
                C3862t.f(str9, "format(...)");
                return str9;
        }
    }

    protected final V B2() {
        V v10 = this.binding;
        if (v10 != null) {
            return v10;
        }
        C3862t.u("binding");
        return null;
    }

    public final EnumC3427c C2() {
        return E2().t();
    }

    public final MEATERDeviceType D2() {
        return E2().u();
    }

    public final O E2() {
        return (O) this.viewModel.getValue();
    }

    protected final void F2(V v10) {
        C3862t.g(v10, "<set-?>");
        this.binding = v10;
    }

    public abstract void G2();

    public abstract void H2();

    public abstract void I2();

    public abstract void J2();

    public final void K2() {
        E2().C();
        Context applicationContext = c2().getApplicationContext();
        C3862t.e(applicationContext, "null cannot be cast to non-null type com.apptionlabs.meater_app.app.MeaterApp");
        ((g) applicationContext).B();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4134b.L2();
            }
        }, 500L);
    }

    public final String M2(int stringId) {
        switch (a.f46559a[D2().ordinal()]) {
            case 1:
                kotlin.jvm.internal.V v10 = kotlin.jvm.internal.V.f43983a;
                Locale locale = Locale.US;
                String strA0 = A0(stringId);
                C3862t.f(strA0, "getString(...)");
                String str = String.format(locale, strA0, Arrays.copyOf(new Object[]{A0(R.string.meater_label)}, 1));
                C3862t.f(str, "format(...)");
                return str;
            case 2:
                kotlin.jvm.internal.V v11 = kotlin.jvm.internal.V.f43983a;
                Locale locale2 = Locale.US;
                String strA02 = A0(stringId);
                C3862t.f(strA02, "getString(...)");
                String str2 = String.format(locale2, strA02, Arrays.copyOf(new Object[]{A0(R.string.meater_plus)}, 1));
                C3862t.f(str2, "format(...)");
                return str2;
            case 3:
            case 4:
                kotlin.jvm.internal.V v12 = kotlin.jvm.internal.V.f43983a;
                Locale locale3 = Locale.US;
                String strA03 = A0(stringId);
                C3862t.f(strA03, "getString(...)");
                String str3 = String.format(locale3, strA03, Arrays.copyOf(new Object[]{A0(R.string.plus_g2_name)}, 1));
                C3862t.f(str3, "format(...)");
                return str3;
            case 5:
                kotlin.jvm.internal.V v13 = kotlin.jvm.internal.V.f43983a;
                Locale locale4 = Locale.US;
                String strA04 = A0(stringId);
                C3862t.f(strA04, "getString(...)");
                String str4 = String.format(locale4, strA04, Arrays.copyOf(new Object[]{A0(R.string.meater_plus_se_name)}, 1));
                C3862t.f(str4, "format(...)");
                return str4;
            case 6:
                kotlin.jvm.internal.V v14 = kotlin.jvm.internal.V.f43983a;
                Locale locale5 = Locale.US;
                String strA05 = A0(stringId);
                C3862t.f(strA05, "getString(...)");
                String str5 = String.format(locale5, strA05, Arrays.copyOf(new Object[]{A0(R.string.meater_block_label)}, 1));
                C3862t.f(str5, "format(...)");
                return str5;
            case 7:
                kotlin.jvm.internal.V v15 = kotlin.jvm.internal.V.f43983a;
                Locale locale6 = Locale.US;
                String strA06 = A0(stringId);
                C3862t.f(strA06, "getString(...)");
                String str6 = String.format(locale6, strA06, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_xl_label)}, 1));
                C3862t.f(str6, "format(...)");
                return str6;
            case 8:
                kotlin.jvm.internal.V v16 = kotlin.jvm.internal.V.f43983a;
                Locale locale7 = Locale.US;
                String strA07 = A0(stringId);
                C3862t.f(strA07, "getString(...)");
                String str7 = String.format(locale7, strA07, Arrays.copyOf(new Object[]{A0(R.string.meater_pro_duo)}, 1));
                C3862t.f(str7, "format(...)");
                return str7;
            default:
                kotlin.jvm.internal.V v17 = kotlin.jvm.internal.V.f43983a;
                Locale locale8 = Locale.US;
                String strA08 = A0(stringId);
                C3862t.f(strA08, "getString(...)");
                String str8 = String.format(locale8, strA08, Arrays.copyOf(new Object[]{A0(R.string.meater_block_label)}, 1));
                C3862t.f(str8, "format(...)");
                return str8;
        }
    }

    public abstract void N2();

    public abstract void O2();

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        F2(V.c(inflater, container, false));
        if (E2().t() != EnumC3427c.f41920Y) {
            z2();
        }
        ConstraintLayout constraintLayoutB = B2().b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public final void y2(boolean shouldSkipProgress) throws Resources.NotFoundException {
        EnumC3427c enumC3427cC2 = C2();
        if (shouldSkipProgress || enumC3427cC2.compareTo(EnumC3427c.f41909N) > 0) {
            K5.a aVar = K5.a.f8696a;
            Context contextE2 = e2();
            C3862t.f(contextE2, "requireContext(...)");
            if (!aVar.d(contextE2)) {
                InterfaceC3415u interfaceC3415uC = C4295d.c();
                C3862t.f(interfaceC3415uC, "actionToPermissionsScreen(...)");
                androidx.navigation.fragment.a.a(this).W(interfaceC3415uC);
                return;
            }
            if (Build.VERSION.SDK_INT >= 33 && C3377a.a(e2(), "android.permission.POST_NOTIFICATIONS") != 0) {
                InterfaceC3415u interfaceC3415uB = C4295d.b();
                C3862t.f(interfaceC3415uB, "actionToNotificationPermissionFragment(...)");
                androidx.navigation.fragment.a.a(this).W(interfaceC3415uB);
                return;
            }
            Object systemService = g.h().getSystemService("notification");
            C3862t.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            if (((NotificationManager) systemService).isNotificationPolicyAccessGranted() || enumC3427cC2.compareTo(EnumC3427c.f41916U) >= 0) {
                InterfaceC3415u interfaceC3415uA = C4302k.a();
                C3862t.f(interfaceC3415uA, "actionToPairingScreen(...)");
                androidx.navigation.fragment.a.a(this).W(interfaceC3415uA);
            } else {
                InterfaceC3415u interfaceC3415uA2 = C4295d.a();
                C3862t.f(interfaceC3415uA2, "actionToImportantAlertPermissionFragment(...)");
                androidx.navigation.fragment.a.a(this).W(interfaceC3415uA2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        o oVarC2 = c2();
        C3862t.e(oVarC2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) oVarC2;
        androidx.appcompat.app.a aVarH0 = cVar.H0();
        if (aVarH0 != null) {
            aVarH0.m();
        }
        androidx.appcompat.app.a aVarH02 = cVar.H0();
        if (aVarH02 != null) {
            aVarH02.F("");
        }
        J2();
        I2();
        H2();
        N2();
        O2();
        G2();
    }

    public abstract void z2();
}
