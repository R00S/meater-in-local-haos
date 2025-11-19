package T5;

import P5.Q;
import com.apptionlabs.meater_app.R;

/* compiled from: DialModel.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private int f16078a = Q.i(R.color.probe_number_bg_color);

    /* renamed from: b, reason: collision with root package name */
    private boolean f16079b;

    /* renamed from: c, reason: collision with root package name */
    int f16080c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16081d;

    public int a() {
        return Q.i(this.f16081d ? R.color.probe_number_bg_g2_color : R.color.probe_number_bg_color);
    }

    public int b() {
        return this.f16080c;
    }

    public String c() {
        int i10 = this.f16080c;
        if (i10 == 112 || i10 <= 0 || i10 >= 5) {
            return null;
        }
        return String.valueOf(i10);
    }

    public int d() {
        return this.f16078a;
    }

    public boolean e() {
        return this.f16081d;
    }

    public boolean f() {
        return this.f16079b;
    }

    public void g(boolean z10) {
        if (this.f16081d != z10) {
            this.f16081d = z10;
        }
    }

    public void h(boolean z10) {
        if (this.f16079b != z10) {
            this.f16079b = z10;
        }
    }

    public void i(int i10) {
        if (this.f16080c == i10) {
            return;
        }
        j(a());
        this.f16080c = i10;
        if (i10 == 128 || i10 == 112 || i10 == 113 || i10 == 129) {
            h(false);
        } else {
            h(i10 > 0);
        }
    }

    public void j(int i10) {
        if (this.f16078a == i10) {
            return;
        }
        this.f16078a = i10;
    }
}
