package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.aab.C1152a;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.gson.C8573l;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\r\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/Variant;", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, HttpUrl.FRAGMENT_ENCODE_SET, RoomNotification.KEY, HttpUrl.FRAGMENT_ENCODE_SET, "attachment", "Lcom/google/gson/JsonObject;", "Lcom/aptoide/aptoide_ab_testing/model/Attachment;", "(JLjava/lang/String;Lcom/google/gson/JsonObject;)V", "getAttachment", "()Lcom/google/gson/JsonObject;", "getId", "()J", "getKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Variant {
    private final C8573l attachment;
    private final long id;
    private final String key;

    public Variant(long j2, String str, C8573l c8573l) {
        C9801m.m32346f(str, RoomNotification.KEY);
        C9801m.m32346f(c8573l, "attachment");
        this.id = j2;
        this.key = str;
        this.attachment = c8573l;
    }

    public static /* synthetic */ Variant copy$default(Variant variant, long j2, String str, C8573l c8573l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = variant.id;
        }
        if ((i2 & 2) != 0) {
            str = variant.key;
        }
        if ((i2 & 4) != 0) {
            c8573l = variant.attachment;
        }
        return variant.copy(j2, str, c8573l);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final C8573l getAttachment() {
        return this.attachment;
    }

    public final Variant copy(long j2, String str, C8573l c8573l) {
        C9801m.m32346f(str, RoomNotification.KEY);
        C9801m.m32346f(c8573l, "attachment");
        return new Variant(j2, str, c8573l);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Variant)) {
            return false;
        }
        Variant variant = (Variant) other;
        return this.id == variant.id && C9801m.m32341a(this.key, variant.key) && C9801m.m32341a(this.attachment, variant.attachment);
    }

    public final C8573l getAttachment() {
        return this.attachment;
    }

    public final long getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return (((C1152a.m6829a(this.id) * 31) + this.key.hashCode()) * 31) + this.attachment.hashCode();
    }

    public String toString() {
        return "Variant(id=" + this.id + ", key=" + this.key + ", attachment=" + this.attachment + ')';
    }
}
