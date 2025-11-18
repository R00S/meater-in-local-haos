package p024c.p089y.p090a.p091a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0264g;
import androidx.core.graphics.drawable.C0265a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p041e.C0867a;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* renamed from: c.y.a.a.c */
/* loaded from: classes.dex */
public class C1064c extends AbstractC1069h implements Animatable {

    /* renamed from: g */
    private b f6966g;

    /* renamed from: h */
    private Context f6967h;

    /* renamed from: i */
    private ArgbEvaluator f6968i;

    /* renamed from: j */
    private Animator.AnimatorListener f6969j;

    /* renamed from: k */
    ArrayList<AbstractC1063b> f6970k;

    /* renamed from: l */
    final Drawable.Callback f6971l;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: c.y.a.a.c$a */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C1064c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            C1064c.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1064c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: c.y.a.a.c$b */
    private static class b extends Drawable.ConstantState {

        /* renamed from: a */
        int f6973a;

        /* renamed from: b */
        C1070i f6974b;

        /* renamed from: c */
        AnimatorSet f6975c;

        /* renamed from: d */
        ArrayList<Animator> f6976d;

        /* renamed from: e */
        C0867a<Animator, String> f6977e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f6973a = bVar.f6973a;
                C1070i c1070i = bVar.f6974b;
                if (c1070i != null) {
                    Drawable.ConstantState constantState = c1070i.getConstantState();
                    if (resources != null) {
                        this.f6974b = (C1070i) constantState.newDrawable(resources);
                    } else {
                        this.f6974b = (C1070i) constantState.newDrawable();
                    }
                    C1070i c1070i2 = (C1070i) this.f6974b.mutate();
                    this.f6974b = c1070i2;
                    c1070i2.setCallback(callback);
                    this.f6974b.setBounds(bVar.f6974b.getBounds());
                    this.f6974b.m6733h(false);
                }
                ArrayList<Animator> arrayList = bVar.f6976d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6976d = new ArrayList<>(size);
                    this.f6977e = new C0867a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.f6976d.get(i2);
                        Animator animatorClone = animator.clone();
                        String str = bVar.f6977e.get(animator);
                        animatorClone.setTarget(this.f6974b.m6732d(str));
                        this.f6976d.add(animatorClone);
                        this.f6977e.put(animatorClone, str);
                    }
                    m6697a();
                }
            }
        }

        /* renamed from: a */
        public void m6697a() {
            if (this.f6975c == null) {
                this.f6975c = new AnimatorSet();
            }
            this.f6975c.playTogether(this.f6976d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6973a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C1064c() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C1064c m6694a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        C1064c c1064c = new C1064c(context);
        c1064c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1064c;
    }

    /* renamed from: b */
    private void m6695b(String str, Animator animator) {
        animator.setTarget(this.f6966g.f6974b.m6732d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m6696c(animator);
        }
        b bVar = this.f6966g;
        if (bVar.f6976d == null) {
            bVar.f6976d = new ArrayList<>();
            this.f6966g.f6977e = new C0867a<>();
        }
        this.f6966g.f6976d.add(animator);
        this.f6966g.f6977e.put(animator, str);
    }

    /* renamed from: c */
    private void m6696c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                m6696c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f6968i == null) {
                    this.f6968i = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f6968i);
            }
        }
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1804a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            return C0265a.m1805b(drawable);
        }
        return false;
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6966g.f6974b.draw(canvas);
        if (this.f6966g.f6975c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6983f;
        return drawable != null ? C0265a.m1807d(drawable) : this.f6966g.f6974b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6966g.f6973a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6983f;
        return drawable != null ? C0265a.m1808e(drawable) : this.f6966g.f6974b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6983f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f6983f.getConstantState());
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6966g.f6974b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6966g.f6974b.getIntrinsicWidth();
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getOpacity() : this.f6966g.f6974b.getOpacity();
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1810g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6958e);
                    int resourceId = typedArrayM1784s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1070i c1070iM6726b = C1070i.m6726b(resources, resourceId, theme);
                        c1070iM6726b.m6733h(false);
                        c1070iM6726b.setCallback(this.f6971l);
                        C1070i c1070i = this.f6966g.f6974b;
                        if (c1070i != null) {
                            c1070i.setCallback(null);
                        }
                        this.f6966g.f6974b = c1070iM6726b;
                    }
                    typedArrayM1784s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C1062a.f6959f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6967h;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m6695b(string, C1066e.m6708i(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f6966g.m6697a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6983f;
        return drawable != null ? C0265a.m1811h(drawable) : this.f6966g.f6974b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f6983f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6966g.f6975c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.isStateful() : this.f6966g.f6974b.isStateful();
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6966g.f6974b.setBounds(rect);
        }
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.setLevel(i2) : this.f6966g.f6974b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.setState(iArr) : this.f6966g.f6974b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f6966g.f6974b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1813j(drawable, z);
        } else {
            this.f6966g.f6974b.setAutoMirrored(z);
        }
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTint(int i2) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1817n(drawable, i2);
        } else {
            this.f6966g.f6974b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1818o(drawable, colorStateList);
        } else {
            this.f6966g.f6974b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1819p(drawable, mode);
        } else {
            this.f6966g.f6974b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f6966g.f6974b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f6966g.f6975c.isStarted()) {
                return;
            }
            this.f6966g.f6975c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6966g.f6975c.end();
        }
    }

    private C1064c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6966g.f6974b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: c.y.a.a.c$c */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f6978a;

        public c(Drawable.ConstantState constantState) {
            this.f6978a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6978a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6978a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1064c c1064c = new C1064c();
            Drawable drawableNewDrawable = this.f6978a.newDrawable();
            c1064c.f6983f = drawableNewDrawable;
            drawableNewDrawable.setCallback(c1064c.f6971l);
            return c1064c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1064c c1064c = new C1064c();
            Drawable drawableNewDrawable = this.f6978a.newDrawable(resources);
            c1064c.f6983f = drawableNewDrawable;
            drawableNewDrawable.setCallback(c1064c.f6971l);
            return c1064c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1064c c1064c = new C1064c();
            Drawable drawableNewDrawable = this.f6978a.newDrawable(resources, theme);
            c1064c.f6983f = drawableNewDrawable;
            drawableNewDrawable.setCallback(c1064c.f6971l);
            return c1064c;
        }
    }

    private C1064c(Context context, b bVar, Resources resources) {
        this.f6968i = null;
        this.f6969j = null;
        this.f6970k = null;
        a aVar = new a();
        this.f6971l = aVar;
        this.f6967h = context;
        if (bVar != null) {
            this.f6966g = bVar;
        } else {
            this.f6966g = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
