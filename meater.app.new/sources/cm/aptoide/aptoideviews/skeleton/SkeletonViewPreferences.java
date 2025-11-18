package cm.aptoide.aptoideviews.skeleton;

import android.graphics.Color;
import cm.aptoide.aptoideviews.skeleton.mask.Border;
import cm.aptoide.aptoideviews.skeleton.mask.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SkeletonViewPreferences.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", HttpUrl.FRAGMENT_ENCODE_SET, "shape", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "border", "Lcm/aptoide/aptoideviews/skeleton/mask/Border;", "(Lcm/aptoide/aptoideviews/skeleton/mask/Shape;Lcm/aptoide/aptoideviews/skeleton/mask/Border;)V", "getBorder", "()Lcm/aptoide/aptoideviews/skeleton/mask/Border;", "setBorder", "(Lcm/aptoide/aptoideviews/skeleton/mask/Border;)V", "getShape", "()Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "setShape", "(Lcm/aptoide/aptoideviews/skeleton/mask/Shape;)V", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SkeletonViewPreferences {
    private Border border;
    private Shape shape;

    public SkeletonViewPreferences() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SkeletonViewPreferences(Shape shape, Border border) {
        C9801m.m32346f(shape, "shape");
        C9801m.m32346f(border, "border");
        this.shape = shape;
        this.border = border;
    }

    public static /* synthetic */ SkeletonViewPreferences copy$default(SkeletonViewPreferences skeletonViewPreferences, Shape shape, Border border, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = skeletonViewPreferences.shape;
        }
        if ((i2 & 2) != 0) {
            border = skeletonViewPreferences.border;
        }
        return skeletonViewPreferences.copy(shape, border);
    }

    /* renamed from: component1, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: component2, reason: from getter */
    public final Border getBorder() {
        return this.border;
    }

    public final SkeletonViewPreferences copy(Shape shape, Border border) {
        C9801m.m32346f(shape, "shape");
        C9801m.m32346f(border, "border");
        return new SkeletonViewPreferences(shape, border);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkeletonViewPreferences)) {
            return false;
        }
        SkeletonViewPreferences skeletonViewPreferences = (SkeletonViewPreferences) other;
        return C9801m.m32341a(this.shape, skeletonViewPreferences.shape) && C9801m.m32341a(this.border, skeletonViewPreferences.border);
    }

    public final Border getBorder() {
        return this.border;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (this.shape.hashCode() * 31) + this.border.hashCode();
    }

    public final void setBorder(Border border) {
        C9801m.m32346f(border, "<set-?>");
        this.border = border;
    }

    public final void setShape(Shape shape) {
        C9801m.m32346f(shape, "<set-?>");
        this.shape = shape;
    }

    public String toString() {
        return "SkeletonViewPreferences(shape=" + this.shape + ", border=" + this.border + ')';
    }

    public /* synthetic */ SkeletonViewPreferences(Shape shape, Border border, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? new Shape.Rect(Color.parseColor("#EDEEF2"), 0) : shape, (i2 & 2) != 0 ? new Border(0, -1) : border);
    }
}
