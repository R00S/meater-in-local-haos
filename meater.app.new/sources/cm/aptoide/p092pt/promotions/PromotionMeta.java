package cm.aptoide.p092pt.promotions;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: PromotionMeta.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m32267d2 = {"Lcm/aptoide/pt/promotions/PromotionMeta;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, "promotionId", "type", "background", "dialogDescription", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Ljava/lang/String;", "getDescription", "getDialogDescription", "getPromotionId", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PromotionMeta {
    private final String background;
    private final String description;
    private final String dialogDescription;
    private final String promotionId;
    private final String title;
    private final String type;

    public PromotionMeta() {
        this(null, null, null, null, null, null, 63, null);
    }

    public PromotionMeta(String str, String str2, String str3, String str4, String str5, String str6) {
        C9801m.m32346f(str, "title");
        C9801m.m32346f(str2, "promotionId");
        C9801m.m32346f(str3, "type");
        C9801m.m32346f(str4, "background");
        C9801m.m32346f(str5, "dialogDescription");
        C9801m.m32346f(str6, "description");
        this.title = str;
        this.promotionId = str2;
        this.type = str3;
        this.background = str4;
        this.dialogDescription = str5;
        this.description = str6;
    }

    public static /* synthetic */ PromotionMeta copy$default(PromotionMeta promotionMeta, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = promotionMeta.title;
        }
        if ((i2 & 2) != 0) {
            str2 = promotionMeta.promotionId;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = promotionMeta.type;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = promotionMeta.background;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = promotionMeta.dialogDescription;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            str6 = promotionMeta.description;
        }
        return promotionMeta.copy(str, str7, str8, str9, str10, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPromotionId() {
        return this.promotionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDialogDescription() {
        return this.dialogDescription;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final PromotionMeta copy(String title, String promotionId, String type, String background, String dialogDescription, String description) {
        C9801m.m32346f(title, "title");
        C9801m.m32346f(promotionId, "promotionId");
        C9801m.m32346f(type, "type");
        C9801m.m32346f(background, "background");
        C9801m.m32346f(dialogDescription, "dialogDescription");
        C9801m.m32346f(description, "description");
        return new PromotionMeta(title, promotionId, type, background, dialogDescription, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionMeta)) {
            return false;
        }
        PromotionMeta promotionMeta = (PromotionMeta) other;
        return C9801m.m32341a(this.title, promotionMeta.title) && C9801m.m32341a(this.promotionId, promotionMeta.promotionId) && C9801m.m32341a(this.type, promotionMeta.type) && C9801m.m32341a(this.background, promotionMeta.background) && C9801m.m32341a(this.dialogDescription, promotionMeta.dialogDescription) && C9801m.m32341a(this.description, promotionMeta.description);
    }

    public final String getBackground() {
        return this.background;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDialogDescription() {
        return this.dialogDescription;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.promotionId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.background.hashCode()) * 31) + this.dialogDescription.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "PromotionMeta(title=" + this.title + ", promotionId=" + this.promotionId + ", type=" + this.type + ", background=" + this.background + ", dialogDescription=" + this.dialogDescription + ", description=" + this.description + ')';
    }

    public /* synthetic */ PromotionMeta(String str, String str2, String str3, String str4, String str5, String str6, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i2 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, (i2 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i2 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4, (i2 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str5, (i2 & 32) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str6);
    }
}
