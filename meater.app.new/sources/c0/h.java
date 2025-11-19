package c0;

import h0.C3478i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Autofill.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, d2 = {"Lc0/h;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Lc0/j;", "a", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "Lh0/i;", "b", "Lh0/i;", "()Lh0/i;", "setBoundingBox", "(Lh0/i;)V", "boundingBox", "Lkotlin/Function1;", "", "Loa/F;", "c", "LBa/l;", "()LBa/l;", "onFill", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final int f30827e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<j> autofillTypes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C3478i boundingBox;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<String, C4153F> onFill;

    public final List<j> a() {
        return this.autofillTypes;
    }

    /* renamed from: b, reason: from getter */
    public final C3478i getBoundingBox() {
        return this.boundingBox;
    }

    public final Ba.l<String, C4153F> c() {
        return this.onFill;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return C3862t.b(this.autofillTypes, hVar.autofillTypes) && C3862t.b(this.boundingBox, hVar.boundingBox) && this.onFill == hVar.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        C3478i c3478i = this.boundingBox;
        int iHashCode2 = (iHashCode + (c3478i != null ? c3478i.hashCode() : 0)) * 31;
        Ba.l<String, C4153F> lVar = this.onFill;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
