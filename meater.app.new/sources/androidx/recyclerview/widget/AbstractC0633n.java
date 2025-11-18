package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC0633n {

    /* renamed from: a */
    protected final RecyclerView.AbstractC0602o f4207a;

    /* renamed from: b */
    private int f4208b;

    /* renamed from: c */
    final Rect f4209c;

    /* compiled from: OrientationHelper.java */
    /* renamed from: androidx.recyclerview.widget.n$a */
    static class a extends AbstractC0633n {
        a(RecyclerView.AbstractC0602o abstractC0602o) {
            super(abstractC0602o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: d */
        public int mo4533d(View view) {
            return this.f4207a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0603p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: e */
        public int mo4534e(View view) {
            RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
            return this.f4207a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0603p).leftMargin + ((ViewGroup.MarginLayoutParams) c0603p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: f */
        public int mo4535f(View view) {
            RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
            return this.f4207a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0603p).topMargin + ((ViewGroup.MarginLayoutParams) c0603p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: g */
        public int mo4536g(View view) {
            return this.f4207a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0603p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: h */
        public int mo4537h() {
            return this.f4207a.getWidth();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: i */
        public int mo4538i() {
            return this.f4207a.getWidth() - this.f4207a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: j */
        public int mo4539j() {
            return this.f4207a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: k */
        public int mo4540k() {
            return this.f4207a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: l */
        public int mo4541l() {
            return this.f4207a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: m */
        public int mo4542m() {
            return this.f4207a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: n */
        public int mo4543n() {
            return (this.f4207a.getWidth() - this.f4207a.getPaddingLeft()) - this.f4207a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: p */
        public int mo4545p(View view) {
            this.f4207a.getTransformedBoundingBox(view, true, this.f4209c);
            return this.f4209c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: q */
        public int mo4546q(View view) {
            this.f4207a.getTransformedBoundingBox(view, true, this.f4209c);
            return this.f4209c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: r */
        public void mo4547r(int i2) {
            this.f4207a.offsetChildrenHorizontal(i2);
        }
    }

    /* compiled from: OrientationHelper.java */
    /* renamed from: androidx.recyclerview.widget.n$b */
    static class b extends AbstractC0633n {
        b(RecyclerView.AbstractC0602o abstractC0602o) {
            super(abstractC0602o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: d */
        public int mo4533d(View view) {
            return this.f4207a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0603p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: e */
        public int mo4534e(View view) {
            RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
            return this.f4207a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0603p).topMargin + ((ViewGroup.MarginLayoutParams) c0603p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: f */
        public int mo4535f(View view) {
            RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
            return this.f4207a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0603p).leftMargin + ((ViewGroup.MarginLayoutParams) c0603p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: g */
        public int mo4536g(View view) {
            return this.f4207a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0603p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: h */
        public int mo4537h() {
            return this.f4207a.getHeight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: i */
        public int mo4538i() {
            return this.f4207a.getHeight() - this.f4207a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: j */
        public int mo4539j() {
            return this.f4207a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: k */
        public int mo4540k() {
            return this.f4207a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: l */
        public int mo4541l() {
            return this.f4207a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: m */
        public int mo4542m() {
            return this.f4207a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: n */
        public int mo4543n() {
            return (this.f4207a.getHeight() - this.f4207a.getPaddingTop()) - this.f4207a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: p */
        public int mo4545p(View view) {
            this.f4207a.getTransformedBoundingBox(view, true, this.f4209c);
            return this.f4209c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: q */
        public int mo4546q(View view) {
            this.f4207a.getTransformedBoundingBox(view, true, this.f4209c);
            return this.f4209c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0633n
        /* renamed from: r */
        public void mo4547r(int i2) {
            this.f4207a.offsetChildrenVertical(i2);
        }
    }

    /* synthetic */ AbstractC0633n(RecyclerView.AbstractC0602o abstractC0602o, a aVar) {
        this(abstractC0602o);
    }

    /* renamed from: a */
    public static AbstractC0633n m4530a(RecyclerView.AbstractC0602o abstractC0602o) {
        return new a(abstractC0602o);
    }

    /* renamed from: b */
    public static AbstractC0633n m4531b(RecyclerView.AbstractC0602o abstractC0602o, int i2) {
        if (i2 == 0) {
            return m4530a(abstractC0602o);
        }
        if (i2 == 1) {
            return m4532c(abstractC0602o);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC0633n m4532c(RecyclerView.AbstractC0602o abstractC0602o) {
        return new b(abstractC0602o);
    }

    /* renamed from: d */
    public abstract int mo4533d(View view);

    /* renamed from: e */
    public abstract int mo4534e(View view);

    /* renamed from: f */
    public abstract int mo4535f(View view);

    /* renamed from: g */
    public abstract int mo4536g(View view);

    /* renamed from: h */
    public abstract int mo4537h();

    /* renamed from: i */
    public abstract int mo4538i();

    /* renamed from: j */
    public abstract int mo4539j();

    /* renamed from: k */
    public abstract int mo4540k();

    /* renamed from: l */
    public abstract int mo4541l();

    /* renamed from: m */
    public abstract int mo4542m();

    /* renamed from: n */
    public abstract int mo4543n();

    /* renamed from: o */
    public int m4544o() {
        if (Integer.MIN_VALUE == this.f4208b) {
            return 0;
        }
        return mo4543n() - this.f4208b;
    }

    /* renamed from: p */
    public abstract int mo4545p(View view);

    /* renamed from: q */
    public abstract int mo4546q(View view);

    /* renamed from: r */
    public abstract void mo4547r(int i2);

    /* renamed from: s */
    public void m4548s() {
        this.f4208b = mo4543n();
    }

    private AbstractC0633n(RecyclerView.AbstractC0602o abstractC0602o) {
        this.f4208b = Integer.MIN_VALUE;
        this.f4209c = new Rect();
        this.f4207a = abstractC0602o;
    }
}
