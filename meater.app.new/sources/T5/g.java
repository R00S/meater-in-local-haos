package T5;

import P5.Q;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.B;
import android.view.D;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;

/* compiled from: DialListViewModel.java */
/* loaded from: classes2.dex */
public class g extends h {

    /* renamed from: e, reason: collision with root package name */
    private final Context f16063e;

    /* renamed from: f, reason: collision with root package name */
    private int f16064f;

    /* renamed from: g, reason: collision with root package name */
    private int f16065g;

    /* renamed from: h, reason: collision with root package name */
    private int f16066h;

    /* renamed from: i, reason: collision with root package name */
    private int f16067i;

    /* renamed from: j, reason: collision with root package name */
    private int f16068j;

    /* renamed from: k, reason: collision with root package name */
    private int f16069k;

    /* renamed from: l, reason: collision with root package name */
    private int f16070l;

    /* renamed from: m, reason: collision with root package name */
    private String f16071m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16072n;

    /* renamed from: o, reason: collision with root package name */
    private int f16073o = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16074p;

    /* renamed from: q, reason: collision with root package name */
    public final D<Boolean> f16075q;

    /* renamed from: r, reason: collision with root package name */
    public final B<Boolean> f16076r;

    /* compiled from: DialListViewModel.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16077a;

        static {
            int[] iArr = new int[DeviceCookState.values().length];
            f16077a = iArr;
            try {
                iArr[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16077a[DeviceCookState.COOK_STATE_OVERCOOK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g(Context context) {
        D<Boolean> d10 = new D<>();
        this.f16075q = d10;
        this.f16076r = d10;
        this.f16063e = context;
    }

    public void A(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.primary_color) : Q.i(R.color.primary_color_faded);
        if (this.f16066h == i10) {
            return;
        }
        this.f16066h = i10;
    }

    public void B(String str) {
        String str2 = this.f16071m;
        if (str2 == null || !str2.equals(str)) {
            this.f16071m = str;
        }
    }

    public void C(int i10) {
        if (i10 < 0) {
            B(x4.g.h().getString(R.string.estimate_cook_time_label));
            return;
        }
        long[] jArrU = Q.u(Math.max(60, i10));
        long j10 = jArrU[0];
        long j11 = jArrU[1];
        SpannableString spannableString = new SpannableString(String.valueOf(j10));
        spannableString.setSpan(new RelativeSizeSpan(1.18f), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(x4.g.h().getString(R.string.time_string_h));
        spannableString2.setSpan(new RelativeSizeSpan(0.82f), 0, spannableString2.length(), 0);
        SpannableString spannableString3 = new SpannableString(String.valueOf(j11));
        spannableString3.setSpan(new RelativeSizeSpan(1.18f), 0, spannableString3.length(), 0);
        SpannableString spannableString4 = new SpannableString("m");
        spannableString4.setSpan(new RelativeSizeSpan(0.82f), 0, spannableString4.length(), 0);
        if (j10 > 0 && j11 > 0) {
            B(TextUtils.concat(spannableString, spannableString2, " ", spannableString3, spannableString4, "\n" + x4.g.h().getString(R.string.remaining_label)).toString());
            return;
        }
        if (j10 > 0) {
            B(TextUtils.concat(spannableString, spannableString2, "\n" + x4.g.h().getString(R.string.remaining_label)).toString());
            return;
        }
        B(TextUtils.concat(spannableString3, spannableString4, "\n" + x4.g.h().getString(R.string.remaining_label)).toString());
    }

    public void D(int i10, boolean z10) {
        if (i10 == 1) {
            this.f16073o = z10 ? R.drawable.ic_clip_1_image : R.drawable.clip_1_transparent;
            return;
        }
        if (i10 == 2) {
            this.f16073o = z10 ? R.drawable.ic_clip_2_image : R.drawable.clip_2_transparent;
        } else if (i10 == 3) {
            this.f16073o = z10 ? R.drawable.ic_clip_3_image : R.drawable.clip_3_transparent;
        } else {
            if (i10 != 4) {
                return;
            }
            this.f16073o = z10 ? R.drawable.ic_clip_4_image : R.drawable.clip_4_transparent;
        }
    }

    public void E(Probe probe) {
        g(MEATERDeviceType.INSTANCE.MEATERDeviceTypeHasIndependentAmbient(probe.getMEATERDeviceType()));
        if (probe.getClipNumber() > 0) {
            D(probe.getClipNumber(), probe.getCookState() == DeviceCookState.COOK_STATE_COOK_CONFIGURED || probe.getCookState() == DeviceCookState.COOK_STATE_STARTED);
            u(probe.getClipNumber() > 0);
        } else if (probe.getParentDevice() == null || !probe.getParentDevice().isMEATERPlus()) {
            i(probe.displayProbeNumber());
        } else {
            i(probe.getParentDevice().getProbeNumber());
        }
        v(probe.getShouldShowAsConnected());
        t(probe);
        j(a());
        switch (a.f16077a[probe.getCookState().ordinal()]) {
            case 1:
                s(probe);
                break;
            case 2:
            case 3:
                A(probe);
                C(probe.getTimeRemaining());
                break;
            case 4:
                y(probe);
                break;
            case 5:
                z(probe);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                w(probe);
                x(probe);
                break;
        }
    }

    public int k() {
        return this.f16065g;
    }

    public int l() {
        return this.f16064f;
    }

    public Integer m() {
        return Integer.valueOf(this.f16073o);
    }

    public int n() {
        return this.f16069k;
    }

    public int o() {
        return this.f16067i;
    }

    public int p() {
        return this.f16068j;
    }

    public String q() {
        return this.f16071m;
    }

    public boolean r() {
        return this.f16074p;
    }

    public void s(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.primary_color) : Q.i(R.color.primary_color_faded);
        if (this.f16065g == i10) {
            return;
        }
        this.f16065g = i10;
    }

    public void t(Probe probe) {
        int iJ = probe.getShouldShowAsConnected() ? Q.j(this.f16063e, R.color.black_color) : Q.j(this.f16063e, R.color.grey_9);
        if (this.f16064f == iJ) {
            return;
        }
        this.f16064f = iJ;
    }

    public void u(boolean z10) {
        this.f16074p = z10;
    }

    public void v(boolean z10) {
        if (this.f16072n == z10) {
            return;
        }
        this.f16072n = z10;
        this.f16075q.o(Boolean.valueOf(z10));
    }

    public void w(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.meater_green) : Q.i(R.color.temperature_ambient_faded);
        if (this.f16069k == i10) {
            return;
        }
        this.f16069k = i10;
    }

    public void x(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.primary_color) : Q.i(R.color.primary_color_faded);
        if (this.f16070l == i10) {
            return;
        }
        this.f16070l = i10;
    }

    public void y(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.primary_color) : Q.i(R.color.primary_color_faded);
        if (this.f16067i == i10) {
            return;
        }
        this.f16067i = i10;
    }

    public void z(Probe probe) {
        int i10 = probe.getShouldShowAsConnected() ? Q.i(R.color.meater_pink) : Q.i(R.color.resting_color_faded);
        if (this.f16068j == i10) {
            return;
        }
        this.f16068j = i10;
    }
}
