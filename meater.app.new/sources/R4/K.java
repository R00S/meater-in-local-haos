package R4;

import E4.a;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import androidx.appcompat.app.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.CookFeedBackActivity;
import com.apptionlabs.meater_app.cloud.requests.CookMethod;
import com.apptionlabs.meater_app.cloud.requests.PurchaseChannel;
import com.apptionlabs.meater_app.data.Data;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.views.C2421z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: FeedBackStoreViewFragment.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001=B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J%\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00072\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u000bH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b*\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010)¨\u0006>"}, d2 = {"LR4/K;", "Landroidx/fragment/app/Fragment;", "LE4/a$d;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "E2", "(Landroid/view/View;)V", "D2", "", "Lcom/apptionlabs/meater_app/cloud/requests/PurchaseChannel;", "purchaseChannels", "", "C2", "(Ljava/util/List;)Ljava/util/List;", "H2", "K2", "(Lcom/apptionlabs/meater_app/cloud/requests/PurchaseChannel;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "success", "Lcom/apptionlabs/meater_app/data/Data;", "data", "H", "(ZLcom/apptionlabs/meater_app/data/Data;)V", "Lcom/apptionlabs/meater_app/cloud/requests/CookMethod;", "cookMethods", "n", "(Ljava/util/List;)V", "I", "LL4/S;", "G0", "LL4/S;", "getBinding", "()LL4/S;", "setBinding", "(LL4/S;)V", "binding", "Landroid/widget/FrameLayout;", "H0", "Landroid/widget/FrameLayout;", "mFrameLayout", "I0", "Ljava/util/List;", "getPurchaseChannels", "()Ljava/util/List;", "setPurchaseChannels", "J0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class K extends Fragment implements a.d {

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: K0, reason: collision with root package name */
    public static final int f14827K0 = 8;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private L4.S binding;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout mFrameLayout;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private List<PurchaseChannel> purchaseChannels;

    /* compiled from: FeedBackStoreViewFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LR4/K$a;", "", "<init>", "()V", "LR4/K;", "a", "()LR4/K;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.K$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final K a() {
            return new K();
        }

        private Companion() {
        }
    }

    private final List<String> C2(List<PurchaseChannel> purchaseChannels) {
        ArrayList arrayList = new ArrayList();
        Iterator<PurchaseChannel> it = purchaseChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().name);
        }
        return arrayList;
    }

    private final void D2() {
        E4.a aVar = new E4.a();
        aVar.e(this);
        aVar.b();
    }

    private final void E2(View view) {
        androidx.fragment.app.o oVarT = T();
        if (oVarT == null) {
            return;
        }
        SavedCook savedCookY0 = ((CookFeedBackActivity) oVarT).Y0();
        C3862t.f(savedCookY0, "getSelectedCook(...)");
        L4.S s10 = this.binding;
        C3862t.d(s10);
        s10.f9593d.f9401i.setRating(savedCookY0.getFeedback());
        L4.S s11 = this.binding;
        C3862t.d(s11);
        s11.f9593d.f9396d.setText(savedCookY0.meatNameForDisplay());
        L4.S s12 = this.binding;
        C3862t.d(s12);
        s12.f9593d.f9397e.setText(savedCookY0.getDateInStringFormat());
        L4.S s13 = this.binding;
        C3862t.d(s13);
        s13.f9593d.f9400h.setText(R.string.where_did_you_purchase_your_meater);
        D2();
        L4.S s14 = this.binding;
        C3862t.d(s14);
        s14.f9592c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: R4.F
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i10, long j10) {
                K.F2(this.f14816B, adapterView, view2, i10, j10);
            }
        });
        FrameLayout frameLayout = this.mFrameLayout;
        C3862t.d(frameLayout);
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(K k10, AdapterView adapterView, View view, int i10, long j10) {
        C3862t.d(k10.purchaseChannels);
        if (i10 == r1.size() - 1) {
            List<PurchaseChannel> list = k10.purchaseChannels;
            C3862t.d(list);
            k10.K2(list.get(i10));
        } else {
            androidx.fragment.app.o oVarC2 = k10.c2();
            C3862t.e(oVarC2, "null cannot be cast to non-null type com.apptionlabs.meater_app.activities.CookFeedBackActivity");
            List<PurchaseChannel> list2 = k10.purchaseChannels;
            C3862t.d(list2);
            ((CookFeedBackActivity) oVarC2).a1(list2.get(i10), null);
        }
    }

    public static final K G2() {
        return INSTANCE.a();
    }

    private final void H2() {
        C2421z.Companion companion = C2421z.INSTANCE;
        androidx.fragment.app.o oVarC2 = c2();
        C3862t.f(oVarC2, "requireActivity(...)");
        String strA0 = A0(R.string.title_error);
        C3862t.f(strA0, "getString(...)");
        String strA02 = A0(R.string.failed_to_load_purchase_channels);
        C3862t.f(strA02, "getString(...)");
        String strA03 = A0(R.string.try_again_text);
        C3862t.f(strA03, "getString(...)");
        C2421z.AlertPair alertPair = new C2421z.AlertPair(strA03, new T4.e() { // from class: R4.I
            @Override // T4.e
            public final void a() {
                K.I2(this.f14823a);
            }
        });
        String strA04 = A0(R.string.cancel_label);
        C3862t.f(strA04, "getString(...)");
        companion.e(oVarC2, strA0, strA02, false, alertPair, new C2421z.AlertPair(strA04, new T4.e() { // from class: R4.J
            @Override // T4.e
            public final void a() {
                K.J2();
            }
        }), null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(K k10) {
        L4.S s10 = k10.binding;
        C3862t.d(s10);
        s10.f9591b.setVisibility(8);
        L4.S s11 = k10.binding;
        C3862t.d(s11);
        s11.f9593d.f9398f.setVisibility(8);
        k10.D2();
    }

    private final void K2(final PurchaseChannel purchaseChannels) {
        final androidx.fragment.app.o oVarT = T();
        if (oVarT != null) {
            b.a aVar = new b.a(oVarT);
            final EditText editText = new EditText(oVarT);
            aVar.f(R.string.your_purchase_method);
            aVar.setView(editText);
            aVar.setPositiveButton(R.string.yes_alert_button_text, new DialogInterface.OnClickListener() { // from class: R4.G
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    K.L2(editText, oVarT, purchaseChannels, dialogInterface, i10);
                }
            });
            aVar.setNegativeButton(R.string.cancel_label, new DialogInterface.OnClickListener() { // from class: R4.H
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    K.M2(dialogInterface, i10);
                }
            });
            aVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(EditText editText, androidx.fragment.app.o oVar, PurchaseChannel purchaseChannel, DialogInterface dialogInterface, int i10) {
        String string = editText.getText().toString();
        C3862t.e(oVar, "null cannot be cast to non-null type com.apptionlabs.meater_app.activities.CookFeedBackActivity");
        ((CookFeedBackActivity) oVar).a1(purchaseChannel, string);
    }

    @Override // E4.a.d
    public void I(List<PurchaseChannel> purchaseChannels) {
        androidx.fragment.app.o oVarT = T();
        if (oVarT == null || oVarT.isFinishing()) {
            return;
        }
        L4.S s10 = this.binding;
        C3862t.d(s10);
        s10.f9591b.setVisibility(8);
        L4.S s11 = this.binding;
        C3862t.d(s11);
        s11.f9593d.f9398f.setVisibility(8);
        if (purchaseChannels == null) {
            H2();
            return;
        }
        this.purchaseChannels = purchaseChannels;
        L4.S s12 = this.binding;
        C3862t.d(s12);
        s12.f9592c.setAdapter((ListAdapter) new ArrayAdapter(oVarT, android.R.layout.simple_list_item_1, C2(purchaseChannels)));
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(c2());
        this.mFrameLayout = frameLayout;
        L4.S sC = L4.S.c(inflater, frameLayout, false);
        this.binding = sC;
        C3862t.d(sC);
        ConstraintLayout constraintLayoutB = sC.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        E2(constraintLayoutB);
        FrameLayout frameLayout2 = this.mFrameLayout;
        C3862t.d(frameLayout2);
        return frameLayout2;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        androidx.fragment.app.o oVarT = T();
        if (oVarT == null) {
            return;
        }
        FrameLayout frameLayout = this.mFrameLayout;
        C3862t.d(frameLayout);
        frameLayout.removeAllViews();
        Object systemService = oVarT.getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        L4.S sC = L4.S.c((LayoutInflater) systemService, this.mFrameLayout, false);
        this.binding = sC;
        C3862t.d(sC);
        ConstraintLayout constraintLayoutB = sC.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        E2(constraintLayoutB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2() {
    }

    @Override // E4.a.d
    public void n(List<CookMethod> cookMethods) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(DialogInterface dialogInterface, int i10) {
    }

    @Override // E4.a.d
    public void H(boolean success, Data data) {
    }
}
