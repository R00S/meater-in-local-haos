package w4;

import L4.V0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.WiFiSSID;
import com.apptionlabs.meater_app.v3protobuf.MEATERSSIDEncryptionType;
import java.util.ArrayList;
import z4.Q;

/* compiled from: QSGNetworkListAdapter.java */
/* loaded from: classes.dex */
public class O extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name */
    private T4.t f51860E;

    /* renamed from: F, reason: collision with root package name */
    Context f51861F;

    /* renamed from: G, reason: collision with root package name */
    ArrayList<WiFiSSID> f51862G;

    /* compiled from: QSGNetworkListAdapter.java */
    public static class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name */
        V0 f51863B;

        public a(View view, V0 v02) {
            super(view);
            this.f51863B = v02;
        }
    }

    public O(Context context) {
        this.f51861F = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(WiFiSSID wiFiSSID, View view) {
        T4.t tVar = this.f51860E;
        if (tVar != null) {
            tVar.K(wiFiSSID);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void w(a aVar, int i10) {
        final WiFiSSID wiFiSSID = this.f51862G.get(i10);
        aVar.f51863B.f9684b.setText(Q.N(wiFiSSID.getName().M()));
        if (wiFiSSID.getEncryptionType() == MEATERSSIDEncryptionType.MEATER_SSID_ENCRYPTION_TYPE_NONE) {
            aVar.f51863B.f9685c.setVisibility(4);
        } else {
            aVar.f51863B.f9685c.setVisibility(0);
        }
        if (wiFiSSID.getRSSI().intValue() < -82) {
            aVar.f51863B.f9687e.setImageResource(R.drawable.ic_wifi_low);
        } else if (wiFiSSID.getRSSI().intValue() < -75) {
            aVar.f51863B.f9687e.setImageResource(R.drawable.ic_wifi_medium);
        } else {
            aVar.f51863B.f9687e.setImageResource(R.drawable.ic_wifi_high);
        }
        if (P5.Q.v(this.f51861F)) {
            aVar.f51863B.f9687e.setColorFilter(P5.Q.j(this.f51861F, R.color.black_color));
            aVar.f51863B.f9685c.setColorFilter(P5.Q.j(this.f51861F, R.color.black_color));
        }
        aVar.f51863B.f9686d.setOnClickListener(new View.OnClickListener() { // from class: w4.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51858B.J(wiFiSSID, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup viewGroup, int i10) {
        LayoutInflater.from(viewGroup.getContext());
        V0 v0C = V0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new a(v0C.b(), v0C);
    }

    public void M(T4.t tVar) {
        this.f51860E = tVar;
    }

    public void N(ArrayList<WiFiSSID> arrayList) {
        this.f51862G = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f51862G.size();
    }
}
