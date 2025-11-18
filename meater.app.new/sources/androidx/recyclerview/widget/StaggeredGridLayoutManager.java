package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.p004d0.C0289c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0602o implements RecyclerView.AbstractC0612y.b {

    /* renamed from: b */
    C0619d[] f4009b;

    /* renamed from: c */
    AbstractC0633n f4010c;

    /* renamed from: d */
    AbstractC0633n f4011d;

    /* renamed from: e */
    private int f4012e;

    /* renamed from: f */
    private int f4013f;

    /* renamed from: g */
    private final C0628i f4014g;

    /* renamed from: j */
    private BitSet f4017j;

    /* renamed from: o */
    private boolean f4022o;

    /* renamed from: p */
    private boolean f4023p;

    /* renamed from: q */
    private SavedState f4024q;

    /* renamed from: r */
    private int f4025r;

    /* renamed from: w */
    private int[] f4030w;

    /* renamed from: a */
    private int f4008a = -1;

    /* renamed from: h */
    boolean f4015h = false;

    /* renamed from: i */
    boolean f4016i = false;

    /* renamed from: k */
    int f4018k = -1;

    /* renamed from: l */
    int f4019l = Integer.MIN_VALUE;

    /* renamed from: m */
    LazySpanLookup f4020m = new LazySpanLookup();

    /* renamed from: n */
    private int f4021n = 2;

    /* renamed from: s */
    private final Rect f4026s = new Rect();

    /* renamed from: t */
    private final C0617b f4027t = new C0617b();

    /* renamed from: u */
    private boolean f4028u = false;

    /* renamed from: v */
    private boolean f4029v = true;

    /* renamed from: x */
    private final Runnable f4031x = new RunnableC0616a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0615a();

        /* renamed from: f */
        int f4038f;

        /* renamed from: g */
        int f4039g;

        /* renamed from: h */
        int f4040h;

        /* renamed from: i */
        int[] f4041i;

        /* renamed from: j */
        int f4042j;

        /* renamed from: k */
        int[] f4043k;

        /* renamed from: l */
        List<LazySpanLookup.FullSpanItem> f4044l;

        /* renamed from: m */
        boolean f4045m;

        /* renamed from: n */
        boolean f4046n;

        /* renamed from: o */
        boolean f4047o;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        static class C0615a implements Parcelable.Creator<SavedState> {
            C0615a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        void m4377a() {
            this.f4041i = null;
            this.f4040h = 0;
            this.f4038f = -1;
            this.f4039g = -1;
        }

        /* renamed from: b */
        void m4378b() {
            this.f4041i = null;
            this.f4040h = 0;
            this.f4042j = 0;
            this.f4043k = null;
            this.f4044l = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f4038f);
            parcel.writeInt(this.f4039g);
            parcel.writeInt(this.f4040h);
            if (this.f4040h > 0) {
                parcel.writeIntArray(this.f4041i);
            }
            parcel.writeInt(this.f4042j);
            if (this.f4042j > 0) {
                parcel.writeIntArray(this.f4043k);
            }
            parcel.writeInt(this.f4045m ? 1 : 0);
            parcel.writeInt(this.f4046n ? 1 : 0);
            parcel.writeInt(this.f4047o ? 1 : 0);
            parcel.writeList(this.f4044l);
        }

        SavedState(Parcel parcel) {
            this.f4038f = parcel.readInt();
            this.f4039g = parcel.readInt();
            int i2 = parcel.readInt();
            this.f4040h = i2;
            if (i2 > 0) {
                int[] iArr = new int[i2];
                this.f4041i = iArr;
                parcel.readIntArray(iArr);
            }
            int i3 = parcel.readInt();
            this.f4042j = i3;
            if (i3 > 0) {
                int[] iArr2 = new int[i3];
                this.f4043k = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4045m = parcel.readInt() == 1;
            this.f4046n = parcel.readInt() == 1;
            this.f4047o = parcel.readInt() == 1;
            this.f4044l = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f4040h = savedState.f4040h;
            this.f4038f = savedState.f4038f;
            this.f4039g = savedState.f4039g;
            this.f4041i = savedState.f4041i;
            this.f4042j = savedState.f4042j;
            this.f4043k = savedState.f4043k;
            this.f4045m = savedState.f4045m;
            this.f4046n = savedState.f4046n;
            this.f4047o = savedState.f4047o;
            this.f4044l = savedState.f4044l;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class RunnableC0616a implements Runnable {
        RunnableC0616a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m4353g();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0617b {

        /* renamed from: a */
        int f4049a;

        /* renamed from: b */
        int f4050b;

        /* renamed from: c */
        boolean f4051c;

        /* renamed from: d */
        boolean f4052d;

        /* renamed from: e */
        boolean f4053e;

        /* renamed from: f */
        int[] f4054f;

        C0617b() {
            m4383c();
        }

        /* renamed from: a */
        void m4381a() {
            this.f4050b = this.f4051c ? StaggeredGridLayoutManager.this.f4010c.mo4538i() : StaggeredGridLayoutManager.this.f4010c.mo4542m();
        }

        /* renamed from: b */
        void m4382b(int i2) {
            if (this.f4051c) {
                this.f4050b = StaggeredGridLayoutManager.this.f4010c.mo4538i() - i2;
            } else {
                this.f4050b = StaggeredGridLayoutManager.this.f4010c.mo4542m() + i2;
            }
        }

        /* renamed from: c */
        void m4383c() {
            this.f4049a = -1;
            this.f4050b = Integer.MIN_VALUE;
            this.f4051c = false;
            this.f4052d = false;
            this.f4053e = false;
            int[] iArr = this.f4054f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m4384d(C0619d[] c0619dArr) {
            int length = c0619dArr.length;
            int[] iArr = this.f4054f;
            if (iArr == null || iArr.length < length) {
                this.f4054f = new int[StaggeredGridLayoutManager.this.f4009b.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f4054f[i2] = c0619dArr[i2].m4402p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0618c extends RecyclerView.C0603p {

        /* renamed from: e */
        C0619d f4056e;

        /* renamed from: f */
        boolean f4057f;

        public C0618c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int m4385e() {
            C0619d c0619d = this.f4056e;
            if (c0619d == null) {
                return -1;
            }
            return c0619d.f4062e;
        }

        /* renamed from: f */
        public boolean m4386f() {
            return this.f4057f;
        }

        public C0618c(int i2, int i3) {
            super(i2, i3);
        }

        public C0618c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0618c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    class C0619d {

        /* renamed from: a */
        ArrayList<View> f4058a = new ArrayList<>();

        /* renamed from: b */
        int f4059b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4060c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4061d = 0;

        /* renamed from: e */
        final int f4062e;

        C0619d(int i2) {
            this.f4062e = i2;
        }

        /* renamed from: a */
        void m4387a(View view) {
            C0618c c0618cM4400n = m4400n(view);
            c0618cM4400n.f4056e = this;
            this.f4058a.add(view);
            this.f4060c = Integer.MIN_VALUE;
            if (this.f4058a.size() == 1) {
                this.f4059b = Integer.MIN_VALUE;
            }
            if (c0618cM4400n.m4240c() || c0618cM4400n.m4239b()) {
                this.f4061d += StaggeredGridLayoutManager.this.f4010c.mo4534e(view);
            }
        }

        /* renamed from: b */
        void m4388b(boolean z, int i2) {
            int iM4398l = z ? m4398l(Integer.MIN_VALUE) : m4402p(Integer.MIN_VALUE);
            m4391e();
            if (iM4398l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iM4398l >= StaggeredGridLayoutManager.this.f4010c.mo4538i()) {
                if (z || iM4398l <= StaggeredGridLayoutManager.this.f4010c.mo4542m()) {
                    if (i2 != Integer.MIN_VALUE) {
                        iM4398l += i2;
                    }
                    this.f4060c = iM4398l;
                    this.f4059b = iM4398l;
                }
            }
        }

        /* renamed from: c */
        void m4389c() {
            LazySpanLookup.FullSpanItem fullSpanItemM4367f;
            ArrayList<View> arrayList = this.f4058a;
            View view = arrayList.get(arrayList.size() - 1);
            C0618c c0618cM4400n = m4400n(view);
            this.f4060c = StaggeredGridLayoutManager.this.f4010c.mo4533d(view);
            if (c0618cM4400n.f4057f && (fullSpanItemM4367f = StaggeredGridLayoutManager.this.f4020m.m4367f(c0618cM4400n.m4238a())) != null && fullSpanItemM4367f.f4035g == 1) {
                this.f4060c += fullSpanItemM4367f.m4374a(this.f4062e);
            }
        }

        /* renamed from: d */
        void m4390d() {
            LazySpanLookup.FullSpanItem fullSpanItemM4367f;
            View view = this.f4058a.get(0);
            C0618c c0618cM4400n = m4400n(view);
            this.f4059b = StaggeredGridLayoutManager.this.f4010c.mo4536g(view);
            if (c0618cM4400n.f4057f && (fullSpanItemM4367f = StaggeredGridLayoutManager.this.f4020m.m4367f(c0618cM4400n.m4238a())) != null && fullSpanItemM4367f.f4035g == -1) {
                this.f4059b -= fullSpanItemM4367f.m4374a(this.f4062e);
            }
        }

        /* renamed from: e */
        void m4391e() {
            this.f4058a.clear();
            m4403q();
            this.f4061d = 0;
        }

        /* renamed from: f */
        public int m4392f() {
            return StaggeredGridLayoutManager.this.f4015h ? m4395i(this.f4058a.size() - 1, -1, true) : m4395i(0, this.f4058a.size(), true);
        }

        /* renamed from: g */
        public int m4393g() {
            return StaggeredGridLayoutManager.this.f4015h ? m4395i(0, this.f4058a.size(), true) : m4395i(this.f4058a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m4394h(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int iMo4542m = StaggeredGridLayoutManager.this.f4010c.mo4542m();
            int iMo4538i = StaggeredGridLayoutManager.this.f4010c.mo4538i();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.f4058a.get(i2);
                int iMo4536g = StaggeredGridLayoutManager.this.f4010c.mo4536g(view);
                int iMo4533d = StaggeredGridLayoutManager.this.f4010c.mo4533d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iMo4536g >= iMo4538i : iMo4536g > iMo4538i;
                if (!z3 ? iMo4533d > iMo4542m : iMo4533d >= iMo4542m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iMo4536g >= iMo4542m && iMo4533d <= iMo4538i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iMo4536g < iMo4542m || iMo4533d > iMo4538i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i2 += i4;
            }
            return -1;
        }

        /* renamed from: i */
        int m4395i(int i2, int i3, boolean z) {
            return m4394h(i2, i3, false, false, z);
        }

        /* renamed from: j */
        public int m4396j() {
            return this.f4061d;
        }

        /* renamed from: k */
        int m4397k() {
            int i2 = this.f4060c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            m4389c();
            return this.f4060c;
        }

        /* renamed from: l */
        int m4398l(int i2) {
            int i3 = this.f4060c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f4058a.size() == 0) {
                return i2;
            }
            m4389c();
            return this.f4060c;
        }

        /* renamed from: m */
        public View m4399m(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f4058a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4058a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4015h && staggeredGridLayoutManager.getPosition(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4015h && staggeredGridLayoutManager2.getPosition(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4058a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.f4058a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4015h && staggeredGridLayoutManager3.getPosition(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4015h && staggeredGridLayoutManager4.getPosition(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C0618c m4400n(View view) {
            return (C0618c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m4401o() {
            int i2 = this.f4059b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            m4390d();
            return this.f4059b;
        }

        /* renamed from: p */
        int m4402p(int i2) {
            int i3 = this.f4059b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f4058a.size() == 0) {
                return i2;
            }
            m4390d();
            return this.f4059b;
        }

        /* renamed from: q */
        void m4403q() {
            this.f4059b = Integer.MIN_VALUE;
            this.f4060c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m4404r(int i2) {
            int i3 = this.f4059b;
            if (i3 != Integer.MIN_VALUE) {
                this.f4059b = i3 + i2;
            }
            int i4 = this.f4060c;
            if (i4 != Integer.MIN_VALUE) {
                this.f4060c = i4 + i2;
            }
        }

        /* renamed from: s */
        void m4405s() {
            int size = this.f4058a.size();
            View viewRemove = this.f4058a.remove(size - 1);
            C0618c c0618cM4400n = m4400n(viewRemove);
            c0618cM4400n.f4056e = null;
            if (c0618cM4400n.m4240c() || c0618cM4400n.m4239b()) {
                this.f4061d -= StaggeredGridLayoutManager.this.f4010c.mo4534e(viewRemove);
            }
            if (size == 1) {
                this.f4059b = Integer.MIN_VALUE;
            }
            this.f4060c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m4406t() {
            View viewRemove = this.f4058a.remove(0);
            C0618c c0618cM4400n = m4400n(viewRemove);
            c0618cM4400n.f4056e = null;
            if (this.f4058a.size() == 0) {
                this.f4060c = Integer.MIN_VALUE;
            }
            if (c0618cM4400n.m4240c() || c0618cM4400n.m4239b()) {
                this.f4061d -= StaggeredGridLayoutManager.this.f4010c.mo4534e(viewRemove);
            }
            this.f4059b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m4407u(View view) {
            C0618c c0618cM4400n = m4400n(view);
            c0618cM4400n.f4056e = this;
            this.f4058a.add(0, view);
            this.f4059b = Integer.MIN_VALUE;
            if (this.f4058a.size() == 1) {
                this.f4060c = Integer.MIN_VALUE;
            }
            if (c0618cM4400n.m4240c() || c0618cM4400n.m4239b()) {
                this.f4061d += StaggeredGridLayoutManager.this.f4010c.mo4534e(view);
            }
        }

        /* renamed from: v */
        void m4408v(int i2) {
            this.f4059b = i2;
            this.f4060c = i2;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.AbstractC0602o.d properties = RecyclerView.AbstractC0602o.getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.f3960a);
        setSpanCount(properties.f3961b);
        setReverseLayout(properties.f3962c);
        this.f4014g = new C0628i();
        m4334k();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4312A(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4016i
            if (r0 == 0) goto L9
            int r0 = r6.m4358u()
            goto Ld
        L9:
            int r0 = r6.m4357t()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4020m
            r4.m4369h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4020m
            r9.m4371k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f4020m
            r7.m4370j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4020m
            r9.m4371k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4020m
            r9.m4370j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f4016i
            if (r7 == 0) goto L4d
            int r7 = r6.m4357t()
            goto L51
        L4d:
            int r7 = r6.m4358u()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4312A(int, int, int):void");
    }

    /* renamed from: D */
    private void m4313D(View view, C0618c c0618c, boolean z) {
        if (c0618c.f4057f) {
            if (this.f4012e == 1) {
                measureChildWithDecorationsAndMargin(view, this.f4025r, RecyclerView.AbstractC0602o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0618c).height, true), z);
                return;
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.AbstractC0602o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0618c).width, true), this.f4025r, z);
                return;
            }
        }
        if (this.f4012e == 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.AbstractC0602o.getChildMeasureSpec(this.f4013f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) c0618c).width, false), RecyclerView.AbstractC0602o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0618c).height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, RecyclerView.AbstractC0602o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0618c).width, true), RecyclerView.AbstractC0602o.getChildMeasureSpec(this.f4013f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c0618c).height, false), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4314E(androidx.recyclerview.widget.RecyclerView.C0609v r9, androidx.recyclerview.widget.RecyclerView.C0613z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4314E(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    /* renamed from: F */
    private boolean m4315F(int i2) {
        if (this.f4012e == 0) {
            return (i2 == -1) != this.f4016i;
        }
        return ((i2 == -1) == this.f4016i) == isLayoutRTL();
    }

    /* renamed from: H */
    private void m4316H(View view) {
        for (int i2 = this.f4008a - 1; i2 >= 0; i2--) {
            this.f4009b[i2].m4407u(view);
        }
    }

    /* renamed from: I */
    private void m4317I(RecyclerView.C0609v c0609v, C0628i c0628i) {
        if (!c0628i.f4197a || c0628i.f4205i) {
            return;
        }
        if (c0628i.f4198b == 0) {
            if (c0628i.f4201e == -1) {
                m4318J(c0609v, c0628i.f4203g);
                return;
            } else {
                m4319K(c0609v, c0628i.f4202f);
                return;
            }
        }
        if (c0628i.f4201e != -1) {
            int iM4342x = m4342x(c0628i.f4203g) - c0628i.f4203g;
            m4319K(c0609v, iM4342x < 0 ? c0628i.f4202f : Math.min(iM4342x, c0628i.f4198b) + c0628i.f4202f);
        } else {
            int i2 = c0628i.f4202f;
            int iM4341w = i2 - m4341w(i2);
            m4318J(c0609v, iM4341w < 0 ? c0628i.f4203g : c0628i.f4203g - Math.min(iM4341w, c0628i.f4198b));
        }
    }

    /* renamed from: J */
    private void m4318J(RecyclerView.C0609v c0609v, int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f4010c.mo4536g(childAt) < i2 || this.f4010c.mo4546q(childAt) < i2) {
                return;
            }
            C0618c c0618c = (C0618c) childAt.getLayoutParams();
            if (c0618c.f4057f) {
                for (int i3 = 0; i3 < this.f4008a; i3++) {
                    if (this.f4009b[i3].f4058a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f4008a; i4++) {
                    this.f4009b[i4].m4405s();
                }
            } else if (c0618c.f4056e.f4058a.size() == 1) {
                return;
            } else {
                c0618c.f4056e.m4405s();
            }
            removeAndRecycleView(childAt, c0609v);
        }
    }

    /* renamed from: K */
    private void m4319K(RecyclerView.C0609v c0609v, int i2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f4010c.mo4533d(childAt) > i2 || this.f4010c.mo4545p(childAt) > i2) {
                return;
            }
            C0618c c0618c = (C0618c) childAt.getLayoutParams();
            if (c0618c.f4057f) {
                for (int i3 = 0; i3 < this.f4008a; i3++) {
                    if (this.f4009b[i3].f4058a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f4008a; i4++) {
                    this.f4009b[i4].m4406t();
                }
            } else if (c0618c.f4056e.f4058a.size() == 1) {
                return;
            } else {
                c0618c.f4056e.m4406t();
            }
            removeAndRecycleView(childAt, c0609v);
        }
    }

    /* renamed from: L */
    private void m4320L() {
        if (this.f4011d.mo4540k() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float fMo4534e = this.f4011d.mo4534e(childAt);
            if (fMo4534e >= fMax) {
                if (((C0618c) childAt.getLayoutParams()).m4386f()) {
                    fMo4534e = (fMo4534e * 1.0f) / this.f4008a;
                }
                fMax = Math.max(fMax, fMo4534e);
            }
        }
        int i3 = this.f4013f;
        int iRound = Math.round(fMax * this.f4008a);
        if (this.f4011d.mo4540k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f4011d.mo4543n());
        }
        m4350S(iRound);
        if (this.f4013f == i3) {
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            C0618c c0618c = (C0618c) childAt2.getLayoutParams();
            if (!c0618c.f4057f) {
                if (isLayoutRTL() && this.f4012e == 1) {
                    int i5 = this.f4008a;
                    int i6 = c0618c.f4056e.f4062e;
                    childAt2.offsetLeftAndRight(((-((i5 - 1) - i6)) * this.f4013f) - ((-((i5 - 1) - i6)) * i3));
                } else {
                    int i7 = c0618c.f4056e.f4062e;
                    int i8 = this.f4013f * i7;
                    int i9 = i7 * i3;
                    if (this.f4012e == 1) {
                        childAt2.offsetLeftAndRight(i8 - i9);
                    } else {
                        childAt2.offsetTopAndBottom(i8 - i9);
                    }
                }
            }
        }
    }

    /* renamed from: M */
    private void m4321M(int i2) {
        C0628i c0628i = this.f4014g;
        c0628i.f4201e = i2;
        c0628i.f4200d = this.f4016i != (i2 == -1) ? -1 : 1;
    }

    /* renamed from: N */
    private void m4322N(int i2, int i3) {
        for (int i4 = 0; i4 < this.f4008a; i4++) {
            if (!this.f4009b[i4].f4058a.isEmpty()) {
                m4325T(this.f4009b[i4], i2, i3);
            }
        }
    }

    /* renamed from: O */
    private boolean m4323O(RecyclerView.C0613z c0613z, C0617b c0617b) {
        c0617b.f4049a = this.f4022o ? m4337q(c0613z.m4306b()) : m4336m(c0613z.m4306b());
        c0617b.f4050b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4324R(int r5, androidx.recyclerview.widget.RecyclerView.C0613z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.i r0 = r4.f4014g
            r1 = 0
            r0.f4198b = r1
            r0.f4199c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m4307c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f4016i
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.n r5 = r4.f4010c
            int r5 = r5.mo4543n()
            goto L2f
        L25:
            androidx.recyclerview.widget.n r5 = r4.f4010c
            int r5 = r5.mo4543n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.i r0 = r4.f4014g
            androidx.recyclerview.widget.n r3 = r4.f4010c
            int r3 = r3.mo4542m()
            int r3 = r3 - r6
            r0.f4202f = r3
            androidx.recyclerview.widget.i r6 = r4.f4014g
            androidx.recyclerview.widget.n r0 = r4.f4010c
            int r0 = r0.mo4538i()
            int r0 = r0 + r5
            r6.f4203g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.i r0 = r4.f4014g
            androidx.recyclerview.widget.n r3 = r4.f4010c
            int r3 = r3.mo4537h()
            int r3 = r3 + r5
            r0.f4203g = r3
            androidx.recyclerview.widget.i r5 = r4.f4014g
            int r6 = -r6
            r5.f4202f = r6
        L5d:
            androidx.recyclerview.widget.i r5 = r4.f4014g
            r5.f4204h = r1
            r5.f4197a = r2
            androidx.recyclerview.widget.n r6 = r4.f4010c
            int r6 = r6.mo4540k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.n r6 = r4.f4010c
            int r6 = r6.mo4537h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f4205i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4324R(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* renamed from: T */
    private void m4325T(C0619d c0619d, int i2, int i3) {
        int iM4396j = c0619d.m4396j();
        if (i2 == -1) {
            if (c0619d.m4401o() + iM4396j <= i3) {
                this.f4017j.set(c0619d.f4062e, false);
            }
        } else if (c0619d.m4397k() - iM4396j >= i3) {
            this.f4017j.set(c0619d.f4062e, false);
        }
    }

    /* renamed from: U */
    private int m4326U(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    /* renamed from: a */
    private void m4327a(View view) {
        for (int i2 = this.f4008a - 1; i2 >= 0; i2--) {
            this.f4009b[i2].m4387a(view);
        }
    }

    /* renamed from: b */
    private void m4328b(C0617b c0617b) {
        SavedState savedState = this.f4024q;
        int i2 = savedState.f4040h;
        if (i2 > 0) {
            if (i2 == this.f4008a) {
                for (int i3 = 0; i3 < this.f4008a; i3++) {
                    this.f4009b[i3].m4391e();
                    SavedState savedState2 = this.f4024q;
                    int iMo4538i = savedState2.f4041i[i3];
                    if (iMo4538i != Integer.MIN_VALUE) {
                        iMo4538i += savedState2.f4046n ? this.f4010c.mo4538i() : this.f4010c.mo4542m();
                    }
                    this.f4009b[i3].m4408v(iMo4538i);
                }
            } else {
                savedState.m4378b();
                SavedState savedState3 = this.f4024q;
                savedState3.f4038f = savedState3.f4039g;
            }
        }
        SavedState savedState4 = this.f4024q;
        this.f4023p = savedState4.f4047o;
        setReverseLayout(savedState4.f4045m);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.f4024q;
        int i4 = savedState5.f4038f;
        if (i4 != -1) {
            this.f4018k = i4;
            c0617b.f4051c = savedState5.f4046n;
        } else {
            c0617b.f4051c = this.f4016i;
        }
        if (savedState5.f4042j > 1) {
            LazySpanLookup lazySpanLookup = this.f4020m;
            lazySpanLookup.f4032a = savedState5.f4043k;
            lazySpanLookup.f4033b = savedState5.f4044l;
        }
    }

    private int computeScrollExtent(RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0635p.m4552a(c0613z, this.f4010c, m4355o(!this.f4029v), m4354n(!this.f4029v), this, this.f4029v);
    }

    private int computeScrollOffset(RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0635p.m4553b(c0613z, this.f4010c, m4355o(!this.f4029v), m4354n(!this.f4029v), this, this.f4029v, this.f4016i);
    }

    private int computeScrollRange(RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0635p.m4554c(c0613z, this.f4010c, m4355o(!this.f4029v), m4354n(!this.f4029v), this, this.f4029v);
    }

    private int convertFocusDirectionToLayoutDirection(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f4012e == 1) ? 1 : Integer.MIN_VALUE : this.f4012e == 0 ? 1 : Integer.MIN_VALUE : this.f4012e == 1 ? -1 : Integer.MIN_VALUE : this.f4012e == 0 ? -1 : Integer.MIN_VALUE : (this.f4012e != 1 && isLayoutRTL()) ? -1 : 1 : (this.f4012e != 1 && isLayoutRTL()) ? 1 : -1;
    }

    /* renamed from: e */
    private void m4329e(View view, C0618c c0618c, C0628i c0628i) {
        if (c0628i.f4201e == 1) {
            if (c0618c.f4057f) {
                m4327a(view);
                return;
            } else {
                c0618c.f4056e.m4387a(view);
                return;
            }
        }
        if (c0618c.f4057f) {
            m4316H(view);
        } else {
            c0618c.f4056e.m4407u(view);
        }
    }

    /* renamed from: f */
    private int m4330f(int i2) {
        if (getChildCount() == 0) {
            return this.f4016i ? 1 : -1;
        }
        return (i2 < m4357t()) != this.f4016i ? -1 : 1;
    }

    /* renamed from: h */
    private boolean m4331h(C0619d c0619d) {
        if (this.f4016i) {
            if (c0619d.m4397k() < this.f4010c.mo4538i()) {
                ArrayList<View> arrayList = c0619d.f4058a;
                return !c0619d.m4400n(arrayList.get(arrayList.size() - 1)).f4057f;
            }
        } else if (c0619d.m4401o() > this.f4010c.mo4542m()) {
            return !c0619d.m4400n(c0619d.f4058a.get(0)).f4057f;
        }
        return false;
    }

    /* renamed from: i */
    private LazySpanLookup.FullSpanItem m4332i(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4036h = new int[this.f4008a];
        for (int i3 = 0; i3 < this.f4008a; i3++) {
            fullSpanItem.f4036h[i3] = i2 - this.f4009b[i3].m4398l(i2);
        }
        return fullSpanItem;
    }

    /* renamed from: j */
    private LazySpanLookup.FullSpanItem m4333j(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4036h = new int[this.f4008a];
        for (int i3 = 0; i3 < this.f4008a; i3++) {
            fullSpanItem.f4036h[i3] = this.f4009b[i3].m4402p(i2) - i2;
        }
        return fullSpanItem;
    }

    /* renamed from: k */
    private void m4334k() {
        this.f4010c = AbstractC0633n.m4531b(this, this.f4012e);
        this.f4011d = AbstractC0633n.m4531b(this, 1 - this.f4012e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: l */
    private int m4335l(RecyclerView.C0609v c0609v, C0628i c0628i, RecyclerView.C0613z c0613z) {
        int i2;
        C0619d c0619dM4344z;
        int iMo4534e;
        int i3;
        int iMo4534e2;
        int iMo4534e3;
        ?? r9 = 0;
        this.f4017j.set(0, this.f4008a, true);
        if (this.f4014g.f4205i) {
            i2 = c0628i.f4201e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = c0628i.f4201e == 1 ? c0628i.f4203g + c0628i.f4198b : c0628i.f4202f - c0628i.f4198b;
        }
        m4322N(c0628i.f4201e, i2);
        int iMo4538i = this.f4016i ? this.f4010c.mo4538i() : this.f4010c.mo4542m();
        boolean z = false;
        while (c0628i.m4522a(c0613z) && (this.f4014g.f4205i || !this.f4017j.isEmpty())) {
            View viewM4523b = c0628i.m4523b(c0609v);
            C0618c c0618c = (C0618c) viewM4523b.getLayoutParams();
            int iM4238a = c0618c.m4238a();
            int iM4368g = this.f4020m.m4368g(iM4238a);
            boolean z2 = iM4368g == -1;
            if (z2) {
                c0619dM4344z = c0618c.f4057f ? this.f4009b[r9] : m4344z(c0628i);
                this.f4020m.m4372n(iM4238a, c0619dM4344z);
            } else {
                c0619dM4344z = this.f4009b[iM4368g];
            }
            C0619d c0619d = c0619dM4344z;
            c0618c.f4056e = c0619d;
            if (c0628i.f4201e == 1) {
                addView(viewM4523b);
            } else {
                addView(viewM4523b, r9);
            }
            m4313D(viewM4523b, c0618c, r9);
            if (c0628i.f4201e == 1) {
                int iM4340v = c0618c.f4057f ? m4340v(iMo4538i) : c0619d.m4398l(iMo4538i);
                int iMo4534e4 = this.f4010c.mo4534e(viewM4523b) + iM4340v;
                if (z2 && c0618c.f4057f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM4332i = m4332i(iM4340v);
                    fullSpanItemM4332i.f4035g = -1;
                    fullSpanItemM4332i.f4034f = iM4238a;
                    this.f4020m.m4362a(fullSpanItemM4332i);
                }
                i3 = iMo4534e4;
                iMo4534e = iM4340v;
            } else {
                int iM4343y = c0618c.f4057f ? m4343y(iMo4538i) : c0619d.m4402p(iMo4538i);
                iMo4534e = iM4343y - this.f4010c.mo4534e(viewM4523b);
                if (z2 && c0618c.f4057f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM4333j = m4333j(iM4343y);
                    fullSpanItemM4333j.f4035g = 1;
                    fullSpanItemM4333j.f4034f = iM4238a;
                    this.f4020m.m4362a(fullSpanItemM4333j);
                }
                i3 = iM4343y;
            }
            if (c0618c.f4057f && c0628i.f4200d == -1) {
                if (z2) {
                    this.f4028u = true;
                } else {
                    if (!(c0628i.f4201e == 1 ? m4351c() : m4352d())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM4367f = this.f4020m.m4367f(iM4238a);
                        if (fullSpanItemM4367f != null) {
                            fullSpanItemM4367f.f4037i = true;
                        }
                        this.f4028u = true;
                    }
                }
            }
            m4329e(viewM4523b, c0618c, c0628i);
            if (isLayoutRTL() && this.f4012e == 1) {
                int iMo4538i2 = c0618c.f4057f ? this.f4011d.mo4538i() : this.f4011d.mo4538i() - (((this.f4008a - 1) - c0619d.f4062e) * this.f4013f);
                iMo4534e3 = iMo4538i2;
                iMo4534e2 = iMo4538i2 - this.f4011d.mo4534e(viewM4523b);
            } else {
                int iMo4542m = c0618c.f4057f ? this.f4011d.mo4542m() : (c0619d.f4062e * this.f4013f) + this.f4011d.mo4542m();
                iMo4534e2 = iMo4542m;
                iMo4534e3 = this.f4011d.mo4534e(viewM4523b) + iMo4542m;
            }
            if (this.f4012e == 1) {
                layoutDecoratedWithMargins(viewM4523b, iMo4534e2, iMo4534e, iMo4534e3, i3);
            } else {
                layoutDecoratedWithMargins(viewM4523b, iMo4534e, iMo4534e2, i3, iMo4534e3);
            }
            if (c0618c.f4057f) {
                m4322N(this.f4014g.f4201e, i2);
            } else {
                m4325T(c0619d, this.f4014g.f4201e, i2);
            }
            m4317I(c0609v, this.f4014g);
            if (this.f4014g.f4204h && viewM4523b.hasFocusable()) {
                if (c0618c.f4057f) {
                    this.f4017j.clear();
                } else {
                    this.f4017j.set(c0619d.f4062e, false);
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m4317I(c0609v, this.f4014g);
        }
        int iMo4542m2 = this.f4014g.f4201e == -1 ? this.f4010c.mo4542m() - m4343y(this.f4010c.mo4542m()) : m4340v(this.f4010c.mo4538i()) - this.f4010c.mo4538i();
        if (iMo4542m2 > 0) {
            return Math.min(c0628i.f4198b, iMo4542m2);
        }
        return 0;
    }

    /* renamed from: m */
    private int m4336m(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            int position = getPosition(getChildAt(i3));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    private void measureChildWithDecorationsAndMargin(View view, int i2, int i3, boolean z) {
        calculateItemDecorationsForChild(view, this.f4026s);
        C0618c c0618c = (C0618c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0618c).leftMargin;
        Rect rect = this.f4026s;
        int iM4326U = m4326U(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) c0618c).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) c0618c).topMargin;
        Rect rect2 = this.f4026s;
        int iM4326U2 = m4326U(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) c0618c).bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, iM4326U, iM4326U2, c0618c) : shouldMeasureChild(view, iM4326U, iM4326U2, c0618c)) {
            view.measure(iM4326U, iM4326U2);
        }
    }

    /* renamed from: q */
    private int m4337q(int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: r */
    private void m4338r(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, boolean z) {
        int iMo4538i;
        int iM4340v = m4340v(Integer.MIN_VALUE);
        if (iM4340v != Integer.MIN_VALUE && (iMo4538i = this.f4010c.mo4538i() - iM4340v) > 0) {
            int i2 = iMo4538i - (-scrollBy(-iMo4538i, c0609v, c0613z));
            if (!z || i2 <= 0) {
                return;
            }
            this.f4010c.mo4547r(i2);
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.f4012e == 1 || !isLayoutRTL()) {
            this.f4016i = this.f4015h;
        } else {
            this.f4016i = !this.f4015h;
        }
    }

    /* renamed from: s */
    private void m4339s(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, boolean z) {
        int iMo4542m;
        int iM4343y = m4343y(Integer.MAX_VALUE);
        if (iM4343y != Integer.MAX_VALUE && (iMo4542m = iM4343y - this.f4010c.mo4542m()) > 0) {
            int iScrollBy = iMo4542m - scrollBy(iMo4542m, c0609v, c0613z);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f4010c.mo4547r(-iScrollBy);
        }
    }

    /* renamed from: v */
    private int m4340v(int i2) {
        int iM4398l = this.f4009b[0].m4398l(i2);
        for (int i3 = 1; i3 < this.f4008a; i3++) {
            int iM4398l2 = this.f4009b[i3].m4398l(i2);
            if (iM4398l2 > iM4398l) {
                iM4398l = iM4398l2;
            }
        }
        return iM4398l;
    }

    /* renamed from: w */
    private int m4341w(int i2) {
        int iM4402p = this.f4009b[0].m4402p(i2);
        for (int i3 = 1; i3 < this.f4008a; i3++) {
            int iM4402p2 = this.f4009b[i3].m4402p(i2);
            if (iM4402p2 > iM4402p) {
                iM4402p = iM4402p2;
            }
        }
        return iM4402p;
    }

    /* renamed from: x */
    private int m4342x(int i2) {
        int iM4398l = this.f4009b[0].m4398l(i2);
        for (int i3 = 1; i3 < this.f4008a; i3++) {
            int iM4398l2 = this.f4009b[i3].m4398l(i2);
            if (iM4398l2 < iM4398l) {
                iM4398l = iM4398l2;
            }
        }
        return iM4398l;
    }

    /* renamed from: y */
    private int m4343y(int i2) {
        int iM4402p = this.f4009b[0].m4402p(i2);
        for (int i3 = 1; i3 < this.f4008a; i3++) {
            int iM4402p2 = this.f4009b[i3].m4402p(i2);
            if (iM4402p2 < iM4402p) {
                iM4402p = iM4402p2;
            }
        }
        return iM4402p;
    }

    /* renamed from: z */
    private C0619d m4344z(C0628i c0628i) {
        int i2;
        int i3;
        int i4 = -1;
        if (m4315F(c0628i.f4201e)) {
            i2 = this.f4008a - 1;
            i3 = -1;
        } else {
            i2 = 0;
            i4 = this.f4008a;
            i3 = 1;
        }
        C0619d c0619d = null;
        if (c0628i.f4201e == 1) {
            int i5 = Integer.MAX_VALUE;
            int iMo4542m = this.f4010c.mo4542m();
            while (i2 != i4) {
                C0619d c0619d2 = this.f4009b[i2];
                int iM4398l = c0619d2.m4398l(iMo4542m);
                if (iM4398l < i5) {
                    c0619d = c0619d2;
                    i5 = iM4398l;
                }
                i2 += i3;
            }
            return c0619d;
        }
        int i6 = Integer.MIN_VALUE;
        int iMo4538i = this.f4010c.mo4538i();
        while (i2 != i4) {
            C0619d c0619d3 = this.f4009b[i2];
            int iM4402p = c0619d3.m4402p(iMo4538i);
            if (iM4402p > i6) {
                c0619d = c0619d3;
                i6 = iM4402p;
            }
            i2 += i3;
        }
        return c0619d;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View m4345B() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4008a
            r2.<init>(r3)
            int r3 = r12.f4008a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4012e
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f4016i
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0618c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4056e
            int r9 = r9.f4062e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4056e
            boolean r9 = r12.m4331h(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4056e
            int r9 = r9.f4062e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4057f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f4016i
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.n r10 = r12.f4010c
            int r10 = r10.mo4533d(r7)
            androidx.recyclerview.widget.n r11 = r12.f4010c
            int r11 = r11.mo4533d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.n r10 = r12.f4010c
            int r10 = r10.mo4536g(r7)
            androidx.recyclerview.widget.n r11 = r12.f4010c
            int r11 = r11.mo4536g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0618c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f4056e
            int r8 = r8.f4062e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f4056e
            int r9 = r9.f4062e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4345B():android.view.View");
    }

    /* renamed from: C */
    public void m4346C() {
        this.f4020m.m4363b();
        requestLayout();
    }

    /* renamed from: G */
    void m4347G(int i2, RecyclerView.C0613z c0613z) {
        int iM4357t;
        int i3;
        if (i2 > 0) {
            iM4357t = m4358u();
            i3 = 1;
        } else {
            iM4357t = m4357t();
            i3 = -1;
        }
        this.f4014g.f4197a = true;
        m4324R(iM4357t, c0613z);
        m4321M(i3);
        C0628i c0628i = this.f4014g;
        c0628i.f4199c = iM4357t + c0628i.f4200d;
        c0628i.f4198b = Math.abs(i2);
    }

    /* renamed from: P */
    boolean m4348P(RecyclerView.C0613z c0613z, C0617b c0617b) {
        int i2;
        if (!c0613z.m4309e() && (i2 = this.f4018k) != -1) {
            if (i2 >= 0 && i2 < c0613z.m4306b()) {
                SavedState savedState = this.f4024q;
                if (savedState == null || savedState.f4038f == -1 || savedState.f4040h < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f4018k);
                    if (viewFindViewByPosition != null) {
                        c0617b.f4049a = this.f4016i ? m4358u() : m4357t();
                        if (this.f4019l != Integer.MIN_VALUE) {
                            if (c0617b.f4051c) {
                                c0617b.f4050b = (this.f4010c.mo4538i() - this.f4019l) - this.f4010c.mo4533d(viewFindViewByPosition);
                            } else {
                                c0617b.f4050b = (this.f4010c.mo4542m() + this.f4019l) - this.f4010c.mo4536g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f4010c.mo4534e(viewFindViewByPosition) > this.f4010c.mo4543n()) {
                            c0617b.f4050b = c0617b.f4051c ? this.f4010c.mo4538i() : this.f4010c.mo4542m();
                            return true;
                        }
                        int iMo4536g = this.f4010c.mo4536g(viewFindViewByPosition) - this.f4010c.mo4542m();
                        if (iMo4536g < 0) {
                            c0617b.f4050b = -iMo4536g;
                            return true;
                        }
                        int iMo4538i = this.f4010c.mo4538i() - this.f4010c.mo4533d(viewFindViewByPosition);
                        if (iMo4538i < 0) {
                            c0617b.f4050b = iMo4538i;
                            return true;
                        }
                        c0617b.f4050b = Integer.MIN_VALUE;
                    } else {
                        int i3 = this.f4018k;
                        c0617b.f4049a = i3;
                        int i4 = this.f4019l;
                        if (i4 == Integer.MIN_VALUE) {
                            c0617b.f4051c = m4330f(i3) == 1;
                            c0617b.m4381a();
                        } else {
                            c0617b.m4382b(i4);
                        }
                        c0617b.f4052d = true;
                    }
                } else {
                    c0617b.f4050b = Integer.MIN_VALUE;
                    c0617b.f4049a = this.f4018k;
                }
                return true;
            }
            this.f4018k = -1;
            this.f4019l = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: Q */
    void m4349Q(RecyclerView.C0613z c0613z, C0617b c0617b) {
        if (m4348P(c0613z, c0617b) || m4323O(c0613z, c0617b)) {
            return;
        }
        c0617b.m4381a();
        c0617b.f4049a = 0;
    }

    /* renamed from: S */
    void m4350S(int i2) {
        this.f4013f = i2 / this.f4008a;
        this.f4025r = View.MeasureSpec.makeMeasureSpec(i2, this.f4011d.mo4540k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f4024q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: c */
    boolean m4351c() {
        int iM4398l = this.f4009b[0].m4398l(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f4008a; i2++) {
            if (this.f4009b[i2].m4398l(Integer.MIN_VALUE) != iM4398l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean canScrollHorizontally() {
        return this.f4012e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean canScrollVertically() {
        return this.f4012e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean checkLayoutParams(RecyclerView.C0603p c0603p) {
        return c0603p instanceof C0618c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.C0613z c0613z, RecyclerView.AbstractC0602o.c cVar) {
        int iM4398l;
        int iM4402p;
        if (this.f4012e != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        m4347G(i2, c0613z);
        int[] iArr = this.f4030w;
        if (iArr == null || iArr.length < this.f4008a) {
            this.f4030w = new int[this.f4008a];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f4008a; i5++) {
            C0628i c0628i = this.f4014g;
            if (c0628i.f4200d == -1) {
                iM4398l = c0628i.f4202f;
                iM4402p = this.f4009b[i5].m4402p(iM4398l);
            } else {
                iM4398l = this.f4009b[i5].m4398l(c0628i.f4203g);
                iM4402p = this.f4014g.f4203g;
            }
            int i6 = iM4398l - iM4402p;
            if (i6 >= 0) {
                this.f4030w[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f4030w, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f4014g.m4522a(c0613z); i7++) {
            cVar.mo4237a(this.f4014g.f4199c, this.f4030w[i7]);
            C0628i c0628i2 = this.f4014g;
            c0628i2.f4199c += c0628i2.f4200d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollExtent(RecyclerView.C0613z c0613z) {
        return computeScrollExtent(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollOffset(RecyclerView.C0613z c0613z) {
        return computeScrollOffset(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollRange(RecyclerView.C0613z c0613z) {
        return computeScrollRange(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0612y.b
    public PointF computeScrollVectorForPosition(int i2) {
        int iM4330f = m4330f(i2);
        PointF pointF = new PointF();
        if (iM4330f == 0) {
            return null;
        }
        if (this.f4012e == 0) {
            pointF.x = iM4330f;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM4330f;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollExtent(RecyclerView.C0613z c0613z) {
        return computeScrollExtent(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollOffset(RecyclerView.C0613z c0613z) {
        return computeScrollOffset(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollRange(RecyclerView.C0613z c0613z) {
        return computeScrollRange(c0613z);
    }

    /* renamed from: d */
    boolean m4352d() {
        int iM4402p = this.f4009b[0].m4402p(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f4008a; i2++) {
            if (this.f4009b[i2].m4402p(Integer.MIN_VALUE) != iM4402p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    boolean m4353g() {
        int iM4357t;
        int iM4358u;
        if (getChildCount() == 0 || this.f4021n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f4016i) {
            iM4357t = m4358u();
            iM4358u = m4357t();
        } else {
            iM4357t = m4357t();
            iM4358u = m4358u();
        }
        if (iM4357t == 0 && m4345B() != null) {
            this.f4020m.m4363b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f4028u) {
            return false;
        }
        int i2 = this.f4016i ? -1 : 1;
        int i3 = iM4358u + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM4366e = this.f4020m.m4366e(iM4357t, i3, i2, true);
        if (fullSpanItemM4366e == null) {
            this.f4028u = false;
            this.f4020m.m4365d(i3);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM4366e2 = this.f4020m.m4366e(iM4357t, fullSpanItemM4366e.f4034f, i2 * (-1), true);
        if (fullSpanItemM4366e2 == null) {
            this.f4020m.m4365d(fullSpanItemM4366e.f4034f);
        } else {
            this.f4020m.m4365d(fullSpanItemM4366e2.f4034f + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public RecyclerView.C0603p generateDefaultLayoutParams() {
        return this.f4012e == 0 ? new C0618c(-2, -1) : new C0618c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public RecyclerView.C0603p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0618c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int getColumnCountForAccessibility(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return this.f4012e == 1 ? this.f4008a : super.getColumnCountForAccessibility(c0609v, c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int getRowCountForAccessibility(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return this.f4012e == 0 ? this.f4008a : super.getRowCountForAccessibility(c0609v, c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean isAutoMeasureEnabled() {
        return this.f4021n != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: n */
    View m4354n(boolean z) {
        int iMo4542m = this.f4010c.mo4542m();
        int iMo4538i = this.f4010c.mo4538i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo4536g = this.f4010c.mo4536g(childAt);
            int iMo4533d = this.f4010c.mo4533d(childAt);
            if (iMo4533d > iMo4542m && iMo4536g < iMo4538i) {
                if (iMo4533d <= iMo4538i || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: o */
    View m4355o(boolean z) {
        int iMo4542m = this.f4010c.mo4542m();
        int iMo4538i = this.f4010c.mo4538i();
        int childCount = getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int iMo4536g = this.f4010c.mo4536g(childAt);
            if (this.f4010c.mo4533d(childAt) > iMo4542m && iMo4536g < iMo4538i) {
                if (iMo4536g >= iMo4542m || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void offsetChildrenHorizontal(int i2) {
        super.offsetChildrenHorizontal(i2);
        for (int i3 = 0; i3 < this.f4008a; i3++) {
            this.f4009b[i3].m4404r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void offsetChildrenVertical(int i2) {
        super.offsetChildrenVertical(i2);
        for (int i3 = 0; i3 < this.f4008a; i3++) {
            this.f4009b[i3].m4404r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0609v c0609v) {
        super.onDetachedFromWindow(recyclerView, c0609v);
        removeCallbacks(this.f4031x);
        for (int i2 = 0; i2 < this.f4008a; i2++) {
            this.f4009b[i2].m4391e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public View onFocusSearchFailed(View view, int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        View viewFindContainingItemView;
        View viewM4399m;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        C0618c c0618c = (C0618c) viewFindContainingItemView.getLayoutParams();
        boolean z = c0618c.f4057f;
        C0619d c0619d = c0618c.f4056e;
        int iM4358u = iConvertFocusDirectionToLayoutDirection == 1 ? m4358u() : m4357t();
        m4324R(iM4358u, c0613z);
        m4321M(iConvertFocusDirectionToLayoutDirection);
        C0628i c0628i = this.f4014g;
        c0628i.f4199c = c0628i.f4200d + iM4358u;
        c0628i.f4198b = (int) (this.f4010c.mo4543n() * 0.33333334f);
        C0628i c0628i2 = this.f4014g;
        c0628i2.f4204h = true;
        c0628i2.f4197a = false;
        m4335l(c0609v, c0628i2, c0613z);
        this.f4022o = this.f4016i;
        if (!z && (viewM4399m = c0619d.m4399m(iM4358u, iConvertFocusDirectionToLayoutDirection)) != null && viewM4399m != viewFindContainingItemView) {
            return viewM4399m;
        }
        if (m4315F(iConvertFocusDirectionToLayoutDirection)) {
            for (int i3 = this.f4008a - 1; i3 >= 0; i3--) {
                View viewM4399m2 = this.f4009b[i3].m4399m(iM4358u, iConvertFocusDirectionToLayoutDirection);
                if (viewM4399m2 != null && viewM4399m2 != viewFindContainingItemView) {
                    return viewM4399m2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f4008a; i4++) {
                View viewM4399m3 = this.f4009b[i4].m4399m(iM4358u, iConvertFocusDirectionToLayoutDirection);
                if (viewM4399m3 != null && viewM4399m3 != viewFindContainingItemView) {
                    return viewM4399m3;
                }
            }
        }
        boolean z2 = (this.f4015h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            View viewFindViewByPosition = findViewByPosition(z2 ? c0619d.m4392f() : c0619d.m4393g());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (m4315F(iConvertFocusDirectionToLayoutDirection)) {
            for (int i5 = this.f4008a - 1; i5 >= 0; i5--) {
                if (i5 != c0619d.f4062e) {
                    View viewFindViewByPosition2 = findViewByPosition(z2 ? this.f4009b[i5].m4392f() : this.f4009b[i5].m4393g());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f4008a; i6++) {
                View viewFindViewByPosition3 = findViewByPosition(z2 ? this.f4009b[i6].m4392f() : this.f4009b[i6].m4393g());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM4355o = m4355o(false);
            View viewM4354n = m4354n(false);
            if (viewM4355o == null || viewM4354n == null) {
                return;
            }
            int position = getPosition(viewM4355o);
            int position2 = getPosition(viewM4354n);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, View view, C0289c c0289c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0618c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c0289c);
            return;
        }
        C0618c c0618c = (C0618c) layoutParams;
        if (this.f4012e == 0) {
            c0289c.m1975b0(C0289c.c.m2017f(c0618c.m4385e(), c0618c.f4057f ? this.f4008a : 1, -1, -1, false, false));
        } else {
            c0289c.m1975b0(C0289c.c.m2017f(-1, -1, c0618c.m4385e(), c0618c.f4057f ? this.f4008a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        m4312A(i2, i3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f4020m.m4363b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        m4312A(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        m4312A(i2, i3, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        m4312A(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onLayoutChildren(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        m4314E(c0609v, c0613z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onLayoutCompleted(RecyclerView.C0613z c0613z) {
        super.onLayoutCompleted(c0613z);
        this.f4018k = -1;
        this.f4019l = Integer.MIN_VALUE;
        this.f4024q = null;
        this.f4027t.m4383c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4024q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public Parcelable onSaveInstanceState() {
        int iM4402p;
        int iMo4542m;
        int[] iArr;
        if (this.f4024q != null) {
            return new SavedState(this.f4024q);
        }
        SavedState savedState = new SavedState();
        savedState.f4045m = this.f4015h;
        savedState.f4046n = this.f4022o;
        savedState.f4047o = this.f4023p;
        LazySpanLookup lazySpanLookup = this.f4020m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f4032a) == null) {
            savedState.f4042j = 0;
        } else {
            savedState.f4043k = iArr;
            savedState.f4042j = iArr.length;
            savedState.f4044l = lazySpanLookup.f4033b;
        }
        if (getChildCount() > 0) {
            savedState.f4038f = this.f4022o ? m4358u() : m4357t();
            savedState.f4039g = m4356p();
            int i2 = this.f4008a;
            savedState.f4040h = i2;
            savedState.f4041i = new int[i2];
            for (int i3 = 0; i3 < this.f4008a; i3++) {
                if (this.f4022o) {
                    iM4402p = this.f4009b[i3].m4398l(Integer.MIN_VALUE);
                    if (iM4402p != Integer.MIN_VALUE) {
                        iMo4542m = this.f4010c.mo4538i();
                        iM4402p -= iMo4542m;
                    }
                } else {
                    iM4402p = this.f4009b[i3].m4402p(Integer.MIN_VALUE);
                    if (iM4402p != Integer.MIN_VALUE) {
                        iMo4542m = this.f4010c.mo4542m();
                        iM4402p -= iMo4542m;
                    }
                }
                savedState.f4041i[i3] = iM4402p;
            }
        } else {
            savedState.f4038f = -1;
            savedState.f4039g = -1;
            savedState.f4040h = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onScrollStateChanged(int i2) {
        if (i2 == 0) {
            m4353g();
        }
    }

    /* renamed from: p */
    int m4356p() {
        View viewM4354n = this.f4016i ? m4354n(true) : m4355o(true);
        if (viewM4354n == null) {
            return -1;
        }
        return getPosition(viewM4354n);
    }

    int scrollBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        m4347G(i2, c0613z);
        int iM4335l = m4335l(c0609v, this.f4014g, c0613z);
        if (this.f4014g.f4198b >= iM4335l) {
            i2 = i2 < 0 ? -iM4335l : iM4335l;
        }
        this.f4010c.mo4547r(-i2);
        this.f4022o = this.f4016i;
        C0628i c0628i = this.f4014g;
        c0628i.f4198b = 0;
        m4317I(c0609v, c0628i);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int scrollHorizontallyBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return scrollBy(i2, c0609v, c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void scrollToPosition(int i2) {
        SavedState savedState = this.f4024q;
        if (savedState != null && savedState.f4038f != i2) {
            savedState.m4377a();
        }
        this.f4018k = i2;
        this.f4019l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int scrollVerticallyBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return scrollBy(i2, c0609v, c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f4012e == 1) {
            iChooseSize2 = RecyclerView.AbstractC0602o.chooseSize(i3, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.AbstractC0602o.chooseSize(i2, (this.f4013f * this.f4008a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0602o.chooseSize(i2, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.AbstractC0602o.chooseSize(i3, (this.f4013f * this.f4008a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i2 == this.f4012e) {
            return;
        }
        this.f4012e = i2;
        AbstractC0633n abstractC0633n = this.f4010c;
        this.f4010c = this.f4011d;
        this.f4011d = abstractC0633n;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f4024q;
        if (savedState != null && savedState.f4045m != z) {
            savedState.f4045m = z;
        }
        this.f4015h = z;
        requestLayout();
    }

    public void setSpanCount(int i2) {
        assertNotInLayoutOrScroll(null);
        if (i2 != this.f4008a) {
            m4346C();
            this.f4008a = i2;
            this.f4017j = new BitSet(this.f4008a);
            this.f4009b = new C0619d[this.f4008a];
            for (int i3 = 0; i3 < this.f4008a; i3++) {
                this.f4009b[i3] = new C0619d(i3);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0613z c0613z, int i2) {
        C0629j c0629j = new C0629j(recyclerView.getContext());
        c0629j.setTargetPosition(i2);
        startSmoothScroll(c0629j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean supportsPredictiveItemAnimations() {
        return this.f4024q == null;
    }

    /* renamed from: t */
    int m4357t() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: u */
    int m4358u() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public RecyclerView.C0603p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0618c((ViewGroup.MarginLayoutParams) layoutParams) : new C0618c(layoutParams);
    }

    static class LazySpanLookup {

        /* renamed from: a */
        int[] f4032a;

        /* renamed from: b */
        List<FullSpanItem> f4033b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m4359i(int i2) {
            if (this.f4033b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM4367f = m4367f(i2);
            if (fullSpanItemM4367f != null) {
                this.f4033b.remove(fullSpanItemM4367f);
            }
            int size = this.f4033b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (this.f4033b.get(i3).f4034f >= i2) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f4033b.get(i3);
            this.f4033b.remove(i3);
            return fullSpanItem.f4034f;
        }

        /* renamed from: l */
        private void m4360l(int i2, int i3) {
            List<FullSpanItem> list = this.f4033b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4033b.get(size);
                int i4 = fullSpanItem.f4034f;
                if (i4 >= i2) {
                    fullSpanItem.f4034f = i4 + i3;
                }
            }
        }

        /* renamed from: m */
        private void m4361m(int i2, int i3) {
            List<FullSpanItem> list = this.f4033b;
            if (list == null) {
                return;
            }
            int i4 = i2 + i3;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4033b.get(size);
                int i5 = fullSpanItem.f4034f;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f4033b.remove(size);
                    } else {
                        fullSpanItem.f4034f = i5 - i3;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m4362a(FullSpanItem fullSpanItem) {
            if (this.f4033b == null) {
                this.f4033b = new ArrayList();
            }
            int size = this.f4033b.size();
            for (int i2 = 0; i2 < size; i2++) {
                FullSpanItem fullSpanItem2 = this.f4033b.get(i2);
                if (fullSpanItem2.f4034f == fullSpanItem.f4034f) {
                    this.f4033b.remove(i2);
                }
                if (fullSpanItem2.f4034f >= fullSpanItem.f4034f) {
                    this.f4033b.add(i2, fullSpanItem);
                    return;
                }
            }
            this.f4033b.add(fullSpanItem);
        }

        /* renamed from: b */
        void m4363b() {
            int[] iArr = this.f4032a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4033b = null;
        }

        /* renamed from: c */
        void m4364c(int i2) {
            int[] iArr = this.f4032a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.f4032a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[m4373o(i2)];
                this.f4032a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4032a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m4365d(int i2) {
            List<FullSpanItem> list = this.f4033b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4033b.get(size).f4034f >= i2) {
                        this.f4033b.remove(size);
                    }
                }
            }
            return m4369h(i2);
        }

        /* renamed from: e */
        public FullSpanItem m4366e(int i2, int i3, int i4, boolean z) {
            List<FullSpanItem> list = this.f4033b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                FullSpanItem fullSpanItem = this.f4033b.get(i5);
                int i6 = fullSpanItem.f4034f;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || fullSpanItem.f4035g == i4 || (z && fullSpanItem.f4037i))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m4367f(int i2) {
            List<FullSpanItem> list = this.f4033b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4033b.get(size);
                if (fullSpanItem.f4034f == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m4368g(int i2) {
            int[] iArr = this.f4032a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        /* renamed from: h */
        int m4369h(int i2) {
            int[] iArr = this.f4032a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int iM4359i = m4359i(i2);
            if (iM4359i == -1) {
                int[] iArr2 = this.f4032a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.f4032a.length;
            }
            int i3 = iM4359i + 1;
            Arrays.fill(this.f4032a, i2, i3, -1);
            return i3;
        }

        /* renamed from: j */
        void m4370j(int i2, int i3) {
            int[] iArr = this.f4032a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            m4364c(i4);
            int[] iArr2 = this.f4032a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.f4032a, i2, i4, -1);
            m4360l(i2, i3);
        }

        /* renamed from: k */
        void m4371k(int i2, int i3) {
            int[] iArr = this.f4032a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            m4364c(i4);
            int[] iArr2 = this.f4032a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.f4032a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            m4361m(i2, i3);
        }

        /* renamed from: n */
        void m4372n(int i2, C0619d c0619d) {
            m4364c(i2);
            this.f4032a[i2] = c0619d.f4062e;
        }

        /* renamed from: o */
        int m4373o(int i2) {
            int length = this.f4032a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0614a();

            /* renamed from: f */
            int f4034f;

            /* renamed from: g */
            int f4035g;

            /* renamed from: h */
            int[] f4036h;

            /* renamed from: i */
            boolean f4037i;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            static class C0614a implements Parcelable.Creator<FullSpanItem> {
                C0614a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f4034f = parcel.readInt();
                this.f4035g = parcel.readInt();
                this.f4037i = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    this.f4036h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m4374a(int i2) {
                int[] iArr = this.f4036h;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4034f + ", mGapDir=" + this.f4035g + ", mHasUnwantedGapAfter=" + this.f4037i + ", mGapPerSpan=" + Arrays.toString(this.f4036h) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f4034f);
                parcel.writeInt(this.f4035g);
                parcel.writeInt(this.f4037i ? 1 : 0);
                int[] iArr = this.f4036h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4036h);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
