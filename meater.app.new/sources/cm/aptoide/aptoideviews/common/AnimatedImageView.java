package cm.aptoide.aptoideviews.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import cm.aptoide.aptoideviews.C1103R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: AnimatedImageView.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u001a\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\u001d\u001a\u00020\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001e"}, m32267d2 = {"Lcm/aptoide/aptoideviews/common/AnimatedImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animation", "Landroid/graphics/drawable/Animatable;", "getAnimation", "()Landroid/graphics/drawable/Animatable;", "setAnimation", "(Landroid/graphics/drawable/Animatable;)V", "isAnimationsEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "setAnimationsEnabled", "(Z)V", "reverse", "getReverse", "setReverse", "play", HttpUrl.FRAGMENT_ENCODE_SET, "playReverse", "retrievePreferences", "setReverseAsDefault", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AnimatedImageView extends ImageView {
    public Map<Integer, View> _$_findViewCache;
    private Animatable animation;
    private boolean isAnimationsEnabled;
    private Animatable reverse;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedImageView(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
    }

    private final void retrievePreferences(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C1103R.styleable.AnimatedImageView, defStyleAttr, 0);
        C9801m.m32345e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ageView, defStyleAttr, 0)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1103R.styleable.AnimatedImageView_animation, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C1103R.styleable.AnimatedImageView_reverseAnimation, -1);
        if (resourceId != -1) {
            Object objM5262d = C0833a.m5262d(getContext(), resourceId);
            if (objM5262d == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.Animatable");
            }
            this.animation = (Animatable) objM5262d;
        }
        if (resourceId2 != -1) {
            Object objM5262d2 = C0833a.m5262d(getContext(), resourceId2);
            if (objM5262d2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.Animatable");
            }
            this.reverse = (Animatable) objM5262d2;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public final Animatable getAnimation() {
        return this.animation;
    }

    public final Animatable getReverse() {
        return this.reverse;
    }

    /* renamed from: isAnimationsEnabled, reason: from getter */
    public final boolean getIsAnimationsEnabled() {
        return this.isAnimationsEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void play() {
        Animatable animatable = this.animation;
        if (animatable != 0) {
            setImageDrawable((Drawable) animatable);
            if (this.isAnimationsEnabled) {
                animatable.start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playReverse() {
        Animatable animatable = this.reverse;
        if (animatable != 0) {
            setImageDrawable((Drawable) animatable);
            if (this.isAnimationsEnabled) {
                animatable.start();
            }
        }
    }

    public final void setAnimation(Animatable animatable) {
        this.animation = animatable;
    }

    public final void setAnimationsEnabled(boolean z) {
        this.isAnimationsEnabled = z;
    }

    public final void setReverse(Animatable animatable) {
        this.reverse = animatable;
    }

    public final void setReverseAsDefault() {
        Object obj = this.reverse;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.Drawable");
        }
        setImageDrawable((Drawable) obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.isAnimationsEnabled = true;
        retrievePreferences(attributeSet, i2);
    }
}
