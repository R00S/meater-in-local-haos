package N5;

import L4.X;
import P5.C1598f;
import T4.h;
import Ub.k;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import d.J;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import x4.g;

/* compiled from: InstructionFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 C2\u00020\u0001:\u0001DB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J7\u0010)\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, d2 = {"LN5/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Loa/F;", "C2", "(Landroid/view/LayoutInflater;)V", "E2", "J2", "z2", "Lcom/apptionlabs/meater_app/targets/MeaterTargetSetupActivity$c;", "G2", "()Lcom/apptionlabs/meater_app/targets/MeaterTargetSetupActivity$c;", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "d1", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "o1", "(Landroid/view/MenuItem;)Z", "", "string1", "string2", "string3", "string4", "I2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LT4/h;", "G0", "LT4/h;", "communicatorCallBack", "LL4/X;", "H0", "LL4/X;", "A2", "()LL4/X;", "H2", "(LL4/X;)V", "binding", "Lcom/apptionlabs/meater_app/model/Probe;", "I0", "Lcom/apptionlabs/meater_app/model/Probe;", "B2", "()Lcom/apptionlabs/meater_app/model/Probe;", "setProbe$app_playstoreLiveRelease", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "probe", "Landroid/widget/FrameLayout;", "J0", "Landroid/widget/FrameLayout;", "frameLayout", "K0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class d extends Fragment {

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: L0, reason: collision with root package name */
    public static final int f12524L0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private h communicatorCallBack;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    public X binding;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private Probe probe;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* compiled from: InstructionFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LN5/d$a;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Landroid/os/Bundle;", "a", "(Lcom/apptionlabs/meater_app/model/Probe;)Landroid/os/Bundle;", "", "KEY_COOK", "Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: N5.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Bundle a(Probe probe) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("c", probe);
            return bundle;
        }

        private Companion() {
        }
    }

    private final void C2(LayoutInflater inflater) {
        FrameLayout frameLayout = this.frameLayout;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        H2(X.c(inflater, frameLayout, false));
        Bundle bundleX = X();
        this.probe = bundleX != null ? (Probe) bundleX.getParcelable("c") : null;
        J jT = T();
        this.communicatorCallBack = jT instanceof h ? (h) jT : null;
        o oVarC2 = c2();
        C3862t.e(oVarC2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((androidx.appcompat.app.c) oVarC2).R0(A2().f9720o);
        A2().f9711f.setOnClickListener(new View.OnClickListener() { // from class: N5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.D2(this.f12522B, view);
            }
        });
        J2();
        FrameLayout frameLayout3 = this.frameLayout;
        if (frameLayout3 == null) {
            C3862t.u("frameLayout");
        } else {
            frameLayout2 = frameLayout3;
        }
        frameLayout2.addView(A2().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(d dVar, View view) {
        dVar.z2();
        dVar.E2();
    }

    private final void E2() {
        h hVar = this.communicatorCallBack;
        if (hVar != null) {
            hVar.K(this.probe, G2(), null, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(d dVar, View view) {
        dVar.E2();
    }

    public final X A2() {
        X x10 = this.binding;
        if (x10 != null) {
            return x10;
        }
        C3862t.u("binding");
        return null;
    }

    /* renamed from: B2, reason: from getter */
    public final Probe getProbe() {
        return this.probe;
    }

    public abstract MeaterTargetSetupActivity.c G2();

    public final void H2(X x10) {
        C3862t.g(x10, "<set-?>");
        this.binding = x10;
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final void I2(String string1, String string2, String string3, String string4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Typeface typefaceG = i1.h.g(g.h(), R.font.roboto_light);
        Typeface typefaceG2 = i1.h.g(g.h(), R.font.roboto_medium);
        ?? r72 = 1;
        if (string1 != null) {
            String strC = new k("\n").c(string1 + "\n", "\n\n");
            SpannableString spannableString = new SpannableString(strC);
            spannableString.setSpan(new C1598f(typefaceG2), 0, spannableString.length(), 33);
            Matcher matcher = Pattern.compile("\n\n").matcher(strC);
            while (matcher.find()) {
                spannableString.setSpan(new AbsoluteSizeSpan(10, true), matcher.start() + 1, matcher.end(), 33);
            }
            spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, spannableString.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        if (string2 != null) {
            String strC2 = new k("\n").c(string2 + "\n", "\n\n");
            SpannableString spannableString2 = new SpannableString(strC2);
            spannableString2.setSpan(new C1598f(typefaceG), 0, spannableString2.length(), 33);
            Matcher matcher2 = Pattern.compile("\n\n").matcher(strC2);
            while (matcher2.find()) {
                spannableString2.setSpan(new AbsoluteSizeSpan(8, r72), matcher2.start() + r72, matcher2.end(), 33);
                r72 = 1;
            }
            spannableString2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableString2.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        if (string3 != null) {
            String strC3 = new k("\n").c(string3 + "\n", "\n\n");
            SpannableString spannableString3 = new SpannableString(strC3);
            spannableString3.setSpan(new C1598f(typefaceG), 0, spannableString3.length(), 33);
            Matcher matcher3 = Pattern.compile("\n\n").matcher(strC3);
            while (matcher3.find()) {
                spannableString3.setSpan(new AbsoluteSizeSpan(8, true), matcher3.start() + 1, matcher3.end(), 33);
            }
            spannableString3.setSpan(new RelativeSizeSpan(1.05f), 0, spannableString3.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableString3);
        }
        if (string4 != null) {
            SpannableString spannableString4 = new SpannableString(new k("\n").c(string4 + "\n", "\n\n"));
            spannableString4.setSpan(new C1598f(typefaceG2), 0, spannableString4.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString4);
        }
        A2().f9709d.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    public abstract void J2();

    @Override // androidx.fragment.app.Fragment
    public void d1(Menu menu, MenuInflater inflater) {
        C3862t.g(menu, "menu");
        C3862t.g(inflater, "inflater");
        super.d1(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_target_setup, menu);
        o oVarT = T();
        if (oVarT == null) {
            return;
        }
        View viewInflate = oVarT.getLayoutInflater().inflate(R.layout.action_bar_menu_layout, (ViewGroup) new LinearLayout(oVarT), false);
        menu.findItem(R.id.menu_target_setup_text).setActionView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.actionbar_menu);
        textView.setText(R.string.menu_text_start_cook);
        textView.setOnClickListener(new View.OnClickListener() { // from class: N5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.F2(this.f12521B, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        m2(true);
        this.frameLayout = new FrameLayout(e2());
        C2(inflater);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            return frameLayout;
        }
        C3862t.u("frameLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean o1(MenuItem item) {
        C3862t.g(item, "item");
        if (item.getItemId() != R.id.menu_target_setup_text) {
            return false;
        }
        E2();
        return false;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        o oVarT = T();
        if (oVarT == null) {
            return;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = oVarT.getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        C2((LayoutInflater) systemService);
    }

    public abstract void z2();
}
