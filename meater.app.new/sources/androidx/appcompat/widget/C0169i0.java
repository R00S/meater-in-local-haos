package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper.java */
/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: classes.dex */
class C0169i0 {

    /* renamed from: a */
    private int f1152a = 0;

    /* renamed from: b */
    private int f1153b = 0;

    /* renamed from: c */
    private int f1154c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1155d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1156e = 0;

    /* renamed from: f */
    private int f1157f = 0;

    /* renamed from: g */
    private boolean f1158g = false;

    /* renamed from: h */
    private boolean f1159h = false;

    C0169i0() {
    }

    /* renamed from: a */
    public int m1023a() {
        return this.f1158g ? this.f1152a : this.f1153b;
    }

    /* renamed from: b */
    public int m1024b() {
        return this.f1152a;
    }

    /* renamed from: c */
    public int m1025c() {
        return this.f1153b;
    }

    /* renamed from: d */
    public int m1026d() {
        return this.f1158g ? this.f1153b : this.f1152a;
    }

    /* renamed from: e */
    public void m1027e(int i2, int i3) {
        this.f1159h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1156e = i2;
            this.f1152a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1157f = i3;
            this.f1153b = i3;
        }
    }

    /* renamed from: f */
    public void m1028f(boolean z) {
        if (z == this.f1158g) {
            return;
        }
        this.f1158g = z;
        if (!this.f1159h) {
            this.f1152a = this.f1156e;
            this.f1153b = this.f1157f;
            return;
        }
        if (z) {
            int i2 = this.f1155d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f1156e;
            }
            this.f1152a = i2;
            int i3 = this.f1154c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f1157f;
            }
            this.f1153b = i3;
            return;
        }
        int i4 = this.f1154c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f1156e;
        }
        this.f1152a = i4;
        int i5 = this.f1155d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f1157f;
        }
        this.f1153b = i5;
    }

    /* renamed from: g */
    public void m1029g(int i2, int i3) {
        this.f1154c = i2;
        this.f1155d = i3;
        this.f1159h = true;
        if (this.f1158g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1152a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1153b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1152a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1153b = i3;
        }
    }
}
