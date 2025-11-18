package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p119w.C5323c;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: h */
    private static final String f12304h = LottieAnimationView.class.getSimpleName();

    /* renamed from: i */
    private final InterfaceC5184h<C5180d> f12305i;

    /* renamed from: j */
    private final InterfaceC5184h<Throwable> f12306j;

    /* renamed from: k */
    private final C5182f f12307k;

    /* renamed from: l */
    private String f12308l;

    /* renamed from: m */
    private int f12309m;

    /* renamed from: n */
    private boolean f12310n;

    /* renamed from: o */
    private boolean f12311o;

    /* renamed from: p */
    private boolean f12312p;

    /* renamed from: q */
    private Set<InterfaceC5185i> f12313q;

    /* renamed from: r */
    private C5188l<C5180d> f12314r;

    /* renamed from: s */
    private C5180d f12315s;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5174a();

        /* renamed from: f */
        String f12316f;

        /* renamed from: g */
        int f12317g;

        /* renamed from: h */
        float f12318h;

        /* renamed from: i */
        boolean f12319i;

        /* renamed from: j */
        String f12320j;

        /* renamed from: k */
        int f12321k;

        /* renamed from: l */
        int f12322l;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        static class C5174a implements Parcelable.Creator<SavedState> {
            C5174a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C5175a c5175a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f12316f);
            parcel.writeFloat(this.f12318h);
            parcel.writeInt(this.f12319i ? 1 : 0);
            parcel.writeString(this.f12320j);
            parcel.writeInt(this.f12321k);
            parcel.writeInt(this.f12322l);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f12316f = parcel.readString();
            this.f12318h = parcel.readFloat();
            this.f12319i = parcel.readInt() == 1;
            this.f12320j = parcel.readString();
            this.f12321k = parcel.readInt();
            this.f12322l = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    class C5175a implements InterfaceC5184h<C5180d> {
        C5175a() {
        }

        @Override // com.airbnb.lottie.InterfaceC5184h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9387a(C5180d c5180d) {
            LottieAnimationView.this.setComposition(c5180d);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    class C5176b implements InterfaceC5184h<Throwable> {
        C5176b() {
        }

        @Override // com.airbnb.lottie.InterfaceC5184h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9387a(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f12305i = new C5175a();
        this.f12306j = new C5176b();
        this.f12307k = new C5182f();
        this.f12310n = false;
        this.f12311o = false;
        this.f12312p = false;
        this.f12313q = new HashSet();
        m9374i(null);
    }

    /* renamed from: e */
    private void m9371e() {
        C5188l<C5180d> c5188l = this.f12314r;
        if (c5188l != null) {
            c5188l.m9505m(this.f12305i);
            this.f12314r.m9504l(this.f12306j);
        }
    }

    /* renamed from: f */
    private void m9372f() {
        this.f12315s = null;
        this.f12307k.m9464f();
    }

    /* renamed from: h */
    private void m9373h() {
        setLayerType(this.f12312p && this.f12307k.m9441B() ? 2 : 1, null);
    }

    /* renamed from: i */
    private void m9374i(AttributeSet attributeSet) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5190n.f12481w);
        if (!isInEditMode()) {
            int i2 = C5190n.f12440E;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
            int i3 = C5190n.f12436A;
            boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i3);
            int i4 = C5190n.f12444I;
            boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i4);
            if (zHasValue && zHasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (zHasValue) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (zHasValue2) {
                String string2 = typedArrayObtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C5190n.f12482x, false)) {
            this.f12310n = true;
            this.f12311o = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C5190n.f12438C, false)) {
            this.f12307k.m9456Q(-1);
        }
        int i5 = C5190n.f12442G;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = C5190n.f12441F;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i6, -1));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(C5190n.f12437B));
        setProgress(typedArrayObtainStyledAttributes.getFloat(C5190n.f12439D, 0.0f));
        m9378g(typedArrayObtainStyledAttributes.getBoolean(C5190n.f12484z, false));
        int i7 = C5190n.f12483y;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            m9376c(new C5233e("**"), InterfaceC5186j.f12418x, new C5323c(new C5191o(typedArrayObtainStyledAttributes.getColor(i7, 0))));
        }
        int i8 = C5190n.f12443H;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f12307k.m9458S(typedArrayObtainStyledAttributes.getFloat(i8, 1.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        m9373h();
    }

    /* renamed from: p */
    private void m9375p(Drawable drawable, boolean z) {
        if (z && drawable != this.f12307k) {
            m9382m();
        }
        m9371e();
        super.setImageDrawable(drawable);
    }

    private void setCompositionTask(C5188l<C5180d> c5188l) {
        m9372f();
        m9371e();
        this.f12314r = c5188l.m9503h(this.f12305i).m9502g(this.f12306j);
    }

    /* renamed from: c */
    public <T> void m9376c(C5233e c5233e, T t, C5323c<T> c5323c) {
        this.f12307k.m9462c(c5233e, t, c5323c);
    }

    /* renamed from: d */
    public void m9377d() {
        this.f12307k.m9463e();
        m9373h();
    }

    /* renamed from: g */
    public void m9378g(boolean z) {
        this.f12307k.m9465g(z);
    }

    public C5180d getComposition() {
        return this.f12315s;
    }

    public long getDuration() {
        C5180d c5180d = this.f12315s;
        if (c5180d != null) {
            return (long) c5180d.m9398d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f12307k.m9469m();
    }

    public String getImageAssetsFolder() {
        return this.f12307k.m9471p();
    }

    public float getMaxFrame() {
        return this.f12307k.m9472q();
    }

    public float getMinFrame() {
        return this.f12307k.m9473s();
    }

    public C5189m getPerformanceTracker() {
        return this.f12307k.m9474t();
    }

    public float getProgress() {
        return this.f12307k.m9475u();
    }

    public int getRepeatCount() {
        return this.f12307k.m9476v();
    }

    public int getRepeatMode() {
        return this.f12307k.m9477w();
    }

    public float getScale() {
        return this.f12307k.m9478x();
    }

    public float getSpeed() {
        return this.f12307k.m9479y();
    }

    public boolean getUseHardwareAcceleration() {
        return this.f12312p;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C5182f c5182f = this.f12307k;
        if (drawable2 == c5182f) {
            super.invalidateDrawable(c5182f);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public boolean m9379j() {
        return this.f12307k.m9441B();
    }

    @Deprecated
    /* renamed from: k */
    public void m9380k(boolean z) {
        this.f12307k.m9456Q(z ? -1 : 0);
    }

    /* renamed from: l */
    public void m9381l() {
        this.f12307k.m9442C();
        m9373h();
    }

    /* renamed from: m */
    void m9382m() {
        this.f12307k.m9443D();
    }

    /* renamed from: n */
    public void m9383n(JsonReader jsonReader, String str) {
        setCompositionTask(C5181e.m9418h(jsonReader, str));
    }

    /* renamed from: o */
    public void m9384o(String str, String str2) {
        m9383n(new JsonReader(new StringReader(str)), str2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12311o && this.f12310n) {
            m9381l();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (m9379j()) {
            m9377d();
            this.f12310n = true;
        }
        m9382m();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f12316f;
        this.f12308l = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f12308l);
        }
        int i2 = savedState.f12317g;
        this.f12309m = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(savedState.f12318h);
        if (savedState.f12319i) {
            m9381l();
        }
        this.f12307k.m9449J(savedState.f12320j);
        setRepeatMode(savedState.f12321k);
        setRepeatCount(savedState.f12322l);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12316f = this.f12308l;
        savedState.f12317g = this.f12309m;
        savedState.f12318h = this.f12307k.m9475u();
        savedState.f12319i = this.f12307k.m9441B();
        savedState.f12320j = this.f12307k.m9471p();
        savedState.f12321k = this.f12307k.m9477w();
        savedState.f12322l = this.f12307k.m9476v();
        return savedState;
    }

    public void setAnimation(int i2) {
        this.f12309m = i2;
        this.f12308l = null;
        setCompositionTask(C5181e.m9420j(getContext(), i2));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m9384o(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(C5181e.m9422l(getContext(), str));
    }

    public void setComposition(C5180d c5180d) {
        if (C5179c.f12325a) {
            Log.v(f12304h, "Set Composition \n" + c5180d);
        }
        this.f12307k.setCallback(this);
        this.f12315s = c5180d;
        boolean zM9445F = this.f12307k.m9445F(c5180d);
        m9373h();
        if (getDrawable() != this.f12307k || zM9445F) {
            setImageDrawable(null);
            setImageDrawable(this.f12307k);
            requestLayout();
            Iterator<InterfaceC5185i> it = this.f12313q.iterator();
            while (it.hasNext()) {
                it.next().m9486a(c5180d);
            }
        }
    }

    public void setFontAssetDelegate(C5177a c5177a) {
        this.f12307k.m9446G(c5177a);
    }

    public void setFrame(int i2) {
        this.f12307k.m9447H(i2);
    }

    public void setImageAssetDelegate(InterfaceC5178b interfaceC5178b) {
        this.f12307k.m9448I(interfaceC5178b);
    }

    public void setImageAssetsFolder(String str) {
        this.f12307k.m9449J(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m9382m();
        m9371e();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m9375p(drawable, true);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        m9382m();
        m9371e();
        super.setImageResource(i2);
    }

    public void setMaxFrame(int i2) {
        this.f12307k.m9450K(i2);
    }

    public void setMaxProgress(float f2) {
        this.f12307k.m9451L(f2);
    }

    public void setMinFrame(int i2) {
        this.f12307k.m9452M(i2);
    }

    public void setMinProgress(float f2) {
        this.f12307k.m9453N(f2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f12307k.m9454O(z);
    }

    public void setProgress(float f2) {
        this.f12307k.m9455P(f2);
    }

    public void setRepeatCount(int i2) {
        this.f12307k.m9456Q(i2);
    }

    public void setRepeatMode(int i2) {
        this.f12307k.m9457R(i2);
    }

    public void setScale(float f2) {
        this.f12307k.m9458S(f2);
        if (getDrawable() == this.f12307k) {
            m9375p(null, false);
            m9375p(this.f12307k, false);
        }
    }

    public void setSpeed(float f2) {
        this.f12307k.m9459T(f2);
    }

    public void setTextDelegate(C5192p c5192p) {
        this.f12307k.m9460U(c5192p);
    }

    public void setAnimation(String str) {
        this.f12308l = str;
        this.f12309m = 0;
        setCompositionTask(C5181e.m9414d(getContext(), str));
    }
}
