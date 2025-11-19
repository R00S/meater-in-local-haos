package V4;

import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import java.util.ArrayList;

/* compiled from: MLSubscriber.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private long f18130a;

    /* renamed from: b, reason: collision with root package name */
    private MEATERLinkAddress f18131b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18132c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<MEATERDevice> f18133d;

    /* renamed from: e, reason: collision with root package name */
    private String f18134e;

    /* renamed from: f, reason: collision with root package name */
    private String f18135f;

    /* renamed from: g, reason: collision with root package name */
    private MasterType f18136g;

    /* renamed from: h, reason: collision with root package name */
    private String f18137h;

    /* renamed from: i, reason: collision with root package name */
    private String f18138i;

    public r(MEATERLinkAddress mEATERLinkAddress) {
        this.f18133d = new ArrayList<>();
        n(mEATERLinkAddress);
    }

    private void n(MEATERLinkAddress mEATERLinkAddress) {
        this.f18131b = mEATERLinkAddress;
        this.f18132c = true;
    }

    public String a() {
        return this.f18137h;
    }

    public MasterType b() {
        return this.f18136g;
    }

    public ArrayList<MEATERDevice> c() {
        return this.f18133d;
    }

    public String d() {
        return this.f18135f;
    }

    public String e() {
        return this.f18134e;
    }

    MEATERLinkAddress f() {
        return this.f18131b;
    }

    long g() {
        return this.f18130a;
    }

    public String h() {
        return this.f18138i;
    }

    boolean i(MEATERLinkAddress mEATERLinkAddress) {
        MEATERLinkAddress mEATERLinkAddress2 = this.f18131b;
        if (mEATERLinkAddress2 == null && mEATERLinkAddress == null) {
            return true;
        }
        if (mEATERLinkAddress2 == null && mEATERLinkAddress != null) {
            return false;
        }
        if (mEATERLinkAddress2 == null || mEATERLinkAddress != null) {
            return mEATERLinkAddress2.toString().equals(mEATERLinkAddress.toString());
        }
        return false;
    }

    public void j(String str) {
        this.f18137h = str;
    }

    public void k(MasterType masterType) {
        this.f18136g = masterType;
    }

    public void l(String str) {
        this.f18135f = str;
    }

    public void m(String str) {
        this.f18134e = str;
    }

    void o(long j10) {
        this.f18130a = j10;
    }

    public void p(String str) {
        this.f18138i = str;
    }

    public r() {
        this.f18133d = new ArrayList<>();
        this.f18132c = false;
    }
}
