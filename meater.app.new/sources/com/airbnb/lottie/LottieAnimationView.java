package com.airbnb.lottie;

import L3.C;
import L3.C1357b;
import L3.C1360e;
import L3.D;
import L3.E;
import L3.EnumC1356a;
import L3.F;
import L3.G;
import L3.H;
import L3.InterfaceC1358c;
import L3.q;
import L3.v;
import L3.x;
import L3.y;
import L3.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import j.C3699a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: R, reason: collision with root package name */
    private static final String f31213R = "LottieAnimationView";

    /* renamed from: S, reason: collision with root package name */
    private static final v<Throwable> f31214S = new v() { // from class: L3.g
        @Override // L3.v
        public final void onResult(Object obj) {
            LottieAnimationView.t((Throwable) obj);
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private final v<L3.i> f31215E;

    /* renamed from: F, reason: collision with root package name */
    private final v<Throwable> f31216F;

    /* renamed from: G, reason: collision with root package name */
    private v<Throwable> f31217G;

    /* renamed from: H, reason: collision with root package name */
    private int f31218H;

    /* renamed from: I, reason: collision with root package name */
    private final n f31219I;

    /* renamed from: J, reason: collision with root package name */
    private String f31220J;

    /* renamed from: K, reason: collision with root package name */
    private int f31221K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f31222L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f31223M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f31224N;

    /* renamed from: O, reason: collision with root package name */
    private final Set<c> f31225O;

    /* renamed from: P, reason: collision with root package name */
    private final Set<x> f31226P;

    /* renamed from: Q, reason: collision with root package name */
    private o<L3.i> f31227Q;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends Y3.c<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y3.e f31228d;

        a(Y3.e eVar) {
            this.f31228d = eVar;
        }

        @Override // Y3.c
        public T a(Y3.b<T> bVar) {
            return (T) this.f31228d.a(bVar);
        }
    }

    private static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        String f31230B;

        /* renamed from: C, reason: collision with root package name */
        int f31231C;

        /* renamed from: D, reason: collision with root package name */
        float f31232D;

        /* renamed from: E, reason: collision with root package name */
        boolean f31233E;

        /* renamed from: F, reason: collision with root package name */
        String f31234F;

        /* renamed from: G, reason: collision with root package name */
        int f31235G;

        /* renamed from: H, reason: collision with root package name */
        int f31236H;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f31230B);
            parcel.writeFloat(this.f31232D);
            parcel.writeInt(this.f31233E ? 1 : 0);
            parcel.writeString(this.f31234F);
            parcel.writeInt(this.f31235G);
            parcel.writeInt(this.f31236H);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f31230B = parcel.readString();
            this.f31232D = parcel.readFloat();
            this.f31233E = parcel.readInt() == 1;
            this.f31234F = parcel.readString();
            this.f31235G = parcel.readInt();
            this.f31236H = parcel.readInt();
        }
    }

    private enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class d implements v<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f31244a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f31244a = new WeakReference<>(lottieAnimationView);
        }

        @Override // L3.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = this.f31244a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f31218H != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f31218H);
            }
            (lottieAnimationView.f31217G == null ? LottieAnimationView.f31214S : lottieAnimationView.f31217G).onResult(th);
        }
    }

    private static class e implements v<L3.i> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f31245a;

        public e(LottieAnimationView lottieAnimationView) {
            this.f31245a = new WeakReference<>(lottieAnimationView);
        }

        @Override // L3.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(L3.i iVar) {
            LottieAnimationView lottieAnimationView = this.f31245a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(iVar);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31215E = new e(this);
        this.f31216F = new d(this);
        this.f31218H = 0;
        this.f31219I = new n();
        this.f31222L = false;
        this.f31223M = false;
        this.f31224N = true;
        this.f31225O = new HashSet();
        this.f31226P = new HashSet();
        p(attributeSet, D.f9109a);
    }

    private void k() {
        o<L3.i> oVar = this.f31227Q;
        if (oVar != null) {
            oVar.k(this.f31215E);
            this.f31227Q.j(this.f31216F);
        }
    }

    private void l() {
        this.f31219I.t();
    }

    private o<L3.i> n(final String str) {
        return isInEditMode() ? new o<>(new Callable() { // from class: L3.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9156a.r(str);
            }
        }, true) : this.f31224N ? q.j(getContext(), str) : q.k(getContext(), str, null);
    }

    private o<L3.i> o(final int i10) {
        return isInEditMode() ? new o<>(new Callable() { // from class: L3.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9158a.s(i10);
            }
        }, true) : this.f31224N ? q.s(getContext(), i10) : q.t(getContext(), i10, null);
    }

    private void p(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, E.f9110a, i10, 0);
        this.f31224N = typedArrayObtainStyledAttributes.getBoolean(E.f9113d, true);
        int i11 = E.f9125p;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        int i12 = E.f9120k;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = E.f9130u;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i13);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i12);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i13)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(E.f9119j, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(E.f9112c, false)) {
            this.f31223M = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(E.f9123n, false)) {
            this.f31219I.a1(-1);
        }
        int i14 = E.f9128s;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = E.f9127r;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = E.f9129t;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i16, 1.0f));
        }
        int i17 = E.f9115f;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i17, true));
        }
        int i18 = E.f9114e;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i18, false));
        }
        int i19 = E.f9117h;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i19));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(E.f9122m));
        int i20 = E.f9124o;
        z(typedArrayObtainStyledAttributes.getFloat(i20, 0.0f), typedArrayObtainStyledAttributes.hasValue(i20));
        m(typedArrayObtainStyledAttributes.getBoolean(E.f9118i, false));
        int i21 = E.f9116g;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            i(new Q3.e("**"), y.f9216K, new Y3.c(new G(C3699a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(i21, -1)).getDefaultColor())));
        }
        int i22 = E.f9126q;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            F f10 = F.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i22, f10.ordinal());
            if (iOrdinal >= F.values().length) {
                iOrdinal = f10.ordinal();
            }
            setRenderMode(F.values()[iOrdinal]);
        }
        int i23 = E.f9111b;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            EnumC1356a enumC1356a = EnumC1356a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i23, enumC1356a.ordinal());
            if (iOrdinal2 >= F.values().length) {
                iOrdinal2 = enumC1356a.ordinal();
            }
            setAsyncUpdates(EnumC1356a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(E.f9121l, false));
        int i24 = E.f9131v;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i24, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f31219I.e1(Boolean.valueOf(X3.j.f(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z r(String str) {
        return this.f31224N ? q.l(getContext(), str) : q.m(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z s(int i10) {
        return this.f31224N ? q.u(getContext(), i10) : q.v(getContext(), i10, null);
    }

    private void setCompositionTask(o<L3.i> oVar) {
        z<L3.i> zVarE = oVar.e();
        n nVar = this.f31219I;
        if (zVarE != null && nVar == getDrawable() && nVar.I() == zVarE.b()) {
            return;
        }
        this.f31225O.add(c.SET_ANIMATION);
        l();
        k();
        this.f31227Q = oVar.d(this.f31215E).c(this.f31216F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Throwable th) {
        if (!X3.j.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        X3.d.d("Unable to load composition.", th);
    }

    private void y() {
        boolean zQ = q();
        setImageDrawable(null);
        setImageDrawable(this.f31219I);
        if (zQ) {
            this.f31219I.z0();
        }
    }

    private void z(float f10, boolean z10) {
        if (z10) {
            this.f31225O.add(c.SET_PROGRESS);
        }
        this.f31219I.Y0(f10);
    }

    public EnumC1356a getAsyncUpdates() {
        return this.f31219I.D();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f31219I.E();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f31219I.G();
    }

    public boolean getClipToCompositionBounds() {
        return this.f31219I.H();
    }

    public L3.i getComposition() {
        Drawable drawable = getDrawable();
        n nVar = this.f31219I;
        if (drawable == nVar) {
            return nVar.I();
        }
        return null;
    }

    public long getDuration() {
        L3.i composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f31219I.L();
    }

    public String getImageAssetsFolder() {
        return this.f31219I.N();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f31219I.P();
    }

    public float getMaxFrame() {
        return this.f31219I.R();
    }

    public float getMinFrame() {
        return this.f31219I.S();
    }

    public C getPerformanceTracker() {
        return this.f31219I.T();
    }

    public float getProgress() {
        return this.f31219I.U();
    }

    public F getRenderMode() {
        return this.f31219I.V();
    }

    public int getRepeatCount() {
        return this.f31219I.W();
    }

    public int getRepeatMode() {
        return this.f31219I.X();
    }

    public float getSpeed() {
        return this.f31219I.Y();
    }

    public <T> void i(Q3.e eVar, T t10, Y3.c<T> cVar) {
        this.f31219I.q(eVar, t10, cVar);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof n) && ((n) drawable).V() == F.SOFTWARE) {
            this.f31219I.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        n nVar = this.f31219I;
        if (drawable2 == nVar) {
            super.invalidateDrawable(nVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public <T> void j(Q3.e eVar, T t10, Y3.e<T> eVar2) {
        this.f31219I.q(eVar, t10, new a(eVar2));
    }

    public void m(boolean z10) {
        this.f31219I.y(z10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f31223M) {
            return;
        }
        this.f31219I.w0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f31220J = bVar.f31230B;
        Set<c> set = this.f31225O;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f31220J)) {
            setAnimation(this.f31220J);
        }
        this.f31221K = bVar.f31231C;
        if (!this.f31225O.contains(cVar) && (i10 = this.f31221K) != 0) {
            setAnimation(i10);
        }
        if (!this.f31225O.contains(c.SET_PROGRESS)) {
            z(bVar.f31232D, false);
        }
        if (!this.f31225O.contains(c.PLAY_OPTION) && bVar.f31233E) {
            v();
        }
        if (!this.f31225O.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f31234F);
        }
        if (!this.f31225O.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.f31235G);
        }
        if (this.f31225O.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bVar.f31236H);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f31230B = this.f31220J;
        bVar.f31231C = this.f31221K;
        bVar.f31232D = this.f31219I.U();
        bVar.f31233E = this.f31219I.d0();
        bVar.f31234F = this.f31219I.N();
        bVar.f31235G = this.f31219I.X();
        bVar.f31236H = this.f31219I.W();
        return bVar;
    }

    public boolean q() {
        return this.f31219I.c0();
    }

    public void setAnimation(int i10) {
        this.f31221K = i10;
        this.f31220J = null;
        setCompositionTask(o(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        x(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f31224N ? q.w(getContext(), str) : q.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f31219I.B0(z10);
    }

    public void setAsyncUpdates(EnumC1356a enumC1356a) {
        this.f31219I.C0(enumC1356a);
    }

    public void setCacheComposition(boolean z10) {
        this.f31224N = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f31219I.D0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f31219I.E0(z10);
    }

    public void setComposition(L3.i iVar) {
        if (C1360e.f9146a) {
            Log.v(f31213R, "Set Composition \n" + iVar);
        }
        this.f31219I.setCallback(this);
        this.f31222L = true;
        boolean zF0 = this.f31219I.F0(iVar);
        if (this.f31223M) {
            this.f31219I.w0();
        }
        this.f31222L = false;
        if (getDrawable() != this.f31219I || zF0) {
            if (!zF0) {
                y();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<x> it = this.f31226P.iterator();
            while (it.hasNext()) {
                it.next().a(iVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f31219I.G0(str);
    }

    public void setFailureListener(v<Throwable> vVar) {
        this.f31217G = vVar;
    }

    public void setFallbackResource(int i10) {
        this.f31218H = i10;
    }

    public void setFontAssetDelegate(C1357b c1357b) {
        this.f31219I.H0(c1357b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f31219I.I0(map);
    }

    public void setFrame(int i10) {
        this.f31219I.J0(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f31219I.K0(z10);
    }

    public void setImageAssetDelegate(InterfaceC1358c interfaceC1358c) {
        this.f31219I.L0(interfaceC1358c);
    }

    public void setImageAssetsFolder(String str) {
        this.f31219I.M0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f31221K = 0;
        this.f31220J = null;
        k();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f31221K = 0;
        this.f31220J = null;
        k();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f31221K = 0;
        this.f31220J = null;
        k();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f31219I.N0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f31219I.O0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f31219I.Q0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f31219I.S0(str);
    }

    public void setMinFrame(int i10) {
        this.f31219I.T0(i10);
    }

    public void setMinProgress(float f10) {
        this.f31219I.V0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f31219I.W0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f31219I.X0(z10);
    }

    public void setProgress(float f10) {
        z(f10, true);
    }

    public void setRenderMode(F f10) {
        this.f31219I.Z0(f10);
    }

    public void setRepeatCount(int i10) {
        this.f31225O.add(c.SET_REPEAT_COUNT);
        this.f31219I.a1(i10);
    }

    public void setRepeatMode(int i10) {
        this.f31225O.add(c.SET_REPEAT_MODE);
        this.f31219I.b1(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f31219I.c1(z10);
    }

    public void setSpeed(float f10) {
        this.f31219I.d1(f10);
    }

    public void setTextDelegate(H h10) {
        this.f31219I.f1(h10);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f31219I.g1(z10);
    }

    public void u() {
        this.f31223M = false;
        this.f31219I.v0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        n nVar;
        if (!this.f31222L && drawable == (nVar = this.f31219I) && nVar.c0()) {
            u();
        } else if (!this.f31222L && (drawable instanceof n)) {
            n nVar2 = (n) drawable;
            if (nVar2.c0()) {
                nVar2.v0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f31225O.add(c.PLAY_OPTION);
        this.f31219I.w0();
    }

    public void w(InputStream inputStream, String str) {
        setCompositionTask(q.n(inputStream, str));
    }

    public void x(String str, String str2) {
        w(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f31219I.P0(str);
    }

    public void setMinFrame(String str) {
        this.f31219I.U0(str);
    }

    public void setAnimation(String str) {
        this.f31220J = str;
        this.f31221K = 0;
        setCompositionTask(n(str));
    }
}
