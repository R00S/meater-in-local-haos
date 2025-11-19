package w4;

import L4.C1412y0;
import L4.G0;
import L4.e1;
import P5.Q;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.GraphSelectedData;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.CookNote;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.TemperatureRecordingFloat;
import java.util.ArrayList;
import java.util.List;
import ru.rambler.libs.swipe_layout.SwipeLayout;
import w4.P;
import x4.b;

/* compiled from: NoteListAdapter.java */
/* loaded from: classes.dex */
public class E extends RecyclerView.h<P.a> {

    /* renamed from: E, reason: collision with root package name */
    private T4.u f51835E;

    /* renamed from: F, reason: collision with root package name */
    private List<CookNote> f51836F;

    /* renamed from: G, reason: collision with root package name */
    private int f51837G = -1;

    /* renamed from: H, reason: collision with root package name */
    private HighResTemperatureLog f51838H;

    /* compiled from: NoteListAdapter.java */
    static class a extends P.a {

        /* renamed from: B, reason: collision with root package name */
        G0 f51839B;

        a(View view, G0 g02) {
            super(view);
            this.f51839B = g02;
        }

        @Override // w4.P.a
        public SwipeLayout getSwipeLayout() {
            return (SwipeLayout) this.itemView.findViewById(R.id.swipe);
        }
    }

    /* compiled from: NoteListAdapter.java */
    static class b extends P.a {

        /* renamed from: B, reason: collision with root package name */
        C1412y0 f51840B;

        b(View view, C1412y0 c1412y0) {
            super(view);
            this.f51840B = c1412y0;
        }

        @Override // w4.P.a
        public SwipeLayout getSwipeLayout() {
            return (SwipeLayout) this.itemView.findViewById(R.id.swipe);
        }
    }

    /* compiled from: NoteListAdapter.java */
    static class c extends P.a {

        /* renamed from: B, reason: collision with root package name */
        e1 f51841B;

        c(View view, e1 e1Var) {
            super(view);
            this.f51841B = e1Var;
        }

        @Override // w4.P.a
        public SwipeLayout getSwipeLayout() {
            return (SwipeLayout) this.itemView.findViewById(R.id.swipe);
        }
    }

    public E(List<CookNote> list) {
        this.f51836F = list;
        list.add(new CookNote());
        e0(list);
    }

    private void P(ImageView imageView, int i10) {
        if (i10 == 1) {
            imageView.setColorFilter(Q.i(R.color.meater_pink));
        } else if (i10 == 2) {
            imageView.setColorFilter(Q.i(R.color.meater_green));
        } else if (i10 == 3) {
            imageView.setColorFilter(Q.i(R.color.meater_orange));
        }
    }

    private void Q(boolean z10, CookNote cookNote, C1412y0 c1412y0) {
        c1412y0.f10792d.setText(cookNote.note);
        if (z10) {
            c1412y0.f10792d.setMaxLines(Integer.MAX_VALUE);
            c1412y0.f10792d.setEllipsize(null);
            c1412y0.f10793e.setImageResource(R.drawable.note_filled_circle);
        } else {
            c1412y0.f10792d.setMaxLines(2);
            c1412y0.f10792d.setEllipsize(TextUtils.TruncateAt.END);
            c1412y0.f10793e.setImageResource(R.drawable.note_hollow_circle);
        }
    }

    private void R(boolean z10, CookNote cookNote, e1 e1Var) {
        e1Var.f10006e.setText(cookNote.note);
        GraphSelectedData graphSelectedDataS = S((long) cookNote.timestamp);
        e1Var.f10011j.setText(graphSelectedDataS.timeTemperature);
        e1Var.f10003b.setText(graphSelectedDataS.ambientTemperature);
        e1Var.f10007f.setText(graphSelectedDataS.internalTemperature);
        if (z10) {
            e1Var.f10006e.setMaxLines(Integer.MAX_VALUE);
            e1Var.f10006e.setEllipsize(null);
            e1Var.f10008g.setImageResource(R.drawable.note_filled_circle);
        } else {
            e1Var.f10006e.setMaxLines(1);
            e1Var.f10006e.setEllipsize(TextUtils.TruncateAt.END);
            e1Var.f10008g.setImageResource(R.drawable.note_hollow_circle);
        }
        P(e1Var.f10008g, cookNote.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(CookNote cookNote, View view) {
        this.f51835E.e(cookNote);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(CookNote cookNote, View view) {
        T4.u uVar = this.f51835E;
        if (uVar != null) {
            uVar.e(cookNote);
        }
        P.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(CookNote cookNote, View view) {
        P.I();
        T4.u uVar = this.f51835E;
        if (uVar != null) {
            uVar.C(cookNote);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(CookNote cookNote, View view) {
        this.f51835E.e(cookNote);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(CookNote cookNote, View view) {
        T4.u uVar = this.f51835E;
        if (uVar != null) {
            uVar.e(cookNote);
        }
        P.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(CookNote cookNote, View view) {
        P.I();
        T4.u uVar = this.f51835E;
        if (uVar != null) {
            uVar.C(cookNote);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(View view) {
        x4.b.f(b.EnumC0768b.f52747y1.title, b.a.f52605C.title, "");
        T4.u uVar = this.f51835E;
        if (uVar != null) {
            uVar.w();
        }
    }

    private void e0(List<CookNote> list) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list);
        Intent intent = new Intent(MEATERIntent.INTENT_COOK_NOTE);
        intent.putParcelableArrayListExtra(MEATERIntent.EXTRA_COOK_NOTE_LIST, arrayList);
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    public GraphSelectedData S(long j10) {
        GraphSelectedData graphSelectedData = new GraphSelectedData();
        graphSelectedData.timeTemperature = P5.I.f(j10);
        TemperatureRecordingFloat temperatureRecordingFloatTemperatureRecordingForTime = this.f51838H.temperatureRecordingForTime(j10);
        graphSelectedData.internalTemperature = Temperature.displayTemperature((int) temperatureRecordingFloatTemperatureRecordingForTime.internal);
        graphSelectedData.ambientTemperature = Temperature.displayTemperature((int) temperatureRecordingFloatTemperatureRecordingForTime.ambient);
        return graphSelectedData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void w(P.a aVar, int i10) {
        final CookNote cookNote = this.f51836F.get(i10);
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            cVar.swipeLayout.setSwipeEnabled(true);
            cVar.f51841B.f10009h.setOnClickListener(new View.OnClickListener() { // from class: w4.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51950B.T(cookNote, view);
                }
            });
            R(i10 == this.f51837G, cookNote, cVar.f51841B);
            cVar.f51841B.f10012k.setOnClickListener(new View.OnClickListener() { // from class: w4.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51952B.U(cookNote, view);
                }
            });
            cVar.f51841B.f10005d.setOnClickListener(new View.OnClickListener() { // from class: w4.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51954B.V(cookNote, view);
                }
            });
            return;
        }
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            bVar.swipeLayout.setSwipeEnabled(true);
            bVar.f51840B.f10794f.setOnClickListener(new View.OnClickListener() { // from class: w4.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51828B.W(cookNote, view);
                }
            });
            Q(i10 == this.f51837G, cookNote, bVar.f51840B);
            bVar.f51840B.f10796h.setOnClickListener(new View.OnClickListener() { // from class: w4.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51830B.X(cookNote, view);
                }
            });
            bVar.f51840B.f10791c.setOnClickListener(new View.OnClickListener() { // from class: w4.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51832B.Y(cookNote, view);
                }
            });
            return;
        }
        if (aVar instanceof a) {
            a aVar2 = (a) aVar;
            aVar2.swipeLayout.setSwipeEnabled(false);
            aVar2.f51839B.f9389f.setVisibility(this.f51836F.size() > 1 ? 8 : 0);
            aVar2.f51839B.f9385b.setOnClickListener(new View.OnClickListener() { // from class: w4.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51834B.Z(view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public P.a y(ViewGroup viewGroup, int i10) {
        if (i10 == 1) {
            LayoutInflater.from(viewGroup.getContext());
            C1412y0 c1412y0C = C1412y0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            return new b(c1412y0C.b(), c1412y0C);
        }
        if (i10 == 0) {
            LayoutInflater.from(viewGroup.getContext());
            e1 e1VarC = e1.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            return new c(e1VarC.b(), e1VarC);
        }
        LayoutInflater.from(viewGroup.getContext());
        G0 g0C = G0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new a(g0C.b(), g0C);
    }

    public void c0(CookNote cookNote) {
        this.f51836F.remove(cookNote);
        n();
    }

    public boolean d0(List<CookNote> list, List<CookNote> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (CookNote cookNote : list2) {
            if (cookNote.noteID != 0) {
                for (CookNote cookNote2 : list) {
                    if (cookNote2.noteID == cookNote.noteID && (cookNote2.type != cookNote.type || !cookNote2.note.equals(cookNote.note))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void f0(T4.u uVar) {
        this.f51835E = uVar;
    }

    public void g0(HighResTemperatureLog highResTemperatureLog) {
        this.f51838H = highResTemperatureLog;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        List<CookNote> list = this.f51836F;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void h0(List<CookNote> list) {
        if (d0(this.f51836F, list)) {
            return;
        }
        this.f51836F = list;
        n();
        e0(this.f51836F);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int j(int i10) {
        if (i10 == this.f51836F.size() - 1) {
            return 2;
        }
        return this.f51836F.get(i10).type != 0 ? 0 : 1;
    }
}
