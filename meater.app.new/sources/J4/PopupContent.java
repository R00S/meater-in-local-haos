package J4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: CloudPopupWindow.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"LJ4/N0;", "", "", "informationText", "actionText", "LJ4/c;", "buttonStyle", "Lkotlin/Function0;", "Loa/F;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;LJ4/c;LBa/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LJ4/c;", "()LJ4/c;", "d", "LBa/a;", "()LBa/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.N0, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class PopupContent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String informationText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String actionText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC1207c buttonStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ba.a<C4153F> onClick;

    public PopupContent(String informationText, String actionText, EnumC1207c buttonStyle, Ba.a<C4153F> onClick) {
        C3862t.g(informationText, "informationText");
        C3862t.g(actionText, "actionText");
        C3862t.g(buttonStyle, "buttonStyle");
        C3862t.g(onClick, "onClick");
        this.informationText = informationText;
        this.actionText = actionText;
        this.buttonStyle = buttonStyle;
        this.onClick = onClick;
    }

    /* renamed from: a, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    /* renamed from: b, reason: from getter */
    public final EnumC1207c getButtonStyle() {
        return this.buttonStyle;
    }

    /* renamed from: c, reason: from getter */
    public final String getInformationText() {
        return this.informationText;
    }

    public final Ba.a<C4153F> d() {
        return this.onClick;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupContent)) {
            return false;
        }
        PopupContent popupContent = (PopupContent) other;
        return C3862t.b(this.informationText, popupContent.informationText) && C3862t.b(this.actionText, popupContent.actionText) && this.buttonStyle == popupContent.buttonStyle && C3862t.b(this.onClick, popupContent.onClick);
    }

    public int hashCode() {
        return (((((this.informationText.hashCode() * 31) + this.actionText.hashCode()) * 31) + this.buttonStyle.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "PopupContent(informationText=" + this.informationText + ", actionText=" + this.actionText + ", buttonStyle=" + this.buttonStyle + ", onClick=" + this.onClick + ")";
    }
}
