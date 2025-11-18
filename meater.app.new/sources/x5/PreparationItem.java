package x5;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: PreparationItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010\u0013R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b \u0010\u0015R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001d\u0010\u0015¨\u0006,"}, d2 = {"Lx5/c;", "", "Lx5/d;", "type", "", "title", "information", "name", "link", "", "isChecked", "isExpanded", "", "index", "groupIndex", "groupItemsCount", "<init>", "(Lx5/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lx5/d;", "f", "()Lx5/d;", "b", "Ljava/lang/String;", "e", "c", "d", "getName", "getLink", "Z", "g", "()Z", "i", "(Z)V", "h", "j", "I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x5.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class PreparationItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC5059d type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String information;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String link;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isChecked;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isExpanded;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int groupIndex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int groupItemsCount;

    public PreparationItem(EnumC5059d type, String str, String str2, String str3, String str4, boolean z10, boolean z11, int i10, int i11, int i12) {
        C3862t.g(type, "type");
        this.type = type;
        this.title = str;
        this.information = str2;
        this.name = str3;
        this.link = str4;
        this.isChecked = z10;
        this.isExpanded = z11;
        this.index = i10;
        this.groupIndex = i11;
        this.groupItemsCount = i12;
    }

    /* renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    /* renamed from: b, reason: from getter */
    public final int getGroupItemsCount() {
        return this.groupItemsCount;
    }

    /* renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: d, reason: from getter */
    public final String getInformation() {
        return this.information;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreparationItem)) {
            return false;
        }
        PreparationItem preparationItem = (PreparationItem) other;
        return this.type == preparationItem.type && C3862t.b(this.title, preparationItem.title) && C3862t.b(this.information, preparationItem.information) && C3862t.b(this.name, preparationItem.name) && C3862t.b(this.link, preparationItem.link) && this.isChecked == preparationItem.isChecked && this.isExpanded == preparationItem.isExpanded && this.index == preparationItem.index && this.groupIndex == preparationItem.groupIndex && this.groupItemsCount == preparationItem.groupItemsCount;
    }

    /* renamed from: f, reason: from getter */
    public final EnumC5059d getType() {
        return this.type;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.information;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        return ((((((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.groupIndex)) * 31) + Integer.hashCode(this.groupItemsCount);
    }

    public final void i(boolean z10) {
        this.isChecked = z10;
    }

    public final void j(boolean z10) {
        this.isExpanded = z10;
    }

    public String toString() {
        return "PreparationItem(type=" + this.type + ", title=" + this.title + ", information=" + this.information + ", name=" + this.name + ", link=" + this.link + ", isChecked=" + this.isChecked + ", isExpanded=" + this.isExpanded + ", index=" + this.index + ", groupIndex=" + this.groupIndex + ", groupItemsCount=" + this.groupItemsCount + ")";
    }

    public /* synthetic */ PreparationItem(EnumC5059d enumC5059d, String str, String str2, String str3, String str4, boolean z10, boolean z11, int i10, int i11, int i12, int i13, C3854k c3854k) {
        this(enumC5059d, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? false : z10, (i13 & 64) != 0 ? true : z11, (i13 & 128) != 0 ? 0 : i10, (i13 & 256) != 0 ? 0 : i11, (i13 & 512) != 0 ? 0 : i12);
    }
}
