package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0311u;
import com.google.android.material.internal.C8030h;
import com.google.android.material.internal.C8032j;
import java.lang.ref.WeakReference;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8915i;
import p241e.p254e.p256b.p271c.C8916j;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p285x.C8948d;

/* loaded from: classes2.dex */
public class BadgeDrawable extends Drawable implements C8030h.b {

    /* renamed from: f */
    private static final int f29677f = C8917k.f33989n;

    /* renamed from: g */
    private static final int f29678g = C8908b.f33813c;

    /* renamed from: h */
    private final WeakReference<Context> f29679h;

    /* renamed from: i */
    private final C8900g f29680i;

    /* renamed from: j */
    private final C8030h f29681j;

    /* renamed from: k */
    private final Rect f29682k;

    /* renamed from: l */
    private final float f29683l;

    /* renamed from: m */
    private final float f29684m;

    /* renamed from: n */
    private final float f29685n;

    /* renamed from: o */
    private final SavedState f29686o;

    /* renamed from: p */
    private float f29687p;

    /* renamed from: q */
    private float f29688q;

    /* renamed from: r */
    private int f29689r;

    /* renamed from: s */
    private float f29690s;

    /* renamed from: t */
    private float f29691t;

    /* renamed from: u */
    private float f29692u;

    /* renamed from: v */
    private WeakReference<View> f29693v;

    /* renamed from: w */
    private WeakReference<ViewGroup> f29694w;

    private BadgeDrawable(Context context) throws Resources.NotFoundException {
        this.f29679h = new WeakReference<>(context);
        C8032j.m24689c(context);
        Resources resources = context.getResources();
        this.f29682k = new Rect();
        this.f29680i = new C8900g();
        this.f29683l = resources.getDimensionPixelSize(C8910d.f33884s);
        this.f29685n = resources.getDimensionPixelSize(C8910d.f33883r);
        this.f29684m = resources.getDimensionPixelSize(C8910d.f33886u);
        C8030h c8030h = new C8030h(this);
        this.f29681j = c8030h;
        c8030h.m24680e().setTextAlign(Paint.Align.CENTER);
        this.f29686o = new SavedState(context);
        m23814s(C8917k.f33979d);
    }

    /* renamed from: b */
    private void m23808b(Context context, Rect rect, View view) throws Resources.NotFoundException {
        int i2 = this.f29686o.f29703n;
        if (i2 == 8388691 || i2 == 8388693) {
            this.f29688q = rect.bottom - this.f29686o.f29705p;
        } else {
            this.f29688q = rect.top + this.f29686o.f29705p;
        }
        if (m23820h() <= 9) {
            float f2 = !m23822j() ? this.f29683l : this.f29684m;
            this.f29690s = f2;
            this.f29692u = f2;
            this.f29691t = f2;
        } else {
            float f3 = this.f29684m;
            this.f29690s = f3;
            this.f29692u = f3;
            this.f29691t = (this.f29681j.m24681f(m23811e()) / 2.0f) + this.f29685n;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m23822j() ? C8910d.f33885t : C8910d.f33882q);
        int i3 = this.f29686o.f29703n;
        if (i3 == 8388659 || i3 == 8388691) {
            this.f29687p = C0311u.m2162y(view) == 0 ? (rect.left - this.f29691t) + dimensionPixelSize + this.f29686o.f29704o : ((rect.right + this.f29691t) - dimensionPixelSize) - this.f29686o.f29704o;
        } else {
            this.f29687p = C0311u.m2162y(view) == 0 ? ((rect.right + this.f29691t) - dimensionPixelSize) - this.f29686o.f29704o : (rect.left - this.f29691t) + dimensionPixelSize + this.f29686o.f29704o;
        }
    }

    /* renamed from: c */
    static BadgeDrawable m23809c(Context context, SavedState savedState) throws Resources.NotFoundException {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m23812k(savedState);
        return badgeDrawable;
    }

    /* renamed from: d */
    private void m23810d(Canvas canvas) {
        Rect rect = new Rect();
        String strM23811e = m23811e();
        this.f29681j.m24680e().getTextBounds(strM23811e, 0, strM23811e.length(), rect);
        canvas.drawText(strM23811e, this.f29687p, this.f29688q + (rect.height() / 2), this.f29681j.m24680e());
    }

    /* renamed from: e */
    private String m23811e() {
        if (m23820h() <= this.f29689r) {
            return Integer.toString(m23820h());
        }
        Context context = this.f29679h.get();
        return context == null ? HttpUrl.FRAGMENT_ENCODE_SET : context.getString(C8916j.f33967k, Integer.valueOf(this.f29689r), "+");
    }

    /* renamed from: k */
    private void m23812k(SavedState savedState) throws Resources.NotFoundException {
        m23827p(savedState.f29699j);
        if (savedState.f29698i != -1) {
            m23828q(savedState.f29698i);
        }
        m23823l(savedState.f29695f);
        m23825n(savedState.f29696g);
        m23824m(savedState.f29703n);
        m23826o(savedState.f29704o);
        m23829t(savedState.f29705p);
    }

    /* renamed from: r */
    private void m23813r(C8948d c8948d) throws Resources.NotFoundException {
        Context context;
        if (this.f29681j.m24679d() == c8948d || (context = this.f29679h.get()) == null) {
            return;
        }
        this.f29681j.m24683h(c8948d, context);
        m23815v();
    }

    /* renamed from: s */
    private void m23814s(int i2) throws Resources.NotFoundException {
        Context context = this.f29679h.get();
        if (context == null) {
            return;
        }
        m23813r(new C8948d(context, i2));
    }

    /* renamed from: v */
    private void m23815v() throws Resources.NotFoundException {
        Context context = this.f29679h.get();
        WeakReference<View> weakReference = this.f29693v;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f29682k);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.f29694w;
        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup != null || C7939a.f29706a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        m23808b(context, rect2, view);
        C7939a.m23857f(this.f29682k, this.f29687p, this.f29688q, this.f29691t, this.f29692u);
        this.f29680i.m28282V(this.f29690s);
        if (rect.equals(this.f29682k)) {
            return;
        }
        this.f29680i.setBounds(this.f29682k);
    }

    /* renamed from: w */
    private void m23816w() {
        Double.isNaN(m23819g());
        this.f29689r = ((int) Math.pow(10.0d, r0 - 1.0d)) - 1;
    }

    @Override // com.google.android.material.internal.C8030h.b
    /* renamed from: a */
    public void mo23817a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f29680i.draw(canvas);
        if (m23822j()) {
            m23810d(canvas);
        }
    }

    /* renamed from: f */
    public CharSequence m23818f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!m23822j()) {
            return this.f29686o.f29700k;
        }
        if (this.f29686o.f29701l <= 0 || (context = this.f29679h.get()) == null) {
            return null;
        }
        return m23820h() <= this.f29689r ? context.getResources().getQuantityString(this.f29686o.f29701l, m23820h(), Integer.valueOf(m23820h())) : context.getString(this.f29686o.f29702m, Integer.valueOf(this.f29689r));
    }

    /* renamed from: g */
    public int m23819g() {
        return this.f29686o.f29699j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29686o.f29697h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f29682k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f29682k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int m23820h() {
        if (m23822j()) {
            return this.f29686o.f29698i;
        }
        return 0;
    }

    /* renamed from: i */
    public SavedState m23821i() {
        return this.f29686o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public boolean m23822j() {
        return this.f29686o.f29698i != -1;
    }

    /* renamed from: l */
    public void m23823l(int i2) {
        this.f29686o.f29695f = i2;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        if (this.f29680i.m28301x() != colorStateListValueOf) {
            this.f29680i.m28284X(colorStateListValueOf);
            invalidateSelf();
        }
    }

    /* renamed from: m */
    public void m23824m(int i2) {
        if (this.f29686o.f29703n != i2) {
            this.f29686o.f29703n = i2;
            WeakReference<View> weakReference = this.f29693v;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f29693v.get();
            WeakReference<ViewGroup> weakReference2 = this.f29694w;
            m23830u(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    /* renamed from: n */
    public void m23825n(int i2) {
        this.f29686o.f29696g = i2;
        if (this.f29681j.m24680e().getColor() != i2) {
            this.f29681j.m24680e().setColor(i2);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void m23826o(int i2) throws Resources.NotFoundException {
        this.f29686o.f29704o = i2;
        m23815v();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C8030h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public void m23827p(int i2) throws Resources.NotFoundException {
        if (this.f29686o.f29699j != i2) {
            this.f29686o.f29699j = i2;
            m23816w();
            this.f29681j.m24684i(true);
            m23815v();
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void m23828q(int i2) throws Resources.NotFoundException {
        int iMax = Math.max(0, i2);
        if (this.f29686o.f29698i != iMax) {
            this.f29686o.f29698i = iMax;
            this.f29681j.m24684i(true);
            m23815v();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f29686o.f29697h = i2;
        this.f29681j.m24680e().setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void m23829t(int i2) throws Resources.NotFoundException {
        this.f29686o.f29705p = i2;
        m23815v();
    }

    /* renamed from: u */
    public void m23830u(View view, ViewGroup viewGroup) {
        this.f29693v = new WeakReference<>(view);
        this.f29694w = new WeakReference<>(viewGroup);
        m23815v();
        invalidateSelf();
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7938a();

        /* renamed from: f */
        private int f29695f;

        /* renamed from: g */
        private int f29696g;

        /* renamed from: h */
        private int f29697h;

        /* renamed from: i */
        private int f29698i;

        /* renamed from: j */
        private int f29699j;

        /* renamed from: k */
        private CharSequence f29700k;

        /* renamed from: l */
        private int f29701l;

        /* renamed from: m */
        private int f29702m;

        /* renamed from: n */
        private int f29703n;

        /* renamed from: o */
        private int f29704o;

        /* renamed from: p */
        private int f29705p;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        static class C7938a implements Parcelable.Creator<SavedState> {
            C7938a() {
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

        public SavedState(Context context) {
            this.f29697h = 255;
            this.f29698i = -1;
            this.f29696g = new C8948d(context, C8917k.f33979d).f34427b.getDefaultColor();
            this.f29700k = context.getString(C8916j.f33964h);
            this.f29701l = C8915i.f33956a;
            this.f29702m = C8916j.f33966j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f29695f);
            parcel.writeInt(this.f29696g);
            parcel.writeInt(this.f29697h);
            parcel.writeInt(this.f29698i);
            parcel.writeInt(this.f29699j);
            parcel.writeString(this.f29700k.toString());
            parcel.writeInt(this.f29701l);
            parcel.writeInt(this.f29703n);
            parcel.writeInt(this.f29704o);
            parcel.writeInt(this.f29705p);
        }

        protected SavedState(Parcel parcel) {
            this.f29697h = 255;
            this.f29698i = -1;
            this.f29695f = parcel.readInt();
            this.f29696g = parcel.readInt();
            this.f29697h = parcel.readInt();
            this.f29698i = parcel.readInt();
            this.f29699j = parcel.readInt();
            this.f29700k = parcel.readString();
            this.f29701l = parcel.readInt();
            this.f29703n = parcel.readInt();
            this.f29704o = parcel.readInt();
            this.f29705p = parcel.readInt();
        }
    }
}
