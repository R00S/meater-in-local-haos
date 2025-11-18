package w4;

import L4.C1411y;
import P5.Q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apptionlabs.meater_app.data.AlertViewHolder;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import java.util.ArrayList;
import java.util.List;
import w4.P;

/* compiled from: AlertRecyclerViewAdapter.java */
/* renamed from: w4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4984d extends P<AlertViewHolder> {

    /* renamed from: F, reason: collision with root package name */
    private final List<Alert> f51873F = new ArrayList();

    /* renamed from: G, reason: collision with root package name */
    private T4.w f51874G;

    /* renamed from: H, reason: collision with root package name */
    private Probe f51875H;

    /* renamed from: I, reason: collision with root package name */
    C1411y f51876I;

    public C4984d() {
        F(true);
    }

    private boolean O(int i10) {
        return Q.y(i10, this.f51873F.size()) && this.f51873F.get(i10).getType() != AlarmType.ALARM_TYPE_ESTIMATE_READY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(int i10, P.a aVar, View view) {
        if (this.f51874G != null && O(i10)) {
            this.f51874G.y(aVar.getBindingAdapterPosition());
        }
        P.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(int i10, P.a aVar, View view) {
        if (this.f51874G != null && O(i10)) {
            this.f51874G.y(aVar.getBindingAdapterPosition());
        }
        P.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(P.a aVar, View view) {
        T4.w wVar = this.f51874G;
        if (wVar != null) {
            wVar.a(aVar.getBindingAdapterPosition());
        }
        P.I();
    }

    public void M(Alert alert) {
        this.f51873F.add(alert);
    }

    public void N(int i10) {
        if (Q.y(i10, this.f51873F.size())) {
            this.f51873F.remove(i10);
            u(i10);
            q(i10, this.f51873F.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void w(final P.a aVar, final int i10) {
        AlertViewHolder alertViewHolder = (AlertViewHolder) aVar;
        alertViewHolder.swipeLayout.setSwipeEnabled(true);
        Alert alert = this.f51873F.get(i10);
        alertViewHolder.adapterBinding.f10782g.setVisibility(this.f51875H.appearsToHaveCookInProgress() ? 0 : 8);
        alertViewHolder.adapterBinding.f10779d.setText(alert.shortDescription());
        alertViewHolder.adapterBinding.f10781f.setText(this.f51875H.currentStateDescriptionForAlertType(alert.getType() != null ? alert.getType() : AlarmType.ALARM_TYPE_MIN_AMBIENT, alert));
        alertViewHolder.adapterBinding.f10782g.setVisibility(this.f51875H.appearsToHaveCookInProgress() ? 0 : 8);
        alertViewHolder.adapterBinding.f10777b.setOnClickListener(new View.OnClickListener() { // from class: w4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51865B.P(i10, aVar, view);
            }
        });
        alertViewHolder.adapterBinding.f10786k.setOnClickListener(new View.OnClickListener() { // from class: w4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51868B.Q(i10, aVar, view);
            }
        });
        alertViewHolder.adapterBinding.f10785j.setOnClickListener(new View.OnClickListener() { // from class: w4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51871B.R(aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public AlertViewHolder y(ViewGroup viewGroup, int i10) {
        LayoutInflater.from(viewGroup.getContext());
        this.f51876I = C1411y.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new AlertViewHolder(this.f51876I.b(), this.f51876I);
    }

    public void U(List<Alert> list, Probe probe) {
        this.f51873F.clear();
        this.f51873F.addAll(list);
        this.f51875H = probe;
    }

    public void V(T4.w wVar) {
        this.f51874G = wVar;
    }

    public void W(Alert alert, int i10) {
        if (Q.y(i10, this.f51873F.size())) {
            this.f51873F.set(i10, alert);
            q(i10, this.f51873F.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f51873F.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int i10) {
        return i10;
    }
}
