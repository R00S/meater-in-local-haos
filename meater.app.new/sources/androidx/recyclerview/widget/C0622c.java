package androidx.recyclerview.widget;

/* compiled from: BatchingListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0622c implements InterfaceC0631l {

    /* renamed from: a */
    final InterfaceC0631l f4077a;

    /* renamed from: b */
    int f4078b = 0;

    /* renamed from: c */
    int f4079c = -1;

    /* renamed from: d */
    int f4080d = -1;

    /* renamed from: e */
    Object f4081e = null;

    public C0622c(InterfaceC0631l interfaceC0631l) {
        this.f4077a = interfaceC0631l;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: a */
    public void mo4436a(int i2, int i3) {
        m4440e();
        this.f4077a.mo4436a(i2, i3);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: b */
    public void mo4437b(int i2, int i3) {
        int i4;
        if (this.f4078b == 1 && i2 >= (i4 = this.f4079c)) {
            int i5 = this.f4080d;
            if (i2 <= i4 + i5) {
                this.f4080d = i5 + i3;
                this.f4079c = Math.min(i2, i4);
                return;
            }
        }
        m4440e();
        this.f4079c = i2;
        this.f4080d = i3;
        this.f4078b = 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: c */
    public void mo4438c(int i2, int i3) {
        int i4;
        if (this.f4078b == 2 && (i4 = this.f4079c) >= i2 && i4 <= i2 + i3) {
            this.f4080d += i3;
            this.f4079c = i2;
        } else {
            m4440e();
            this.f4079c = i2;
            this.f4080d = i3;
            this.f4078b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC0631l
    /* renamed from: d */
    public void mo4439d(int i2, int i3, Object obj) {
        int i4;
        if (this.f4078b == 3) {
            int i5 = this.f4079c;
            int i6 = this.f4080d;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f4081e == obj) {
                this.f4079c = Math.min(i2, i5);
                this.f4080d = Math.max(i6 + i5, i4) - this.f4079c;
                return;
            }
        }
        m4440e();
        this.f4079c = i2;
        this.f4080d = i3;
        this.f4081e = obj;
        this.f4078b = 3;
    }

    /* renamed from: e */
    public void m4440e() {
        int i2 = this.f4078b;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            this.f4077a.mo4437b(this.f4079c, this.f4080d);
        } else if (i2 == 2) {
            this.f4077a.mo4438c(this.f4079c, this.f4080d);
        } else if (i2 == 3) {
            this.f4077a.mo4439d(this.f4079c, this.f4080d, this.f4081e);
        }
        this.f4081e = null;
        this.f4078b = 0;
    }
}
