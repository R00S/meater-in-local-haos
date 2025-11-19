package Y0;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private a f19189a;

    /* renamed from: b, reason: collision with root package name */
    private String f19190b;

    /* renamed from: c, reason: collision with root package name */
    private int f19191c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f19192d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f19193e = 0;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<b> f19194f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    static class a {
        public double a(float f10) {
            throw null;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f19195a;

        /* renamed from: b, reason: collision with root package name */
        float f19196b;
    }

    public float a(float f10) {
        return (float) this.f19189a.a(f10);
    }

    public String toString() {
        String str = this.f19190b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f19194f.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f19195a + " , " + decimalFormat.format(r3.f19196b) + "] ";
        }
        return str;
    }
}
