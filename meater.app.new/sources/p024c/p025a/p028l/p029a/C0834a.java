package p024c.p025a.p028l.p029a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0165g0;
import androidx.core.content.p003d.C0264g;
import androidx.core.graphics.drawable.InterfaceC0266b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p025a.p028l.p029a.C0835b;
import p024c.p025a.p028l.p029a.C0837d;
import p024c.p025a.p030m.C0839b;
import p024c.p041e.C0870d;
import p024c.p041e.C0874h;
import p024c.p089y.p090a.p091a.C1064c;
import p024c.p089y.p090a.p091a.C1070i;

/* compiled from: AnimatedStateListDrawableCompat.java */
@SuppressLint({"RestrictedAPI"})
/* renamed from: c.a.l.a.a */
/* loaded from: classes.dex */
public class C0834a extends C0837d implements InterfaceC0266b {

    /* renamed from: t */
    private static final String f5463t = C0834a.class.getSimpleName();

    /* renamed from: u */
    private c f5464u;

    /* renamed from: v */
    private g f5465v;

    /* renamed from: w */
    private int f5466w;

    /* renamed from: x */
    private int f5467x;

    /* renamed from: y */
    private boolean f5468y;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: c.a.l.a.a$b */
    private static class b extends g {

        /* renamed from: a */
        private final Animatable f5469a;

        b(Animatable animatable) {
            super();
            this.f5469a = animatable;
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: c */
        public void mo5278c() {
            this.f5469a.start();
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: d */
        public void mo5279d() {
            this.f5469a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: c.a.l.a.a$c */
    static class c extends C0837d.a {

        /* renamed from: K */
        C0870d<Long> f5470K;

        /* renamed from: L */
        C0874h<Integer> f5471L;

        c(c cVar, C0834a c0834a, Resources resources) {
            super(cVar, c0834a, resources);
            if (cVar != null) {
                this.f5470K = cVar.f5470K;
                this.f5471L = cVar.f5471L;
            } else {
                this.f5470K = new C0870d<>();
                this.f5471L = new C0874h<>();
            }
        }

        /* renamed from: D */
        private static long m5280D(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        /* renamed from: B */
        int m5281B(int[] iArr, Drawable drawable, int i2) {
            int iM5330z = super.m5330z(iArr, drawable);
            this.f5471L.m5486k(iM5330z, Integer.valueOf(i2));
            return iM5330z;
        }

        /* renamed from: C */
        int m5282C(int i2, int i3, Drawable drawable, boolean z) {
            int iM5304a = super.m5304a(drawable);
            long jM5280D = m5280D(i2, i3);
            long j2 = z ? 8589934592L : 0L;
            long j3 = iM5304a;
            this.f5470K.m5435b(jM5280D, Long.valueOf(j3 | j2));
            if (z) {
                this.f5470K.m5435b(m5280D(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return iM5304a;
        }

        /* renamed from: E */
        int m5283E(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.f5471L.m5483h(i2, 0).intValue();
        }

        /* renamed from: F */
        int m5284F(int[] iArr) {
            int iM5329A = super.m5329A(iArr);
            return iM5329A >= 0 ? iM5329A : super.m5329A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m5285G(int i2, int i3) {
            return (int) this.f5470K.m5439h(m5280D(i2, i3), -1L).longValue();
        }

        /* renamed from: H */
        boolean m5286H(int i2, int i3) {
            return (this.f5470K.m5439h(m5280D(i2, i3), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        boolean m5287I(int i2, int i3) {
            return (this.f5470K.m5439h(m5280D(i2, i3), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p024c.p025a.p028l.p029a.C0837d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0834a(this, null);
        }

        @Override // p024c.p025a.p028l.p029a.C0837d.a, p024c.p025a.p028l.p029a.C0835b.c
        /* renamed from: r */
        void mo5288r() {
            this.f5470K = this.f5470K.clone();
            this.f5471L = this.f5471L.clone();
        }

        @Override // p024c.p025a.p028l.p029a.C0837d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0834a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: c.a.l.a.a$d */
    private static class d extends g {

        /* renamed from: a */
        private final C1064c f5472a;

        d(C1064c c1064c) {
            super();
            this.f5472a = c1064c;
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: c */
        public void mo5278c() {
            this.f5472a.start();
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: d */
        public void mo5279d() {
            this.f5472a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: c.a.l.a.a$e */
    private static class e extends g {

        /* renamed from: a */
        private final ObjectAnimator f5473a;

        /* renamed from: b */
        private final boolean f5474b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            if (Build.VERSION.SDK_INT >= 18) {
                objectAnimatorOfInt.setAutoCancel(true);
            }
            objectAnimatorOfInt.setDuration(fVar.m5291a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f5474b = z2;
            this.f5473a = objectAnimatorOfInt;
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: a */
        public boolean mo5289a() {
            return this.f5474b;
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: b */
        public void mo5290b() {
            this.f5473a.reverse();
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: c */
        public void mo5278c() {
            this.f5473a.start();
        }

        @Override // p024c.p025a.p028l.p029a.C0834a.g
        /* renamed from: d */
        public void mo5279d() {
            this.f5473a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: c.a.l.a.a$f */
    private static class f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f5475a;

        /* renamed from: b */
        private int f5476b;

        /* renamed from: c */
        private int f5477c;

        f(AnimationDrawable animationDrawable, boolean z) {
            m5292b(animationDrawable, z);
        }

        /* renamed from: a */
        int m5291a() {
            return this.f5477c;
        }

        /* renamed from: b */
        int m5292b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f5476b = numberOfFrames;
            int[] iArr = this.f5475a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f5475a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f5475a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f5477c = i2;
            return i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f5477c) + 0.5f);
            int i3 = this.f5476b;
            int[] iArr = this.f5475a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f5477c : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: c.a.l.a.a$g */
    private static abstract class g {
        private g() {
        }

        /* renamed from: a */
        public boolean mo5289a() {
            return false;
        }

        /* renamed from: b */
        public void mo5290b() {
        }

        /* renamed from: c */
        public abstract void mo5278c();

        /* renamed from: d */
        public abstract void mo5279d();
    }

    public C0834a() {
        this(null, null);
    }

    /* renamed from: m */
    public static C0834a m5266m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0834a c0834a = new C0834a();
            c0834a.m5277n(context, resources, xmlPullParser, attributeSet, theme);
            return c0834a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m5267o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m5269q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m5270r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: p */
    private void m5268p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m5269q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C0839b.f5539h);
        int resourceId = typedArrayM1784s.getResourceId(C0839b.f5540i, 0);
        int resourceId2 = typedArrayM1784s.getResourceId(C0839b.f5541j, -1);
        Drawable drawableM990j = resourceId2 > 0 ? C0165g0.m981h().m990j(context, resourceId2) : null;
        typedArrayM1784s.recycle();
        int[] iArrM5328k = m5328k(attributeSet);
        if (drawableM990j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableM990j = xmlPullParser.getName().equals("vector") ? C1070i.m6727c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableM990j != null) {
            return this.f5464u.m5281B(iArrM5328k, drawableM990j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m5270r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C0839b.f5542k);
        int resourceId = typedArrayM1784s.getResourceId(C0839b.f5545n, -1);
        int resourceId2 = typedArrayM1784s.getResourceId(C0839b.f5544m, -1);
        int resourceId3 = typedArrayM1784s.getResourceId(C0839b.f5543l, -1);
        Drawable drawableM990j = resourceId3 > 0 ? C0165g0.m981h().m990j(context, resourceId3) : null;
        boolean z = typedArrayM1784s.getBoolean(C0839b.f5546o, false);
        typedArrayM1784s.recycle();
        if (drawableM990j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableM990j = xmlPullParser.getName().equals("animated-vector") ? C1064c.m6694a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableM990j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f5464u.m5282C(resourceId, resourceId2, drawableM990j, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* renamed from: s */
    private boolean m5271s(int i2) {
        int iM5297c;
        int iM5285G;
        g bVar;
        g gVar = this.f5465v;
        if (gVar == null) {
            iM5297c = m5297c();
        } else {
            if (i2 == this.f5466w) {
                return true;
            }
            if (i2 == this.f5467x && gVar.mo5289a()) {
                gVar.mo5290b();
                this.f5466w = this.f5467x;
                this.f5467x = i2;
                return true;
            }
            iM5297c = this.f5466w;
            gVar.mo5279d();
        }
        this.f5465v = null;
        this.f5467x = -1;
        this.f5466w = -1;
        c cVar = this.f5464u;
        int iM5283E = cVar.m5283E(iM5297c);
        int iM5283E2 = cVar.m5283E(i2);
        if (iM5283E2 == 0 || iM5283E == 0 || (iM5285G = cVar.m5285G(iM5283E, iM5283E2)) < 0) {
            return false;
        }
        boolean zM5287I = cVar.m5287I(iM5283E, iM5283E2);
        m5298g(iM5285G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m5286H(iM5283E, iM5283E2), zM5287I);
        } else {
            if (!(current instanceof C1064c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C1064c) current);
        }
        bVar.mo5278c();
        this.f5465v = bVar;
        this.f5467x = iM5297c;
        this.f5466w = i2;
        return true;
    }

    /* renamed from: t */
    private void m5272t(TypedArray typedArray) {
        c cVar = this.f5464u;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f5504d |= typedArray.getChangingConfigurations();
        }
        cVar.m5324x(typedArray.getBoolean(C0839b.f5535d, cVar.f5509i));
        cVar.m5320t(typedArray.getBoolean(C0839b.f5536e, cVar.f5512l));
        cVar.m5321u(typedArray.getInt(C0839b.f5537f, cVar.f5492A));
        cVar.m5322v(typedArray.getInt(C0839b.f5538g, cVar.f5493B));
        setDither(typedArray.getBoolean(C0839b.f5533b, cVar.f5524x));
    }

    @Override // p024c.p025a.p028l.p029a.C0837d, p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p024c.p025a.p028l.p029a.C0837d, p024c.p025a.p028l.p029a.C0835b
    /* renamed from: h */
    void mo5274h(C0835b.c cVar) {
        super.mo5274h(cVar);
        if (cVar instanceof c) {
            this.f5464u = (c) cVar;
        }
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // p024c.p025a.p028l.p029a.C0837d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f5465v;
        if (gVar != null) {
            gVar.mo5279d();
            this.f5465v = null;
            m5298g(this.f5466w);
            this.f5466w = -1;
            this.f5467x = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p024c.p025a.p028l.p029a.C0837d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c mo5273b() {
        return new c(this.f5464u, this, null);
    }

    @Override // p024c.p025a.p028l.p029a.C0837d, p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5468y && super.mutate() == this) {
            this.f5464u.mo5288r();
            this.f5468y = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m5277n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C0839b.f5532a);
        setVisible(typedArrayM1784s.getBoolean(C0839b.f5534c, true), true);
        m5272t(typedArrayM1784s);
        m5299i(resources);
        typedArrayM1784s.recycle();
        m5267o(context, resources, xmlPullParser, attributeSet, theme);
        m5268p();
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i2) {
        return super.onLayoutDirectionChanged(i2);
    }

    @Override // p024c.p025a.p028l.p029a.C0837d, p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iM5284F = this.f5464u.m5284F(iArr);
        boolean z = iM5284F != m5297c() && (m5271s(iM5284F) || m5298g(iM5284F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        super.scheduleDrawable(drawable, runnable, j2);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.f5465v;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo5278c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p024c.p025a.p028l.p029a.C0835b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C0834a(c cVar, Resources resources) {
        super(null);
        this.f5466w = -1;
        this.f5467x = -1;
        mo5274h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
