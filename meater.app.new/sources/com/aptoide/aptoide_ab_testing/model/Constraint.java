package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.aab.C1152a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/Constraint;", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, HttpUrl.FRAGMENT_ENCODE_SET, "property", HttpUrl.FRAGMENT_ENCODE_SET, "operator", "value", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getOperator", "()Ljava/lang/String;", "getProperty", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Constraint {
    private final long id;
    private final String operator;
    private final String property;
    private final String value;

    public Constraint(long j2, String str, String str2, String str3) {
        C9801m.m32346f(str, "property");
        C9801m.m32346f(str2, "operator");
        C9801m.m32346f(str3, "value");
        this.id = j2;
        this.property = str;
        this.operator = str2;
        this.value = str3;
    }

    public static /* synthetic */ Constraint copy$default(Constraint constraint, long j2, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = constraint.id;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            str = constraint.property;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = constraint.operator;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = constraint.value;
        }
        return constraint.copy(j3, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProperty() {
        return this.property;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final Constraint copy(long id, String property, String operator, String value) {
        C9801m.m32346f(property, "property");
        C9801m.m32346f(operator, "operator");
        C9801m.m32346f(value, "value");
        return new Constraint(id, property, operator, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Constraint)) {
            return false;
        }
        Constraint constraint = (Constraint) other;
        return this.id == constraint.id && C9801m.m32341a(this.property, constraint.property) && C9801m.m32341a(this.operator, constraint.operator) && C9801m.m32341a(this.value, constraint.value);
    }

    public final long getId() {
        return this.id;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((C1152a.m6829a(this.id) * 31) + this.property.hashCode()) * 31) + this.operator.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Constraint(id=" + this.id + ", property=" + this.property + ", operator=" + this.operator + ", value=" + this.value + ')';
    }
}
