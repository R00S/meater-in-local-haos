package cm.aptoide.p092pt.aab;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: DynamicSplit.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006&"}, m32267d2 = {"Lcm/aptoide/pt/aab/DynamicSplit;", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, "type", "md5Sum", "path", "fileSize", HttpUrl.FRAGMENT_ENCODE_SET, "deliveryTypes", HttpUrl.FRAGMENT_ENCODE_SET, "configSplits", "Lcm/aptoide/pt/aab/Split;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;)V", "getConfigSplits", "()Ljava/util/List;", "getDeliveryTypes", "getFileSize", "()J", "getMd5Sum", "()Ljava/lang/String;", "getName", "getPath", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DynamicSplit {
    private final List<Split> configSplits;
    private final List<String> deliveryTypes;
    private final long fileSize;
    private final String md5Sum;
    private final String name;
    private final String path;
    private final String type;

    public DynamicSplit(String str, String str2, String str3, String str4, long j2, List<String> list, List<Split> list2) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, "type");
        C9801m.m32346f(str3, "md5Sum");
        C9801m.m32346f(str4, "path");
        C9801m.m32346f(list, "deliveryTypes");
        C9801m.m32346f(list2, "configSplits");
        this.name = str;
        this.type = str2;
        this.md5Sum = str3;
        this.path = str4;
        this.fileSize = j2;
        this.deliveryTypes = list;
        this.configSplits = list2;
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMd5Sum() {
        return this.md5Sum;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component5, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    public final List<String> component6() {
        return this.deliveryTypes;
    }

    public final List<Split> component7() {
        return this.configSplits;
    }

    public final DynamicSplit copy(String name, String type, String md5Sum, String path, long fileSize, List<String> deliveryTypes, List<Split> configSplits) {
        C9801m.m32346f(name, "name");
        C9801m.m32346f(type, "type");
        C9801m.m32346f(md5Sum, "md5Sum");
        C9801m.m32346f(path, "path");
        C9801m.m32346f(deliveryTypes, "deliveryTypes");
        C9801m.m32346f(configSplits, "configSplits");
        return new DynamicSplit(name, type, md5Sum, path, fileSize, deliveryTypes, configSplits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicSplit)) {
            return false;
        }
        DynamicSplit dynamicSplit = (DynamicSplit) other;
        return C9801m.m32341a(this.name, dynamicSplit.name) && C9801m.m32341a(this.type, dynamicSplit.type) && C9801m.m32341a(this.md5Sum, dynamicSplit.md5Sum) && C9801m.m32341a(this.path, dynamicSplit.path) && this.fileSize == dynamicSplit.fileSize && C9801m.m32341a(this.deliveryTypes, dynamicSplit.deliveryTypes) && C9801m.m32341a(this.configSplits, dynamicSplit.configSplits);
    }

    public final List<Split> getConfigSplits() {
        return this.configSplits;
    }

    public final List<String> getDeliveryTypes() {
        return this.deliveryTypes;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getMd5Sum() {
        return this.md5Sum;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.md5Sum.hashCode()) * 31) + this.path.hashCode()) * 31) + C1152a.m6829a(this.fileSize)) * 31) + this.deliveryTypes.hashCode()) * 31) + this.configSplits.hashCode();
    }

    public String toString() {
        return "DynamicSplit(name=" + this.name + ", type=" + this.type + ", md5Sum=" + this.md5Sum + ", path=" + this.path + ", fileSize=" + this.fileSize + ", deliveryTypes=" + this.deliveryTypes + ", configSplits=" + this.configSplits + ')';
    }
}
