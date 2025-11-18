package T5;

import android.view.Y;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.Probe;

/* compiled from: ConfirmCookFragmentObserver.java */
/* loaded from: classes2.dex */
public class b extends Y {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16013c;

    /* renamed from: i, reason: collision with root package name */
    Probe f16019i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16020j;

    /* renamed from: b, reason: collision with root package name */
    private a f16012b = a.NONE;

    /* renamed from: d, reason: collision with root package name */
    private int f16014d = R.drawable.probe_clip_plus_icon;

    /* renamed from: e, reason: collision with root package name */
    private int f16015e = R.drawable.ic_clip_1;

    /* renamed from: f, reason: collision with root package name */
    private int f16016f = R.drawable.ic_clip_2;

    /* renamed from: g, reason: collision with root package name */
    private int f16017g = R.drawable.ic_clip_3;

    /* renamed from: h, reason: collision with root package name */
    private int f16018h = R.drawable.ic_clip_4;

    /* compiled from: ConfirmCookFragmentObserver.java */
    public enum a {
        NONE(0),
        ICON_ONE(1),
        ICON_TWO(2),
        ICON_THREE(3),
        ICON_FOUR(4);


        /* renamed from: B, reason: collision with root package name */
        private final int f16027B;

        a(int i10) {
            this.f16027B = i10;
        }

        public static a j(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? NONE : ICON_FOUR : ICON_THREE : ICON_TWO : ICON_ONE;
        }
    }

    private void s() {
        this.f16015e = R.drawable.ic_clip_1;
        this.f16016f = R.drawable.ic_clip_2;
        this.f16017g = R.drawable.ic_clip_3;
        this.f16018h = R.drawable.ic_clip_4;
        this.f16012b = a.NONE;
        this.f16014d = R.drawable.probe_clip_plus_icon;
    }

    public int h() {
        return this.f16015e;
    }

    public int i() {
        return this.f16016f;
    }

    public int j() {
        return this.f16017g;
    }

    public int k() {
        return this.f16018h;
    }

    public int l() {
        return this.f16014d;
    }

    public int m() {
        int iOrdinal = this.f16012b.ordinal();
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    i10 = 4;
                    if (iOrdinal != 4) {
                        return -1;
                    }
                }
            }
        }
        return i10;
    }

    public boolean n() {
        Probe probe = this.f16019i;
        if (probe == null || !(probe.isBlockProbe() || this.f16019i.getMEATERDeviceType().isG2Probe())) {
            return this.f16013c;
        }
        return false;
    }

    public void o(a aVar) {
        this.f16012b = aVar;
    }

    public void p(Probe probe) {
        this.f16019i = probe;
        r((probe.getMEATERDeviceType().isG2Probe() || probe.getMEATERDeviceType().isBlockProbe()) ? false : true);
    }

    public void q(LinearLayout linearLayout) {
        boolean z10 = this.f16013c;
        this.f16013c = !z10;
        linearLayout.setVisibility(!z10 ? 0 : 8);
    }

    public void r(boolean z10) {
        this.f16020j = z10;
    }

    public void t(a aVar, AppCompatImageView appCompatImageView) {
        s();
        if (appCompatImageView == null) {
            return;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            this.f16014d = R.drawable.ic_clip_1_selected;
            this.f16015e = R.drawable.ic_clip_1_selected;
            this.f16012b = a.ICON_ONE;
            appCompatImageView.setImageResource(R.drawable.ic_clip_1_selected);
            return;
        }
        if (iOrdinal == 2) {
            this.f16014d = R.drawable.ic_clip_2_selected;
            this.f16016f = R.drawable.ic_clip_2_selected;
            this.f16012b = a.ICON_TWO;
            appCompatImageView.setImageResource(R.drawable.ic_clip_2_selected);
            return;
        }
        if (iOrdinal == 3) {
            this.f16014d = R.drawable.ic_clip_3_selected;
            this.f16017g = R.drawable.ic_clip_3_selected;
            this.f16012b = a.ICON_THREE;
            appCompatImageView.setImageResource(R.drawable.ic_clip_3_selected);
            return;
        }
        if (iOrdinal != 4) {
            return;
        }
        this.f16014d = R.drawable.ic_clip_4_selected;
        this.f16018h = R.drawable.ic_clip_4_selected;
        this.f16012b = a.ICON_FOUR;
        appCompatImageView.setImageResource(R.drawable.ic_clip_4_selected);
    }
}
