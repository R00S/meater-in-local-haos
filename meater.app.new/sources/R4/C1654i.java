package R4;

import L4.C1407w;
import R4.T0;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.GraphSelectedData;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.CookNote;
import com.apptionlabs.meater_app.model.NoteType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.TemperatureRecordingFloat;
import x4.b;

/* compiled from: AddNoteFragment.java */
/* renamed from: R4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1654i extends Fragment {

    /* renamed from: G0, reason: collision with root package name */
    long f14948G0;

    /* renamed from: I0, reason: collision with root package name */
    SavedCook f14950I0;

    /* renamed from: J0, reason: collision with root package name */
    CookNote f14951J0;

    /* renamed from: K0, reason: collision with root package name */
    private FrameLayout f14952K0;

    /* renamed from: M0, reason: collision with root package name */
    C1407w f14954M0;

    /* renamed from: H0, reason: collision with root package name */
    boolean f14949H0 = false;

    /* renamed from: L0, reason: collision with root package name */
    private NoteType f14953L0 = NoteType.GENERAL;

    /* compiled from: AddNoteFragment.java */
    /* renamed from: R4.i$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14956a;

        static {
            int[] iArr = new int[NoteType.values().length];
            f14956a = iArr;
            try {
                iArr[NoteType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14956a[NoteType.INTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14956a[NoteType.AMBIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14956a[NoteType.TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void F2() {
        this.f14954M0.f10687j.setOnClickListener(new View.OnClickListener() { // from class: R4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14935B.L2(view);
            }
        });
        this.f14954M0.f10688k.setOnClickListener(new View.OnClickListener() { // from class: R4.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14937B.M2(view);
            }
        });
        this.f14954M0.f10679b.setOnClickListener(new View.OnClickListener() { // from class: R4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14939B.N2(view);
            }
        });
        this.f14954M0.f10698u.setOnClickListener(new View.OnClickListener() { // from class: R4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14941B.O2(view);
            }
        });
        this.f14954M0.f10684g.setOnClickListener(new View.OnClickListener() { // from class: R4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14943B.P2(view);
            }
        });
        this.f14954M0.f10692o.setOnClickListener(new View.OnClickListener() { // from class: R4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14945B.Q2(view);
            }
        });
        this.f14954M0.f10691n.addTextChangedListener(new a());
    }

    private String G2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? b.c.f52763O.title : b.c.f52766R.title : b.c.f52765Q.title : b.c.f52764P.title;
    }

    private int H2(int i10) {
        return i10 == 0 ? NoteType.GENERAL.getValue() : i10 == 1 ? NoteType.INTERNAL.getValue() : i10 == 2 ? NoteType.AMBIENT.getValue() : i10 == 3 ? NoteType.TIME.getValue() : NoteType.GENERAL.getValue();
    }

    private void J2(View view) {
        int i10;
        String str;
        Bundle bundleX = X();
        if (bundleX != null) {
            this.f14950I0 = LocalStorage.sharedStorage().savedCookDAO().f(bundleX.getLong(MEATERIntent.EXTRA_SAVED_COOK_ID, 0L));
            this.f14951J0 = (CookNote) P5.Q.k(bundleX, "note_key", CookNote.class);
            if (T0.d.values()[bundleX.getInt(MEATERIntent.EXTRA_GRAPH_CONTEXT)] == T0.d.COOK_IN_PROGRESS) {
                Probe probe = (Probe) P5.Q.k(bundleX, MEATERIntent.EXTRA_PROBE, Probe.class);
                SavedCook savedCook = (probe == null || probe.getSavedCook() == null || probe.getSavedCook().getCookTime() <= 0) ? this.f14950I0 : probe.getSavedCook();
                this.f14950I0 = savedCook;
                this.f14948G0 = probe != null ? probe.cookTimeElapsed() : savedCook.getCookTime();
            }
        }
        CookNote cookNote = this.f14951J0;
        int i11 = 0;
        if (cookNote == null || (i10 = cookNote.type) == 0) {
            i10 = 0;
        }
        ConstraintLayout constraintLayout = this.f14954M0.f10695r;
        if (i10 != 0 && this.f14948G0 != 0) {
            i11 = 8;
        }
        constraintLayout.setVisibility(i11);
        CookNote cookNote2 = this.f14951J0;
        if (cookNote2 != null && (str = cookNote2.note) != null) {
            this.f14954M0.f10691n.setText(str);
        }
        if (i10 != 0 && this.f14948G0 == 0) {
            U2(i10);
            double d10 = this.f14951J0.timestamp;
            this.f14948G0 = (long) d10;
            V2(I2((long) d10));
        }
        if (this.f14949H0) {
            this.f14953L0 = NoteType.GENERAL;
        }
        F2();
        X2();
        S2();
        this.f14952K0.addView(view);
    }

    private void K2() {
        CookNote cookNote = new CookNote();
        cookNote.noteID = cookNote.generateNoteID();
        cookNote.cookId = this.f14950I0.cookIDString();
        cookNote.noteCookId = this.f14950I0.getCookID();
        cookNote.updatedAt = System.currentTimeMillis();
        cookNote.needsUploading = true;
        NoteType noteType = this.f14953L0;
        if (noteType != NoteType.GENERAL) {
            cookNote.type = H2(noteType.ordinal());
            cookNote.timestamp = this.f14948G0;
        }
        cookNote.note = this.f14954M0.f10691n.getText() != null ? this.f14954M0.f10691n.getText().toString() : "";
        LocalStorage.sharedStorage().cookNoteDAO().g(cookNote);
        F4.f.f4544f.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L2(View view) {
        this.f14953L0 = NoteType.GENERAL;
        X2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(View view) {
        this.f14953L0 = NoteType.INTERNAL;
        long j10 = this.f14948G0;
        if (j10 <= 0) {
            T2();
        } else {
            V2(I2(j10));
            X2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N2(View view) {
        this.f14953L0 = NoteType.AMBIENT;
        long j10 = this.f14948G0;
        if (j10 <= 0) {
            T2();
        } else {
            V2(I2(j10));
            X2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O2(View view) {
        this.f14953L0 = NoteType.TIME;
        long j10 = this.f14948G0;
        if (j10 <= 0) {
            T2();
        } else {
            V2(I2(j10));
            X2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2(View view) {
        T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q2(View view) {
        if (this.f14954M0.f10691n.getText() == null || this.f14954M0.f10691n.getText().toString().isEmpty()) {
            return;
        }
        x4.b.f(b.EnumC0768b.f52749z1.title, b.a.f52605C.title, G2(this.f14953L0.ordinal()));
        CookNote cookNote = this.f14951J0;
        if (cookNote == null) {
            K2();
        } else {
            W2(cookNote);
        }
        if (T() != null) {
            T().getOnBackPressedDispatcher().l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R2(String str, Bundle bundle) {
        this.f14949H0 = false;
        this.f14948G0 = bundle.getLong("timeStamp", 0L);
        NoteType noteType = NoteType.values()[bundle.getInt("selectedTab")];
        if (this.f14948G0 <= 0) {
            this.f14953L0 = NoteType.GENERAL;
        } else {
            this.f14953L0 = noteType;
        }
        X2();
        V2(I2(this.f14948G0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2() {
        Context contextZ = Z();
        if (contextZ == null) {
            return;
        }
        boolean zEquals = this.f14954M0.f10691n.getText().toString().equals("");
        if (P5.Q.v(contextZ)) {
            P5.S.h(this.f14954M0.f10692o, R.color.white, true);
        } else {
            this.f14954M0.f10692o.setBackgroundResource(!zEquals ? R.drawable.rounder_red_border_background : R.drawable.rounded_corner_background);
        }
        this.f14954M0.f10692o.setTextColor(P5.Q.j(contextZ, !zEquals ? R.color.primary_white_toggle_color : R.color.grey_e));
    }

    private void T2() {
        M m10 = new M();
        Bundle bundle = new Bundle();
        bundle.putLong(MEATERIntent.EXTRA_SAVED_COOK_ID, this.f14950I0.getCookID());
        bundle.putInt("selectedTab", this.f14953L0.ordinal());
        bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, 1);
        bundle.putLong("selectedTimeStamp", this.f14948G0);
        bundle.putParcelable(MEATERIntent.EXTRA_PROBE, (Probe) P5.Q.k(X(), MEATERIntent.EXTRA_PROBE, Probe.class));
        bundle.putInt(MEATERIntent.EXTRA_GRAPH_CONTEXT, X() != null ? X().getInt(MEATERIntent.EXTRA_GRAPH_CONTEXT) : 0);
        m10.k2(bundle);
        androidx.fragment.app.C cR = o0().r();
        cR.u(R.id.baseLayoutContainer, m10, "graphSelect").h("");
        cR.B(4097);
        cR.j();
        this.f14949H0 = true;
    }

    private void U2(int i10) {
        if (i10 == 0) {
            this.f14953L0 = NoteType.GENERAL;
        }
        if (i10 == 1) {
            this.f14953L0 = NoteType.INTERNAL;
        } else if (i10 == 2) {
            this.f14953L0 = NoteType.AMBIENT;
        } else if (i10 == 3) {
            this.f14953L0 = NoteType.TIME;
        }
    }

    private void V2(GraphSelectedData graphSelectedData) {
        if (graphSelectedData != null) {
            this.f14954M0.f10690m.setText(graphSelectedData.internalTemperature);
            this.f14954M0.f10681d.setText(graphSelectedData.ambientTemperature);
            this.f14954M0.f10700w.setText(graphSelectedData.timeTemperature);
        } else {
            this.f14954M0.f10690m.setText("-");
            this.f14954M0.f10681d.setText("-");
            this.f14954M0.f10700w.setText("-");
        }
    }

    private void W2(CookNote cookNote) {
        cookNote.updatedAt = System.currentTimeMillis();
        cookNote.needsUploading = true;
        NoteType noteType = this.f14953L0;
        if (noteType != NoteType.GENERAL) {
            cookNote.type = H2(noteType.ordinal());
            long j10 = this.f14948G0;
            if (j10 != 0) {
                cookNote.timestamp = j10;
            }
        }
        cookNote.note = this.f14954M0.f10691n.getText() != null ? this.f14954M0.f10691n.getText().toString() : "";
        LocalStorage.sharedStorage().cookNoteDAO().d(cookNote);
        F4.f.f4544f.w();
    }

    private void X2() {
        if (Z() == null) {
            return;
        }
        this.f14954M0.f10689l.setVisibility(8);
        this.f14954M0.f10680c.setVisibility(8);
        this.f14954M0.f10699v.setVisibility(8);
        this.f14954M0.f10679b.setBackground(null);
        this.f14954M0.f10679b.setTextColor(P5.Q.j(Z(), R.color.meater_green));
        this.f14954M0.f10688k.setBackground(null);
        this.f14954M0.f10688k.setTextColor(P5.Q.j(Z(), R.color.meater_pink));
        this.f14954M0.f10687j.setBackground(null);
        this.f14954M0.f10698u.setBackground(null);
        this.f14954M0.f10698u.setTextColor(P5.Q.j(Z(), R.color.meater_orange));
        this.f14954M0.f10695r.setVisibility(0);
        this.f14954M0.f10687j.setTextColor(P5.Q.j(Z(), R.color.grey_9));
        View view = this.f14954M0.f10685h;
        NoteType noteType = this.f14953L0;
        view.setVisibility((noteType == NoteType.GENERAL || noteType == NoteType.INTERNAL) ? 4 : 0);
        View view2 = this.f14954M0.f10693p;
        NoteType noteType2 = this.f14953L0;
        view2.setVisibility((noteType2 == NoteType.INTERNAL || noteType2 == NoteType.AMBIENT) ? 4 : 0);
        View view3 = this.f14954M0.f10697t;
        NoteType noteType3 = this.f14953L0;
        view3.setVisibility((noteType3 == NoteType.AMBIENT || noteType3 == NoteType.TIME) ? 4 : 0);
        int i10 = b.f14956a[this.f14953L0.ordinal()];
        if (i10 == 1) {
            this.f14954M0.f10695r.setVisibility(8);
            this.f14954M0.f10687j.setTextColor(-1);
            this.f14954M0.f10687j.setBackgroundResource(R.drawable.dark_grey_rounded_bg);
        } else if (i10 == 2) {
            this.f14954M0.f10688k.setBackgroundResource(R.drawable.rounded_pink_button_bg);
            this.f14954M0.f10688k.setTextColor(-1);
            this.f14954M0.f10689l.setVisibility(0);
        } else if (i10 == 3) {
            this.f14954M0.f10679b.setBackgroundResource(R.drawable.rounded_green_button_bg);
            this.f14954M0.f10679b.setTextColor(-1);
            this.f14954M0.f10680c.setVisibility(0);
        } else if (i10 == 4) {
            this.f14954M0.f10698u.setBackgroundResource(R.drawable.rounded_orange_button_bg);
            this.f14954M0.f10698u.setTextColor(-1);
            this.f14954M0.f10699v.setVisibility(0);
        }
        V2(I2(this.f14948G0));
    }

    public GraphSelectedData I2(long j10) {
        GraphSelectedData graphSelectedData = new GraphSelectedData();
        graphSelectedData.timeTemperature = P5.I.f(j10);
        TemperatureRecordingFloat temperatureRecordingFloatTemperatureRecordingForTime = this.f14950I0.getTemperatureLog().temperatureRecordingForTime(j10);
        graphSelectedData.internalTemperature = Temperature.displayTemperature((int) temperatureRecordingFloatTemperatureRecordingForTime.internal);
        graphSelectedData.ambientTemperature = Temperature.displayTemperature((int) temperatureRecordingFloatTemperatureRecordingForTime.ambient);
        return graphSelectedData;
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
        c2().w0().I1("requestKey", this, new J1.o() { // from class: R4.b
            @Override // J1.o
            public final void a(String str, Bundle bundle2) {
                this.f14933a.R2(str, bundle2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(e2());
        this.f14952K0 = frameLayout;
        C1407w c1407wC = C1407w.c(layoutInflater, frameLayout, false);
        this.f14954M0 = c1407wC;
        J2(c1407wC.b());
        return this.f14952K0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14952K0.removeAllViews();
        if (T() == null) {
            return;
        }
        C1407w c1407wC = C1407w.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f14954M0 = c1407wC;
        J2(c1407wC.b());
    }

    /* compiled from: AddNoteFragment.java */
    /* renamed from: R4.i$a */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C1654i.this.S2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
