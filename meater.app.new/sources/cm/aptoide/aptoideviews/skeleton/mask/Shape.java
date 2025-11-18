package cm.aptoide.aptoideviews.skeleton.mask;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: Shape.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", HttpUrl.FRAGMENT_ENCODE_SET, "color", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "getColor", "()I", "Circle", "Rect", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Rect;", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Circle;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class Shape {
    private final int color;

    /* compiled from: Shape.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Circle;", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "color", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Circle extends Shape {
        public Circle(int i2) {
            super(i2, null);
        }
    }

    /* compiled from: Shape.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Rect;", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "color", HttpUrl.FRAGMENT_ENCODE_SET, "cornerRadius", "(II)V", "getCornerRadius", "()I", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Rect extends Shape {
        private final int cornerRadius;

        public Rect(int i2, int i3) {
            super(i2, null);
            this.cornerRadius = i3;
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }
    }

    private Shape(int i2) {
        this.color = i2;
    }

    public /* synthetic */ Shape(int i2, C9789g c9789g) {
        this(i2);
    }

    public final int getColor() {
        return this.color;
    }
}
