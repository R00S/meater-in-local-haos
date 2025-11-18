package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes.dex */
public class c implements n {

    /* renamed from: a, reason: collision with root package name */
    final n f28821a;

    /* renamed from: b, reason: collision with root package name */
    int f28822b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f28823c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f28824d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f28825e = null;

    public c(n nVar) {
        this.f28821a = nVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(int i10, int i11) {
        e();
        this.f28821a.a(i10, i11);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(int i10, int i11) {
        int i12;
        if (this.f28822b == 1 && i10 >= (i12 = this.f28823c)) {
            int i13 = this.f28824d;
            if (i10 <= i12 + i13) {
                this.f28824d = i13 + i11;
                this.f28823c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f28823c = i10;
        this.f28824d = i11;
        this.f28822b = 1;
    }

    @Override // androidx.recyclerview.widget.n
    public void c(int i10, int i11) {
        int i12;
        if (this.f28822b == 2 && (i12 = this.f28823c) >= i10 && i12 <= i10 + i11) {
            this.f28824d += i11;
            this.f28823c = i10;
        } else {
            e();
            this.f28823c = i10;
            this.f28824d = i11;
            this.f28822b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.n
    @SuppressLint({"UnknownNullness"})
    public void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f28822b == 3) {
            int i13 = this.f28823c;
            int i14 = this.f28824d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f28825e == obj) {
                this.f28823c = Math.min(i10, i13);
                this.f28824d = Math.max(i14 + i13, i12) - this.f28823c;
                return;
            }
        }
        e();
        this.f28823c = i10;
        this.f28824d = i11;
        this.f28825e = obj;
        this.f28822b = 3;
    }

    public void e() {
        int i10 = this.f28822b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f28821a.b(this.f28823c, this.f28824d);
        } else if (i10 == 2) {
            this.f28821a.c(this.f28823c, this.f28824d);
        } else if (i10 == 3) {
            this.f28821a.d(this.f28823c, this.f28824d, this.f28825e);
        }
        this.f28825e = null;
        this.f28822b = 0;
    }
}
