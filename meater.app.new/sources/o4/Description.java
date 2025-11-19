package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Description.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010\r¨\u0006!"}, d2 = {"Lo4/d;", "", "", "prepTimeMinutes", "cookTimeMinutes", "totalTimeMinutes", "Lo4/e;", "difficulty", "", "text", "<init>", "(IIILo4/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getPrepTimeMinutes", "b", "getCookTimeMinutes", "c", "setTotalTimeMinutes", "(I)V", "d", "Lo4/e;", "()Lo4/e;", "e", "Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class Description {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int prepTimeMinutes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cookTimeMinutes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private int totalTimeMinutes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC4130e difficulty;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    public Description(int i10, int i11, int i12, EnumC4130e difficulty, String text) {
        C3862t.g(difficulty, "difficulty");
        C3862t.g(text, "text");
        this.prepTimeMinutes = i10;
        this.cookTimeMinutes = i11;
        this.totalTimeMinutes = i12;
        this.difficulty = difficulty;
        this.text = text;
    }

    /* renamed from: a, reason: from getter */
    public final EnumC4130e getDifficulty() {
        return this.difficulty;
    }

    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: c, reason: from getter */
    public final int getTotalTimeMinutes() {
        return this.totalTimeMinutes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Description)) {
            return false;
        }
        Description description = (Description) other;
        return this.prepTimeMinutes == description.prepTimeMinutes && this.cookTimeMinutes == description.cookTimeMinutes && this.totalTimeMinutes == description.totalTimeMinutes && this.difficulty == description.difficulty && C3862t.b(this.text, description.text);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.prepTimeMinutes) * 31) + Integer.hashCode(this.cookTimeMinutes)) * 31) + Integer.hashCode(this.totalTimeMinutes)) * 31) + this.difficulty.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "Description(prepTimeMinutes=" + this.prepTimeMinutes + ", cookTimeMinutes=" + this.cookTimeMinutes + ", totalTimeMinutes=" + this.totalTimeMinutes + ", difficulty=" + this.difficulty + ", text=" + this.text + ")";
    }

    public /* synthetic */ Description(int i10, int i11, int i12, EnumC4130e enumC4130e, String str, int i13, C3854k c3854k) {
        this(i10, i11, (i13 & 4) != 0 ? i10 + i11 : i12, enumC4130e, str);
    }
}
