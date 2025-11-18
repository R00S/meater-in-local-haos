package cm.aptoide.p092pt.editorial;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: EditorialLoadSource.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m32267d2 = {"Lcm/aptoide/pt/editorial/Slug;", "Lcm/aptoide/pt/editorial/EditorialLoadSource;", "slug", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Slug extends EditorialLoadSource {
    private final String slug;

    public Slug(String str) {
        super(null);
        this.slug = str;
    }

    public static /* synthetic */ Slug copy$default(Slug slug, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = slug.slug;
        }
        return slug.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    public final Slug copy(String slug) {
        return new Slug(slug);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Slug) && C9801m.m32341a(this.slug, ((Slug) other).slug);
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        String str = this.slug;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Slug(slug=" + this.slug + ')';
    }
}
