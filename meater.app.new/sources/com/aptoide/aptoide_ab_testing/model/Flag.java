package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.aab.C1152a;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\nHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u009d\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005HÆ\u0001J\u0013\u00106\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#¨\u0006;"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/Flag;", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, HttpUrl.FRAGMENT_ENCODE_SET, RoomNotification.KEY, HttpUrl.FRAGMENT_ENCODE_SET, "description", "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "tags", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/aptoide/aptoide_ab_testing/model/Tag;", "segments", "Lcom/aptoide/aptoide_ab_testing/model/Segment;", "variants", "Lcom/aptoide/aptoide_ab_testing/model/Variant;", "dataRecordsEnabled", "entityType", "notes", "createdBy", "updatedBy", "updatedAt", "(JLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "getDataRecordsEnabled", "()Z", "getDescription", "getEnabled", "getEntityType", "getId", "()J", "getKey", "getNotes", "getSegments", "()Ljava/util/List;", "getTags", "getUpdatedAt", "getUpdatedBy", "getVariants", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Flag {
    private final String createdBy;
    private final boolean dataRecordsEnabled;
    private final String description;
    private final boolean enabled;
    private final String entityType;
    private final long id;
    private final String key;
    private final String notes;
    private final List<Segment> segments;
    private final List<Tag> tags;
    private final String updatedAt;
    private final String updatedBy;
    private final List<Variant> variants;

    public Flag(long j2, String str, String str2, boolean z, List<Tag> list, List<Segment> list2, List<Variant> list3, boolean z2, String str3, String str4, String str5, String str6, String str7) {
        C9801m.m32346f(str, RoomNotification.KEY);
        C9801m.m32346f(str2, "description");
        C9801m.m32346f(list, "tags");
        C9801m.m32346f(list2, "segments");
        C9801m.m32346f(list3, "variants");
        C9801m.m32346f(str3, "entityType");
        C9801m.m32346f(str4, "notes");
        C9801m.m32346f(str5, "createdBy");
        C9801m.m32346f(str6, "updatedBy");
        C9801m.m32346f(str7, "updatedAt");
        this.id = j2;
        this.key = str;
        this.description = str2;
        this.enabled = z;
        this.tags = list;
        this.segments = list2;
        this.variants = list3;
        this.dataRecordsEnabled = z2;
        this.entityType = str3;
        this.notes = str4;
        this.createdBy = str5;
        this.updatedBy = str6;
        this.updatedAt = str7;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component12, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<Tag> component5() {
        return this.tags;
    }

    public final List<Segment> component6() {
        return this.segments;
    }

    public final List<Variant> component7() {
        return this.variants;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDataRecordsEnabled() {
        return this.dataRecordsEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEntityType() {
        return this.entityType;
    }

    public final Flag copy(long id, String key, String description, boolean enabled, List<Tag> tags, List<Segment> segments, List<Variant> variants, boolean dataRecordsEnabled, String entityType, String notes, String createdBy, String updatedBy, String updatedAt) {
        C9801m.m32346f(key, RoomNotification.KEY);
        C9801m.m32346f(description, "description");
        C9801m.m32346f(tags, "tags");
        C9801m.m32346f(segments, "segments");
        C9801m.m32346f(variants, "variants");
        C9801m.m32346f(entityType, "entityType");
        C9801m.m32346f(notes, "notes");
        C9801m.m32346f(createdBy, "createdBy");
        C9801m.m32346f(updatedBy, "updatedBy");
        C9801m.m32346f(updatedAt, "updatedAt");
        return new Flag(id, key, description, enabled, tags, segments, variants, dataRecordsEnabled, entityType, notes, createdBy, updatedBy, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) other;
        return this.id == flag.id && C9801m.m32341a(this.key, flag.key) && C9801m.m32341a(this.description, flag.description) && this.enabled == flag.enabled && C9801m.m32341a(this.tags, flag.tags) && C9801m.m32341a(this.segments, flag.segments) && C9801m.m32341a(this.variants, flag.variants) && this.dataRecordsEnabled == flag.dataRecordsEnabled && C9801m.m32341a(this.entityType, flag.entityType) && C9801m.m32341a(this.notes, flag.notes) && C9801m.m32341a(this.createdBy, flag.createdBy) && C9801m.m32341a(this.updatedBy, flag.updatedBy) && C9801m.m32341a(this.updatedAt, flag.updatedAt);
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final boolean getDataRecordsEnabled() {
        return this.dataRecordsEnabled;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final long getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<Segment> getSegments() {
        return this.segments;
    }

    public final List<Tag> getTags() {
        return this.tags;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    public final List<Variant> getVariants() {
        return this.variants;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM6829a = ((((C1152a.m6829a(this.id) * 31) + this.key.hashCode()) * 31) + this.description.hashCode()) * 31;
        boolean z = this.enabled;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int iHashCode = (((((((iM6829a + i2) * 31) + this.tags.hashCode()) * 31) + this.segments.hashCode()) * 31) + this.variants.hashCode()) * 31;
        boolean z2 = this.dataRecordsEnabled;
        return ((((((((((iHashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.entityType.hashCode()) * 31) + this.notes.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.updatedBy.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        return "Flag(id=" + this.id + ", key=" + this.key + ", description=" + this.description + ", enabled=" + this.enabled + ", tags=" + this.tags + ", segments=" + this.segments + ", variants=" + this.variants + ", dataRecordsEnabled=" + this.dataRecordsEnabled + ", entityType=" + this.entityType + ", notes=" + this.notes + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", updatedAt=" + this.updatedAt + ')';
    }
}
