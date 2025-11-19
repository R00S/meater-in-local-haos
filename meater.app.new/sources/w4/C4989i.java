package w4;

import L4.f1;
import P5.Q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import ru.rambler.libs.swipe_layout.SwipeLayout;
import w4.P;

/* compiled from: DeviceVersionAdapter.java */
/* renamed from: w4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4989i extends P<P.a> {

    /* renamed from: F, reason: collision with root package name */
    private List<MEATERDevice> f51887F = new ArrayList();

    /* renamed from: G, reason: collision with root package name */
    private final Context f51888G;

    /* compiled from: DeviceVersionAdapter.java */
    /* renamed from: w4.i$a */
    class a extends P.a {

        /* renamed from: B, reason: collision with root package name */
        private f1 f51889B;

        @SuppressLint({"RestrictedApi"})
        a(C4989i c4989i, View view, f1 f1Var) {
            super(view);
            this.f51889B = f1Var;
        }

        @Override // w4.P.a
        public SwipeLayout getSwipeLayout() {
            return null;
        }
    }

    public C4989i(Context context) {
        F(true);
        this.f51888G = context;
    }

    private SpannableStringBuilder J(MEATERDevice mEATERDevice) {
        Context context;
        int i10;
        String str;
        boolean zNeedsFirmwareUpdate;
        if (mEATERDevice.getShouldShowAsConnected()) {
            context = this.f51888G;
            i10 = R.string.connected;
        } else {
            context = this.f51888G;
            i10 = R.string.not_connected_label;
        }
        String string = context.getString(i10);
        Locale locale = Locale.US;
        String str2 = String.format(locale, "%s (%s)", mEATERDevice.getDeviceName(), string);
        if (mEATERDevice.getFirmwareRevision() != null) {
            str = String.format(locale, "\n%s", mEATERDevice.getFirmwareRevision());
            zNeedsFirmwareUpdate = mEATERDevice.needsFirmwareUpdate();
        } else {
            str = null;
            zNeedsFirmwareUpdate = false;
        }
        return K(str2, str, zNeedsFirmwareUpdate);
    }

    private SpannableStringBuilder K(String str, String str2, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(1.05f), 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (str2 != null) {
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(new RelativeSizeSpan(0.95f), 0, spannableString2.length(), 0);
            if (z10) {
                spannableString2.setSpan(new ForegroundColorSpan(Q.i(R.color.primary_color)), 0, spannableString2.length(), 18);
            }
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void w(P.a aVar, int i10) {
        if (this.f51887F.size() == 0) {
            return;
        }
        ((a) aVar).f51889B.f10027b.setText(J(this.f51887F.get(i10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public P.a y(ViewGroup viewGroup, int i10) {
        LayoutInflater.from(viewGroup.getContext());
        f1 f1VarC = f1.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new a(this, f1VarC.b(), f1VarC);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void B(P.a aVar) {
        w(aVar, aVar.getBindingAdapterPosition());
    }

    public void O(List<MEATERDevice> list) {
        P(list);
    }

    public void P(List<MEATERDevice> list) {
        this.f51887F = list;
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f51887F.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int i10) {
        return super.i(i10);
    }
}
