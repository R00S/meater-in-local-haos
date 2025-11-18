package w4;

import P5.Q;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.DeviceViewHolder;
import com.apptionlabs.meater_app.model.MEATERDevice;
import g1.C3377a;
import java.util.ArrayList;
import w4.P;

/* compiled from: DevicesRecyclerAdapter.java */
/* renamed from: w4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4992l extends P<DeviceViewHolder> {

    /* renamed from: F, reason: collision with root package name */
    private final ArrayList<MEATERDevice> f51894F;

    /* renamed from: G, reason: collision with root package name */
    private T4.j f51895G;

    /* renamed from: H, reason: collision with root package name */
    private final a f51896H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f51897I;

    /* compiled from: DevicesRecyclerAdapter.java */
    /* renamed from: w4.l$a */
    public enum a {
        PAIRED_DEVICES_LIST,
        NEARBY_DEVICES_LIST
    }

    public C4992l(ArrayList<MEATERDevice> arrayList, a aVar, boolean z10) {
        this.f51894F = arrayList;
        this.f51896H = aVar;
        this.f51897I = z10;
        F(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(P.a aVar, View view) {
        P.I();
        T4.j jVar = this.f51895G;
        if (jVar != null) {
            jVar.L(this.f51896H, aVar.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(P.a aVar, View view) {
        T4.j jVar = this.f51895G;
        if (jVar != null) {
            jVar.a(aVar.getBindingAdapterPosition());
        }
    }

    private boolean R(MEATERDevice mEATERDevice) {
        return mEATERDevice.isPaired();
    }

    private boolean S(MEATERDevice mEATERDevice) {
        return mEATERDevice.getParentDevice() != null && mEATERDevice.getParentDevice().isPaired();
    }

    private boolean T(MEATERDevice mEATERDevice) {
        if (this.f51897I) {
            return mEATERDevice.isPaired();
        }
        if (mEATERDevice.isMEATERBlock() && mEATERDevice.needsFirmwareUpdate()) {
            return false;
        }
        if (mEATERDevice.isMEATERBlock() && mEATERDevice.isInWiFiSetupMode()) {
            return false;
        }
        if (mEATERDevice.isMEATERPlus() && mEATERDevice.needsFirmwareUpdate()) {
            return false;
        }
        return mEATERDevice.isPaired();
    }

    public void L(int i10) {
        this.f51894F.remove(i10);
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void w(final P.a aVar, int i10) {
        DeviceViewHolder deviceViewHolder = (DeviceViewHolder) aVar;
        MEATERDevice mEATERDevice = this.f51894F.get(i10);
        boolean z10 = true;
        deviceViewHolder.swipeLayout.setSwipeEnabled(!this.f51896H.equals(a.NEARBY_DEVICES_LIST) && R(mEATERDevice));
        deviceViewHolder.adapterBinding.f9515d.setVisibility(T(mEATERDevice) ? 0 : 8);
        deviceViewHolder.adapterBinding.f9516e.setVisibility(S(mEATERDevice) ? 0 : 8);
        deviceViewHolder.adapterBinding.f9518g.setVisibility(S(mEATERDevice) ? 4 : 0);
        boolean shouldShowAsConnected = mEATERDevice.isPaired() ? mEATERDevice.getShouldShowAsConnected() : mEATERDevice.isOnline();
        boolean shouldShowAsConnected2 = mEATERDevice.isPaired() ? mEATERDevice.getShouldShowAsConnected() : mEATERDevice.isMEATERBlock() && mEATERDevice.appearsToBeAdvertisingBLE();
        if (!shouldShowAsConnected && !shouldShowAsConnected2) {
            z10 = false;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C3377a.c(x4.g.h(), R.color.primary_color));
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(C3377a.c(x4.g.h(), R.color.primary_color_faded));
        deviceViewHolder.adapterBinding.f9518g.setImageResource(mEATERDevice.getImageResource());
        deviceViewHolder.adapterBinding.f9518g.setColorFilter(z10 ? R.color.black_color : R.color.grey_e);
        deviceViewHolder.adapterBinding.f9513b.setVisibility(mEATERDevice.hasLowBattery() ? 0 : 8);
        deviceViewHolder.adapterBinding.f9516e.setColorFilter(z10 ? R.color.black_color : R.color.grey_e);
        AppCompatTextView appCompatTextView = deviceViewHolder.adapterBinding.f9521j;
        if (!z10) {
            colorStateListValueOf = colorStateListValueOf2;
        }
        appCompatTextView.setBackgroundTintList(colorStateListValueOf);
        deviceViewHolder.adapterBinding.f9520i.setTextColor(z10 ? Q.i(R.color.black_color) : Q.i(R.color.grey_e));
        deviceViewHolder.adapterBinding.f9517f.setTextColor(z10 ? Q.i(R.color.black_color) : Q.i(R.color.grey_e));
        deviceViewHolder.adapterBinding.f9517f.setText(mEATERDevice.getConnectionText());
        deviceViewHolder.adapterBinding.f9520i.setText(mEATERDevice.listName());
        deviceViewHolder.adapterBinding.f9521j.setText(mEATERDevice.numberStringForDisplay() != null ? mEATERDevice.numberStringForDisplay() : x4.g.h().getString(R.string.connect_label));
        deviceViewHolder.adapterBinding.f9521j.setVisibility(mEATERDevice.numberStringForDisplay() == null ? 8 : 0);
        deviceViewHolder.adapterBinding.f9524m.setOnClickListener(new View.OnClickListener() { // from class: w4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51890B.M(aVar, view);
            }
        });
        deviceViewHolder.adapterBinding.f9519h.setOnClickListener(new View.OnClickListener() { // from class: w4.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51892B.N(aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public DeviceViewHolder y(ViewGroup viewGroup, int i10) {
        LayoutInflater.from(viewGroup.getContext());
        L4.M mC = L4.M.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new DeviceViewHolder(mC.b(), mC);
    }

    public void Q(T4.j jVar) {
        this.f51895G = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f51894F.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int i10) {
        return i10;
    }
}
