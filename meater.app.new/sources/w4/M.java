package w4;

import P5.Q;
import android.view.View;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.SavedCook;
import w4.AbstractC4987g;
import w4.P;

/* compiled from: PreviousCookRecyclerAdapter.java */
/* loaded from: classes.dex */
public class M extends AbstractC4987g {

    /* renamed from: H, reason: collision with root package name */
    private T4.r f51857H;

    public M(boolean z10) {
        this.f51883G = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(SavedCook savedCook, AbstractC4987g.a aVar, View view) {
        T4.r rVar = this.f51857H;
        if (rVar != null) {
            rVar.o(savedCook, aVar.getLayoutPosition());
        }
        P.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(SavedCook savedCook, View view) {
        T4.r rVar = this.f51857H;
        if (rVar != null) {
            rVar.j(savedCook);
        }
        P.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(SavedCook savedCook, View view) {
        P.I();
        T4.r rVar = this.f51857H;
        if (rVar != null) {
            rVar.q(savedCook);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void w(P.a aVar, int i10) {
        if (aVar instanceof AbstractC4987g.b) {
            AbstractC4987g.b bVar = (AbstractC4987g.b) aVar;
            bVar.swipeLayout.setSwipeEnabled(false);
            int iH = h() - 1;
            if (iH == 0) {
                bVar.f51885B.f9415d.setVisibility(8);
                return;
            } else if (iH == 1) {
                bVar.f51885B.f9415d.setVisibility(0);
                bVar.f51885B.f9416e.setText(R.string.one_previous_cook_label);
                return;
            } else {
                bVar.f51885B.f9415d.setVisibility(0);
                bVar.f51885B.f9416e.setText(x4.g.h().getResources().getString(R.string.no_of_previous_cooks_label, Integer.valueOf(iH)));
                return;
            }
        }
        if (aVar instanceof AbstractC4987g.a) {
            final AbstractC4987g.a aVar2 = (AbstractC4987g.a) aVar;
            aVar2.swipeLayout.setSwipeEnabled(this.f51883G);
            final SavedCook savedCook = this.f51882F.get(i10 - 1);
            aVar2.f51884B.f9435o.setColor(savedCook.meatColor());
            aVar2.f51884B.f9426f.setImageResource(savedCook.getMeatImage());
            aVar2.f51884B.f9427g.setText(savedCook.meatNameForCookList());
            aVar2.f51884B.f9428h.setText(savedCook.cookNameForCookList());
            aVar2.f51884B.f9433m.setText(savedCook.getFormattedPeakTemp());
            aVar2.f51884B.f9433m.setTextColor(savedCook.getCookTextColor());
            aVar2.f51884B.f9437q.setText(savedCook.getFormattedTargetTemp());
            aVar2.f51884B.f9429i.setText(savedCook.getDateInStringFormat());
            aVar2.f51884B.f9439s.setText(savedCook.getFormattedTimeText());
            aVar2.f51884B.f9423c.setVisibility(savedCook.totalAlarms() > 0 ? 0 : 8);
            aVar2.f51884B.f9422b.setText(savedCook.getAlertCountText());
            aVar2.f51884B.f9431k.setVisibility(savedCook.isCookHaveNote() ? 0 : 8);
            aVar2.f51884B.f9441u.setImageResource(savedCook.getFavouriteBtnImage());
            int cookTextColor = savedCook.getCookTextColor();
            if (cookTextColor != -1) {
                aVar2.f51884B.f9432l.setTextColor(Q.i(cookTextColor));
                aVar2.f51884B.f9433m.setTextColor(Q.i(cookTextColor));
            }
            aVar2.f51884B.f9434n.setOnClickListener(new View.OnClickListener() { // from class: w4.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51850B.Q(savedCook, aVar2, view);
                }
            });
            aVar2.f51884B.f9441u.setOnClickListener(new View.OnClickListener() { // from class: w4.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51853B.R(savedCook, view);
                }
            });
            aVar2.f51884B.f9430j.setOnClickListener(new View.OnClickListener() { // from class: w4.L
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51855B.S(savedCook, view);
                }
            });
        }
    }

    public void U(T4.r rVar) {
        this.f51857H = rVar;
    }
}
