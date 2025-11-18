package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
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
import android.util.AttributeSet;
import i1.k;
import java.io.IOException;
import java.util.ArrayList;
import k1.C3784a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C4391a;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class c extends g implements Animatable {

    /* renamed from: C, reason: collision with root package name */
    private C0412c f29615C;

    /* renamed from: D, reason: collision with root package name */
    private Context f29616D;

    /* renamed from: E, reason: collision with root package name */
    private ArgbEvaluator f29617E;

    /* renamed from: F, reason: collision with root package name */
    d f29618F;

    /* renamed from: G, reason: collision with root package name */
    private Animator.AnimatorListener f29619G;

    /* renamed from: H, reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b> f29620H;

    /* renamed from: I, reason: collision with root package name */
    final Drawable.Callback f29621I;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f29620H);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f29620H);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0412c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f29624a;

        /* renamed from: b, reason: collision with root package name */
        h f29625b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f29626c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f29627d;

        /* renamed from: e, reason: collision with root package name */
        C4391a<Animator, String> f29628e;

        public C0412c(Context context, C0412c c0412c, Drawable.Callback callback, Resources resources) {
            if (c0412c != null) {
                this.f29624a = c0412c.f29624a;
                h hVar = c0412c.f29625b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f29625b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f29625b = (h) constantState.newDrawable();
                    }
                    h hVar2 = (h) this.f29625b.mutate();
                    this.f29625b = hVar2;
                    hVar2.setCallback(callback);
                    this.f29625b.setBounds(c0412c.f29625b.getBounds());
                    this.f29625b.g(false);
                }
                ArrayList<Animator> arrayList = c0412c.f29627d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f29627d = new ArrayList<>(size);
                    this.f29628e = new C4391a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c0412c.f29627d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = c0412c.f29628e.get(animator);
                        animatorClone.setTarget(this.f29625b.c(str));
                        this.f29627d.add(animatorClone);
                        this.f29628e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f29626c == null) {
                this.f29626c = new AnimatorSet();
            }
            this.f29626c.playTogether(this.f29627d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29624a;
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

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableE = i1.h.e(context.getResources(), i10, context.getTheme());
        cVar.f29631B = drawableE;
        drawableE.setCallback(cVar.f29621I);
        cVar.f29618F = new d(cVar.f29631B.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f29619G;
        if (animatorListener != null) {
            this.f29615C.f29626c.removeListener(animatorListener);
            this.f29619G = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f29615C.f29625b.c(str));
        C0412c c0412c = this.f29615C;
        if (c0412c.f29627d == null) {
            c0412c.f29627d = new ArrayList<>();
            this.f29615C.f29628e = new C4391a<>();
        }
        this.f29615C.f29627d.add(animator);
        this.f29615C.f29628e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f29620H == null) {
            this.f29620H = new ArrayList<>();
        }
        if (this.f29620H.contains(bVar)) {
            return;
        }
        this.f29620H.add(bVar);
        if (this.f29619G == null) {
            this.f29619G = new b();
        }
        this.f29615C.f29626c.addListener(this.f29619G);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            return C3784a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f29615C.f29625b.draw(canvas);
        if (this.f29615C.f29626c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f29620H;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f29620H.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f29631B;
        return drawable != null ? C3784a.d(drawable) : this.f29615C.f29625b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f29615C.f29624a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f29631B;
        return drawable != null ? C3784a.e(drawable) : this.f29615C.f29625b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f29631B != null) {
            return new d(this.f29631B.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f29615C.f29625b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f29615C.f29625b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.getOpacity() : this.f29615C.f29625b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f29605e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h hVarB = h.b(resources, resourceId, theme);
                        hVarB.g(false);
                        hVarB.setCallback(this.f29621I);
                        h hVar = this.f29615C.f29625b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f29615C.f29625b = hVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f29606f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f29616D;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, e.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f29615C.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f29631B;
        return drawable != null ? C3784a.h(drawable) : this.f29615C.f29625b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f29631B;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f29615C.f29626c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.isStateful() : this.f29615C.f29625b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f29615C.f29625b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.setLevel(i10) : this.f29615C.f29625b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.setState(iArr) : this.f29615C.f29625b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f29615C.f29625b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.j(drawable, z10);
        } else {
            this.f29615C.f29625b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.n(drawable, i10);
        } else {
            this.f29615C.f29625b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.o(drawable, colorStateList);
        } else {
            this.f29615C.f29625b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.p(drawable, mode);
        } else {
            this.f29615C.f29625b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f29615C.f29625b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f29615C.f29626c.isStarted()) {
                return;
            }
            this.f29615C.f29626c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f29615C.f29626c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f29615C.f29625b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f29629a;

        public d(Drawable.ConstantState constantState) {
            this.f29629a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f29629a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29629a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f29629a.newDrawable();
            cVar.f29631B = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f29621I);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f29629a.newDrawable(resources);
            cVar.f29631B = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f29621I);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f29629a.newDrawable(resources, theme);
            cVar.f29631B = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f29621I);
            return cVar;
        }
    }

    private c(Context context, C0412c c0412c, Resources resources) {
        this.f29617E = null;
        this.f29619G = null;
        this.f29620H = null;
        a aVar = new a();
        this.f29621I = aVar;
        this.f29616D = context;
        if (c0412c != null) {
            this.f29615C = c0412c;
        } else {
            this.f29615C = new C0412c(context, c0412c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
