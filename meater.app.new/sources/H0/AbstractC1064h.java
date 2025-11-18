package H0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: LinkAnnotation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LH0/h;", "", "<init>", "()V", "LH0/i;", "a", "()LH0/i;", "linkInteractionListener", "LH0/G;", "b", "()LH0/G;", "styles", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1064h {

    /* compiled from: LinkAnnotation.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LH0/h$a;", "LH0/h;", "", "tag", "LH0/G;", "styles", "LH0/i;", "linkInteractionListener", "<init>", "(Ljava/lang/String;LH0/G;LH0/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "LH0/G;", "()LH0/G;", "LH0/i;", "()LH0/i;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.h$a */
    public static final class a extends AbstractC1064h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final G styles;

        public a(String str, G g10, InterfaceC1065i interfaceC1065i) {
            super(null);
            this.tag = str;
            this.styles = g10;
        }

        @Override // H0.AbstractC1064h
        public InterfaceC1065i a() {
            return null;
        }

        @Override // H0.AbstractC1064h
        /* renamed from: b, reason: from getter */
        public G getStyles() {
            return this.styles;
        }

        /* renamed from: c, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            if (!C3862t.b(this.tag, aVar.tag) || !C3862t.b(getStyles(), aVar.getStyles())) {
                return false;
            }
            a();
            aVar.a();
            return C3862t.b(null, null);
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            G styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }
    }

    /* compiled from: LinkAnnotation.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LH0/h$b;", "LH0/h;", "", "url", "LH0/G;", "styles", "LH0/i;", "linkInteractionListener", "<init>", "(Ljava/lang/String;LH0/G;LH0/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "LH0/G;", "()LH0/G;", "LH0/i;", "()LH0/i;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.h$b */
    public static final class b extends AbstractC1064h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final G styles;

        public /* synthetic */ b(String str, G g10, InterfaceC1065i interfaceC1065i, int i10, C3854k c3854k) {
            this(str, (i10 & 2) != 0 ? null : g10, (i10 & 4) != 0 ? null : interfaceC1065i);
        }

        @Override // H0.AbstractC1064h
        public InterfaceC1065i a() {
            return null;
        }

        @Override // H0.AbstractC1064h
        /* renamed from: b, reason: from getter */
        public G getStyles() {
            return this.styles;
        }

        /* renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            if (!C3862t.b(this.url, bVar.url) || !C3862t.b(getStyles(), bVar.getStyles())) {
                return false;
            }
            a();
            bVar.a();
            return C3862t.b(null, null);
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            G styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }

        public b(String str, G g10, InterfaceC1065i interfaceC1065i) {
            super(null);
            this.url = str;
            this.styles = g10;
        }
    }

    public /* synthetic */ AbstractC1064h(C3854k c3854k) {
        this();
    }

    public abstract InterfaceC1065i a();

    /* renamed from: b */
    public abstract G getStyles();

    private AbstractC1064h() {
    }
}
