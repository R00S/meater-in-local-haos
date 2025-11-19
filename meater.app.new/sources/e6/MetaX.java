package e6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.StepContentMeta;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0007R\u001c\u0010/\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u0007R\u001c\u00107\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010:\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u001d\u001a\u0004\b9\u0010\u0007R\u001c\u0010=\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u001c\u0010@\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u001d\u001a\u0004\b?\u0010\u0007¨\u0006A"}, d2 = {"Le6/i;", "", "Lo4/z;", "a", "()Lo4/z;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoProgress", "()Ljava/lang/Boolean;", "autoProgress", "b", "getCompact", "compact", "", "c", "Ljava/util/List;", "getDeviceTypes", "()Ljava/util/List;", "deviceTypes", "d", "Ljava/lang/String;", "getHtml", "html", "e", "getIngredients", "ingredients", "Le6/j;", "f", "getOverlayText", "overlayText", "g", "getProTip", "proTip", "Le6/p;", "h", "Le6/p;", "getSetup", "()Le6/p;", "setup", "i", "getText", "text", "j", "Ljava/lang/Integer;", "getToInternalTemp", "()Ljava/lang/Integer;", "toInternalTemp", "k", "getToState", "toState", "l", "getToTime", "toTime", "m", "getVideo", "video", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class MetaX {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("auto_progress")
    private final Boolean autoProgress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("compact")
    private final Boolean compact;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("device_types")
    private final List<String> deviceTypes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("html")
    private final String html;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("ingredients")
    private final List<String> ingredients;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("overlay_text")
    private final List<OverlayText> overlayText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("pro_tip")
    private final String proTip;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("setup")
    private final Setup setup;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("text")
    private final String text;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("to_internal_temp")
    private final Integer toInternalTemp;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("to_state")
    private final String toState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("to_time")
    private final Integer toTime;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("video")
    private final String video;

    public final StepContentMeta a() {
        ArrayList arrayList;
        Boolean bool = this.autoProgress;
        Boolean bool2 = this.compact;
        List<String> list = this.deviceTypes;
        String str = this.html;
        List<String> list2 = this.ingredients;
        List<OverlayText> list3 = this.overlayText;
        if (list3 != null) {
            arrayList = new ArrayList(kotlin.collections.r.x(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((OverlayText) it.next()).a());
            }
        } else {
            arrayList = null;
        }
        String str2 = this.proTip;
        Setup setup = this.setup;
        return new StepContentMeta(bool, bool2, list, str, list2, arrayList, str2, setup != null ? setup.a() : null, this.text, this.toInternalTemp, this.toState, this.toTime, this.video);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaX)) {
            return false;
        }
        MetaX metaX = (MetaX) other;
        return C3862t.b(this.autoProgress, metaX.autoProgress) && C3862t.b(this.compact, metaX.compact) && C3862t.b(this.deviceTypes, metaX.deviceTypes) && C3862t.b(this.html, metaX.html) && C3862t.b(this.ingredients, metaX.ingredients) && C3862t.b(this.overlayText, metaX.overlayText) && C3862t.b(this.proTip, metaX.proTip) && C3862t.b(this.setup, metaX.setup) && C3862t.b(this.text, metaX.text) && C3862t.b(this.toInternalTemp, metaX.toInternalTemp) && C3862t.b(this.toState, metaX.toState) && C3862t.b(this.toTime, metaX.toTime) && C3862t.b(this.video, metaX.video);
    }

    public int hashCode() {
        Boolean bool = this.autoProgress;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.compact;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.deviceTypes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.html;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.ingredients;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<OverlayText> list3 = this.overlayText;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.proTip;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Setup setup = this.setup;
        int iHashCode8 = (iHashCode7 + (setup == null ? 0 : setup.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.toInternalTemp;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.toState;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.toTime;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.video;
        return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "MetaX(autoProgress=" + this.autoProgress + ", compact=" + this.compact + ", deviceTypes=" + this.deviceTypes + ", html=" + this.html + ", ingredients=" + this.ingredients + ", overlayText=" + this.overlayText + ", proTip=" + this.proTip + ", setup=" + this.setup + ", text=" + this.text + ", toInternalTemp=" + this.toInternalTemp + ", toState=" + this.toState + ", toTime=" + this.toTime + ", video=" + this.video + ")";
    }
}
