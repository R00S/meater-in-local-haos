package cm.aptoide.aptoideviews.skeleton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import cm.aptoide.aptoideviews.C1103R;
import cm.aptoide.aptoideviews.skeleton.mask.Border;
import cm.aptoide.aptoideviews.skeleton.mask.Shape;
import cm.aptoide.aptoideviews.skeleton.mask.SkeletonMask;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SkeletonView.kt */
@Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mask", "Lcm/aptoide/aptoideviews/skeleton/mask/SkeletonMask;", "viewPreferences", "Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "onDraw", HttpUrl.FRAGMENT_ENCODE_SET, "canvas", "Landroid/graphics/Canvas;", "Companion", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SkeletonView extends View {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Map<Integer, View> _$_findViewCache;
    private SkeletonMask mask;
    private SkeletonViewPreferences viewPreferences;

    /* compiled from: SkeletonView.kt */
    @Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0002¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonView$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "getSkeletonBorder", "Lcm/aptoide/aptoideviews/skeleton/mask/Border;", "t", "Landroid/content/res/TypedArray;", "defaultBorder", "getSkeletonShape", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "defaultShape", "getSkeletonViewPreferences", "Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultPrefs", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        private final Border getSkeletonBorder(TypedArray t, Border defaultBorder) {
            ColorStateList colorStateList = t.getColorStateList(C1103R.styleable.SkeletonView_skeleton_border_color);
            return new Border((int) t.getDimension(C1103R.styleable.SkeletonView_skeleton_border_thickness, 0.0f), colorStateList != null ? colorStateList.getDefaultColor() : defaultBorder.getColor());
        }

        private final Shape getSkeletonShape(TypedArray t, Shape defaultShape) {
            ColorStateList colorStateList = t.getColorStateList(C1103R.styleable.SkeletonView_skeleton_color);
            int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : defaultShape.getColor();
            int i2 = t.getInt(C1103R.styleable.SkeletonView_skeleton_shape, 0);
            return i2 != 0 ? i2 != 1 ? defaultShape : new Shape.Circle(defaultColor) : new Shape.Rect(defaultColor, (int) t.getDimension(C1103R.styleable.SkeletonView_skeleton_corner_radius, 0.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SkeletonViewPreferences getSkeletonViewPreferences(Context c2, AttributeSet attrs, SkeletonViewPreferences defaultPrefs) {
            if (attrs == null) {
                return defaultPrefs;
            }
            TypedArray typedArrayObtainStyledAttributes = c2.obtainStyledAttributes(attrs, C1103R.styleable.SkeletonView, 0, 0);
            C9801m.m32345e(typedArrayObtainStyledAttributes, "c.obtainStyledAttributes…eable.SkeletonView, 0, 0)");
            Companion companion = SkeletonView.INSTANCE;
            SkeletonViewPreferences skeletonViewPreferences = new SkeletonViewPreferences(companion.getSkeletonShape(typedArrayObtainStyledAttributes, defaultPrefs.getShape()), companion.getSkeletonBorder(typedArrayObtainStyledAttributes, defaultPrefs.getBorder()));
            typedArrayObtainStyledAttributes.recycle();
            return skeletonViewPreferences;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletonView(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
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
    protected void onDraw(Canvas canvas) {
        C9801m.m32346f(canvas, "canvas");
        super.onDraw(canvas);
        SkeletonMask skeletonMask = this.mask;
        if (skeletonMask != null) {
            skeletonMask.draw(canvas);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        SkeletonViewPreferences skeletonViewPreferences = new SkeletonViewPreferences(null, null, 3, null);
        this.viewPreferences = skeletonViewPreferences;
        SkeletonViewPreferences skeletonViewPreferences2 = INSTANCE.getSkeletonViewPreferences(context, attributeSet, skeletonViewPreferences);
        this.viewPreferences = skeletonViewPreferences2;
        this.mask = new SkeletonMask(this, skeletonViewPreferences2);
    }
}
