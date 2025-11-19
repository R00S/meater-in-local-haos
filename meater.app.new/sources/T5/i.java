package T5;

import P5.I;
import P5.Q;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;

/* compiled from: DialViewModel.java */
/* loaded from: classes2.dex */
public class i extends h {

    /* renamed from: e, reason: collision with root package name */
    private int f16082e;

    /* renamed from: f, reason: collision with root package name */
    private int f16083f;

    /* renamed from: g, reason: collision with root package name */
    private int f16084g;

    /* renamed from: h, reason: collision with root package name */
    private int f16085h;

    /* renamed from: i, reason: collision with root package name */
    private int f16086i;

    /* renamed from: j, reason: collision with root package name */
    private int f16087j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16088k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16089l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16090m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16091n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f16092o;

    /* renamed from: p, reason: collision with root package name */
    private String f16093p;

    /* renamed from: q, reason: collision with root package name */
    private String f16094q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f16095r;

    /* renamed from: t, reason: collision with root package name */
    private String f16097t;

    /* renamed from: u, reason: collision with root package name */
    private String f16098u;

    /* renamed from: y, reason: collision with root package name */
    private boolean f16102y;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16096s = true;

    /* renamed from: v, reason: collision with root package name */
    private b f16099v = b.DialTimeModeNone;

    /* renamed from: w, reason: collision with root package name */
    boolean f16100w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f16101x = 0;

    /* compiled from: DialViewModel.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16103a;

        static {
            int[] iArr = new int[DeviceCookState.values().length];
            f16103a = iArr;
            try {
                iArr[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16103a[DeviceCookState.COOK_STATE_OVERCOOK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: DialViewModel.java */
    public enum b {
        DialTimeModeNone,
        DialTimeModeEstimatingTimeRemaining,
        DialTimeModeTimeRemaining,
        DialTimeModeTotalTimeRemaining,
        DialTimeModeTimeSoFar;


        /* renamed from: G, reason: collision with root package name */
        public static final b[] f16109G = values();

        public b j() {
            b[] bVarArr = f16109G;
            return bVarArr[(ordinal() + 1) % bVarArr.length];
        }
    }

    public i(Context context) {
        this.f16092o = context;
    }

    private boolean W(int i10) {
        if (i10 == -1) {
            return false;
        }
        L(i10);
        return true;
    }

    private boolean X(int i10) {
        if (i10 == -1 || i10 <= 60) {
            return false;
        }
        N(i10);
        return true;
    }

    private CharSequence r(int i10) {
        long[] jArrU = Q.u(Math.max(60, i10));
        long j10 = jArrU[0];
        long j11 = jArrU[1];
        SpannableString spannableString = new SpannableString(String.valueOf(j10).trim());
        spannableString.setSpan(new RelativeSizeSpan(1.15f), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(x4.g.h().getString(R.string.time_string_h));
        spannableString2.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString2.length(), 0);
        SpannableString spannableString3 = new SpannableString(String.valueOf(j11));
        spannableString3.setSpan(new RelativeSizeSpan(1.15f), 0, spannableString3.length(), 0);
        SpannableString spannableString4 = new SpannableString("m");
        spannableString4.setSpan(new RelativeSizeSpan(0.9f), 0, spannableString4.length(), 0);
        return (j10 <= 0 || j11 <= 0) ? j10 > 0 ? TextUtils.concat(spannableString, spannableString2) : TextUtils.concat(spannableString3, spannableString4) : TextUtils.concat(spannableString, spannableString2, " ", spannableString3, spannableString4);
    }

    public boolean A() {
        return this.f16091n;
    }

    public b B(Probe probe) {
        b bVarJ = this.f16099v.j();
        b bVar = b.DialTimeModeTimeSoFar;
        if (bVarJ == bVar.j()) {
            bVarJ = b.DialTimeModeEstimatingTimeRemaining;
        }
        if (bVarJ == b.DialTimeModeEstimatingTimeRemaining && probe.getTimeRemaining() > 0) {
            bVarJ = b.DialTimeModeTimeRemaining;
        } else if ((bVarJ == b.DialTimeModeTimeRemaining || bVarJ == b.DialTimeModeTotalTimeRemaining) && probe.getTimeRemaining() == -1) {
            bVarJ = bVar;
        }
        b bVar2 = b.DialTimeModeTotalTimeRemaining;
        if ((bVarJ == bVar2 && probe.getTimeRemaining() == probe.getTotalTimeRemaining()) || (bVarJ == bVar2 && probe.getTotalTimeRemaining() == 0)) {
            bVarJ = bVar;
        }
        if (bVarJ != bVar2) {
            bVar = bVarJ;
        }
        this.f16099v = bVar;
        return bVar;
    }

    public void C(b bVar) {
        this.f16099v = bVar;
    }

    public void D(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.meater_blue) : Q.i(R.color.temperature_target_selected);
        if (this.f16083f == i10) {
            return;
        }
        this.f16083f = i10;
    }

    public void E(boolean z10) {
        if (this.f16089l != z10) {
            this.f16089l = z10;
        }
    }

    public void F(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.black_color) : Q.i(R.color.grey_e);
        if (this.f16082e == i10) {
            return;
        }
        this.f16082e = i10;
    }

    public void G(boolean z10) {
        this.f16102y = z10;
    }

    public void H(boolean z10) {
        if (this.f16096s != z10) {
            this.f16096s = z10;
        }
    }

    public void I(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.meater_green) : Q.i(R.color.temperature_ambient_faded);
        if (this.f16087j == i10) {
            return;
        }
        this.f16087j = i10;
    }

    public void J(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.primary_color) : Q.i(R.color.primary_color_faded);
        if (this.f16085h == i10) {
            return;
        }
        this.f16085h = i10;
    }

    public void K(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.meater_pink) : Q.i(R.color.resting_color_faded);
        if (this.f16086i == i10) {
            return;
        }
        this.f16086i = i10;
    }

    public void L(int i10) {
        String string = i10 <= 60 ? this.f16092o.getString(R.string.almost_there_label) : this.f16092o.getString(R.string.remaining_label);
        String str = this.f16093p;
        if (str == null || !str.equals(string)) {
            this.f16093p = string;
        }
    }

    public void M(boolean z10) {
        if (this.f16088k != z10) {
            this.f16088k = z10;
        }
    }

    public void N(int i10) {
        String strF = I.f(i10);
        String str = this.f16094q;
        if (str == null || !str.equals(strF)) {
            this.f16094q = strF;
        }
    }

    public void O(boolean z10) {
        if (this.f16095r != z10) {
            this.f16095r = z10;
        }
    }

    public void P(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.primary_color) : Q.i(R.color.primary_color_faded);
        if (this.f16084g == i10) {
            return;
        }
        this.f16084g = i10;
    }

    public void Q(String str) {
        String str2 = this.f16097t;
        if (str2 == null || !str2.equals(str)) {
            this.f16097t = str;
        }
    }

    public void R(boolean z10) {
        if (this.f16090m != z10) {
            this.f16090m = z10;
        }
    }

    public void S(Probe probe) {
        this.f16100w = !this.f16100w;
        B(probe);
        a0(probe);
    }

    public void T(String str) {
        String str2 = this.f16098u;
        if (str2 == null || !str2.equals(str)) {
            this.f16098u = str;
        }
    }

    public void U(boolean z10) {
        if (this.f16091n != z10) {
            this.f16091n = z10;
        }
    }

    public void V(Probe probe) {
        if (probe.getTimeRemaining() < 1) {
            C(b.DialTimeModeEstimatingTimeRemaining);
        } else {
            C(b.DialTimeModeTimeRemaining);
        }
    }

    public void Y(int i10, boolean z10) {
        if (i10 == 1) {
            this.f16101x = z10 ? R.drawable.ic_clip_1_image : R.drawable.clip_1_transparent;
            return;
        }
        if (i10 == 2) {
            this.f16101x = z10 ? R.drawable.ic_clip_2_image : R.drawable.clip_2_transparent;
        } else if (i10 == 3) {
            this.f16101x = z10 ? R.drawable.ic_clip_3_image : R.drawable.clip_3_transparent;
        } else {
            if (i10 != 4) {
                return;
            }
            this.f16101x = z10 ? R.drawable.ic_clip_4_image : R.drawable.clip_4_transparent;
        }
    }

    public void Z(Probe probe) {
        b bVar = this.f16099v;
        if (bVar == b.DialTimeModeEstimatingTimeRemaining) {
            if (probe.getTotalTimeRemaining() > 0) {
                this.f16099v = b.DialTimeModeTimeRemaining;
            }
            H(false);
            R(false);
            U(false);
            E(true);
            return;
        }
        if (bVar == b.DialTimeModeTimeSoFar) {
            int iCookTimeElapsed = probe.cookTimeElapsed();
            if (iCookTimeElapsed == 0) {
                H(true);
                R(false);
                U(false);
                E(false);
                return;
            }
            H(false);
            T(I.b(iCookTimeElapsed));
            Q(x4.g.h().getResources().getString(R.string.elapsed_label));
            E(false);
            R(true);
            U(true);
            return;
        }
        if (bVar == b.DialTimeModeTimeRemaining) {
            H(false);
            int timeRemaining = probe.getTimeRemaining();
            if (timeRemaining <= -1) {
                E(true);
                R(false);
                U(false);
                return;
            } else {
                T(r(timeRemaining).toString());
                Q(x4.g.h().getResources().getString(R.string.remaining_label));
                E(false);
                R(true);
                U(true);
                return;
            }
        }
        if (bVar == b.DialTimeModeTotalTimeRemaining) {
            H(false);
            int totalTimeRemaining = probe.getTotalTimeRemaining();
            if (totalTimeRemaining <= -1) {
                E(true);
                R(false);
                U(false);
            } else {
                T(r(totalTimeRemaining).toString());
                Q("until finished");
                E(false);
                R(true);
                U(true);
            }
        }
    }

    public void a0(Probe probe) {
        g(MEATERDeviceType.INSTANCE.MEATERDeviceTypeHasIndependentAmbient(probe.getMEATERDeviceType()));
        if (probe.getClipNumber() > 0) {
            Y(probe.getClipNumber(), probe.getCookState() == DeviceCookState.COOK_STATE_COOK_CONFIGURED || probe.getCookState() == DeviceCookState.COOK_STATE_STARTED);
            G(probe.getClipNumber() > 0);
        } else if (probe.getParentDevice() == null || !probe.getParentDevice().isMEATERPlus()) {
            i(probe.displayProbeNumber());
        } else {
            i(probe.getParentDevice().getProbeNumber());
        }
        F(probe);
        switch (a.f16103a[probe.getCookState().ordinal()]) {
            case 1:
                D(probe);
                G(false);
                j(Q.i(e() ? R.color.probe_number_bg_g2_color : R.color.transparent));
                break;
            case 2:
            case 3:
                P(probe);
                Z(probe);
                j(a());
                break;
            case 4:
                J(probe);
                j(a());
                break;
            case 5:
                K(probe);
                O(X(probe.getTimeRemaining()));
                M(W(probe.getTimeRemaining()));
                j(a());
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                I(probe);
                j(a());
                break;
        }
        if (probe.getTimeRemaining() <= 0 || this.f16099v != b.DialTimeModeEstimatingTimeRemaining) {
            return;
        }
        this.f16099v = b.DialTimeModeTimeRemaining;
    }

    public int k() {
        return this.f16083f;
    }

    public Integer l() {
        return Integer.valueOf(this.f16101x);
    }

    public int m() {
        return this.f16087j;
    }

    public int n() {
        return this.f16085h;
    }

    public int o() {
        return this.f16086i;
    }

    public String p() {
        return this.f16093p;
    }

    public String q() {
        return this.f16094q;
    }

    public String s() {
        return this.f16097t;
    }

    public String t() {
        return this.f16098u;
    }

    public boolean u() {
        return this.f16089l;
    }

    public boolean v() {
        return this.f16102y;
    }

    public boolean w() {
        return this.f16096s;
    }

    public boolean x() {
        return this.f16088k;
    }

    public boolean y() {
        return this.f16095r;
    }

    public boolean z() {
        return this.f16090m;
    }
}
