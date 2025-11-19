package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.EnumC4130e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001c"}, d2 = {"Le6/e;", "", "Lo4/d;", "a", "()Lo4/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPrepTimeMinutes", "prepTimeMinutes", "b", "getCookTimeMinutes", "cookTimeMinutes", "c", "Ljava/lang/String;", "getDifficulty", "difficulty", "d", "getText", "text", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class Description {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("prep_time_minutes")
    private final int prepTimeMinutes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("cook_time_minutes")
    private final int cookTimeMinutes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("difficulty")
    private final String difficulty;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("text")
    private final String text;

    public final o4.Description a() {
        return new o4.Description(this.prepTimeMinutes, this.cookTimeMinutes, 0, EnumC4130e.INSTANCE.a(this.difficulty), this.text, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Description)) {
            return false;
        }
        Description description = (Description) other;
        return this.prepTimeMinutes == description.prepTimeMinutes && this.cookTimeMinutes == description.cookTimeMinutes && C3862t.b(this.difficulty, description.difficulty) && C3862t.b(this.text, description.text);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.prepTimeMinutes) * 31) + Integer.hashCode(this.cookTimeMinutes)) * 31) + this.difficulty.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "Description(prepTimeMinutes=" + this.prepTimeMinutes + ", cookTimeMinutes=" + this.cookTimeMinutes + ", difficulty=" + this.difficulty + ", text=" + this.text + ")";
    }
}
